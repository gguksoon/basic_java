package h_useful;

public class MathClass {

	public static void main(String[] args) {
		/*
		- round(): 반올림
		- ceil(): 올림
		- floor(): 내림
		- abs(): 절대값
		- random(): double 난수 발생(0.0이상, 1.0미만)
		*/

		double d1 = 0.5;
		double d2 = -0.5;
		System.out.println("[d1 = 0.5 / d2 = -0.5]");
		
		// round(): 반올림
		System.out.println("Math.round(d1): " + Math.round(d1));
		System.out.println("Math.round(d2): " + Math.round(d2));	
		
		// ceil(): 올림
		System.out.println("Math.ceil(d1): " + Math.ceil(d1));
		System.out.println("Math.ceil(d2): " + Math.ceil(d2));
		
		// floor(): 내림
		System.out.println("Math.floor(d1): " + Math.floor(d1));
		System.out.println("Math.floor(d2): " + Math.floor(d2));
		
		// abs(): 절대값
		System.out.println("Math.abs(d1): " + Math.abs(d1));
		System.out.println("Math.abs(d2): " + Math.abs(d2));
		
		while(true)
			System.out.println(getRandom(10, 9));
	}
	
	public static int getRandom(int from, int to){
		
		return (int)(Math.random() * (Math.abs(to - from) + 1 )) + Math.min(from, to);
	}

}
