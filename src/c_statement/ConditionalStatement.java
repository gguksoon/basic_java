package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;

		if (a < 100)
			System.out.println("조건식의 연산결과가 true이면 수행된다.");

		if (a < 5)
			System.out.println("조건식의 연산결과가 false이면 수행되지 않는다.");

		int regNo = 1; // 주먼등록번호 첫자리
		String gender = null; // 성별

		if (regNo == 1 || regNo == 3)
			gender = "남자";
		else if (regNo == 2 || regNo == 4)
			gender = "여자";
		else
			gender = "미확인";
		System.out.println(gender);

		if (gender.equals("남자")) {

		} else if (gender.equals("여자")) {

		} else {

		}

		// 성적에 등급을 부여하는 프로그램
		int score = 89;
		String grade = null;

		if (score >= 90) {
			grade = "A";
			if (score >= 97)
				grade += "+";
			else if (score >= 93)
				grade += "-";
		} else if (score >= 80) {
			grade = "B";
			if (score >= 87)
				grade += "+";
			else if (score >= 83)
				grade += "-";
		} else if (score >= 70) {
			grade = "C";
			if (score >= 77)
				grade += "+";
			else if (score >= 73)
				grade += "-";
		} else if (score >= 60) {
			grade = "D";
			if (score >= 67)
				grade += "+";
			else if (score >= 63)
				grade += "-";
		} else
			grade = "F";
		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");

		// switch
		regNo = 2;
		gender = null;
		switch (regNo) {
		case 1:
			gender = "남자";
			break;
		case 2:
			gender = "여자";
			break;
		case 3:
			gender = "남자";
			break;
		case 4:
			gender = "여자";
			break;
		}

		regNo = 3;
		gender = null;
		switch (regNo) { // 조건식의 연산결과는 정수와 문자열만 허용
		case 1: // case문의 값은 정수 리터럴 정수 상수만 사용할 수 있다.
		case 3:
			gender = "남자";
			break; // break를 만나면 switch문을 빠져나간다.
		case 2:
		case 4:
			gender = "여자";
			break;
		default: // if문의 else와 같은 역할을 한다.
		}

		score = 100;
		grade = null;
		switch (score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		System.out.println(score + "에 해당하는 점수는 " + grade + " 입니다.");
		
		/*
		
		// 스캐너
		Scanner sc = new Scanner(System.in);
		// 문자
		//System.out.print("입력: ");
		//String str = sc.nextLine();
		//System.out.println("입력받은 내용: " + str);
		
		// 숫자
		System.out.print("입력: ");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("입력받은 내용: " + num);
		
		// 숫자2(권장X)
		System.out.print("숫자입력>");
		int num2 = sc.nextInt();
		
		*/
		
		//문제1. 숫자를 입력받아 그 숫자가 0인지 0이 아닌지 출력해주세요.
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("숫자를 입력하세요.: ");
		int num = Integer.parseInt(sc.nextLine());
		if(num == 0)
			System.out.println("입력하신 " + num + "는 숫자입니다.");
		else
			System.out.println("입력하신 " + num + "는 숫자가 아닙니다.");
		*/
		
		//문제2. 숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		/*
		System.out.print("숫자를 입력하세요.: ");
		int num2 = Integer.parseInt(sc.nextLine());
		if(num2 % 2 == 0)
			System.out.println("입력하신 " + num + "는 짝수입니다.");
		else
			System.out.println("입력하신 " + num + "는 홀수입니다.");
		*/
		
		//문제3. 점수 3개를 입력받아 총점, 평균, 등급을 출력해주세요.
		int sum = 0;
		float avg = 0f;
		String grd = null;
		System.out.print("숫자를 입력하세요.(1/3): ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.print("숫자를 입력하세요.(2/3): ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.print("숫자를 입력하세요.(3/3): ");
		int num3 = Integer.parseInt(sc.nextLine());
		
		sum = num1 + num2 + num3;
		avg = (int)(sum / 3f * 10 + 0.5) / 10f;
		
		switch (sum / 30) {
		case 10:
		case 9:
			grd = "A";
			break;
		case 8:
			grd = "B";
			break;
		case 7:
			grd = "C";
			break;
		case 6:
			grd = "D";
			break;
		default:
			grd = "F";
		}
		
		System.out.println("총점: " + sum + ", 평균: " + avg + ", 등급: " + grd);
		
	}

}
