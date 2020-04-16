package z_exam;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Exam07 {

	public static void main(String[] args) {
		/*
		[7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯
		다카드 20장을 담는 SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자
		가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인 경우에는 둘 중의 한 장은 광(Kwang)이
		어야 한다. 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
		[연습문제]/ch7/Exercise7_1.java
		class SutdaDeck {
			final int CARD_NUM = 20;
			SutdaCard[] cards = new SutdaCard[CARD_NUM];
			SutdaDeck() {
			
			// (1) 배열 SutdaCard를 적절히 초기화 하시오.
			
			}
		}
		class SutdaCard {
			int num;
			boolean isKwang;
			SutdaCard() {
				this(1, true);
			}
			SutdaCard(int num, boolean isKwang) {
				this.num = num;
				this.isKwang = isKwang;
			}
			// info()대신 Object클래스의 toString()을 오버라이딩했다.
			public String toString() {
				return num + ( isKwang ? "K":"");
			}
		}
		class Exercise7_1 {
			public static void main(String args[]) {
				SutdaDeck deck = new SutdaDeck();
				for(int i=0; i < deck.cards.length;i++)
					System.out.print(deck.cards[i]+",");
			}
		}
		[실행결과]
		1K,2,3K,4,5,6,7,8K,9,10,1,2,3,4,5,6,7,8,9,10,
		[답]
		for(int i = 0; i < cards.length; i++){
			int number = (i + 1) <= 10 ? i + 1 : i - 9;
			boolean kwang = (i < 10) && (i == 0 || i == 2 || i == 7);
			cards[i] = new SutdaCard(number, kwang);
		}
		
		
		[7-2] 문제7-1의 SutdaDeck클래스에 다음에 정의된 새로운 메서드를 추가하고 테스트 하
		시오.
		[주의] Math.random()을 사용하는 경우 실행결과와 다를 수 있음.
		1. 메서드명 : shuffle
		기 능 : 배열 cards에 담긴 카드의 위치를 뒤섞는다.(Math.random()사용)
		반환타입 : 없음
		매개변수 : 없음
		2. 메서드명 : pick
		기 능 : 배열 cards에서 지정된 위치의 SutdaCard를 반환한다.
		반환타입 : SutdaCard
		매개변수 : int index - 위치
		3. 메서드명 : pick
		기 능 : 배열 cards에서 임의의 위치의 SutdaCard를 반환한다.(Math.random()사용)
		반환타입 : SutdaCard
		매개변수 : 없음
		[연습문제]/ch7/Exercise7_2.java
		class SutdaDeck {
			final int CARD_NUM = 20;
			SutdaCard[] cards = new SutdaCard[CARD_NUM];
			SutdaDeck() {
			
			// 문제 7-1의 답이므로 내용생략
			
			}
		
		// (1) 위에 정의된 세 개의 메서드를 작성하시오.
		
		} // SutdaDeck
		class SutdaCard {
			int num;
			boolean isKwang;
			SutdaCard() {
				this(1, true);
			}
			SutdaCard(int num, boolean isKwang) {
				this.num = num;
				this.isKwang = isKwang;
			}
			public String toString() {
				return num + ( isKwang ? "K":"");
			}
		}
		class Exercise7_2 {
			public static void main(String args[]) {
				SutdaDeck deck = new SutdaDeck();
				System.out.println(deck.pick(0));
				System.out.println(deck.pick());
				deck.shuffle();
				for(int i=0; i < deck.cards.length;i++)
					System.out.print(deck.cards[i]+",");
				System.out.println();
				System.out.println(deck.pick(0));
			}
		}
		[실행결과]
		1K
		7
		2,6,10,1K,7,3,10,5,7,8,5,1,2,9,6,9,4,8K,4,3K,
		2
		[답]
		void shuffle(){
			for(int i = 0; i < cards.length * 10; i++){
				int r = (int)(Math.random() * cards.length);
				SutdaCard temp = cards[r];
				cards[r] = cards[0];
				cards[0] = temp;
			}
		}
		
		SutdaCard pick(int index){
			return cards[index];
		}
		
		SutdaCard pick(){
			return cards[(int)(Math.random() * cards.length)];
		}
		
		
		
		[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
		[답]
		정의: 부모메서드의 내용을 재정의 하는것을 의미한다.
		필요성: 자손메서드의 내용을 자손클래스의 스타일에 맞도록 할 수 있기에 필요하다.
			    (개발의 효율성을 높일 수 있다.)
		
		
		
		[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)
			a. 조상의 메서드와 이름이 같아야 한다. o
			b. 매개변수의 수와 타입이 모두 같아야 한다. o
			c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다. x
			d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다. x
		[답]
		c: 
		d: 조상 메서드보다 더 적은 수의 예외를 선언할 수 있다.
		
		
		
		[7-5] 다음의 코드는 컴파일하면 에러가 발생한다. 그 이유를 설명하고 에러를 수정하기
		위해서는 코드를 어떻게 바꾸어야 하는가?
		[연습문제]/ch7/Exercise7_5.java
		class Product
		{
			int price; // 제품의 가격
			int bonusPoint; // 제품구매 시 제공하는 보너스점수
			Product(int price) {
				this.price = price;
				bonusPoint =(int)(price/10.0);
			}
		}
		class Tv extends Product {
			Tv() {}
			public String toString() {
				return "Tv";
			}
		}
		class Exercise7_5 {
			public static void main(String[] args) {
				Tv t = new Tv();
			}
		}
		[답]
		자손클래스의 생성자에서 super()를 이용하여 부모클래스의 생성자를 호출하여야 한다.
		만약 super()를 사용하지 않으면 컴파일러가 자동으로 첫줄에 super()를 생성해준다.
		위 문제의 경우 컴파일러가 자손클래스에서 super()를 사용하여 기본 생성자를 호출하지만
		부모클래스에 기본생성자가 없으므로 에러가 발생한다.
		에러를 없애기 위해서 자손메서드(Tv)의 생성자 Tv()의 첫 줄에 super(price)를 적어줘야 한다.
		ex) Tv() { super(100); }
		 
		
		
		
		[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인
		가?
		[답] 
		자손 클래스의 멤버가 조상 클래스의 멤버를 사용할 수도 있으므로,
		조상의 멤버들이 먼저 초기화되어 있어야 하기 때문
		
				
				
		[7-7] 다음 코드의 실행했을 때 호출되는 생성자의 순서와 실행결과를 적으시오.
		[연습문제]/ch7/Exercise7_7.java
		class Parent {
			int x=100;
			Parent() {
				this(200);
			}
			Parent(int x) {
				this.x = x;
			}
			int getX() {
				return x;
			}
		}
		class Child extends Parent {
			int x = 3000;
			Child() {
				this(1000);
			}
			Child(int x) {
				this.x = x;
			}
		}
		class Exercise7_7 {
			public static void main(String[] args) {
				Child c = new Child();
			System.out.println("x="+c.getX());
			}
		}
		[답]
		<생성자의 순서>
		Child()
		   ↓
		Child(int x) // this(1000)이므로 파라미터에는 1000이 들어간다.
		   ↓			// this()가 있으면 super()를 생성하지 않음
		Parent() // 자동 생성된 super()
		   ↓
		Parent(int x) // this(200)이므로 파라미터에는 200이 들어간다.
		   ↓
		Object() 
		
		부모메서드의 x는 200이 되고 자손메서드의 x는 1000이 된다. 
		
		<실행결과>
		x=200 // 부모클래스의 x를 호출하므로
		
		
		
		[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한
		것은?
			a. public-protected-(default)-private
			b. public-(default)-protected-private
			c. (default)-public-protected-private
			d. private-protected-(default)-public
		[답] a
			
			
			
		[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다.
		옳지 않은 것은? (모두 고르시오)
			a. 지역변수 - 값을 변경할 수 없다. o <- 상수가 됨
			b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다. o <- 조상이 될 수 없다. 변경/확장이 안된다. 
			c. 메서드 - 오버로딩을 할 수 없다. x <- 오버라이딩이 안됨 
			d. 멤버변수 - 값을 변경할 수 없다. o <- 상수가 됨
		[답] c - 오버라이딩이 안됨
		
		
		[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할
		수 없도록 제어자를 붙이고 대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록
		getter와 setter메서드를 추가하라.
		[연습문제]/ch7/Exercise7_10.java
		class MyTv2 {
			boolean isPowerOn;
			int channel;
			int volume;
			final int MAX_VOLUME = 100;
			final int MIN_VOLUME = 0;
			final int MAX_CHANNEL = 100;
			final int MIN_CHANNEL = 1;
			// (1) 알맞은 코드를 넣어 완성하시오.
		}
		class Exercise7_10 {
			public static void main(String args[]) {
				MyTv2 t = new MyTv2();
				t.setChannel(10);
				System.out.println("CH:"+t.getChannel());
				t.setVolume(20);
				System.out.println("VOL:"+t.getVolume());
			}
		}
		[실행결과]
		CH:10
		VOL:20
		[답]
		class MyTv2 {
			private boolean isPowerOn;	// private 추가
			private int channel;		// private 추가
			private int volume;			// private 추가
			final int MAX_VOLUME = 100;
			final int MIN_VOLUME = 0;
			final int MAX_CHANNEL = 100;
			final int MIN_CHANNEL = 1;
			
			// getter와 setter
			public boolean getIsPowerOn(){
				return isPowerOn;
			}
			public void setIsPowerOn(boolean isPowerOn){
				this.isPowerOn = isPowerOn; 
			}
			public int getChannel(){
				return channel;
			}
			public void setChannel(int channel){
				this.channel = channel; 
			}
			public int getVolume(){
				return volume;
			}
			public void setVolume(int volume){
				this.volume = volume; 
			}
		}
		
		
		
		[7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
		기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
		[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
			메서드명 : gotoPrevChannel
			기 능 : 현재 채널을 이전 채널로 변경한다.
			반환타입 : 없음
			매개변수 : 없음
			
		[연습문제]/ch7/Exercise7_11.java
		class MyTv2 {
			// (1) 문제7-10의 MyTv2클래스에 gotoPrevChannel메서드를 추가하여 완성하시오.
		}
		class Exercise7_11 {
			public static void main(String args[]) {
				MyTv2 t = new MyTv2();
				t.setChannel(10);
				System.out.println("CH:"+t.getChannel());
				t.setChannel(20);
				System.out.println("CH:"+t.getChannel());
				t.gotoPrevChannel();
				System.out.println("CH:"+t.getChannel());
				t.gotoPrevChannel();
				System.out.println("CH:"+t.getChannel());
			}
		}
		[실행결과]
		CH:10
		CH:20
		CH:10
		CH:20
		
		[답]
		class MyTv2 {
			private boolean isPowerOn;
			private int channel;
			private int volume;
			private int prevChannel;
			final int MAX_VOLUME = 100;
			final int MIN_VOLUME = 0;
			final int MAX_CHANNEL = 100;
			final int MIN_CHANNEL = 1;
		
			public boolean getIsPowerOn() {
				return isPowerOn;
			}
		
			public void setPowerOn(boolean isPowerOn) {
				this.isPowerOn = isPowerOn;
			}
		
			public int getChannel() {
				return channel;
			}
		
			public void setChannel(int channel) {
				this.prevChannel = this.channel;
				this.channel = channel;
			}
		
			public int getVolume() {
				return volume;
			}
		
			public void setVolume(int volume) {
				this.volume = volume;
			}
			
			public void gotoPrevChannel(){
				int temp = channel;
				channel = prevChannel;
				prevChannel = temp;
			}
		}
		
		
		[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
			a. public은 접근제한이 전혀 없는 접근 제어자이다. o
			b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다. o
			c. 지역변수에도 접근 제어자를 사용할 수 있다. x
			d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다. o
			e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다. o
		[답] c
				
				
				
		[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
		[답] 
		Math클래스에 진입하여 내부를 확인하면
		"Don't let anyone instantiate this class."라는 주석이 있다.
		Math클래스는 인스턴스변수가 하나도 없고, 모두 public static메서드만 존재한다.
		인스턴스를 생성하지 않고 Math클래스의 static메서드만 이용하게 정의되었기에
		생성자의 접근을 제한하여 불필요한 Math의 인스턴스를 생성하지 못하게 만든 것 같습니다.
		
		
		
		[7-14] 문제7-1에 나오는 섯다카드의 숫자와 종류(isKwang)는 사실 한번 값이 지정되면
		변경되어서는 안 되는 값이다. 카드의 숫자가 한번 잘못 바뀌면 똑같은 카드가 두 장이
		될 수 도 있기 때문이다. 이러한 문제점이 발생하지 않도록 아래의 SutdaCard를 수정하시
		오.
		[연습문제]/ch7/Exercise7_14.java
		class SutdaCard {
			int num;
			boolean isKwang;
			SutdaCard() {
				this(1, true);
			}
			SutdaCard(int num, boolean isKwang) {
				this.num = num;
				this.isKwang = isKwang;
			}
			public String toString() {
				return num + ( isKwang ? "K":"");
			}
		}
		class Exercise7_14 {
			public static void main(String args[]) {
				SutdaCard card = new SutdaCard(1, true);
			}
		}
		[답]
		class SutdaCard {
			final int NUM;
			final boolean IS_KWANG;
			SutdaCard() {
				this(1, true);
			}
			SutdaCard(int num, boolean isKwang) {
				this.NUM = num;
				this.IS_KWANG = isKwang;
			}
			public String toString() {
				return NUM + ( IS_KWANG ? "K":"");
			}
		}
		
		
		
		[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은?
				(모두 고르시오.)
		class Unit {}
		
		class AirUnit extends Unit {}
		class GroundUnit extends Unit {}
		
		class Tank extends GroundUnit {}
		class AirCraft extends AirUnit {}
		
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
			a. u = (Unit)ac;
			b. u = ac;
			c. GroundUnit gu = (GroundUnit)u;
			d. AirUnit au = ac;
			e. t = (Tank)u;
			f. GroundUnit gu = t;
		[답]
		     -> AirUnit -> AirCraft
		 Unit 
		     -> GroundUnit -> Tank
		이므로, 
		a: 가능(Unit에 (Unit)ac를 넣음) <- up-casting이므로 
		b: 가능(Unit에 AirCraft를 넣음) <- up-casting
		c: 가능(GroundUnit에 GroundUnit를 넣음) <- 만약 (GroundUnit)을 생략하면 안됨
		d: 가능(AirUnit에 AirCraft를 넣음) <- 자손을 부모에 넣으므로 형변환 생략
		e: 에러.. (Tank에 (Tank)GroundUnit을 넣음) <- 모르겠음
		f: 가능(GroundUnit에 Tank를 넣음)
		
			
		[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
			class Car {}
			class FireEngine extends Car implements Movable {}
			class Ambulance extends Car {}
			
			FireEngine fe = new FireEngine();
			
			a. fe instanceof FireEngine -> true
			b. fe instanceof Movable    -> true <- instanceof해보니 맞음
			c. fe instanceof Object     -> true
			d. fe instanceof Car        -> true
			e. fe instanceof Ambulance  -> false
		[답]
		   -> FireEngine <- Movable(인터페이스) 
		Car 
		   -> Ambulance
		이므로 e만 false가 나온다.
		
		
		
		[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이
		클래스를 상속받도록 코드를 변경하시오.
		class Marine { // 보병
			int x, y; // 현재 위치
			void move(int x, int y) {  지정된 위치로 이동  }
			void stop() {  현재 위치에 정지  }
			void stimPack() {  스팀팩을 사용한다.}
		}
		class Tank { // 탱크
			int x, y; // 현재 위치
			void move(int x, int y) {  지정된 위치로 이동  }
			void stop() {  현재 위치에 정지  }
			void changeMode() {  공격모드를 변환한다. }
		}
		class Dropship { // 수송선
			int x, y; // 현재 위치
			void move(int x, int y) {  지정된 위치로 이동  }
			void stop() {  현재 위치에 정지  }
			void load() {  선택된 대상을 태운다. }
			void unload() {  선택된 대상을 내린다. }
		}
		[답]
		abstract class Unit{
			int x, y; // 현재 위치
			abstract void move(int x, int y) {  지정된 위치로 이동  }
			void stop() {  현재 위치에 정지  }
		}
		class Marine extends Unit{ // 보병
			void move(int x, int y) {  지정된 위치로 이동  }
			void stimPack() {  스팀팩을 사용한다.}
		}
		class Tank extends Unit{ // 탱크
			void move(int x, int y) {  지정된 위치로 이동  }
			void changeMode() {  공격모드를 변환한다. }
		}
		class Dropship extends Unit { // 수송선
			void move(int x, int y) {  지정된 위치로 이동  }
			void load() {  선택된 대상을 태운다. }
			void unload() {  선택된 대상을 내린다. }
		}
		
		
		[7-18] 다음과 같은 실행결과를 얻도록 코드를 완성하시오.
		[Hint] instanceof연산자를 사용해서 형변환한다.
		
			메서드명 : action
			기 능 : 주어진 객체의 메서드를 호출한다.
			DanceRobot인 경우, dance()를 호출하고,
			SingRobot인 경우, sing()을 호출하고,
			DrawRobot인 경우, draw()를 호출한다.
			반환타입 : 없음
			매개변수 : Robot r - Robot인스턴스 또는 Robot의 자손 인스턴스
			
		[연습문제]/ch7/Exercise7_18.java
		class Exercise7_18 {
			// (1) action메서드를 작성하시오.
			public static void main(String[] args) {
				Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
				for(int i=0; i< arr.length;i++)
					action(arr[i]);
				} // main
		}
		class Robot {}
			class DanceRobot extends Robot {
				void dance() {
					System.out.println("춤을 춥니다.");
				}
			}
			class SingRobot extends Robot {
				void sing() {
				System.out.println("노래를 합니다.");
				}
			}
			class DrawRobot extends Robot {
				void draw() {
				System.out.println("그림을 그립니다.");
			}
		}
		[실행결과]
		춤을 춥니다.
		노래를 합니다.
		그림을 그립니다.
		[답]
		private static void action(Robot robot) {
			if(robot instanceof DanceRobot)
				((DanceRobot) robot).dance();
			else if(robot instanceof SingRobot)
				((SingRobot) robot).sing();
			else if(robot instanceof DrawRobot)
				((DrawRobot) robot).draw();
		}	
			
		
		
		[7-19] 다음은 물건을 구입하는 사람을 정의한 Buyer클래스이다. 이 클래스는 멤버변수
		로 돈(money)과 장바구니(cart)를 가지고 있다. 제품을 구입하는 기능의 buy메서드와 장
		바구니에 구입한 물건을 추가하는 add메서드, 구입한 물건의 목록과 사용금액, 그리고 남
		은 금액을 출력하는 summary메서드를 완성하시오.
			
			1. 메서드명 : buy
			기 능 : 지정된 물건을 구입한다. 가진 돈(money)에서 물건의 가격을 빼고,
			장바구니(cart)에 담는다.
			만일 가진 돈이 물건의 가격보다 적다면 바로 종료한다.
			반환타입 : 없음
			매개변수 : Product p - 구입할 물건
			2. 메서드명 : add
			기 능 : 지정된 물건을 장바구니에 담는다.
			만일 장바구니에 담을 공간이 없으면, 장바구니의 크기를 2배로 늘린 다음에 담는다.
			반환타입 : 없음
			매개변수 : Product p - 구입할 물건
			3. 메서드명 : summary
			기 능 : 구입한 물건의 목록과 사용금액, 남은 금액을 출력한다.
			반환타입 : 없음
			매개변수 : 없음
			
		[연습문제]/ch7/Exercise7_19.java
		class Exercise7_19 {
			public static void main(String args[]) {
				Buyer b = new Buyer();
				b.buy(new Tv());
				b.buy(new Computer());
				b.buy(new Tv());
				b.buy(new Audio());
				b.buy(new Computer());
				b.buy(new Computer());
				b.buy(new Computer());
				b.summary();
			}
		}
		class Buyer {
			int money = 1000;
			Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
			int i = 0; // Product배열 cart에 사용될 index
			void buy(Product p) {
				// (1) 아래의 로직에 맞게 코드를 작성하시오.
				// 1.1 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다.
				// 1.2 가진 돈이 충분하면, 제품의 가격을 가진 돈에서 빼고
				// 1.3 장바구니에 구입한 물건을 담는다.(add메서드 호출)
			}
			void add(Product p) {
				// (2) 아래의 로직에 맞게 코드를 작성하시오.
				// 1.1 i의 값이 장바구니의 크기보다 같거나 크면
				// 1.1.1 기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
				// 1.1.2 기존의 장바구니의 내용을 새로운 배열에 복사한다.
				// 1.1.3 새로운 장바구니와 기존의 장바구니를 바꾼다.
				// 1.2 물건을 장바구니(cart)에 저장한다. 그리고 i의 값을 1 증가시킨다.
			} // add(Product p)
			void summary() {
				// (3) 아래의 로직에 맞게 코드를 작성하시오.
				// 1.1 장바구니에 담긴 물건들의 목록을 만들어 출력한다.
				// 1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
				// 1.3 물건을 사고 남은 금액(money)를 출력한다.
			} // summary()
		}
		class Product {
			int price; // 제품의 가격
			Product(int price) {
				this.price = price;
			}
		}
		class Tv extends Product {
			Tv() { super(100); }
			public String toString() { return "Tv"; }
		}
		class Computer extends Product {
			Computer() { super(200); }
			public String toString() { return "Computer";}
		}
		class Audio extends Product {
			Audio() { super(50); }
			public String toString() { return "Audio"; }
		}
		[실행결과]
		잔액이 부족하여 Computer을/를 살수 없습니다.
		구입한 물건:Tv,Computer,Tv,Audio,Computer,Computer,
		사용한 금액:850
		남은 금액:150
		[답]
		void buy(Product p) {
			if(money >= p.price){
				money -= p.price;
				add(p);
			} else{
				System.out.println("돈이 부족합니다.");
			}		
		}
		void add(Product p) {
			if(i >= cart.length){
				 Product[] temp = new Product[cart.length * 2];
				 System.arraycopy(cart, 0, temp, 0, cart.length);
				 cart = temp;
			}
			cart[i] = p;
			i++;
		}
		void summary() {
			int sum = 0;
			System.out.print("구입한 물건: ");
			for(Product p : cart){
				System.out.print(p + ",");
				sum += p.price;
			}
			System.out.println("\n사용한 금액: " + sum);
			System.out.println("남은 금액: " + money);
		} 
		
		
		
		[7-20] 다음의 코드를 실행한 결과를 적으시오.
		[연습문제]/ch7/Exercise7_20.java
		class Exercise7_20 {
			public static void main(String[] args) {
				Parent p = new Child();
				Child c = new Child();
				System.out.println("p.x = " + p.x);
				p.method();
				System.out.println("c.x = " + c.x);
				c.method();
			}
		}
		class Parent {
			int x = 100;
			void method() {
				System.out.println("Parent Method");
			}
		}
		class Child extends Parent {
			int x = 200;
			void method() {
				System.out.println("Child Method");
			}
		}
		[답]
		p.x = 100
		Child Method
		c.x = 200
		Child Method

		
		
		
		[7-21] 다음과 같이 attack메서드가 정의되어 있을 때, 이 메서드의 매개변수로 가능한
		것 두 가지를 적으시오.
		interface Movable {
			void move(int x, int y);
		}
		void attack(Movable f) {
			// 내용 생략
		}
		[답]
		Movable은 인터페이스..
		Movable타입과 null이 가능
		
		
		
		[7-22] 아래는 도형을 정의한 Shape클래스이다. 이 클래스를 조상으로 하는 Circle클래
		스와 Rectangle클래스를 작성하시오. 이 때, 생성자도 각 클래스에 맞게 적절히 추가해야
		한다.
		
			(1) 클래스명 : Circle
				조상클래스 : Shape
				멤버변수 : double r - 반지름
			(2) 클래스명 : Rectangle
				조상클래스 : Shape
				멤버변수 : double width - 폭
						double height - 높이
				메서드 :
					1. 메서드명 : isSquare
					기 능 : 정사각형인지 아닌지를 알려준다.
					반환타입 : boolean
					매개변수 : 없음
					
		[연습문제]/ch7/Exercise7_22.java
		abstract class Shape {
			Point p;
			Shape() {
				this(new Point(0,0));
			}
			Shape(Point p) {
				this.p = p;
			}
			abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
			Point getPosition() {
				return p;
			}
			void setPosition(Point p) {
				this.p = p;
			}
		}
		class Point {
			int x;
			int y;
			Point() {
				this(0,0);
			}
			Point(int x, int y) {
				this.x=x;
				this.y=y;
			}
			public String toString() {
				return "["+x+","+y+"]";
			}
		}
		[답]
		class Circle extends Shape{

			Point p;
			Shape() {
				this(new Point(0,0));
			}
			Shape(Point p) {
				this.p = p;
			}
			abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
			
			Point getPosition() {
				return p;
			}
			void setPosition(Point p) {
				this.p = p;
			}
		}
		class Rectangle extends Shape{
			double width; // 폭
			double height; // 높이
			
			Rectangle(){
				this(0, 0);
			}
			
			Rectangle(double width, double height){
				this.width = width;
				this.height = height;
			}
			
			@Override
			double calcArea() {
				return width * height;
			}
			boolean isSquare() {
				if(width == height && width != 0 && height != 0)
					return true;
				else 
					return false;
			}
		}
		
		
		
		[7-23] 문제7-22에서 정의한 클래스들의 면적을 구하는 메서드를 작성하고 테스트 하시
		오.
			1. 메서드명 : sumArea
			기 능 : 주어진 배열에 담긴 도형들의 넓이를 모두 더해서 반환한다.
			반환타입 : double
			매개변수 : Shape[] arr
			
		[연습문제]/ch7/Exercise7_23.java
		class Exercise7_23
		{
		
			// (1) sumArea메서드를 작성하시오.
		
			public static void main(String[] args)
			{
				Shape[] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
				System.out.println("면적의 합:"+sumArea(arr));
			}
		}
		[실행결과]
		면적의 합:93.68140899333463
		[답]
		static double sumArea(Shape[] arr){
			double sum = 0.0;
			for(Shape i : arr){
				sum += i.calcArea();
				System.out.println(i.calcArea());
			}
			return sum;
		}
		> math.pi를 사용하지 않고 pi를 3.14로 지정했기때문에 합은 93.64가 나온다.
		
		
		
		[7-24] 다음 중 인터페이스의 장점이 아닌 것은?
			a. 표준화를 가능하게 해준다. o
			b. 서로 관계없는 클래스들에게 관계를 맺어 줄 수 있다. o
			c. 독립적인 프로그래밍이 가능하다. o
			d. 다중상속을 가능하게 해준다. o
			e. 패키지간의 연결을 도와준다.
		[답] e
		
		
		
		[7-25] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
		[연습문제]/ch7/Exercise7_25.java
		class Outer {
			class Inner {
				int iv=100;
			}
		}
		class Exercise7_25 {
			public static void main(String[] args) {
				// (1) 알맞은 코드를 넣어 완성하시오.
			}
		}
		[실행결과]
		100
		[답]
		Outer.Inner oi = new Outer().new Inner();
		System.out.println(oi.iv);
		
		
		
		[7-26] Outer클래스의 내부 클래스 Inner의 멤버변수 iv의 값을 출력하시오.
		[연습문제]/ch10/Exercise7_26.java
		class Outer {
			static class Inner {
				int iv=200;
			}
		}
		class Exercise7_26 {
			public static void main(String[] args) {
				// (1) 알맞은 코드를 넣어 완성하시오.
			}
		}
		[실행결과]
		200
		[답]
		Outer.Inner oi = new Outer.Inner();
		System.out.println(oi.iv);
		
		
		
		[7-27] 다음과 같은 실행결과를 얻도록 (1)~(4)의 코드를 완성하시오.
		[연습문제]/ch7/Exercise7_27.java
		class Outer {
			int value=10;
			class Inner {
				int value=20;
				void method1() {
					int value=30;
					System.out.println( (1) );
					System.out.println( (2) );
					System.out.println( (3) );
				}
			} // Inner클래스의 끝
		} // Outer클래스의 끝
		class Exercise7_27 {
			public static void main(String args[]) {
			// (4) 알맞은 코드를 넣어 완성하시오.
				inner.method1();
			}
		}
		[실행결과]
		30
		20
		10
		[답]
		(1) System.out.println( value );
		(2) System.out.println( this.value );
		(3) System.out.println( Outer.this.value );
		(4) Outer.Inner inner = new Outer().new Inner();
		
		
		[7-28] 아래의 EventHandler를 익명 클래스(anonymous class)로 변경하시오.
		[연습문제]/ch7/Exercise7_28.java
		import java.awt.*;
		import java.awt.event.*;
		class Exercise7_28
		{
			public static void main(String[] args)
			{
				Frame f = new Frame();
				f.addWindowListener(new EventHandler());
			}
		}
		class EventHandler extends WindowAdapter
		{
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		}
		[답]
		class Exercise7_28
		{
			public static void main(String[] args) {
				Frame f = new Frame();
				f.addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						e.getWindow().setVisible(false);
						e.getWindow().dispose();
						System.exit(0);
					}
				});
			}
		}
		
		
		[7-29] 지역 클래스에서 외부 클래스의 인스턴스 멤버와 static멤버에 모두 접근할 수
		있지만, 지역변수는 final이 붙은 상수만 접근할 수 있는 이유 무엇인가?
		[답] 메서드가 수행을 마쳐서 지역변수가 소멸된 시점에도 지역 클래스의 인스턴스가 소멸된
		     지역변수를 참조하려는 경우가 발생할 수 있기 때문이다.
		*/
		
		
	}

}
