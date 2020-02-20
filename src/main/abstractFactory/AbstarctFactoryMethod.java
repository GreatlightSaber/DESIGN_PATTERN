package main.abstractFactory;

/*
 * 
 * 팩토리 메서드 패턴 (Factory Method Pattern)
 * 	객체의 생성은 일반적으로 new를 사용해 구체적인 클래스 이름을 지정한다.
 * 	팩토리 메소드 패턴은 사람이 직접 무엇인가를 만드는 것이 아니라 공장(Factory)에서 지정된 방식으로 대신 클래스를 생성해주는 방식이다.
 * 	일반적으로 팩토리 메서드 패턴은 사용자 코드에서 new를 사용하는 대신에 클래스의 static method(일반적으로 create)를 사용해 객체를 대리생성한다. -> 객체 만들어내는 부분을 서브 클래스에 위임하는 패턴
 * 	즉, 객체를 만들어내는 공장(Factory 객체)을 만드는 패턴
 * 
 * 	예) 구조
 * 		ComputerFactory
 * 			ㄴKeyboardFactory
 * 				ㄴKeyboard (interface)
 * 					ㄴLGKeyboard
 * 					ㄴSamsungKeyboard
 * 			ㄴMouseFactory
 * 				ㄴMouse (interface)
 * 					ㄴLGMouse
 * 					ㄴSamsungMouse
 * 
 * */

public class AbstarctFactoryMethod {
	
}
