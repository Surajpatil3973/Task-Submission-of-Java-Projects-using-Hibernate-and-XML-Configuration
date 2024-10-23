package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Doc_id;
	private String Doc_name;
	private String qualification;
	private int age;
	public Doctor() {
		
	}
	public Doctor(int doc_id, String doc_name, String qualification, int age) {
		super();
		Doc_id = doc_id;
		Doc_name = doc_name;
		this.qualification = qualification;
		this.age = age;
	}
	public int getDoc_id() {
		return Doc_id;
	}
	public void setDoc_id(int doc_id) {
		Doc_id = doc_id;
	}
	public String getDoc_name() {
		return Doc_name;
	}
	public void setDoc_name(String doc_name) {
		Doc_name = doc_name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Doctor [Doc_id=" + Doc_id + ", Doc_name=" + Doc_name + ", qualification=" + qualification + ", age="
				+ age + "]";
	}
	
	

}
