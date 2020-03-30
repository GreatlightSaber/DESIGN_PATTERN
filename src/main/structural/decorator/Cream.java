package main.structural.decorator;

public class Cream extends CondimentDecorator{
	Beverage beverage;
	
	public Cream(Beverage beverage) {
		super();
		this.beverage = beverage;
		}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 크림";
	}

	@Override
	public int cost() {
		return beverage.cost() + 500;
	}
}
