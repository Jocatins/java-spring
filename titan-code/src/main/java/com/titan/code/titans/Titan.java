package com.titan.code.titans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.titan.code.gypsy.Gypsy;

@Entity
public class Titan  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	private int age;
	private String name;
	private String description;
	
	@OneToMany( mappedBy = "titan" )
	private List<Gypsy> gypsyList;
	
	public Titan() {
		
	}
	
	public Titan(Long id) {
		this.id  = id;
	}
	
	public Titan(Long id,  int age ,String name, String description) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.description = description;
		
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		
}
