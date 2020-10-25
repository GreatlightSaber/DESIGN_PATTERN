package main.behavioral.templateMethod;

import java.sql.Connection;

public abstract class UserDao {
	
	private ConnectionMaker connectionMaker;
	
	public UserDao(ConnectionMaker connectionMaker) {
		
		 /*
         * 한 번만 만든다.
         * 상태를 관리하는 것도 아니니까 한 번만 만들어
         * 인스턴스 변수에 저장해두고 메서드에서 사용하게 한다.
         */ 
		
		this.connectionMaker = connectionMaker;
	}
	
    /**
     * 추상 메서드로 만든다. (템플릿 메서드 패턴)
     * 기능의 일부를 추상 메서드로 만들고
     * 서브 클래스에서 필요에 맞게 구현하도록 한다.
     */
	// public abstract Connection getConnection() throws Exception;
	
	public void add(User user) throws Exception{
		Connection conn = connectionMaker.makeNewConnection();
	}
	
	public UserDao get(String id) throws Exception{
		Connection conn = connectionMaker.makeNewConnection();
		return null;
	}
}
