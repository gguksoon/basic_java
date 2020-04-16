package f_oop2;

import java.util.Vector;

public class Store {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		Desktop d = new Desktop();
		System.out.println(d.getInfo());

		Product l = new Laptop();
		System.out.println(l.getInfo());
		
		TV tv = new TV();
		System.out.println(tv.getInfo());
		
		c.buy(d);
		c.buy(l);
		c.buy(tv);
		
		c.showItem();
		System.out.println(c.money);
	}
}

// 여러가지 물건들이 공통으로 상속받을 수 있는 클래스를 만들 것이다.
// 물건의 가격과 물건에 대한 포인트를 속성으로 가진 Product라는 클래스를 만들어보자.
class Product {

	int price;
	int point;

	// 생성자에서 가격과 포인트를 초기화
	Product(int price) {
		this.price = price;
		point = price / 10;
	}

	String getInfo() {
		return "가격: " + price + "원 / 포인트: " + point + "점";
	}
}

class Desktop extends Product {

	Desktop() {
		// 부모 클래스의 생성자 호출
		super(1000);
	}

	@Override
	String getInfo() {
		return "Desktop - " + super.getInfo();
	}
	
	// Object 클래스에서 상속받은 메서드
	@Override
	public String toString(){
		return "Desktop";
	}
}

class Laptop extends Product {
	
	Laptop() {
		super(2000);
	}
	
	@Override
	String getInfo() {
		return "Laptop - " + super.getInfo();
	}
	
	// Object 클래스에서 상속받은 메서드
	@Override
	public String toString(){
		return "Laptop";
	}
}

class TV extends Product {
	
	TV() {
		super(2000);
	}
	
	@Override
	String getInfo() {
		return "TV - " + super.getInfo();
	}
	
	// Object 클래스에서 상속받은 메서드
	@Override
	public String toString(){
		return "TV";
	}
}

class Customer {

	int money = 10000;
	int point = 0;
	
	Vector<Product> item = new Vector<Product>();
	
	// 구매할 때 받을 파라미터의 타입으로 물건들의 부모클래스를 지정해주면 자식클래스 모두를 받을 수 있따.
	// 부모클래스가 없다면 각 물건을 파라미터로 받는 매서드가 물건의 개수만큼 있어야 할 것이다.
	void buy(Product p){
		if(money < p.price){
			System.out.println("잔돈이 부족하네ㅠㅠ");
			return;
		}
		
		money -= p.price;
		point += p.point;
		
		item.add(p);
		// p는 주소가 나온다. > f_oop2.Desktop@71f801f7을 구매하였습니다.
		// 주소는 오브젝트가 가지고 있다 그래서 오버라이딩으로 바꿔준다.
		// 해결하기 위해서 Desktop 클래스에 
		// public String toString(){ return "Desktop"; }을 정의하면
		// "Desktop을 구매하였습니다."로 출력된다.
		System.out.println(p + "을 구매하였습니다.");
	}
	
	void showItem(){
		String items = "아이템 목록: ";
		for(Product item : this.item){
			items += " " + item;
		}
		System.out.println(items);
	}
	
}
