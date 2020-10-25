package main.behavioral.templateMethod;

import java.sql.Connection;
import java.sql.DriverManager;

public class SimpleConnectionMaker implements ConnectionMaker{
    /* 
     * 추상 클래스로 만들 필요가 없다.
     * 더 이상 상속을 이용한 확장 방식을 사용할 필요가 없다.
     */
	@Override
    public Connection makeNewConnection() throws Exception {
        // JDBC를 연결하여 Connection을 가져온다.
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/root", "root", "");
        return conn;
    }
}
