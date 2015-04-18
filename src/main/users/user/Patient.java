package main.users.user;

import java.util.ArrayList;
import java.util.List;

public class Patient extends RegisteredUser {
	
	private Doctor assigned_doctor;
	private List<MedicalCase> cases = new ArrayList<MedicalCase>();
	
	public Doctor getAssigned_doctor() {
		return assigned_doctor;
	}
	public void setAssigned_doctor(Doctor assigned_doctor) {
		this.assigned_doctor = assigned_doctor;
	}
	
	public List<MedicalCase> getCaseList() {
		return cases;
	}
	public void setCaseList(List<MedicalCase> cases) {
		this.cases = cases;
	}
		
}
