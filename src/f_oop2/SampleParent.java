package f_oop2;

//상속받지 않는 클래스는 Object 클래스를 상속받는다.
public class SampleParent {

	String parentVariable;
	String var;
	
	SampleParent(String param){
		// super()가 없으면 
		// 컴파일러가 Object 클래스의 생성자를 호출하는 super()를 넣어준다.
		super();
		parentVariable = param;
	}
	
	SampleParent(){
		// 생성자에서 다른 생성자를 호출할 때는 this()를 사용한다.
		this("부모 변수"); // SampleParent(String param) 호출
	}
	
	void parentMethod(){
		System.out.println("부모 메서드");
	}
}
