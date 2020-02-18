package main.singleton;

/*
 * 2. volatile 키워드 + double checking lock(DCL)하는 방법
 *
 * 	lazy loading 방법중에 빠른 방법이다. (jdk 1.4이전에서는 정상 작동이 안될 수 있다.)
 * 
 * */
public class SingletonVolatile {
	static SingletonVolatile singletonVolatile = null;
	static public synchronized SingletonVolatile getInstance() {
		if(singletonVolatile == null) {
			synchronized(SingletonVolatile.class) {
				if (singletonVolatile == null) {
					singletonVolatile = new SingletonVolatile();
				}
			}
		}
		return singletonVolatile;
	}
	
}
