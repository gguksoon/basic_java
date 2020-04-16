package e_oop;

import java.util.Arrays;

public class OOPetc {
	
	public static void main(String[] args){
		
		// 객체를 생성하지 않고 대표와 메뉴 찾아보기
		String ceo = RestaurantGroup.ceo;
		System.out.println("대표: " + ceo);
		
		String[] restaurants = RestaurantGroup.restaurants;
		String[][] menus = RestaurantGroup.menus;
		
		for(int i = 0; i < restaurants.length; i++){
			System.out.println(restaurants[i] + ": " + Arrays.toString(menus[i]));
		}
		
		
		// 객체 생성
		RestaurantGroup rg1 = new RestaurantGroup(); // 파라미터가 없는 생성자를 참조하여 restaurants[0]이 됨
		RestaurantGroup rg2 = new RestaurantGroup(restaurants[1]);
		RestaurantGroup rg3 = new RestaurantGroup(restaurants[2]);
		
		
		// menu1~menu3에 메뉴를 받기 / 주문하기 / 계산하기
		String[] menu1 = rg1.getMenu();
		String[] menu2 = rg2.getMenu();
		String[] menu3 = rg3.getMenu();
		
		System.out.println(Arrays.toString(menu1));
		System.out.println(Arrays.toString(menu2));
		System.out.println(Arrays.toString(menu3));
		
		String[] order = rg3.order(new String[]{"와퍼", "사이다", "감자튀김"});
		System.out.println(Arrays.toString(order));
		
		rg3.pay(2000);
		
		
		// 클래스로 접근하지 않고 인스턴스로도 접근이 가능
		System.out.println(rg1.ceo);
		System.out.println(rg2.ceo);
		System.out.println(rg3.ceo);
		
		rg1.ceo = "홍길동"; // 주소가 중복된 것을 확인할 수 있음
		
		System.out.println(rg1.ceo); // 인스턴스로 접근
		System.out.println(rg2.ceo);
		System.out.println(rg3.ceo);
		
		
		// 인스턴스로 접근하면 인스턴스 멤버라고 생각할 수 있으므로
		// 클래스 멤버는 반드시 클래스를 통해 접근하도록 하자
		System.out.println(RestaurantGroup.ceo); // 클래스로 접근
		
		int callTest1 = 0;
		System.out.println(callTest1);
		callTest1(callTest1);
		System.out.println(callTest1);
		
		System.out.println(Arrays.toString(menu1));
		callTest2(menu1);
		System.out.println(Arrays.toString(menu1));
		
		String str = "ABC";
		System.out.println(str);
		callTest3(str);
		System.out.println(str);
	}

	private static void callTest3(String str) {
		str += "DEF"; // 새로운 문자열을 만들어  주소를 바꾸므로 이 곳의 str은 기존의 str과 달라짐
	}

	private static void callTest2(String[] menu1) {
		menu1[0] = "짜장면";
	}

	private static void callTest1(int callTest1) {
		callTest1 = 1;
	}
	

}
