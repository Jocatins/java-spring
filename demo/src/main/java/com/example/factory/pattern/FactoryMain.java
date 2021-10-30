package com.example.factory.pattern;

public class FactoryMain {

	public static void main(String[] args) {
		
		OsFactory osf = new OsFactory();
		OS obj = osf.getInstance("open");
		obj.spec();
	}

}
