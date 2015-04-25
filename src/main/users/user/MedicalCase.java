package main.users.user;

import java.util.Date;

public class MedicalCase {

	private int caseNumber;
	private String patientEmail;
	private Doctor doctorEmail;
	private String disease;
	private int severityLevel;
	private String dateCreated;
	private Date dateResolution;
	private String caseStatus;
	private int actualSeverity;
	private String comment;
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(int caseNumber) {
		this.caseNumber = caseNumber;
	}
	public String getPatientEmail() {
		return patientEmail;
	}
	public void setPatientEmail(String patientEmail) {
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
	public String getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(String string) {
		this.dateCreated = string;
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
