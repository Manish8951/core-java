package com.xworkz.hospitalInterface.hospital;
import com.xworkz.hospitalInterface.DTO.*;
import com.xworkz.hospitalInterface.constants.Gender;
import com.xworkz.hospitalInterface.hospital.*;

public interface Hospital {
	
	public boolean createPatientDetails(PatientDTO dto);
	
	public void getAllpatientDetails();
	
	public PatientDTO getPatientById(int patientId);
	
	public PatientDTO getPatientByGender(Gender patientGender);
	
	public PatientDTO getPatientByContact(long patientContact);
	
	public PatientDTO getPatientByAge(int patientAge);
	
	public boolean updateContactNumByPatientAge(int patientAge,long contactnumber);
	
	 public boolean deletePatientDetailsByAge(int patientAge);
	
	

}
