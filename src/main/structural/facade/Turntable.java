package main.structural.facade;

public class Turntable implements Switch{

	@Override
	public void on() {
		System.out.println("턴테이블 작동 [시작]");
		
	}

	@Override
	public void off() {
		System.out.println("턴테이블 작동 [종료]");
		
	}

}
