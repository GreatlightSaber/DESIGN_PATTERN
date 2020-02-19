package main;

import main.factoryMethod.ModifiedSuperRobotFactory;
import main.factoryMethod.Robot;
import main.factoryMethod.RobotFactory;
import main.factoryMethod.SuperRobotFactory;

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
		

	}

}
