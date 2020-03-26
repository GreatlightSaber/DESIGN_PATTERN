package main;

import main.creation.abstractFactory.ComputerFactory;
import main.creation.builder.NutritionFacts;
import main.creation.factoryMethod.ModifiedSuperRobotFactory;
import main.creation.factoryMethod.Robot;
import main.creation.factoryMethod.RobotFactory;
import main.creation.factoryMethod.SuperRobotFactory;

public class Main {

	public static void main(String[] args) {
		
		// 예제 - 팩터리 메서드)
		System.out.println("########## Factory Method ##########\n");
		
		RobotFactory rf = new SuperRobotFactory();
		
		Robot r = rf.createRobot("super");
		Robot r2 = rf.createRobot("power");
		
		System.out.println(r.getName());
		System.out.println(r2.getName());
		
		RobotFactory mrf = new ModifiedSuperRobotFactory();
		
		Robot r3 = mrf.createRobot("main.factoryMethod.SuperRobot");
		Robot r4 = mrf.createRobot("main.factoryMethod.PowerRobot");
		
		System.out.println(r3.getName());
		System.out.println(r4.getName());
		
		/*
		 * 객체를 생성할 때 new 키워드를 사용하지 않음
		 * 객체 생성을 패토리 클래스에 위임한 결과 
		 * 메인 프로그램은 어떤 객체가 생성 되었는지 신경쓰지 않고 단지 변환된 객체를 사용만 하면 된다.
		 * 
		 * */
		
		
		// 예제 - 팩터리 메서드)
		System.out.println("########## Abstract Factory ##########\n");
		
		ComputerFactory computerFactory = new ComputerFactory();
		computerFactory.createComputer("LG");
		
		// 예제 - 빌더 패턴)
		System.out.println("########## Builder ##########\n");
		
		// 예제1
		NutritionFacts.Builder builder = new NutritionFacts.Builder(240, 8);
		builder.calories(100);
		builder.sodium(35);
		builder.carbohydrate(27);
		NutritionFacts coke1 = builder.build();
		
		// 예제2
		NutritionFacts coke2 = new NutritionFacts.Builder(270, 5)
				.calories(150)
				.sodium(30)
				.carbohydrate(50)
				.build();
		
	}
}
