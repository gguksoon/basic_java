package e_oop;

public class Restaurant {
	// 프로그램의 구조: 메뉴판좀주세요 -> 주문이요 -> 계산이요

	// 메서드가 실행되면서 만들어지는게 아닌 클래스가 원래 가지고 있어야하는 것은 전역변수로 만든다.
	String name = "대덕식당";
	String[] menu = { "김밥", "라면", "떡볶이", "오뎅", "순대" };

	// 메뉴판좀주세요
	String[] getMenu() {
		return menu;
	}

	// 주문이요
	String order(String foodName) {
		boolean flag = false; // 주문이 맞는지 확인하기 위한 변수

		for (int i = 0; i < menu.length; i++) {
			if (foodName.equals(menu[i]))
				flag = true;
		}

		if (flag) {
			return "조리된" + foodName;
		} else {
			return foodName + "? 그런거 안팔아요.";
		}

	}
	
	// 계산이요.
	void pay(int money){
		if(money > 0)
			System.out.println("감사합니다. 안녕히 가세요.");
		else
			System.out.println("계산하고 가셔야죠?");
	}

}
