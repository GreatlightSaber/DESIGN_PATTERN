package main.structural.bridge;

public class Bird extends Animal{

	public Bird(HuntingHandler hunting) {
		super(hunting);
		// TODO Auto-generated constructor stub
	}
	
	public void hunt() {
		
		System.out.println("새의 사냥방식");
		
		findQuarry();
		detecteQuarry();
		attack();
	}

}
