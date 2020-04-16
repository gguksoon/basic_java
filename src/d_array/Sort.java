package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {

		// ㅁ 선택정렬: 첫번째 숫자부터 그 뒤의 모든 숫자들과 비교해서 작은수와 자리 바꾸기를
		// 반복해 앞에서부터 작은수를 채워나가는 방식
		// ㅁ 버블정렬: 첫번째 숫자부터 바로 뒷 숫자와 비교해서 크면 자리 바꾸기를 반복해 뒤에서부터 큰 수를 채워나가는 방식
		// ㅁ 삽입정렬: 두번째 숫자부터 그 앞의 모든 숫자들과 비교해서 큰 수들을 뒤로 밀고 중간에 삽입하는 방식
		// ㅁ 석차구하기: 모든 점수가 1등으로 시작해서 다른 점수들과 비교해 자신의 점수가 작으면 1씩 증가시키는 방식

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = i + 1;
		numbers[1] = 8;
		numbers[0] = 8;

		shuffle(numbers);
		System.out.println(Arrays.toString(numbers) + " <- shuffle");

		// 선택정렬
		selectSort(numbers);
		System.out.println(Arrays.toString(numbers) + " <- select sort");

		// 버블정렬
		shuffle(numbers);
		System.out.println("\n" + Arrays.toString(numbers) + " <- shuffle");
		bubbleSort(numbers);
		System.out.println(Arrays.toString(numbers) + " <- bubble sort");

		// 삽입정렬
		shuffle(numbers);
		System.out.println("\n" + Arrays.toString(numbers) + " <- shuffle");
		insertSort(numbers);
		System.out.println(Arrays.toString(numbers) + " <- insert sort");
		
		// 석차구하기
		shuffle(numbers);
		System.out.println("\n" + Arrays.toString(numbers) + " <- shuffle");
		int[] rank = new int[10];
		printRank(numbers, rank);
		System.out.println(Arrays.toString(rank) + " <- rank");
	}

	private static void printRank(int[] numbers, int[] rank) {
		for(int i = 0; i < numbers.length; i++){
			rank[i]++;
			for(int j = 0; j < numbers.length; j++){
				if(numbers[i] < numbers[j])
					rank[i]++;
			}
		}
	}

	private static void insertSort(int[] numbers) {
		for(int i = 1; i < numbers.length; i++){
			int key = numbers[i];
			for(int j = i - 1; j >= 0; j--){
				if(numbers[j] > key){
					numbers[j+1] = numbers[j];
					numbers[j] = key;
				}
				else
					break;
			}
		}
	}

	private static void bubbleSort(int[] numbers) {
		int temp = 0;
		for (int i = 0; i < numbers.length - 1; i++) {
			boolean changed = false; // 한 회차에 교환이 없으면 모두 정렬된 상태이므로 프로그램 종료하기 위해 count를 이용
			for (int j = 0; j < numbers.length - 1 - i; j++) {
				if (numbers[j] > numbers[j + 1]) {
					temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					changed = true;
				}
			}
			if (changed == false)
				break;
		}
	}

	private static void selectSort(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 1 + i; j < numbers.length; j++) {
				if (numbers[i] > numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
	}

	private static void shuffle(int[] numbers) {
		for (int i = 0; i < numbers.length * 10; i++) {
			int rand = (int) (Math.random() * numbers.length);
			int temp = numbers[0];
			numbers[0] = numbers[rand];
			numbers[rand] = temp;
		}
	}
}
