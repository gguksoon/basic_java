package b_operator;

public class ComparisonOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean b = 10 < 20; // 비교연산자의 연산결과는 boolean이다.
		// b = true
		
		b = 10 < 20 - 15;
		// b = false("20 - 15"가 먼저 수행된다.)
		
		b = 10 >= 10.0; // (double)10 <= 10.0
		// b = true
		
		b = 65 >= 'B'; // 65 >= 66((int)'B')
		// b = false
		
		b = 10.0f == 10.0;
		// true
		b = 10.1f == 10.1;
		System.out.println(b); // false(정밀도의 차이 때문)
		System.out.printf("%21.20f\n", 10.1f); // 10.1f
		System.out.printf("%21.20f\n", 10.1);  // 10.1
		// float과 double은 정밀도가 달라 float을 double로 형변환하면
		// 소수점을 정확하게 비교할 수 없다.
		System.out.printf("%21.20f\n", (double)10.1f); //오차는 그대로
		System.out.printf("%21.20f\n", (float)10.1);   //오차가 발생
		//double을 float으로 형변환해야 정확하게 비교할 수 있다.
		b = 10.1f == (float)10.1;
		System.out.println(b);
		
		// 대소비교는 boolean을 제외한 기본형 타입만 비교할 수 있지만
		// 등가비교는 모든 타입을 비교할 수 있다.
		b = 'A' == 65;
		System.out.println(b);
		b = true != false;
		System.out.println(b);
		
		b = "abc" == "abc"; // 같은 스트링 리터럴은 같은 주소를 갖는다.
		System.out.println(b);
		b = "abc" == new String("abc"); // false(new는 새로운 주소를 생성한다.)
		System.out.println(b);
		//참조형 타입은 저장된 메모리 주소를 비교하기 때문에
		//String은 등가비교 연산자로 내용을 비교할 수 없다.
		//따라서 equals메서드를 이용한다.
		
		b = "abc".equals(new String("abc"));
		System.out.println(b);
		

	}

}
