package main.creation.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 추상 메소드 use와 createClone이 선언되어 있는 인터페이스
 * 
 * */

public interface Product extends Cloneable{ // 자바에서는 객체를 복사하기 위해서 Cloneable 클래스를 구현하여야 합니다.
	
	// 깊은복사 - 얕은복사 확인 용
	Map<String, String> maps = new HashMap<>();
	
	// 메서드가 해당되는 동작(앞뒤를 입력받은 문자로 감싼다)를 수행하게 하는 인터페이스
	String use(String s);
	// 자기 자신을 복사하여 새로운 니스턴스를 린턴하는 메서드
	Product createProduct();
}
