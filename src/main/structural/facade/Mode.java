package main.structural.facade;

public enum Mode {
	FAST(10000)
	,NORMAL(30000)
	,SLOW(60000);
	
	private final int value;
	
	Mode(int value) {this.value = value;}
	
	public int getValue() {
		return this.value;
	}
	
	public String getName() {
		return this.name();
	}
}
