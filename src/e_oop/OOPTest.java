package e_oop;

import java.util.Scanner;

public class OOPTest {

	public static void main(String[] args) {

		// TV라는 클래스를 생성해 전원상태, 채널, 음량을 변경하는 메서드를 만들어주세요.
		// TV객체 생성시 이름을 지정하게 해주세요.
		// 채널과 음량은 제한을 해주세요.
		// TV상태 변경 후 현재 상태를 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		TV tv0 = new TV();
		TV tv1 = new TV("이름있는 TV");
		
		tv0.info();
		tv1.info();
		
		tv0.channelUp();
		tv0.powerChange();
		tv1.powerChange();
		
		tv0.channelChange(100);
		tv0.channelDown();
		tv0.channelUp();
		tv0.channelUp();
		tv0.channelUp();
		tv0.channelUp();
		tv0.channelChange(150);
		tv0.volumeUp();
		tv0.volumeDown();
		
	}
}

class TV{
	
	final int MAX_CHANNEL = 100; // 최대채널번호
	final int MIN_CHANNEL = 1; // 최소채널번호
	final int MAX_VOLUME = 50; // 최대볼륨
	final int MIN_VOLUME = 0; // 최소볼륨
	
	boolean power; // 전원상태
	int channel; // 채널
	int volume; // 음량
	String name; // tv이름
	
	static int number = 10000; // tv이름을 지정하기 위한 멤버변수 
	
	TV(){
		this.power = false;
		this.channel = 1;
		this.volume = 10;
		this.name = "TV" + number++;
	}
	
	TV(String name){
		this.name = name;
		this.power = false;
		this.channel = 1;
		this.volume = 10;
		this.name = name;
	}
	
	void powerChange(){
		power = !power;
		if(power == true)
			System.out.println("powerOn> ");
		else
			System.out.println("powerDown> ");
		info();
	}
	
	void channelChange(int channel){
		if(power == true){
			System.out.println("channelChange(" + channel + ")> ");
			this.channel = channel;
			if(channel > MAX_CHANNEL)
				this.channel = MAX_CHANNEL;
			else if(channel < MIN_CHANNEL)
				this.channel = MIN_CHANNEL;
			info();
		}
	}
	
	void channelUp(){
		if(power == true){
			System.out.println("channelUp> ");
			if(channel > MAX_CHANNEL)
				channel++;
			info();
		}
	}
	
	void channelDown(){
		if(power == true){
			System.out.println("channelDown> ");
			if(channel > MIN_CHANNEL)
				channel--;
			info();
		}
	}
	
	void volumeUp(){
		if(power == true){
			volume++;
			System.out.println("volumeUp> ");
			if(volume > MAX_VOLUME)
				volume = MIN_VOLUME;
			info();
		}
	}
	
	void volumeDown(){
		if(power == true){
			System.out.println("volumeDown> ");
			volume--;
			if(volume < MIN_VOLUME)
				volume = MAX_VOLUME;
			info();
		}
	}
	
	void info(){
		System.out.println("[" + name + "]" + "전원: " + power + " / 채널: " + channel + " / 볼륨: " + volume + "\n");
	}
	
	
	
	
	
	
	
	
	
	
}