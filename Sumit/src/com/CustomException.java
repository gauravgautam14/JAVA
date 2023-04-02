package com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CustomException {
	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException  {
		
	Class.forName("com.mysql.jdbc.cj.Driver");
		
		try {
			FileInputStream fs=new FileInputStream("d:/abc2.txt");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
		
	}

}
