package com.mx.entity;

import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
public class courses {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	int id;
	String name;
	String lessons;
	
	@OneToMany(mappedBy = "coursesId",cascade = CascadeType.ALL)
	List<lessons> lista = new ArrayList<lessons>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLessons() {
		return lessons;
	}
	public void setLessons(String lessons) {
		this.lessons = lessons;
	}
	@Override
	public String toString() {
		return "courses [id=" + id + ", name=" + name + ", lessons=" + lessons + "]\n";
	}
	public courses(int id, String name, String lessons) {
		super();
		this.id = id;
		this.name = name;
		this.lessons = lessons;
	}
	
	public courses(){}
	
	public courses(String name, int id){}
	

}
