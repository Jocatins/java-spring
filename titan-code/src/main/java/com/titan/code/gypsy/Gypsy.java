package com.titan.code.gypsy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.titan.code.titans.Titan;

@Entity
public class Gypsy  {
	@Id
	private String id ;
	private int age;
	private String name;
	private String description;
	@ManyToOne
	private Titan titan;
	
	public Gypsy() {
		
	}
	
	public Gypsy(String id,  int age ,String name, String description, String titanId) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.description = description;
		this.titan = new Titan(titanId, age, titanId, titanId);
		
	}
	public String getId() { 
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return description;
	}
	public void setDesc(String description) {
		this.description = description;
	}

	public Titan getTitan() {
		return titan;
	}

	public void setTitan(Titan titan) {
		this.titan = titan;
	}
		
}
