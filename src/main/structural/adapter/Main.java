package main.structural.adapter;

import org.junit.Test;

public class Main {
	
	@Test
	public void test() {
		MallarDuck duck = new MallarDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("######### The turkey says...");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("######### The Duck says...");
		testDuck(duck);
		
		System.out.println("######### The TurkeyAdapter says...");
		testDuck(turkeyAdapter);
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
