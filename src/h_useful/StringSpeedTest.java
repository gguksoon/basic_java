package h_useful;

public class StringSpeedTest {

	public static void main(String[] args) {

		//strTest(); // 같은 문장 7.5초
		strTest2(); // 같은 문장 0.016초
		
	}

	static void strTest(){
		String str = "a";
		
		// System.currentTimeMillis(): 현재 시간을 ms로 나타냄
		long start = System.currentTimeMillis();
		for(int i = 0; i < 200000; i++){
			str += "a";
		}
		long end = System.currentTimeMillis() - start;
		// 대략 7.5초가 걸림 <- 매우 느린것임
		System.out.println("[finish] " + end + "ms");
	}
	
	static void strTest2(){
		StringBuffer sb = new StringBuffer("a");
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 200000; i++){
			sb.append("a");
		}
		long end = System.currentTimeMillis() - start;
		// 대략 0.016초가 걸림 <- 매우 빠름
		System.out.println("[finish] " + end + "ms");
	}
}

