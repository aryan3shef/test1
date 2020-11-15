package test1;

import java.sql.*;
import java.util.*;
import javax.sql.*;


public class FindDrivers {
	public static void main(String[] args) throws Exception {
		System.out.println("\nDriversloaded as properties:");
		System.out.println(System.getProperty("jdbc.drivers"));
		System.out.println("\nDriversloaded by DriverManager:");
		Enumeration<Driver> list = DriverManager.getDrivers();
		while (list.hasMoreElements()) 
			System.out.println(list.nextElement());
		}

}
