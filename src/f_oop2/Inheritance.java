package f_oop2;

import java.util.Vector;

public class Inheritance {

	public static void main(String[] args) {

		SampleParent sp = new SampleParent();
		System.out.println(sp.parentVariable);
		sp.parentMethod();
		
		SampleChild sc = new SampleChild();
		System.out.println(sc.childVariable);
		sc.childMethod();
		// 상속받은 부모의 변수와 메서드를 사용할 수 있다.
		System.out.println(sc.parentVariable);
		sc.parentMethod();
		
		// 부모타입으로 자식 인스턴스 생성
		SampleParent poly = new SampleChild();
		// 부모타입으로 선언하면 부모클래스의 멤버만 사용이 가능하다.
		// 자식클래스의 인스턴스이기 때문에 실제로 실행되는 것은 자식클래스의 오버라이딩된 메서드이다.
		System.out.println(poly.parentVariable);
		poly.parentMethod();
		// 자식 클래스에 있는 멤버는 사용할 수 없다.
		// System.out.println(poly.childVariable);
		// poly.childMethod();
		
		
		
		
		// <>는 제네릭
		Vector<String> v = new Vector<String>();
		
		v.add("A");
		v.add("B");
		v.add("C");
		
		if(!v.isEmpty()){
			for(int i = 0; i < v.size(); i++){
				System.out.println(v.get(i));
			}
			
			boolean remove = v.remove("A");
			System.out.println(remove);
			System.out.println(v.size());
		}
		
		
		// AccessModifier.java의 class 단위 확인
		AccessModifier am = new AccessModifier();
		System.out.println(am.publicVar);
		am.publicMethod();
		
		System.out.println(am.protectedVar);
		am.protectedMethod();
		
		System.out.println(am.defaultVar);
		am.defaultMethod();
		
		//System.out.println(am.privateVar);	// 에러
		//am.privateMethod();					// 에러
		
		
		
		
		
		// Time
		Time t = new Time();
		/*t.setHour(30);
		t.setMinute(100);
		t.setSecond(1000);
		System.out.println(t.toString());*/
		// 30 : 100 : 1000 이라고 나옴
		
		// 문제1. Time 클래스의 유효성을 체크하는 로직을 만들어주세요.
		// 위에서 30시 100분 1000초가 나왔었는데 수정 후 23:59:59가 나옴
		
		// 문제2. Time 클래스의 시분초 셋팅 시 초과되는 부분을 고려한 로직을 만들어주세요.
		//t.setHour(100000);
		//t.setMinute(100000);
		t.setSecond(100000);
		System.out.println(t);
		
		
		
		
		
		
		
		// singleton
		Inheritance i1 = new Inheritance();
		Inheritance i2 = new Inheritance();
		System.out.println(i1 == i2 ? "같다" : "다르다");
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2 ? "같다" : "다르다");
	}

}
