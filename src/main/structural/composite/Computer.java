package main.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice{
	
	// 복수개의 ComputerDevice 객체를 가리킴
	private List<ComputerDevice> components = new ArrayList<ComputerDevice>();
	
	// ComputerDevice 객체를 Computer 클래스에 추가
	public void addComponenet(ComputerDevice component) {components.add(component);}
	// ComputerDevice 객체를 Computer 클래스에 제거
	public void removeComponenet(ComputerDevice component) {components.remove(component);}

	@Override
	public int getPrice() {
		int price = 0;
		for(ComputerDevice component : components) {
			price += component.getPrice();
		}
		return price;
	}

	@Override
	public int getPower() {
		int power = 0;
		for(ComputerDevice component : components) {
			power += component.getPower();
		}
		return power;
	}
	
}
