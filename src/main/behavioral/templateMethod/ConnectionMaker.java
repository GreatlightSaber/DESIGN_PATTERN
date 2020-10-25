package main.behavioral.templateMethod;

import java.sql.Connection;

public interface ConnectionMaker {
	public Connection makeNewConnection() throws Exception;
}
