package com.example.factory.pattern;

public class OsFactory {

	public OS getInstance(String string) {
		if(string.equals("open")) {
			return new Android();
		}
		else if(string.equals("closed")) {
			return new IOS();
		}
		else 
			return new Windows();
	}
}
