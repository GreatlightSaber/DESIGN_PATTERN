package main.behavioral.templateMethod;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyUserDao extends UserDao{

	public MyUserDao(ConnectionMaker connectionMaker) {
		super(connectionMaker);
		// TODO Auto-generated constructor stub
	}
	
    /**
     * 서브 클래스에서 오브젝트를 결정한다. (팩토리 메서드 패턴)
     * 어떤 Connection 클래스의 오브젝트를 어떻게 생성할 것인지 결정한다.
     * 그러니까, 서브 클래스에서 오브젝트 생성 방법을 결정한다.
     * 
     *  * 자바는 다중 상속을 허용하지 않는다.
     *  	- 단순히 커넥션 객체를 가져오는 방법을 분리하기 위해 상속구조로 만들면 차후에 다른 목적으로 UserDao에 상속을 적용하기 어렵다
     *  
     *  * 상속을 통한 슈퍼 클래스와 서브 클래스의 관계는 밀접하다.
     *  	- 슈퍼 클래스 내부의 변경이 있을 때 모든 서브 클래스를 수정하거나 다시 개발해야 할 수도 있다.
     * 
     *  * DB 커넥션을 생성하는 코드를 UserDAO가 아닌 다른 DAO 클래스에 적용할 수 없다.
     *  	- UserDAO 외의 DAO 클래스들이 계속 만들어진다면 그때는 상속을 통해서 만들어진 getConnection 메서드의 구현 코드가 매 DAO 클래스마다 중복됩니다.
     */

	/*	@Override
	public Connection getConnection() throws Exception {
		// JDBC를 연결하여 Connection을 가져온다.
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/root", "root", "");
        return conn;
	}*/
	

}
