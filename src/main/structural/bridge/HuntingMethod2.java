package main.structural.bridge;

public class HuntingMethod2 implements HuntingHandler{

	@Override
	public void findQuarry() {
		System.out.println("지상에서 찾는다.");
	}

	@Override
	public void detectedQuarry() {
		System.out.println("노루 발견");
	}

	@Override
	public void attack() {
		System.out.println("물어뜯는다.");
	}
	
}
