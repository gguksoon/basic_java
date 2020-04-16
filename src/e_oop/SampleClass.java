package e_oop;
// import는 다른 패키지를 사용하기 위한 것.
public class SampleClass {
	
	int field = 10; // 필드 멤버변수 전역변수(메서드 밖에 선언된 변수를 3가지로 부름)

	// 매개변수도 리턴타입도 없는 메서드
	void method1(){
		System.out.println("나는 줄것도 받을것도 없다.");
	}
	
	// 명령의 수행에 필요한 정보: 매개변수 파라미터 아규먼트(같은 말)
	void method2(int parameter){
		System.out.println(parameter + "을 받았다.");
	}
	
	// 명령 수행 후 결과를 돌려주는 것: 반환타입 리턴타입
	String method3(){
		return "결과물 받아라.";
	}
	
	int method4(int a){
		int result = a + field;
		return result;
	}
	
	
}
