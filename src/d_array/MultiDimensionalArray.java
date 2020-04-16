package d_array;

import java.util.Arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * int[][] numbers = new int[2][3]; // 2행 3열 int numbers2[][] = new
		 * int[][]{{1, 2, 3}, {4, 5, 6}}; // 값의 개수로 배열의 길이가 정해진다. int[]
		 * numbers3[] = { // 선언과 초기화를 동시에 해야한다. {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
		 * }; int[][] numbers4 = new int[3][]; //가변배열 numbers4[0] = new int[3];
		 * numbers4[1] = new int[4]; numbers4[2] = new int[10];
		 * 
		 * // numbers[0] = 10; // 1차원에 값을 저장할 수 없다. numbers[0] = new int[5];
		 * numbers[0][0] = 10; numbers[0][1] = 20; numbers[1][0] = 100;
		 * 
		 * System.out.println(numbers.length); // 1차원 배열의 길이
		 * System.out.println(numbers[0].length); // 2차원 배열의 길이
		 * 
		 * for(int i = 0; i < numbers.length; i++){ for(int j = 0; j <
		 * numbers[i].length; j++){ System.out.print(numbers[i][j] + " "); }
		 * System.out.println(); }
		 * 
		 * System.out.println(Arrays.toString(numbers)); // 주소가 출력됨
		 * 
		 * for (int i = 0; i < numbers.length; i++) {
		 * System.out.println(Arrays.toString(numbers[i])); // 2차원까지 접근해야 값이 출력됨
		 * }
		 * 
		 * // 향상된 for문 for(int[] numberArr : numbers){ for(int number :
		 * numberArr){ System.out.println(number); } }
		 * 
		 * int[][] scores = new int[3][5]; // int[학생수][과목수] int[] sum = new
		 * int[scores.length]; // 합계 float[] avg = new float[scores.length]; //
		 * 평균
		 * 
		 * for(int i = 0; i < scores.length; i++){ for(int j = 0; j <
		 * scores[i].length; j++){ scores[i][j] = (int)(Math.random() * 100) +
		 * 1; } System.out.println(Arrays.toString(scores[i])); }
		 * 
		 * // 합계, 평균 for(int i = 0; i < scores.length; i++){ for(int j = 0; j <
		 * scores[i].length; j++){ sum[i] += scores[i][j]; } avg[i] =
		 * (float)sum[i] / scores[i].length; } System.out.println("SUM: " +
		 * Arrays.toString(sum)); System.out.println("AVG: " +
		 * Arrays.toString(avg));
		 */
		score();

	}

	private static void score() {
		// 우리반 모두의 Java, Oracle, HTML, CSS, JQuery, JSP 점수를 50~100까지 랜덤으로
		// 생성시켜주시고, <석차 / 이름 / 과목별점수 / 총점 / 평균>을 출력해주세요.
		//
		// 석차 이름 Java Oracle HTML CSS JQuery JSP 총점 평균
		// 1 차주환 100 100 100 100 100 100 100 100
		// 2 노현아 90 90 90 90 90 90 90 90
		final int STUDENT_INFO = 9;
		String[] name = { "조민수", "강진구", "조하경", "홍다은", "김소리", "전민규", "류우찬",
				"김혜인", "이다혜", "박채은", "갈치", "고등어", "삼치", "우럭", "광어"};
		String[] subject = { "이름", "JAVA", "Oracle", "HTML", "CSS", "JQuery", 
				"JSP", "AI", "OS", "총점", "평균", "석차", "등급" };
		String[] grade = new String[name.length];
		// scores의 열에는 아래의 값이 순서대로 들어감
		// {JAVA, Oracle, HTML, CSS, JQuery, JSP, 총점, 평균, 석차}
		float[][] scores = new float[name.length][subject.length - 2];
		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[0].length - 3; j++){ // 랜덤성적입력
				scores[i][j] = (int) (Math.random() * 51) + 50;
				scores[i][scores[i].length - 3] += scores[i][j]; // 한 학생의 성적합계([i][6])
			}
			scores[i][scores[i].length - 2] = scores[i][scores[i].length - 3] / (scores[i].length - 3); // 한 학생의 평균
		}
		for(int i = 0; i < scores.length; i++){ // 순위([i][8])
			scores[i][scores[0].length - 1]++;
			for(int j = 0; j < scores.length; j++){
				if(scores[i][scores[0].length - 3] < scores[j][scores[0].length - 3])
					scores[i][scores[0].length - 1]++;
			}
		}
		// 등급(ex A+)
		for(int i = 0; i < scores.length; i++){
			if(scores[i][scores[0].length - 2] >= 90)
				grade[i] = "A";
			else if(scores[i][scores[0].length - 2] >= 80)
				grade[i] = "B";
			else if(scores[i][scores[0].length - 2] >= 70)
				grade[i] = "C";
			else if(scores[i][scores[0].length - 2] >= 60)
				grade[i] = "D";
			else if(scores[i][scores[0].length - 2] < 60)
				grade[i] = "F";
			
			if((scores[i][scores[0].length - 2] % 10) >= 7 && grade[i] != "F")
				grade[i] += "+";
			else if((scores[i][scores[0].length - 2] % 10) >= 3)
				grade[i] += "0";
			else
				grade[i] += "-";
		}
		
		for (int i = 0; i < scores.length - 1; i++) { // 정렬
			for (int j = 1 + i; j < scores.length; j++) {
				if (scores[i][scores[i].length-2] < scores[j][scores[i].length-2]) {
					float[] tempArr = new float[scores[i].length];
					String temp;
					System.arraycopy(scores[i], 0, tempArr, 0, scores[i].length);
					scores[i] = scores[j];
					scores[j] = tempArr;
					temp = name[i];
					name[i] = name[j];
					name[j] = temp;
					temp = grade[i];
					grade[i] = grade[j];
					grade[j] = temp;
					
				}
			}
		}
		

		
		for(int i = 0; i < subject.length; i++)
			System.out.print(subject[i] + "\t");
		System.out.println();
		for(int i = 0; i < subject.length; i++)
			System.out.print("--------");
		System.out.println();
		
		for(int i = 0; i < scores.length; i++){
			System.out.print(name[i] + "\t");
			for(int j = 0; j < scores[i].length; j++){
				System.out.printf("%.1f \t", scores[i][j]);
			}
			System.out.println(grade[i]);
		}
		for(int i = 0; i < subject.length; i++)
			System.out.print("--------");
		System.out.println();
		System.out.print("전체평균> \t");

		float[] sum = new float[scores[0].length-1];
		
		for(int i = 0; i < scores[0].length-1; i++){
			for(int j = 0; j < scores.length ; j++){
				sum[i] += scores[j][i];
			}
			sum[i] /= scores.length;
		}

		for(int i = 0; i < sum.length; i++){
			System.out.printf("%.1f\t", sum[i]);
		}
	}

}
