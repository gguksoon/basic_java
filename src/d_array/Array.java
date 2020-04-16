package d_array;

// import 단축키: Ctrl + Shift + o
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		int[] array; // 배열의 주소를 저장할 공간이 만들어진다.
		array = new int[5]; // 배열이 생성되고 그 주소가 저장된다.
		// new: 새로운 저장공간 생성 및 주소변환
		// int[5]: int를 저장할 수 있는 5개의 공간
		// 배열 초기화시 기본값이 저장된다.

		System.out.println(array); // 주소가 저장되어 있다.

		System.out.println(array[0]); // 실제 값에 접근하기 위해서는 index를 지정해야 한다.
		// index에는 int만 사용할 수 있다.(리터럴, 변수, 상수, 연산 등)
		// 배열의 최대 크기는 int의 최대값(약 20억)이다.

		String arrayStr = Arrays.toString(array);
		System.out.println(arrayStr);

		int[] iAraay1 = new int[] { 1, 2, 3 }; // 값의 개수로 배열의 길이가 정해진다.
		int[] iArray2 = { 1, 2, 3 }; // 선언과 초기화를 동시에 해야한다.
		int[] iArray3;
		// iArray3 = {1, 2, 3}; // 선언과 초기화를 따로하면 에러가 발생

		array[0] = 10; // 인덱스는 0부터 시작한다.
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50; // 마지막 인덱스는 "배열의 길이 - 1"이다.

		// 정수를 저장할 수 있는 길이가 10인 배열을 생성 및 초기화 해주세요.
		int[] arr = new int[10];

		// 모든 인덱스에 있는 값을 변경해주세요.
		// 모든 인덱스에 있는 값을 더해주세요.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
			sum += arr[i];
			System.out.print(arr[i] + " ");
		}
		System.out.println("\nsum: " + sum);

		for (int tmp : arr) {
			System.out.print(tmp);
			if (!(tmp == arr[arr.length - 1]))
				System.out.print(", ");
		}
		System.out.println();

		// 배열에 숫자를 담고 합게와 평균을 구해보자.
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) (Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(numbers));
		sum = 0;
		float avg = 0;
		for (int i = 0; i < numbers.length; i++)
			sum += numbers[i];
		avg = (float) sum / numbers.length;
		System.out.println("합계: " + sum + " / 평균: " + avg);

		// 향상된 for문(읽기만 가능. 배열 변경 불가)
		for (int number : numbers) {
			System.out.print(number + " ");
		}

		// 배열에 저장된 숫자들 중 최소값과 최대값을 찾아보세요.
		int minNum = 2147483647, maxNum = 0, count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > maxNum)
				maxNum = numbers[i];
			if (numbers[i] < minNum)
				minNum = numbers[i];
		}
		System.out.println("\nmaxNum: " + maxNum + ", minNum: " + minNum);

		//
		int[] shuffle = new int[30];
		for (int i = 0; i < shuffle.length; i++) {
			shuffle[i] = i + 1;
		}
		System.out.println(Arrays.toString(shuffle));

		// 배열의 값을 섞어주세요.
		count = 0;
		int temp = 0;
		System.out.println(Arrays.toString(shuffle));
		while (count < 10000) {
			int randNum = (int) (Math.random() * 30);
			temp = shuffle[0];
			shuffle[0] = shuffle[randNum];
			shuffle[randNum] = temp;
			count++;
		}
		System.out.println("길이: " + shuffle.length + Arrays.toString(shuffle));

		// 배열은 길이를 변경할 수 없기 때문에 깅리가 부족할 경우 더 큰 배열에 복사를 해야한다.
		int[] tempArr = new int[shuffle.length * 2];
		for (int i = 0; i < shuffle.length; i++) {
			tempArr[i] = shuffle[i];
		}
		System.out.println("길이: " + tempArr.length + Arrays.toString(tempArr));

		int[] tempArr2 = new int[tempArr.length * 2];

		System.arraycopy(tempArr, 0, tempArr2, 0, tempArr.length);
		System.out
				.println("길이: " + tempArr2.length + Arrays.toString(tempArr2));

		// 문제1. 1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		// randomCount();를 치고 Ctrl1을 치면 메서드가 생성된다.
		randomCount();

		// 문제2. 문제1의 최솟값, 최댓값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		inputRandomCount();
	}

	private static void randomCount() {
		// 문제1. 1 ~ 10 사이의 난수를 500번 생성하고, 각 숫자가 생성된 횟수를 출력해주세요.
		int[] callNum = new int[10];
		for (int i = 0; i < 500; i++) {
			int randNum = (int) (Math.random() * 10) + 1;
			callNum[randNum - 1]++;
		}

		System.out
				.println("\n[1번문제] 각 숫자가 반복된 횟수: " + Arrays.toString(callNum));
		System.out.println();
	}

	private static void inputRandomCount() {
		// 문제2. 문제1의 최솟값, 최댓값, 반복횟수를 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("최솟값을 입력하세요.: ");
		int minNum = Integer.parseInt(sc.nextLine());
		System.out.print("최댓값을 입력하세요.: ");
		int maxNum = Integer.parseInt(sc.nextLine());
		System.out.print("반복횟수를 입력하세요.: ");
		int repeatNum = Integer.parseInt(sc.nextLine());

		int[] callNum = new int[maxNum - minNum + 1];

		for (int i = 0; i < repeatNum; i++) {
			int randNum = (int) (Math.random() * (maxNum - minNum + 1)) + minNum;
			callNum[randNum - minNum]++;
		}

		System.out.println("[2번문제]각 숫자가 반복된 횟수: " + Arrays.toString(callNum));
		for (int i = 0; i < callNum.length; i++) {
			System.out.print((i + minNum) + ": " + callNum[i] + "회");
			if(i % 10 == 0 && i != 0)
				System.out.println();
			else
				System.out.print(", ");
		}
	}

}
