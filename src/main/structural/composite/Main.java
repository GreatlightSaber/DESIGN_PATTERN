package main.structural.composite;

import org.junit.Test;

public class Main {
	@Test
	public void test() {
		// 컴퓨터의 ㅜ품으로 Keyboard, Body, Monitor 객체를 생성
		Keyboard keyboard = new Keyboard(5, 2);
		Body body = new Body(100, 70);
		Monitor monitor = new Monitor(20, 30);
		
		// Computer 객체를 생성하고 addComponenet()를 통해 부품 객체들을 설정
		Computer computer = new Computer();
		computer.addComponenet(keyboard);
		computer.addComponenet(body);
		computer.addComponenet(monitor);
		
		// 컴퓨터의 가격과 전력 소비량을 구함
		int computerPrice = computer.getPrice();
		int computerPower = computer.getPower();
		System.out.println("Computer price : " + computerPrice + " 만원");
		System.out.println("Computer power : " + computerPower + " W");
		
	}
}
