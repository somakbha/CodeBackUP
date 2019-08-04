package practice;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

public class LoadDriver {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
	//	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Enumeration<Driver> e=DriverManager.getDrivers();
		while (e.hasMoreElements())
		{
			Driver d=e.nextElement();
			System.out.println(d);
		}

	}

}
