package com.xworkz.hospitalInterface.hospital;

import com.xworkz.hospitalInterface.DTO.PatientDTO;
import com.xworkz.hospitalInterface.constants.Gender;

public class HospitalImpl implements Hospital{
	
	public PatientDTO[] patientDTO;
	int index;
	
	public HospitalImpl(int size) {
		patientDTO = new PatientDTO[size];
	}
  
	public boolean createPatientDetails(PatientDTO dto) {
		System.out.println("Inside createPatientDetails");
		boolean patientAdded =false;
		if(dto!=null) {
			patientDTO[index++]=dto;
			patientAdded =true;
		}
		else {
			System.out.println("No patient found");
		}
		return patientAdded;
	}
	   


  public void getAllpatientDetails() {
	  System.out.println("inside getAllpatientDetails ");
	  for(int i=0;i<patientDTO.length;i++) {
		  System.out.println(patientDTO[i]);
		  
	  }
  }
  
  public PatientDTO getPatientById(int patientId) {
	  PatientDTO dto = null;
	  System.out.println("Inside getPatientById");
	  for(int i=0;i<patientDTO.length;i++) {
		  if(patientDTO[i].getPatient_id()==patientId) {
			  System.out.println(patientDTO[i]);
		  }
		  else {
			  System.out.println(patientId+"patient id not avaliable");
		  }
	  }
	  return dto;
  }
        
  public PatientDTO getPatientByGender(Gender patientGender) {
	  PatientDTO dto =null;
	  System.out.println("Inside getPatientByGender");
	  for(int i=0;i<patientDTO.length;i++) {
		  if(patientDTO[i].getGender()==patientGender){
			  System.out.println(patientDTO[i]);
			    
		  }
		  else {
			  System.out.println("Patient not found");
		  }
	  } return dto;
  }
  
  public PatientDTO getPatientByContact(long patientContact) {
	    PatientDTO dto=null;
	    for(int i=0;i<patientDTO.length;i++) {
	    	if(patientDTO[i].getCont_num()==patientContact) {
	    		System.out.println(patientDTO[i]);
	    	}
	    	else {
	    		System.out.println("Patient is not found");
	    	}
	    }return dto;
  }
  
  public PatientDTO getPatientByAge(int patientAge) {
	  PatientDTO dto =null;
	  for(int i=0;i<patientDTO.length;i++) {
		  if(patientDTO[i].getAge()==patientAge) {
			  System.out.println(patientDTO[i]);
		}
		  else {
			  System.out.println("Patient not found");
		  }
	  }return dto;
  }
  public boolean updateContactNumByPatientAge(int patientAge,long contactnumber) {
	  boolean isContactNumUpdated =false;
	  
	  for(int i=0;i<patientDTO.length;i++) {
		  if(patientDTO[i].getAge()==patientAge) {
			  patientDTO[i].setCont_num(contactnumber);
			  isContactNumUpdated =true;
		  }
		  else {
			  System.out.println("Number is not updated");
		  }
	  }return isContactNumUpdated;
  }
  
  public boolean deletePatientDetailsByAge(int patientAge) {
	  boolean delete =false;
	  for(int i=0;i<patientDTO.length;i++) {
		  if(patientDTO[i].getAge()==patientAge) {
			  patientDTO[i]=null;
		  }
		  else {
			  System.out.println("SORRY....Can't delete patient details..!!");
		  }
	  }return delete;
  }
}
