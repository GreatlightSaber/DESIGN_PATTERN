package main.structural.bridge;

public class HuntingMethod1 implements HuntingHandler{

	@Override
	public void findQuarry() {
		System.out.println("물 위에서 찾는다.");
	}

	@Override
	public void detectedQuarry() {
		System.out.println("물고기 발견");
	}

	@Override
	public void attack() {
		System.out.println("낚아챈다.");
	}
	
}
