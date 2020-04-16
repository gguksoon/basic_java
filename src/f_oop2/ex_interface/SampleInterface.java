package f_oop2.ex_interface;

public interface SampleInterface {

		
	/*  < 인터페이스 > 
   		- interface 인터페이스명 {}
   		- 상수와 추상메서드만 멤버로 가질 수 있다.
   		- 모든 멤버변수의 제어자는 public static final 이며, 생략할 수 있다.
   		- 모든 메서드의 제어자는 public abstract 이며, 생략할 수 있다.
   		*/
	
	// 인터페이스의 모든 멤버변수는 public static final 제어자를 사용해야 한다.
	public static final int NUM1 = 1;
	// 모든 멤버변수의 제어자가 같기 떄문에 생략이 가능하다.
	int NUM2 = 2;
	
	// 인터페이스의 모든 메서드는 public abstract 제어자를 사용해야한다.
	public abstract void method1();
	// 모든 메서드의 제어자가 같기 떄문에 생략이 가능하다.
	void method2();
	
	// 이 외에 JDK1.8부터 static 메서드와 디폴트 메서드를 사용할 수 있게 되었다.
}

// 인터페이스를 상속받을 땐 implements를 사용
// 인터페이스는 메서드에 내용이 없기 때문에 메서드명이 중복되어도 구분할 필요가 없다.
// 그러므로 다중상속이 가능하다.
class SampleImplement implements SampleInterface, SampleInterface2{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println(NUM1);
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println(SampleImplement.NUM2);
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}
	
}

interface SampleInterface2 {
	public abstract void method1();
	void method3();
}
