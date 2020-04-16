package h_useful;

import java.util.Vector;

public class WrapperClass {

	public static void main(String[] args) {

		// Wrapper클래스: 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
		// - boolean : Boolean
		// - char    : Character <<<
		// - byte    : Byte
		// - short   : Short
		// - int     : Integer   <<< 
		// - long    : Long
		// - float   : Float
		// - double  : Double
		
		int i = 10;
		Integer iw = new Integer(20);
		
		// 자동 형변환이 된다.
		System.out.println(iw + i);
		
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		System.out.println(i + Integer.parseInt("20"));
		
		System.out.println(i + String.valueOf(20));
		
	    System.out.println(i + Integer.valueOf("20"));
	    
	    
	    
	    // 벡터클래스
	    Vector<Integer> v = new Vector<Integer>();
	    // 벡터클래스에 참조형과 기본형 둘 다 사용 가능하다.(오토박싱)
	    v.add(new Integer(10)); // 참조형 타입
	    v.add(10); // 기본형 타입 <- 오토박싱됨(오토박싱: 기본형타입이 wrapper클래스로 자동 변환)
	    
	    // v.get(0): 벡터클래스에 0번째에 있는 값 가져오기
	    Integer integer = v.get(0); // Integer형(참조형) 
	    int i2 = v.get(0); // int형(기본형) <- 언박싱됨(언박싱: wrapper클래스가 기본형타입으로 자동 변환)
	}

}
