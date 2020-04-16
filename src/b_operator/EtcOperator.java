package b_operator;

import java.util.Scanner;

public class EtcOperator {

	public static void main(String[] args) {
		
		//00001010(2): 10
		//00001111(2): 15
		
		//|: 00001111(2)   -> 15
		System.out.println(10 | 15);
		//&: 00001010(2)   -> 10
		System.out.println(10 & 15);
		//^: 00000101(2)   -> 5
		System.out.println((10 ^ 15));
		//~: ~00001010 = 11110101   -> -11
		System.out.println(~10);
		//<<: 00001010 << 2   -> 00101000: 40
		System.out.println(10 << 2);
		//>>: 00001010 >> 2   -> 00000010: 2
		System.out.println(10 >> 2);
		
		
		
		int x = 10;
		int y = 20;
		int result = (x < y) ? x : y;
		System.out.println(result); // x
		
		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자
		int regNo = 3;
		String gender = (regNo == 1) ? "남자" : "여자";
		System.out.println(gender);
		
		// 위 식의 문제는 1, 2가 아닌 숫자가 오면 결과가 무조건 여자가 나온다. 그럴경우 삼항연산자를 중첩해서 이용
		gender = (regNo == 1) ? "남자" : (regNo == 2 ? "여자" : "확인불가");
		System.out.println(gender);
		
		
		
		// 문제1. 두 개의 변수에 저장된 수 중에 큰 숫자를 출력해주세요.
		int a = 22;
		int b = 288;
		int res = (a > b) ? a : b;
		System.out.println(res);
		
		// 문제2. 변수에 저장된 수의 절대값을 출력해주세요.
		int num = -4;
		int res2 = (num < 0) ? -num : num;
		System.out.println(res2);
		
		// 문제3. 변수에 저장된 주민등록번호 뒷자리의 첫번째 숫자가 1이나 3이면 남자를, 2나 4면 여자를 출력해주세요.
		// 	 	  그 외의 숫자를 입력하면 "잘못 입력하셨습니다."를 출력해주세요.
		int regNo2 = 4;
		String gender2 = (regNo2 == 1 || regNo2 == 3) ? "남자" : (regNo2 == 2 || regNo2 == 4 ? "여자" : "잘못 입력하셨습니다.");
		System.out.println(gender2);
		
		
	}
}
