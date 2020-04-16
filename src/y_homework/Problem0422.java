package y_homework;

public class Problem0422 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 별 출력
		
		final int STAR_LINE = 5;

		// 1.
		// ----*
		// ---**
		// --***
		// -****
		// *****
		System.out.println("[1번문제]");
		for (int i = 0; i < STAR_LINE; i++) {
			for (int j = STAR_LINE - i; j > 1; j--)
				System.out.print(" ");
			for (int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();

		// 2.
		// *****
		// -****
		// --***
		// ---**
		// ----*
		System.out.println("[2번문제]");
		for (int i = STAR_LINE; i > 0; i--) {
			for (int j = STAR_LINE - i; j > 0; j--)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();

		// 3.
		// ----*----
		// ---***---
		// --*****--
		// -*******-
		// *********
		System.out.println("[3번문제]");
		for (int i = 0; i < STAR_LINE; i++) {
			for (int j = STAR_LINE - i; j > 1; j--)
				System.out.print(" ");
			for (int j = 0; j <= i * 2; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();

		// 4.
		// *********  
		// -*******-  
		// --*****--  
		// ---***---  
		// ----*----  
		
		System.out.println("[4번문제]");
		for (int i = STAR_LINE; i > 0; i--) {
			for (int j = STAR_LINE - i; j > 0; j--)
				System.out.print(" ");
			for (int j = 0; j < (i * 2) - 1; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
	}

}
