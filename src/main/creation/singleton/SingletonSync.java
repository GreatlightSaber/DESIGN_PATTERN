package main.creation.singleton;

/*
 * 2. getInstance()에 lock 거는 방법
 *
 * 	메서드 전체에 lock을 거는 방식이라 느리다 사용을 지양한다.
 * 
 * */
public class SingletonSync {
	static SingletonSync singletonSync = null;
	static public synchronized SingletonSync getInstance() {
		if(singletonSync == null) {
			singletonSync = new SingletonSync();
		}
		return singletonSync;
	}
	
}
