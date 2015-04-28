package main.users.user;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends RegisteredUser{

	private String doctor_email;
	private String speciality;
	private List<MedicalCase> cases = new ArrayList<MedicalCase>();
	
	public String getDoctor_email() {
		return doctor_email;
	}
	public void setDoctor_email(String doctor_email) {
		this.doctor_email = doctor_email;
	}
	
	public List<MedicalCase> getCases() {
		return cases;
	}
	public void setCases(List<MedicalCase> cases) {
		this.cases = cases;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
	
	
}
