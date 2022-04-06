package com.xworkz.hospitalInterface.hospital;

import com.xworkz.hospitalInterface.DTO.PatientDTO;
import com.xworkz.hospitalInterface.constants.Gender;
import com.xworkz.hospitalInterface.hospital.HospitalImpl;

import java.util.Scanner;


public class HospitalTester {
		
		public static void main(String[] args) {
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter the size");
			int size=scanner.nextInt();
			
			HospitalImpl hospitalImpl =new HospitalImpl(size);
			for(int i=0;i<size;i++) {
				PatientDTO dto = new PatientDTO();
				
				System.out.println("Enter patient ID");
				dto.setPatient_id(scanner.nextInt());
				
				System.out.println("Enter patient Name");
				dto.setPatient_name(scanner.next());
				
				System.out.println("Enter adress");
				dto.setAddress(scanner.next());
				
				System.out.println("Enter Age");
				dto.setAge(scanner.nextInt());
				
				System.out.println("Enter Disease");
				dto.setDisease(scanner.next());
				
				System.out.println("Enter Patient Number");
				dto.setCont_num(scanner.nextLong());
				
				System.out.println("Enetr gender");
				String gender =scanner.next();
			    dto.setGender(Gender.valueOf(gender));
			    
			 //  System.out.println(HospitalImpl.getAllpatientDetails);
			    
			}
			String textString =null;
			do {
				System.out.println("Enter 1 to get all patient details");
				System.out.println("Enter 2 to get patient details by ID");
				System.out.println("Enter 3 to get patient details by gender");
				System.out.println("Enter 4 to get patient details by Contact number");
				System.out.println("Enter 5 to get patient details by Age");
				System.out.println("Enter 6 to update contact number by patient age ");
				System.out.println("Enter 7 to delete patient details by age");
				
				int choice = scanner.nextInt();
				switch (choice) {
				
				case 1: System.out.println("All patient details");
				        hospitalImpl.getAllpatientDetails();
				        break;
				case 2:System.out.println("Enter patient ID to get patient details");
				        hospitalImpl.getPatientById(scanner.nextInt());
				        break;
				case 3:System.out.println("Enter patient gender to get patient details");
				         String gender1=scanner.next();
				         hospitalImpl.getPatientByGender(Gender.valueOf(gender1));
				         break;
				case 4:System.out.println("Enter contact number to get patient details");
				         hospitalImpl.getPatientByContact(scanner.nextLong());
				         break;
				case 5:System.out.println("Enter age to get patient details");
				         hospitalImpl.getPatientByAge(scanner.nextInt());
				         break;
				case 6:System.out.println("Update contact number by patient age");
				         hospitalImpl.updateContactNumByPatientAge(scanner.nextInt(),scanner.nextLong());
				         break;
				case 7:System.out.println("delete patient details by age"); 
				         hospitalImpl.deletePatientDetailsByAge(scanner.nextInt());
				         break;
				default:System.out.println("Enter Correct Choice "); 
				}
				
				System.out.println("Do you want to continue type YES/NO");
				textString=scanner.next();
				
			}
			while(textString.equalsIgnoreCase("yes"));
			
		}



		}



