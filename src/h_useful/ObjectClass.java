package h_useful;

public class ObjectClass {

	public static void main(String[] args) {

		// toString(): 객체에 대한 정보를 문자열로 제공한다.
		
		ObjectClass oc = new ObjectClass();
 
		System.out.println(oc);
		// 출력값: h_useful.ObjectClass@3654919e (클래스명@해시코드(16진수))
		// ALT + SHIFT + S > S > OK 하면 toString 오버라이딩 자동 생성
	}

	@Override
	public String toString() {
		return "ObjectClass []";
	}

}
