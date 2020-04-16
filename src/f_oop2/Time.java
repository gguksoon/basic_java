package f_oop2;

public class Time {

	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if(hour < 0){
			this.hour = 0;
		} else if(hour > 23){
			this.hour = hour;
			timeCarry();
		} else{
			this.hour = hour;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0){
			this.minute = 0;
		} else if(minute > 59){
			this.minute = minute;
			timeCarry();
		} else{
			this.minute = minute;
		}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0){
			this.second = 0;
		} else if(second > 59){
			this.second = second;
			timeCarry();
		} else{
			this.second = second;
		}
	}
	
	private void timeCarry(){
		int temp;
		temp = this.second;
		this.second %= 60;
		this.minute += temp / 60;
		
		temp = this.minute;
		this.minute %= 60;
		this.hour += temp / 60;
		
		temp = this.hour;
		this.hour %= 24;
		// this.day += temp / 24;
	}
	
	@Override
	public String toString() {
		return hour + " : " + minute + " : " + second;
	}
	
}
