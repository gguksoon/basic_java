package f_oop2.ex_interface;

public class Starcraft {

	public static void main(String[] args) {

		Marine marine = new Marine();
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		SCV scv = new SCV();
		tank.hp--;
		System.out.println(tank.hp);
		scv.repair(tank);
		System.out.println(tank.hp);

		System.out.println(scv instanceof Repairable);
		// marine은 Repairable을 상속받지 않기 때문에 에러발생.. 
//		scv.repair(marine);
	}

}

class Unit{
	int hp;
	final int MAX_HP;
	
	Unit(int hp){
		MAX_HP = hp;
		this.hp = MAX_HP;
	}
}

class Marine extends Unit{

	Marine() {
		super(40);
	}
}

class Tank extends Unit implements Repairable{
	
	Tank(){
		super(150);
	}
}

class Dropship extends Unit implements Repairable{
	
	Dropship(){
		super(125);
	}
}

class SCV extends Unit implements Repairable{
	
	SCV(){
		super(60);
	}
	
	void repair(Repairable r){
		// Repairable 인터페이스를 상속받게 함으로써 수리가 가능한 유닛을 구분했다.
		// 그러나 Repairable에는 멤버가 없기 때문에 아무것도 할 수 없다.
		// hp를 멤버로 가진 Unit으로 형변환을 해줘야 한다.
		if(r instanceof Unit){ // Unit으로 형변환이 가능한지 확인
			Unit u = (Unit)r;
			while(u.hp < u.MAX_HP){
				u.hp++;
			}
		}
	}
}

interface Repairable{
	
}