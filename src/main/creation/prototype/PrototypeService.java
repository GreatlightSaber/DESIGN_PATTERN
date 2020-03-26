package main.creation.prototype;

import java.util.HashMap;

/**
 * 복사할 객체를 등록하는 register와 입력받은 객체를 복사하여 생성하는 create 메서드가 있음
 * 
 * */

public class PrototypeService {
	private HashMap showcase = new HashMap<>();
	
	// 복사할 객체를 등록한다. key는 객체의 다운캐스팅한 클래스 이름으로 한다.
	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}
	// 등록되어 있는 객체에서 클래스명으로 해당하는 객체를 복사한다.
	public Product create(String protoName) {
		return((Product)showcase.get(protoName)).createProduct();
	}
}
