package com.jsp.springboot.actordb.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Actor {
	@Id
	private int actorId;
	private String name;
	private int age;
	private String industry;
	private String nationality;
	public int getActorId() {
		return actorId;
	}
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}



}
