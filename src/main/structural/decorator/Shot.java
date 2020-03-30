package main.structural.decorator;

public class Shot extends CondimentDecorator{
	Beverage beverage;
	
	public Shot(Beverage beverage) {
		super();
		this.beverage = beverage;
		}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 샷";
	}

	@Override
	public int cost() {
		return beverage.cost() + 400;
	}
}
