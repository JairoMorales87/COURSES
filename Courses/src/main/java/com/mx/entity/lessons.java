package com.mx.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class lessons {
	int id;
	String lessons;
	String courses;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn (name = "COURSES_ID")
	courses corusesId;
	
	public lessons() {}

	public lessons(int id, String lessons, String courses, com.mx.entity.courses corusesId) {
		super();
		this.id = id;
		this.lessons = lessons;
		this.courses = courses;
		this.corusesId = corusesId;
	}

	@Override
	public String toString() {
		return "lessons [id=" + id + ", lessons=" + lessons + ", courses=" + courses + ", corusesId=" + corusesId + "]\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLessons() {
		return lessons;
	}

	public void setLessons(String lessons) {
		this.lessons = lessons;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public courses getCorusesId() {
		return corusesId;
	}

	public void setCorusesId(courses corusesId) {
		this.corusesId = corusesId;
	}

	
	
	
}
