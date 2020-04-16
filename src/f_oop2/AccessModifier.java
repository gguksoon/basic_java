package f_oop2;

public class AccessModifier {

	public String publicVar = "public: 접근제한이 없음";
	protected String protectedVar = "protected: 같은 패키지 + 상속받은 클래스에서 접근 가능";
	String defaultVar = "default: 같은 패키지에서 접근 가능";
	private String privateVar = "private: 클래스 내에서만 접근 가능";
	
	// 클래스 접근제어자 확인(public): f_oop2 > Inheritance.java 아래쪽에서 사용
	// 자손 접근제어자 확인(protected): f_oop2 > f_oop2.test > AccessTest.java
	
	public void publicMethod(){
		System.out.println(publicVar);
	}
	
	protected void protectedMethod(){
		System.out.println(protectedVar);
	}
	
	void defaultMethod(){
		System.out.println(defaultVar);
	}
	
	private void privateMethod(){
		System.out.println(privateVar);
	}
}
