package main.structural.bridge;

public class Animal {
	
	private HuntingHandler hunting;
	
	public Animal(HuntingHandler hunting) {
		this.hunting=hunting;
	}
	public void findQuarry() {
		hunting.findQuarry();
	}
	public void detecteQuarry() {
		hunting.detectedQuarry();
	}
	public void attack() {
		hunting.attack();
	}
	public void hunt() {
		findQuarry();
		detecteQuarry();
		attack();
	}
}
