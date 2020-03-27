package main.structural.bridge;

import org.junit.Test;

public class Main {
	@Test
	public void test() {
		Animal bird = new Bird(new HuntingMethod1());
		Animal tiger = new Tiger(new HuntingMethod2());
		
		
		tiger.hunt();
		System.out.println("-------------------");
		bird.hunt();
	}
}
