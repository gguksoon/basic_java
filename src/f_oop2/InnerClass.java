package f_oop2;

public class InnerClass {

	public static void main(String[] args) {

		/* 내부클래스(inner class)
		   - 클래스 내부에서 선언된 클래스이다.
		   - 선언된 위치와 형태에 따라 여러가지로 나누어진다.
		   - 인스턴스 클래스: 멤버변수 선언위치에 선언하며, 인스턴스 멤버들과 관련된 작업에 사용된다.
		   - 스태틱 클래스: static이 붙고 멤버변수 선언위치에 선언하며, static 멤버들과 관련된 작업에 사용된다.
		   - 지역 클래스: 메서드나 초기화블럭 안에 선언하며, 선언된 영역 내부에서만 사용될 수 있다.
		   - 익명 클래스: 이름이 없고, 선언과 객체 생성을 동시에 한다.(일회용)*/
		Outer.InstanceInner ii = new Outer().new InstanceInner();
		
		// 스태틱 클래스 클래스 변수 접근
		System.out.println(Outer.StaticClass.inner3);
		
		// 스태틱 클래스 인스턴스 변수 접근
		Outer.StaticClass si = new Outer.StaticClass();
		System.out.println(si.inner2);
	}

}

class Outer{
	// 인스턴스 변수
	int instanceVar = 1;
	int var = 10;
	
	// 인스턴스 클래스
	class InstanceInner{
		// 인스턴스 클래스에서는 인스턴스 멤버와 클래스 멤버 모두 사용 가능
		int inner1 = instanceVar;
		int inner2 = classVar;
		int var = 20;
		
		void method(){
			int var = 30;
			System.out.println(var);
			System.out.println(this.var);
			System.out.println(Outer.this.var);
		}
	}
	
	// 클래스 변수
	static int classVar = 2;
	
	// 스태틱 클래스
	static class StaticClass{
		// 스태틱 클래스에서는 클래스 멤버만 사용 가능
//		int inner1 = instanceVar; // 에러 발생
		int inner2 = classVar;
		static int inner3 = classVar;
	}
	
	void method(){
		// 지역 변수
		int localVar1 = 3;
		final int localVar2 = 4; // JDK1.8부터는 지역 클래스가 참조하는 변수에 컴파일러가 자동으로 final을 붙여줌.
		
		// 지역 클래스
		class LocalInner{
			// 지역 클래스에서는 인스턴스 멤버와 클래스 멤버 모두 사용 가능하고
			// final이 붙은 지역변수도 사용 가능
			int inner1 = instanceVar;
			int inner2 = classVar;
//			int inner3 = localVar1; // final이 붙지 않은 지역 변수는 사용 불가
			int inner4 = localVar2;
			
		}
		
	}
	
}





