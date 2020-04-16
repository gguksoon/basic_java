package e_oop;

import java.util.Arrays;

public class OOP {

	public static void main(String[] args) {

		new SampleClass(); 	// 객체 생성(=인스턴스화)
							// 클래스를 사용하기 위해 메모리에 올리기
		
		SampleClass sc = new SampleClass(); // 객체를 변수에 저장
		
		sc.method1();
		
		sc.method2(15); // 타입에 맞는 파라미터를 넘겨준다.
		
		String method3 = sc.method3(); // 리턴타입을 받을 수 있다.
		System.out.println(method3);
		
		int method4 = sc.method4(111);
		System.out.println(method4);
		
		
		
		// 레스토랑
		Restaurant r = new Restaurant(); // 한번쓸거면 Restaurant.method();를 쓰는게 편함
		
		String[] menu = r.getMenu();
		System.out.println(Arrays.toString(menu));
		
		String order1 = r.order(menu[2]);
		System.out.println(order1);
		
		String order2 = r.order("짜장면");
		System.out.println(order2);
		
		r.pay(1000);
		r.pay(0);
		
		
		
		// 문제1. Calculator 클래스에 두개의 숫자를 받아서
		// 더하기, 빼기, 곱하기, 나누기, 나머지를 연산한 결과를 반환하는 메서드를 만들어주세요.
		Calculator c = new Calculator();
		
		// 문제2. 
		// Calculator 클래스를 사용해 다음을 계산해주세요.
		// 1. 123456 + 654321
		// 2. 1번의 결과값 * 123456
		// 3. 2번의 결과값 / 123456
		// 4. 3번의 결과값 - 654321
		// 5. 4번의 결과값 % 123456
		float num1 = 123456;
		float num2 = 654321;
		
		float result = c.add(num1, num2);
		System.out.println("1. " + num1 + " + " + num2 + " = " + result);
		
		float result2 = c.mul(result, num1);
		System.out.println("2. " + result + " * " + num1 + " = " + result2);
		
		float result3 = c.div(result2, num1);
		System.out.println("3. " + result2 + " / " + num1 + " = " + result3);
		
		float result4 = c.min(result3, num2);
		System.out.println("4. " + result3 + " - " + num2 + " = " + result4);
		
		float result5 = c.rem(result4, num1);
		System.out.println("5. " + result4 + " % " + num1 + " = " + result5);
		
		
	}

}
