package com.callor.db.service;

public class DBContract {
	
	public static class DB_INFO {
		public static final String JdbcDriver 
				= "oracle.jdbc.driver.OracleDriver";
		public static final String URL 
				= "jdbc:oracle:thin:@localhost:1521:xe";
		public static final String USER = "iouser";
		public static final String PASSWORD = "iouser";
	}
	
	
}
