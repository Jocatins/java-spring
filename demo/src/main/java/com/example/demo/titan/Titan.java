package com.example.demo.titan;

public class Titan {
	private String id ;
	private String name;
	private String desc;
	private int age;
	

	public Titan() {
		
	}
	
	public Titan(String id, String name, String desc, int age) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.age = age;
	}
	public String getId() { 
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

}
