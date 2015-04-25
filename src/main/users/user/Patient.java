package main.users.user;

import java.util.ArrayList;
import java.util.List;

public class Patient extends RegisteredUser {
	
	private String patient_email;
	private String assigned_doctor;
	private List<MedicalCase> cases = new ArrayList<MedicalCase>();
	
	public String getPatient_email() {
		return patient_email;
	}
	public void setPatient_email(String patient_email) {
		this.patient_email = patient_email;
	}
	public List<MedicalCase> getCases() {
		return cases;
	}
	public void setCases(List<MedicalCase> cases) {
		this.cases = cases;
	}
	
	
	public String getAssigned_doctor() {
		return assigned_doctor;
	}
	public void setAssigned_doctor(String assigned_doctor) {
		this.assigned_doctor = assigned_doctor;
	}
		
}
