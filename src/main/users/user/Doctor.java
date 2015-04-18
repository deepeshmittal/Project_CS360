package main.users.user;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends RegisteredUser{

	private String speciality;
	private List<MedicalCase> cases = new ArrayList<MedicalCase>();
	
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public List<MedicalCase> getCaseList() {
		return cases;
	}
	public void setCaseList(List<MedicalCase> cases) {
		this.cases = cases;
	}
	
	
}
