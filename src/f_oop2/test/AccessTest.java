package f_oop2.test;

// 다른 패키지 이므로 import
import f_oop2.AccessModifier;

public class AccessTest extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier am = new AccessModifier();
		
		System.out.println(am.publicVar);
		am.publicMethod();
		
		// 상속받았을 때 아래의 protectedTest() 메서드에서는 에러가 발생하지 않음
		//System.out.println(am.protectedVar);	// 에러
		//am.protectedMethod();					// 에러	
		
		//System.out.println(am.defaultVar);	// 에러
		//am.defaultMethod();					// 에러
		
		//System.out.println(am.privateVar);	// 에러
		//am.privateMethod();					// 에러
		
	}
	
	void protectedTest(){
		System.out.println(protectedVar);
		protectedMethod();
	}

}
