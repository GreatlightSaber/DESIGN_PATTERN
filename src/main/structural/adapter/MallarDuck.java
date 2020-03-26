package main.structural.adapter;

public class MallarDuck implements Duck{

	@Override
	public void quack() {
		System.out.println("Quack");
	}

	@Override
	public void fly() {
		System.out.println("i'm flying");
	}

}
