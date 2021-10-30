package com.example.demo.adapter.pattern;

public class AssigmentWork {
	
	//Null pointer exception err because no value assigned to p
	private Pen p;
	
	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public void writeAssignment(String str) {
		p.write(str);
	}

}
