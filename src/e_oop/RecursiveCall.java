package e_oop;

public class RecursiveCall {

	public static void main(String[] args) {
		// 4! = 4 * 3 * 2 * 1
		int result = factorial(4);
		System.out.println(result);
	}

	private static int factorial(int n) {
		int result = 0;
		
		if(n == 1){
			result = 1;
		} else
			result = n * factorial(n - 1);
		
		return result;
	}

}
