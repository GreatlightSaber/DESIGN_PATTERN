package main.creation.singleton;

/*
 * 싱글톤 패턴 (singleton pattern)
 * 	자원이 단지 하나만 필요한 개체들이 있다.
 * 	그 객체는 다양한 클래스와 쓰레드 컨택스트 내에서 공유되어 사용 될 수 있어야 한다.
 * 	이러한 경우 싱글톤 패턴을 고려한다
 * 
 * * 장점
 * 		객체가 단일하게 생성되므로 메모리가 절약된다.
 * 		new 를 사용하는 과정을 줄이므로 라인이 몇줄 이나마 절약된다.
 * 		메모리를 공유하는 좋은 방법
 * 
 * * 단점
 * 		일단 메모리를 잡아먹게 되어잇고, 한번 사용하면 언제 해제될지 모른다.
 * 		oop의 컨셈셉과 맞지 않는 면이 있다. oop에서는 모든 객체를 생명주기가 존재하는것으로 인식하는 경향이 있다
 * 
 * 
 * 	* JDK안의 싱글톤들
 * 		java.lang.Runtime#getRuntime()
 * 			: jvm 외부의 명령행을 수행하고 싶을 때, 메모리등을 확인하고 싶을 때
 * 
 * 		java.awt.Dsktop#getDesktop()
 * 			: 스크린 사이즈등을 알고 싶을때
 * 
 *  	java.lang.System#getSecurity Message()
 *  		: jvm의 securityMnanger정보를 가지고 오고 싶을때
 * 
 * 
 * */
public class Singleton {
	
	// 실제 싱글톤의 구현은 생각보다 까다롭다 -> 싱글톤을 사용하는 여러 쓰레들간의 race condition 이 발생하기 때문
	
	static private Singleton singleton = null;
	static public Singleton getInstance() {
		/* if(singleton == null)을 거쳐 singleton = new Singleton(); 이 완료된 시점(singleton에 할당이 되기 전)에 다른 쓰레드가 if(singleton == null)안으로 또 들어와
		 * 두개 이상의 Singleton 객체가 생성되고, 원하는 의도대로 데이터가 공유되지 않을 수 있다.
		 */
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public void putInfo(String info) {
		// ... 생략
	}
	
}

//void test() {
//	Singleton.getInstance().putInfo("info1");
//}
