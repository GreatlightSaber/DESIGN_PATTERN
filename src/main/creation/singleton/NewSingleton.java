package main.creation.singleton;

/*
 * 1. 클래스로딩시에 객체 생성
 * 
 * 	클래스로딩시에 무조건 객체 생성하는 방법
 * 	스타트업 시간에 영향을 주고, 메모리에 무조건 차지
 * 
 * */
public class NewSingleton {
	static NewSingleton newSingleton = new NewSingleton();
	static public NewSingleton getInstance() {
		return newSingleton;
	}
	
}
