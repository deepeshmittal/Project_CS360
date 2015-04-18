package main.users.user;

import java.util.Date;

public class MedicalCase {

	private int caseNumber;
	private Patient patientEmail;
	private Doctor doctorEmail;
	private String disease;
	private int severityLevel;
	private Date dateCreated;
	private Date dateResolution;
	private String caseStatus;
	private int actualSeverity;
	
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public Patient getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(Patient patientEmail) {
		this.patientEmail = patientEmail;
	}
	public Doctor getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(Doctor doctorEmail) {
		this.doctorEmail = doctorEmail;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public int getSeverityLevel() {
		return severityLevel;
	}
	public void setSeverityLevel(int severityLevel) {
		this.severityLevel = severityLevel;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateResolution() {
		return dateResolution;
	}
	public void setDateResolution(Date dateResolution) {
		this.dateResolution = dateResolution;
	}
	public String getCaseStatus() {
		return caseStatus;
	}
	public void setCaseStatus(String caseStatus) {
		this.caseStatus = caseStatus;
	}
	public int getActualSeverity() {
		return actualSeverity;
	}
	public void setActualSeverity(int actualSeverity) {
		this.actualSeverity = actualSeverity;
	}
	
	
}
