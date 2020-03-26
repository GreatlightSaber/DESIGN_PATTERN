package main.creation.prototype;

/**
 * Product 인터페이스의 구현체
 * 
 * */

public class MessageBox implements Product{
	
	private String deco;
	
	public MessageBox(String deco) {
		this.deco = deco;
	}

	@Override
	public String use(String s) {
		return deco + s + deco;
	}

	@Override
	public Product createProduct() {
		Product p = null;
		try {
			p = (Product)clone();
		}catch(CloneNotSupportedException ex) {
			ex.printStackTrace();
		}
		return p;
	}
}
/*
 *  * Clone
 *   - 자바에서 Clone 은 Cloneable 클래스를 상속한 클래스에서 clone() 메서드를 호출하여 구현 할 수 있습니다.
 *     clone 이 호출되면 해당 클래스의 인스턴스를 복사해서 반환하게 됩니다.
 *  
 *  주의할 점
 *   1. Cloneable 인터페이스를 상송하지 않은 경우
 *   	- CloneNotSupportedException이 발생하게 됩니다.
 *   2. 클래스 명이 같다.
 *   	- 클래스를 복사하였기 때문에 클래스 명이 같습니다.
 *   3. hashCode()의 리턴값이 다르다.
 *   	- 아예 다른 객체가 리턴되기 때문에, hashCode()의 리턴값이 다릅니다.
 *   4. 얕은 복사가 이루어진다.
 *   	- 만약에 복사할 객체가 다른 객체를 가지고 있다면, 객체에 대한 참조가 복사되는 것이지 객체 자체가 따로 복사되는 것은 아닙니다.
 *   	  만약에 객체를 깊은 복사로 완전한 복사할 필요가 있다면, clone 메서드를 오버라이드 하여 재정의해야 할 것입니다.
 *   5. 객체가 생성되는 것이 아니다.
 *   	- 복사만 하는 것이고, 생성자를 따로 호출하는 것은 아닙니다.
 *   
 * */
