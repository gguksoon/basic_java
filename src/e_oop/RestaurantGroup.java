package e_oop;

public class RestaurantGroup {

	// 클래스 변수
	// 사용이유1. 객체를 사용하지 않고 사용할 수 있다.
	// 사용이유2. 객체들이 값을 공유해야 할 때
	static String ceo = "김승섭"; // 명시적 초기화 (1번째)
	static String[] restaurants; // 체인점 목록
	static String[][] menus; // 체인점들 메뉴 목록
	
	// 인스턴스 변수
	String name; // 선택한 체인점 상호
	String[] menu; // 선택한 체인점 메뉴
	
	static { // static이 붙은 전역변수를 초기화 하기 위해선 static {} 사용
		restaurants = new String[]{"대덕김밥", "대덕반점", "대덕버거"};
		
		menus = new String[3][];
		menus[0] = new String[]{"김밥", "라면", "떡볶이", "오뎅", "순대"};
		menus[1] = new String[]{"짜장면", "짬뽕", "볶음밥", "탕수육"};
		menus[2] = new String[]{"불고기버거", "와퍼", "상하이버거", "콜라", "사이다", "감자튀김"};
	}
	
	// 객체를 생성할 때 호출하던 메서드가 바로 생성자이다.
	// 생성자는 인스턴스변수를 초기화하거나 인스턴스화 할 때 필요한 작업을 위해 사용한다.
	RestaurantGroup(String name) {
		// 생성자를 통한 초기화(3번째)
		
		// 셋 중 하나를 선택하기 위한 정보가 없으므로 정보를 파라미터로 받는다.
		// 생성자엔 리턴타입은 있을 수 없다.
		for(int i = 0; i < restaurants.length; i++){
			if(restaurants[i].equals(name)){
				name = restaurants[i];
				menu = menus[i];
			}
		}
	}
	
	// 같은 이름의 메서드를 여러개 만드는 것을 오버로딩이라 한다.
	RestaurantGroup() {
		this(restaurants[0]); 	// 생성자에서 생성자를 호출 할때는 반드시 this()를 사용한다.
								// 가장 첫줄에 와야됨, 파라미터가 1개인 생성자 호출
	}
	
	// 메뉴판 좀 주세요.
	String[] getMenu(){
		return menu;
	}
	
	// 주문이요.(1개주문)
	String order(String menu){
		boolean flag = false; // 주문이 맞는지 확인하기 위한 변수
		
		for(int i = 0; i < this.menu.length; i++)
			if(menu.equals(this.menu[i]))
				flag = true;
		
		if(flag)
			return "조리된" + menu;
		else
			return menu + "? 그런거 안팔아요.";
	}
	
	// 주문이요.(2개주문)
	// 메뉴 배열을 파라미터로 받는 메서드
	String[] order(String[] menu){
		boolean[] flag = new boolean[menu.length];
		String[] rtnMenu = new String[menu.length];
		
		for(int i = 0; i < menu.length; i++){
			for(int j = 0; j < this.menu.length; j++){
				if(menu[i].equals(this.menu[j])){
					flag[i] = true;
				}
			}
		}
		
		for(int i = 0; i < flag.length; i++){
			if(flag[i])
				rtnMenu[i] = "조리된" + menu[i];
			else
				System.out.println(menu[i] + "? 그런거 안팔아요.");
		}
		
		return rtnMenu;
	}
	
	// 계산이요
	void pay(int money){
		if(money > 0)
			System.out.println("감사합니다. 안녕히가세요.");
		else
			System.out.println("계산하고 가셔야죠?");
	}
	
}
