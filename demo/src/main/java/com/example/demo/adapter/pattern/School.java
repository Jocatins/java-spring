package com.example.demo.adapter.pattern;


public class School {
	public static void main(String [] args) {
		
		Pen penAdapter = new PenAdapter();
		
		AssigmentWork assWork = new AssigmentWork();
		
		assWork.setP(penAdapter);
		
		assWork.writeAssignment("Using joca's pen");
	}

}
