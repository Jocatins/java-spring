package com.example.builder.pattern;

public class Phone {
	private String os;
	private int screenSize;
	private int ram;
	private String format;
	
	public Phone(String os, int screenSize, int ram, String format) {
		super();
		this.os = os;
		this.screenSize = screenSize;
		this.ram = ram;
		this.format = format;
	}

	@Override
	public String toString() {
		return "Phone [os=" + os + ", screenSize=" + screenSize + ", ram=" + ram + ", format=" + format + "]";
	}
	

}
