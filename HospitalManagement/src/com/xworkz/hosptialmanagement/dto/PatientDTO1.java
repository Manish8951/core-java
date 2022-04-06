package com.xworkz.hosptialmanagement.dto;



import com.xworkz.hosptialmanagement.constants.Gender;

public class PatientDTO1 {
	private String patientName;
	private String address;
	private long phno;
	private String disease;
	private int age;
	private int pid;
	private Gender gender;
	
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getAddress() {
		return address;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Enum<Gender> getGenderString() {
		return gender;
	}
	public void setGenderString(Gender gender) {
		this.gender = gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "PatientDTO [patientName=" + patientName + ", address=" + address + ", phno=" + phno + ", disease="
				+ disease + ", age=" + age + ", pid=" + pid + ", gender=" + gender + "]";
	}
	

}
