package e_oop;

public class SampleTV {
	
	boolean power; // 전원
	int channel; // 채널
	int volume; // 음량
	
	// 기본생성자
	SampleTV(){
		power = false;
		channel = 1;
		volume = 5;
	}
	
	// 전원 ON/OFF 메서드
	void power(){
		power = !power;
	}
	
	// 채널 변경 메서드
	void changeChannel(int channel){
		this.channel = channel;
	}
	
	// 채널UP 메서드
	void channelUp(){
		channel++;
	}
	
	// 채널DOWN 메서드
	void channelDown(){
		channel--;
	}
	
	// 음량UP 메서드
	void volumeUp(){
		volume++;
	}
	
	// 음량DOWN 메서드
	void volumeDown(){
		volume--;
	}
	
}
