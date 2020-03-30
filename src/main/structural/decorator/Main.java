package main.structural.decorator;

import org.junit.Test;

public class Main {
	@Test
	public void test() {
		Beverage beverage = new Americano();
		beverage = new Shot(beverage);
		beverage = new Shot(beverage);
		
		System.out.println("메뉴 : " + beverage.getDescription());
		System.out.println("가격 : " + beverage.cost());
	}
}
