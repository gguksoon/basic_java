package d_array;

import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {

		String s = new String("ABCD"); // 참조형 타입을 초기화 하는 방법
		String str = "ABCD"; // String은 특별히 간단하게 초기화 가능

		char[] charArray = str.toCharArray(); // toCharArray()는 문자열을 char 배열로
												// 저장해줌
		System.out.println(charArray); // char 배열은 특별히 배열의 내용이 출력된다.
										// (다른 배열은 배열의 주소가 출력됨)

		// String의 주요 메서드
		// equlas() : 문자열의 내용이 같은지 확인한다.
		// length() : 문자열의 길이를 반환한다.
		// charAt() : 문자열에서 해당 위치에 있는 문자를 반환한다.
		// substring() : 문자열에서 해당 범위에 있는 문자열을 반환한다.
		// indexOf() : 문자열 내의 특정 문자열의 인덱스를 반환한다.
		// replace() : 문자열 내의 특정 문자열을 원하는 문자열로 변경해 반환한다.

		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i)); // charArray[i]와 같다.
		}

		// length(), charAt()
		String revStr = ""; // str을 거꾸로 담을 변수
		// 뒤에서 부터 한글자씩 가져와서 새로운 변수에 더한다.
		for (int i = str.length() - 1; i >= 0; i--) {
			revStr += str.charAt(i);
		}
		
		// substring()
		str = "0123456789";
		String sub1 = str.substring(3); // 1. 3번 인덱스부터 잘라서 반환
		System.out.println(sub1);
		String sub2 = str.substring(5, 8); // 2. 5번 부터 8번 전까지 잘라서 반환
		System.out.println(sub2);
		
		// indexOf()
		str = "치킨 피자 돈까스 떡볶이";
		int idx = str.indexOf("피자"); // 피자의 시작 인덱스를 반환한다.
		System.out.println(idx); // 출력값: 3, 공백은 포함x
		
		// indexOf를 검색하는데 사용할 수 있다.
		String[] stores = new String[3]; // 참조형의 기본값인 null이 저장
		stores[0] = "굽네치킨";
		stores[1] = "피자나라 치킨공주";
		stores[2] = "도미노 피자";
		for(String store : stores){
			int i = store.indexOf("치킨");
			if(0 <= i)
				System.out.println(i + " / " + store);
			else
				System.out.println(i); // 해당되는 문자열이 없는경우 -1을 반환
		}
		
		// substring과 indexOf를 조합해서 문자열을 가져올 수 있다.
		String[] menus = {
				"치킨 18000원",
				"피자 9900원",
				"돈까스 8000원",
				"떡볶이 5000원"
		};
		for(String menu : menus){
			// 메뉴의 이름만 저장
			String name = menu.substring(0, menu.indexOf(" "));
			System.out.println(name);
			// 메뉴의 가격만 저장
			int price = Integer.parseInt(menu.substring(menu.indexOf(" ") + 1, menu.indexOf("원")));
			System.out.println(price);
		}

		// replace()
		str = "123456789";
		str = str.replace("3", "짝");
		System.out.println(str);
		str = str.replace("6", "짝");
		System.out.println(str);
		str = str.replace("9", "짝");
		System.out.println(str);
		
		// 하이픈(-)을 제거해서 출력해주세요.
		String pn = "010-2363-3647";
		pn = pn.replace("-", "");
		System.out.println(pn);
		
		// arg
		for(String arg : args){
			System.out.println(arg);
		}
		
		
		// 문제1. 숫자를 입력받아 입력받은 숫자에 3자리마다 콤마(,)를 붙여 출력해주세요.
		setComma();
		
		
	}
	
	private static void setComma() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.: ");
		String number = sc.nextLine();
		String result = "";
		for(int i = number.length() - 1; i >= 0; i--){
			result = number.charAt(i) + result;
			if((number.length() - i) % 3 == 0 && i != 0)
				result = "," + result;
		}
		System.out.println(result);
	}

}
