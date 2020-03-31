package main.structural.facade;

public class Magnetron implements Switch{

	@Override
	public void on() {
		System.out.println("쿨러 작동 [시작]");
		
	}

	@Override
	public void off() {
		System.out.println("쿨러 작동 [종료]");
		
	}

}
