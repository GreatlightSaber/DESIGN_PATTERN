package main.structural.facade;

public class Cooler implements Switch{

	@Override
	public void on() {
		System.out.println("마이크로파 발생기 작동 [시작]");
		
	}

	@Override
	public void off() {
		System.out.println("마이크로파 발생기 작동 [종료]");
		
	}

}
