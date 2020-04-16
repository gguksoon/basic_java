package y_homework;

import java.util.Scanner;

public class Problem0423 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 야구게임
		
		Scanner sc = new Scanner(System.in);

		// answer1: 백의자리 / answer2: 십의자리 / answer3: 일의자리
		int answer1 = 0, answer2 = 0, answer3 = 0;
		int round = 0;
		String answer = null, yourAnswer = null;

		
		
		// 난수 구하기(answer1, answer2, answer3에 중복하지 않는 랜덤값이 들어감)
		answer1 = (int) (Math.random() * 9) + 1;
		do {
			answer2 = (int) (Math.random() * 9) + 1;
		} while (answer2 == answer1);
		do {
			answer3 = (int) (Math.random() * 9) + 1;
		} while (answer3 == answer1 || answer3 == answer2);
		answer = "" + answer1 + answer2 + answer3;
		System.out.println("정답: " + answer);

		
		
		// 답을 입력을 받고, 3자리의 정수인지 확인
		boolean check = true;
		System.out.print("[야구게임]");
		do {
			System.out.print("3자리의 수를 입력하세요.: ");
			yourAnswer = sc.nextLine();
			if (yourAnswer.length() == 3) {
				// 3자리 체크 됨 > 숫자인지 확인 ( 확인되면 check = false 주기 )
				for (int i = 0; i < yourAnswer.length(); i++) {
					if (yourAnswer.charAt(i) < 48 || yourAnswer.charAt(i) > 57) {
						System.out.println("\n3자리의 수를 다시 입력하세요.");
						check = true;
						break;
					} else
						check = false;
				}
			} else { // 3자리 아님 재입력
				System.out.println("\n3자리의 수를 다시 입력하세요.");
				check = true;
			}
		} while (check);

		
		
		// 아래의 do-while문에서 정답을 찾을 때 까지 무한반복
		do {		
			// 결과 계산(Strike와 Ball의 갯수 구하기)
			int strike = 0, ball = 0;
			round++;
			for (int i = 0; i < 3; i++) {
				if (yourAnswer.charAt(i) == answer.charAt(0)) {
					if (i == 0)
						strike++;
					else
						ball++;
					continue;
				}
				if (yourAnswer.charAt(i) == answer.charAt(1)) {
					if (i == 1)
						strike++;
					else
						ball++;
					continue;
				}
				if (yourAnswer.charAt(i) == answer.charAt(2)) {
					if (i == 2)
						strike++;
					else
						ball++;
					continue;
				}
			}
			
			
			// 결과 출력 및 단어 재입력
			System.out.println("[round " + round + "] " + yourAnswer + ": "
					+ strike + "S " + ball + "B " + (3 - strike - ball) + "O");
			if (strike == 3) {
				System.out.println("정답입니다!!");
				break;
			} else {
				boolean check2 = true;
				do {
					System.out.print("\n3자리의 수를 입력하세요.: ");
					yourAnswer = sc.nextLine();
					if (yourAnswer.length() == 3) {
						for (int i = 0; i < yourAnswer.length(); i++) {
							if (yourAnswer.charAt(i) < 48
									|| yourAnswer.charAt(i) > 57) {
								System.out.println("3자리의 수를 다시 입력하세요.");
								check2 = true;
								break;
							} else
								check2 = false;
						}
					} else {
						System.out.println("3자리의 수를 다시 입력하세요.");
						check2 = true;
					}
				} while (check2);
			}
			
			
			
		} while (true);
	}
}
