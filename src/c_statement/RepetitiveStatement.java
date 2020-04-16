package c_statement;

import java.util.Scanner;

public class RepetitiveStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			// for(초기화; 조건식; 증감식){ }
			System.out.print(i + ", ");
			sum += i;
		}
		System.out.println("sum: " + sum);

		sum = 0;
		// 0~100 짝수 합
		for (int i = 0; i <= 100; i += 2)
			sum += i;
		System.out.println("짝수의 합: " + sum);

		sum = 0;
		// 1부터 100까지 홀수의 합을 구해주세요.
		for (int i = 1; i <= 100; i += 2)
			sum += i;
		System.out.println("홀수의 합: " + sum);

		// 구구단
		for (int i = 1; i <= 9; i++) {
			System.out.println("7 * " + i + " = " + 7 * i);
		}

		// 입력한 단 출력
		System.out.print("출력할 단수를 입력하세요.: ");
		// int dan = Integer.parseInt(sc.nextLine());
		// for (int i = 1; i <= 9; i++)
		// System.out.println(dan + " * " + i + " = " + dan * i);

		// 구구단 전체
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		// 짝수단 홀수줄 출력
		for (int i = 2; i <= 9; i += 2) {
			for (int j = 1; j <= 9; j += 2)
				System.out.println(i + " * " + j + " = " + i * j);
			System.out.println();
		}

		for (int i = 2; i <= 9; i += 5) {
			for (int j = 1; j <= 9; j++) {
				for (int k = 0; k <= 4; k++) {
					if (i + k < 10)
						System.out.print(i + k + " * " + j + " = " + (i + k)
								* j + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++)
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			System.out.println();
		}

		// for문을 사용해 별1개를 찍어 모양을 만들어보자.
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++)
				System.out.print("*");
			System.out.println();
		}

		// 삼각형
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 역삼각형
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\n");

		// 삼각형2
		int max = 5;
		for (int i = 1; i <= max; i += 2) {
			for (int j = 0; j <= (max - i) / 2; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

		// while문

		// 구구단의 단수를 계속 입력받아보자.
		/*
		 * int dan; while (true) { System.out.print("몇단을 출력할까요?(0: 종료): "); dan
		 * = Integer.parseInt(sc.nextLine()); if (dan == 0) break; for (int i =
		 * 1; i <= 9; i++) System.out.println(dan + "*" + i + "=" + dan * i +
		 * "\t"); }
		 */

		// 숫자맞추기 게임
		/*
		 * int answer = (int) (Math.random() * 100) + 1; // 1~100 난수 int input =
		 * 0; do { System.out.print("1 ~ 100 사이의 숫자를 입력하세요.: "); input =
		 * Integer.parseInt(sc.nextLine());
		 * 
		 * if (input > answer) System.out.println(input + "보다 작습니다."); else if
		 * (input < answer) System.out.println(input + "보다 큽니다."); else
		 * System.out.println("정답입니다!!"); } while (input != answer);
		 */

		// 이름붙은 반복문
		outer: for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 5) {
					// break; // 가장 가까운 반복문 탈출
					break outer; // outer라는 이름의 반복문 탈출
					// continue; // 가장 가까운 반복문의 현재 반복회차에서 탈출
					// continue outer; // outer라는 이름의 반복문의 현재 반복회차에서 탈출
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

	}
}
