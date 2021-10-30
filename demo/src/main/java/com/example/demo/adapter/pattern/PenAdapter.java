package com.example.demo.adapter.pattern;

import com.example.joca.JocaPen;

public class PenAdapter implements Pen {

	JocaPen jp = new JocaPen();
	
	public void write(String str) {
		
		jp.mark(str);
	}

}
