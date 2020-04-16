package f_oop2.ex_abstract;

public abstract class SampleAbstractParent {
	/*
	 * < 추상클래스와 추상메서드 >
	   - abstract class 클래스명 {}
	   - abstrace 리턴타입 메서드명();
	   - 구현부가 없이 선언부만 존재하는 메서드를 추상메서드라고 한다.
	   - 추상메서드는 클래스 구현에 도움을 주기위해 사용한다.
	   - 추상메서드를 가진 클래스를 추상클래스라고 한다.
	 */
	
	// 일반 메서드
	void method(){ // 선언부
		// 구현부
	}
	// 추상 메서드: 선언부만 있고 구현부는 없는 메서드
	abstract void abstractMethod();
	abstract void abstractMethod2();
}

class SampleAbstractChild extends SampleAbstractParent{

	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
	}
	@Override
	void abstractMethod2() {
		// TODO Auto-generated method stub
	}
	
	// 추상메서드를 상속받으면 반드시 구현해야 한다.
	// 상속받은 추상메서드를 추상메서드로 남겨두려면 클래스를 추상클래스로 변경해야 한다.
	
}