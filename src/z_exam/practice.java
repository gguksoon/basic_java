package z_exam;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("탈출은 안되지");
			String id = sc.nextLine();
			if(id.equals("0")) return;
		}
	}
}
