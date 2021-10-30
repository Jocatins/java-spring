package com.titan.code.gypsy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.titan.code.titans.Titan;

@Entity
public class Gypsy  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	
	@Column(name = "age")
	private int age;
	
	@Column(name ="name")
	private String name;
	
	@Column(name = "description")
	private String description;  
	
	@ManyToOne()
	@JoinColumn( name = "titan_id" )
	private Titan titan;
	
	public Gypsy() {
		
	} 
	
	public Gypsy(Long id,  int age ,String name, String description, Long titanId) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.description = description;
		this.titan = new Titan();
		
	}
	public Long getId() { 
		return id;
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
