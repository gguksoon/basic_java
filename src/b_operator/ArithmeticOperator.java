package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		
		byte b = 10;
		short c = 20;
		
		short d = (short)(c - b); //표현범위가 큰 short로 형변환이 이루어질 것 같지만 그렇지 않다.
		//int보다 작은 정수 타입은 int로 형변환 후 연산이 수행된다.(JAVA의 기본 연산이 4Byte)
		
		long e1 = 1000000 * 1000000;	// int와 int의 연산 결과는 int이다.
		System.out.println("e1: " + e1);			// int이므로 오버플로우 발생
		long e2 = 1000000 * 1000000L;	//int와 long의 연산 결과 정상적인 결과가(long) 나옴
		System.out.println("e2: " + e2);			// 오버플로우 발생하지 않음
		
		float f1 = 10 / 4; 	// int와 int의 연산 결과는 int이다.
		System.out.println("f1: " + f1);
		float f2 = 10 / 4f; // int와 float의 연산 결과 정상적인 결과가(float) 나옴
		System.out.println("f2: " + f2);
		int f3 = 10 % 4;
		System.out.println("f3: " + f3);
		
		//int g1 = 10 / 0; //나눌 수 없다(런타임 에러)
		float g2 = 10.0f / 0;
		System.out.println("g2: " + g2);  //Infinity: 무한대
		float g3 = 0 / 0f;
		System.out.println("g3: " + g3);  //NaN: Not a Number
		
		char h1 = 'A';
		// char h2 = h1 + 1; // 오류 남 아래처럼 형변환 해야됨
		char h2 = (char)(h1 + 1);
		System.out.println("h2: " + h2);
		h2 = 'A' + 1; // 위와 달리 오류가 나지 않음(리터럴 + 리터럴 이므로)
		
		int h3 = 'D' - 'A'; // 68 - 65
		System.out.println("h3: " + h3);
		
		int h4 = '5' - '0'; //53 - 48
		System.out.println("h4: " + h4);
		
		int i = 0;
		System.out.println("++i = " + ++i); // 전위형: 변수가 참조되기 전 수행
		
		int j = 0;
		System.out.println("j++ = " + j++); // 후위형: 변수가 참조된 후 수행
		System.out.println("j = " + j);
		
		System.out.println((int)(50.6 + 0.3)); // 내림
		System.out.println(Math.round(50.6));  // 반올림 메서드(소수점 첫째 자리에서 반올림)
		System.out.println(Math.round(50.56));
		System.out.println((int)((50.46 + 0.05) * 10) / 10.0); // 소수점 둘째 자리에서 반올림.
		
		//문제1. 다음을 한줄 씩 계산해서 최종 결과값을 출력해주세요.
		//1. 123456 + 654321
		//2. 1번의 결과값 * 123456
		//3. 2번의 결과값 / 123456
		//4. 3번의 결과값 - 654321
		//5. 4번의 결과값 % 123456
		
		float num = 123456f;
		num += 654321;
		System.out.println("1. " + num);
		num *= 123456;
		System.out.println("2. " + num);
		num /= 123456;
		System.out.println("3. " + num);
		num -= 654321;
		System.out.println("4. " + num);
		num %= 123456;
		System.out.println("5. " + num);
		
		//문제2. 3개의 int형 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
		//      (평균은 소수점 셋째자리에서 반올림)
		
		int num1 = 2, num2 = 3, num3 = 3;
		int sum = num1 + num2 + num3;
		float avg = (int)((sum / 3.0 * 100) + 0.5) / 100f;
		System.out.println("sum: " + sum + ", avg: " + avg);
		
		
	}

}
