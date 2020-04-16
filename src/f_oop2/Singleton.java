package f_oop2;

// 싱글톤 패턴: 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴
// final: 상속할 수 없는 클래스
public final class Singleton {

	// 인스턴스를 저장할 변수
	private static Singleton instance; // 싱글톤(클래스명)타입
	
	// 생성자는 클래스의 접근제어자와 같은 접근제어자를 가진다.
	// 객체 생성을 막기 위해 private 접근제어자를 가진 생성자를 선언한다.
	// 생성자의 접근제어자가 private이면 상속도 할 수 없게 된다.
	private Singleton(){
		
	}
	
	// 인스턴스를 반환하는 메서드
	public static Singleton getInstance(){
		// 처음 호출된 때만 객체를 생성한다.
		if(instance == null)
			instance = new Singleton();
		return instance;
	}
	
}
