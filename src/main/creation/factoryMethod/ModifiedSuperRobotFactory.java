package main.creation.factoryMethod;

public class ModifiedSuperRobotFactory extends RobotFactory{

	@Override
	public Robot createRobot(String name) {
		try {
			Class<?> cls = Class.forName(name);
			Object obj = cls.newInstance();
			return (Robot)obj;
		}catch(Exception e) {
			return null;
		}
	}

}
