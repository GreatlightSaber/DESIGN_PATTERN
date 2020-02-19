package main.factoryMethod;

/*
 * 
 * 팩토리 메서드 패턴 (Factory Method Pattern)
 * 	객체의 생성은 일반적으로 new를 사용해 구체적인 클래스 이름을 지정한다.
 * 	팩토리 메소드 패턴은 사람이 직접 무엇인가를 만드는 것이 아니라 공장(Factory)에서 지정된 방식으로 대신 클래스를 생성해주는 방식이다.
 * 	일반적으로 팩토리 메서드 패턴은 사용자 코드에서 new를 사용하는 대신에 클래스의 static method(일반적으로 create)를 사용해 객체를 대리생성한다. -> 객체 만들어내는 부분을 서브 클래스에 위임하는 패턴
 * 	즉, 객체를 만들어내는 공장(Factory 객체)을 만드는 패턴
 * 
 * 
 * 	
 * 	아주 가끔 팩토리에 귀속되는 객체를 만들고자 할 때 static을 사용하지 않음
 * 	
 * 	※팩토리 메서드 패턴에서는 객체가 아닌 클래스를 사용해서 객체를 생성
 * 	
 *  * 사용해야하는 경우
 *  	- 생성하려고 하는 객체의 상위개념 클래스나 인터페이스가 존재하고, 이런 상위개념 클래스나 인터페이스를 바탕으로 다양한 하위 클래스들이 존재할때
 *  	- 클래스간의 결합도를 낮추기 위한것입니다. -> 클래스 변경점이 생겼을 때 얼마나 다른 클래스에도 영향을 주는가
 *  
 *  * 팩토리 메소드 장점
 *  	- 관리용이성 - 클래스 이름대신 팩토리 메소드를 사용해 객체를 생성하기 때문에, 추후 실제 생성되는 객체가 바뀌거나 추가되어도 문제가 없다.
 *  	- 보안성 - 클래스의 대부분의 내용은 숨기고 싶을때, 인터페이스나 abstract를 통해서만 객체에 접근하게 할 수 있다.
 *  	- 리소스재활용성 - 팩토리 메소드가 반드시 객체를 새로 생성할 필요는 없고, 상황에 따라 새로 생성될수도, 기존의 것을 리턴할수도 있다.
 *  
 *  * JDK안의 팩토리 메소드 패턴들
 *  	- java.util.Calendar#getInstance()
 *  	- java.util.ResourceBundle#getBundle()
 *  	- java.util.text.NumberFormat#getInstance()
 *  	- java.nio.Charset#forName()
 *  	- java.net.URLStreamHandlerFactory#createURLStreamHandler(String)
 *  
 *  
 *  예제) 구조
 *  	Robot(abstract class)
 *  		ㄴ SuperRobot
 *  		ㄴ PowerRobot
 *  	RobotFactory(abstract class)
 *  		ㄴ SuperRobotFactory
 *  		ㄴ ModifiedSuperRobotFactory
 * 
 * */

public class FactoryMethod {
	
}
