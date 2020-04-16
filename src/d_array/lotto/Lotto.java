package d_array.lotto;

import java.util.Arrays;

public class Lotto {

	
	static int[][] LottoNumber = LottoHistory.WIN_NUMBERS;
	
	public static void main(String[] args) {
		// 홀짝 출현 확률
		//oddEven();
		// 각 숫자 출현 확률
		//appearance();
		// 구간별 출현확률(1~5의 확률/ 6~10의 확률 ....)
		//section();
		// 중복 확률
		repeat();
	}

	private static void repeat() {
		int[] overlapArray = new int[6];
		for(int i = 0; i < LottoNumber.length - 1; i++){ // 반복횟수 저장
			int count = 0;
			for(int j = 0; j < LottoNumber[i].length; j++){
				for(int k = 0; k < LottoNumber[i].length; k++){
					if(LottoNumber[i][j] == LottoNumber[i+1][k]){
						count++;
						break;
					}
				}
			}
			if(count != 0)
				overlapArray[count-1]++;
		}
		
		
		for(int i = 0; i < overlapArray.length; i++){ // 퍼센트 구하고 출력
			float percent = (int)((((float)overlapArray[i]/LottoNumber.length) * 10000 + .5f)) / 100f;
			System.out.println(i + 1 + "개반복: " + overlapArray[i] + "(" + percent + "%)");
		}
	}

	private static void section() {
		int[] counts = new int[45]; 
		for(int i = 0; i < LottoNumber.length; i++){ // 각 횟수 구하기
			for(int j = 0; j < LottoNumber[i].length; j++){
				counts[LottoNumber[i][j] - 1]++;
			}
		}

		int[] sectionCounts = new int[45/5]; // 0~4 / 5~9 / 10~14 / ... / 40~44 으로 합치기
		for(int i = 0; i < counts.length; i++){
			sectionCounts[i/5] += counts[i];
		}
		
		float[] sectionPercents = new float[sectionCounts.length]; // 0~8 배열에 위에서 합친 횟수 퍼센트로 저장
		for(int i = 0; i < sectionPercents.length; i++){
			sectionPercents[i] = (float)sectionCounts[i] / (LottoNumber.length * LottoNumber[0].length) * 100;
		}
		
		System.out.println("구간\t  횟수\t확률");
		for(int i = 0; i < sectionPercents.length; i++){
			System.out.printf("%d~%d\t %d\t%.2f\n", i*5+1, i*5+5, sectionCounts[i], sectionPercents[i]);
		}
		
	}

	private static void appearance() {
		int[] counts = new int[45]; // 각 숫자가 나온 카운트 횟수 저장
		float[] percents = new float[counts.length]; // 횟수를 이용해 전체에서 해당 숫자가 나올 확률 
		
		for(int[] i : LottoNumber){ // 횟수 기록
			for(int j : i){
				counts[j-1]++;
			}
		}
		
		for(int i = 0; i < counts.length; i++){ // 횟수의 확률 구하고 출력
			percents[i] = (float)counts[i] / (LottoNumber.length * LottoNumber[i].length) * 100;
			if(i < 9)
				System.out.printf("0");
			System.out.printf("%d번: %.2f%%\t", i + 1, percents[i]);
			
			if(((i+1) % 5) == 0 && i != 0)
				System.out.println();
		}
		System.out.println("===========================================================================");
		float[][] rank = new float[counts.length][2]; // 0번 순위 1번 횟수
		for(int i = 0; i < rank.length; i++){
			rank[i][0] = i + 1;
			rank[i][1] = percents[i];
		}
		
		for(int i = 1; i < rank.length; i++){  //정렬
			float key = rank[i][1];
			float key2 = rank[i][0];
			for(int j = i - 1; j >= 0; j--){
				if(rank[j][1] < key){
					rank[j+1][1] = rank[j][1];
					rank[j][1] = key;
					rank[j+1][0] = rank[j][0];
					rank[j][0] = key2;
				}
				else
					break;
			}
		}
		System.out.println("순위\t번호\t확률");
		for(int i = 0; i < rank.length; i++){
			System.out.printf("%d\t%d\t%.2f\n", i+1, (int)rank[i][0], rank[i][1]);
		}
	}

	private static void oddEven() {
		int[] counts = new int[2]; // 홀 혹은 짝의 카운트가 저장되는 배열

		// 일반 for문
		/*for(int i = 0; i < LottoNumber.length; i++){
			for(int j = 0; j < LottoNumber[i].length; j++)
				if((LottoNumber[i][j] % 2) == 0)
					counts[1]++; // 짝수 1번 인덱스
				else
					counts[0]++; // 홀수 0번 인덱스
			
		}*/
		// 향상된 for문
		for(int[] i : LottoNumber){
			for(int j : i){
				if((j % 2) == 0)
					counts[1]++; // 짝수 1번 인덱스
				else
					counts[0]++; // 홀수 0번 인덱스
			}
		}
		System.out.println("홀수: " + counts[0] + ", 짝수: " + counts[1]);
		
		float[] percents = new float[counts.length];
		for(int i = 0; i < counts.length; i++)
			percents[i] = (int)((float)counts[i] / (LottoNumber.length * LottoNumber[0].length) * 1000) / 10f;
			//percents[i] = (float)counts[i] / (counts[0]+counts[1]) * 100;
		System.out.println("홀수확률: " + percents[0] + "%, 짝수확률: " + percents[1] + "%");
	}

}
