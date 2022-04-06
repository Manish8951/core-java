package com.xworkz.hosptialmanagement.hospital;


import com.xworkz.hosptialmanagement.constants.Gender;
import com.xworkz.hosptialmanagement.dto.*;

public class Hospital1 {
	
	
	public PatientDTO1 PatientDTO[];// array : patientDTO its datatype(1st)  array delceration
	int index;
	
	public Hospital1(int size) {
		PatientDTO = new PatientDTO1[size];//array initilasition
		
	}
	public boolean createPatientdetails(PatientDTO1 dto) {
		
		System.out.println("Invoke patient details");
		boolean patientAdded = false;
		
	 if (dto!=null) {
		 PatientDTO[index++]=dto;
		 patientAdded = true;
		 
	 }
	 else 
	 {
		 System.out.println("No patient found");
	 }
	 System.out.println("end of create patient details");
	 return patientAdded;
	}
	
	
		 public PatientDTO1 getPatientByID(int patientID) {
			 
			 PatientDTO1 dto=null;
			 System.out.println("get patient by ID");
			 System.out.println("arg1 patientID"+patientID);
			 for(int i=0;i<PatientDTO.length;i++) {
				 if(PatientDTO[i].getPid()==patientID) {
					 dto=PatientDTO[i];
				 }
				 else {
					 System.out.println("Plz enter correct patient ID");
				 }
				 
			 }
			 return dto;
			 
		 }
		 
		 public PatientDTO1 getPatientbyGender(Gender gender) {
			 PatientDTO1 dto =null;
			 System.out.println("inside get patient by gender");
			 for(int i=0;i<PatientDTO.length;i++) {
				 if(PatientDTO[i].getGenderString().equals(gender)) {
					 dto=PatientDTO[i];
				 }
				 else {
					 System.out.println("patient gender is not avaliable");
				 }
			 }
			 return dto;
		 }
		 
		 public PatientDTO1 getpatientbyContact(long patientContact) {
			 PatientDTO1 dto =null;
			 System.out.println("inside get patient by contact");
			 for(int i=0;i<PatientDTO.length;i++) {
				 if(PatientDTO[i].getPhno()==patientContact) {
					 dto=PatientDTO[i];
				 }
				 else {
					 System.out.println("patient is not avaliable");
				 }
				 
			 }
			 return dto;
		 }
		 
		 public PatientDTO1 getPatientbyAge(int patientAge) {
			 PatientDTO1 dto = null;
			 System.out.println("inside get patient by age");
			 for(int i=0;i<PatientDTO.length;i++) {
				 if(PatientDTO[i].getAge()==patientAge) {
					 dto=PatientDTO[i];
				 }
				 else {
					 System.out.println("patient not found");
				 }
			 
			 }
			 return dto;
				 
			 }
		 
		
		 
		 public PatientDTO1 getPatientbyAddress(String patientAddress) {
			 PatientDTO1 dto = null;
			 System.out.println("inside get patient by adress ");
			 for(int i=0;i<PatientDTO.length;i++) {
				 if(PatientDTO[i].getAddress().equals(patientAddress)) {
					 dto=PatientDTO[i];
				 }
				 else {
					 System.out.println("patient not found");
				 }
			 }
			 return dto ;
		 }
		
	
	
	

	}

