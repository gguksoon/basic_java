package a_variable;

public class Variable {

	public static void main(String[] args) {

		// 정수
		System.out.println(100); // int
		System.out.println(100L); // long(접미사는 대소문자 둘 다 가능. 단, 소문자를 헷갈릴 수 있음)
		// byte와 short는 접미사가 없다. 문법상 byte와 short로 사용되어야 할 때 그렇게 사용된다.

		// 실수
		System.out.println(100.0); // double
		System.out.println(100d); // double
		System.out.println(100f); // float

		// 문자
		System.out.println('A'); // char
		System.out.println(' '); // char

		// 논리
		System.out.println(true); // boolean
		System.out.println(false); // boolean

		// 문자열
		System.out.println("abcd");
		// 필요한 데이터들과 기능들을 모아놓은 것이 클래스이다.
		// 클래스를 타입으로 사용하는 것이 참조형 타입이다.

		int number; // 선언
		number = 10; // 초기화
		System.out.println(number);
		number = 20;
		System.out.println(number);

		int number2 = 100; // 선언 + 초기화

		// 문제1. 문자를 저장할 수 있는 변수 2개를 선언 및 초기화 해주세요.
		char ch1 = 'A';
		char ch2 = 'B';

		// 문제2. 문제1에서 만든 두 변수의 값을 서로 교환해서 저장 후 출력해주세요.(리터럴 사용X)
		char temp = ch1;
		ch1 = ch2;
		ch2 = temp;
		System.out.println("ch1: " + ch1 + ", ch2: " + ch2);

		byte byteNumber = 127; // 2진 데이터를 다룰 때 사용(-128~127)
		short shortNumber = 32767; // C언어와의 호환을 위해 추가됨(-32768~32767)
		int intNumber = 2147483647; // 약 21억. 연산에 효율적이므로 주로 사용
		long doubleNumber = 100000000000000L; // 20억 이상의 큰 수(900경)를 표현할 때 사용한다.

		// 1byte = 8bit
		// bit = 0 or 1
		// 첫번째 비트는 부호를 표현, 나머지는 숫자이므로 1byte: -2^7 ~ 2^7-1
		// byte: -2^7 ~ 2^7-1
		// short: -2^15 ~ 2^15-1
		// int: -2^31 ~ 2^31-1
		// long: -2^63 ~ 2^63-1

		intNumber = intNumber + 1;
		System.out.println(intNumber + "(오버플로우)"); // 오버플로우
		intNumber = intNumber - 1;
		System.out.println(intNumber + "(언더플로우)"); // 언더플로우

		float decimal = 0.1234567890123456789f; // 정밀도: 7자리
		System.out.printf("%21.20f%n", decimal);
		decimal = 123456789.0f;
		System.out.printf("%f%n", decimal);

		double bigDecimal = 0.1234567890123456789d; // 정밀도: 15자리
		System.out.printf("%21.20f%n", bigDecimal);
		bigDecimal = 1234567890123456789.0;
		System.out.printf("%f%n", bigDecimal);

		char character = 'A';
		System.out.println(character);
		System.out.println((int) character);
		// 자바는 문자표현에 유니코드를 사용한다.
		character = '\u0041'; // 유니코드 16진수(A, 65)
		System.out.println(character);

		// 특수문자 표현은 역슬래쉬 사용
		System.out.println("A\tB\"" + '\'');

		boolean bool = false;
		System.out.println(bool);
		bool = true;
		System.out.println(bool);

		// 기본값
		int i = 0;
		long l = 0L;
		float f = 0.0f;
		double d = 0.0d; // d가 붙지 않아도 됨
		char ch = ' '; // 유니코드: \u0000
		boolean bl = false;
		String str = null;
		
		int cast1 = (int)2000000000000L;
		System.out.println(cast1); // 오버플로우 된 값임
		long cast2 = 10;
		System.out.println(cast2);
		int cast3 = (int)50.5;
		System.out.println(cast3);
		float cast4 = (float)5.5;
		System.out.println(cast4);
		
		//문제1. 서로 타입이 다른 변수 4개를 만들고 각 변수를 다른 변수들에 저장해보세요.
		int intNum = 2;
		double doubleNum = 3.3;
		float floatNum = 4.4f;
		char charWord = 'A';

		intNum = (int)doubleNum;
		intNum = (int)floatNum;
		intNum = charWord;
		
		doubleNum = intNum;
		doubleNum = floatNum;
		doubleNum = charWord;
		
		floatNum = intNum;
		floatNum = (float)doubleNum;
		floatNum = charWord;
		
		charWord = (char)intNum;
		charWord = (char)doubleNum;
		charWord = (char)floatNum;

		
		//상수
		final int MAX_NUMBER = 100;
		
	}

}
