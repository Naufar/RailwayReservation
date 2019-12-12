package com.naufar.entity;

public class Passenger {

	private String name;
	private String gender;
	private Integer age;
	//@JsonProperty("berthPreference")
	private String berthPreference;
	private Boolean withChild;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getBerthPreference() {
		return berthPreference;
	}
	public void setBerthPreference(String birthPreference) {
		this.berthPreference = birthPreference;
	}
	public Boolean getWithChild() {
		return withChild;
	}
	public void setWithChild(Boolean withChild) {
		this.withChild = withChild;
	}
	@Override
	public String toString() {
		return "Passenger [name=" + name + ", gender=" + gender + ", age=" + age + ", berthPreference="
				+ berthPreference + ", withChild=" + withChild + "]";
	}
	
	
	
	
	
	
}
