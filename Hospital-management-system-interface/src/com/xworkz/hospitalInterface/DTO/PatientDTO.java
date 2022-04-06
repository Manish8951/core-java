package com.xworkz.hospitalInterface.DTO;

import com.xworkz.hospitalInterface.constants.Gender;

public class PatientDTO {
	
	private int patient_id;
	private String patient_name;
	private int age;
	private String address;
	private String disease;
	private long cont_num;
	private Gender gender;
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public long getCont_num() {
		return cont_num;
	}
	public void setCont_num(long cont_num) {
		this.cont_num = cont_num;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	

}
