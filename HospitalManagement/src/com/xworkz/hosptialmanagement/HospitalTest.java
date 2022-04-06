package com.xworkz.hosptialmanagement;
import com.xworkz.hosptialmanagement.constants.Gender;
import com.xworkz.hosptialmanagement.dto.*;
import com.xworkz.hosptialmanagement.hospital.Hospital;
import com.xworkz.hosptialmanagement.hospital.Hospital1;
import com.xworkz.hosptialmanagement.constants.*;

import java.util.Scanner;

public class HospitalTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scanner.nextInt();
		
		Hospital1 hp = new Hospital1(size);
		for(int i=0;i<size ;i++) {
			PatientDTO1 dto = new PatientDTO1();
			System.out.println("Enter the address");
			dto.setAddress(scanner.next());
			
			System.out.println("Enter the age");
			dto.setAge(scanner.nextInt());
			
			System.out.println("Enter patient name ");
			dto.setPatientName(scanner.next());
			
			System.out.println("Enter patient contact num");
			dto.setPhno(scanner.nextLong());
			
			System.out.println("Enter patient discease");
			dto.setDisease(scanner.next());
			
			System.out.println("Enter gender");
			String genderString=scanner.next();
			dto.setGenderString(Gender.valueOf(genderString));
			
			System.out.println("Enter the patient ID");
			dto.setPid(scanner.nextInt());
			
			
			hp.createPatientdetails(dto);
			
		
	}
		
		
		System.out.println("enter contact number to get details");
		long phno= scanner.nextLong();
		 PatientDTO1  no= hp.getpatientbyContact(phno);
		 System.out.println(no);
		 
		 System.out.println("enter id to get details");
		 int Id=scanner.nextInt();
		 PatientDTO1 iddto=hp.getPatientByID(Id);
		 System.out.println(iddto);
		 
		 System.out.println("enter gender");
		 String g=scanner.next();
		 PatientDTO1 pdataDto=hp.getPatientbyGender(g);
		 System.out.println(pdataDto);
		 
		 System.out.println("enter the address to get details");
		 String address=scanner.next();
		 PatientDTO1 addDto =hp.getPatientbyAddress(address);
		 System.out.println(addDto);
		 
		 
		
		
		

	}
}
