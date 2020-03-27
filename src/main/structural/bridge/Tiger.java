package main.structural.bridge;

public class Tiger extends Animal{

	public Tiger(HuntingHandler hunting) {
		super(hunting);
		// TODO Auto-generated constructor stub
	}
	
	public void hunt() {
		
		System.out.println("호랑이의 사냥방식");
		
		findQuarry();
		detecteQuarry();
		attack();
	}

}
