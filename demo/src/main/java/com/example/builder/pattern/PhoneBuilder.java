package com.example.builder.pattern;

public class PhoneBuilder {

	private String os;
	private int screenSize;
	private int ram;
	private String format;
	
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setScreenSize(int screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public PhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public PhoneBuilder setFormat(String format) {
		this.format = format;
		return this;
	}
	public Phone getPhone() {
		return new Phone(os, screenSize, ram, format);
	}

}
