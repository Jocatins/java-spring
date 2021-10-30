package com.example.builder.pattern;

public class Shop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = new PhoneBuilder().setFormat("gypsy format").setOs("android").getPhone();
		System.out.println(phone);
	}
}
