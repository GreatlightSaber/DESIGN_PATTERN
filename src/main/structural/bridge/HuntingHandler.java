package main.structural.bridge;

// 동물이 가질 수 있는 공통적인'사냥 방식' 인터페이스 정의 
public interface HuntingHandler {
	public void findQuarry();
	public void detectedQuarry();
	public void attack();
}
