package main.users.user;

public class MedicalCase {

	private int caseNumber;
	private String patientEmail;
	private String doctorEmail;
	private String disease;
	private int severityLevel;
	private String dateCreated;
	private String dateResolution;
	private String caseStatus;
	private int actualSeverity;
	private String comment;
	private String docPrescription;
	
	
	public String getDocPrescription() {
		return docPrescription;
	}
	public void setDocPrescription(String docPres) {
		this.docPrescription = docPres;
	}
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
	public String getDoctorEmail() {
		return doctorEmail;
	}
	public void setDoctorEmail(String doctorEmail) {
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
	public String getDateResolution() {
		return dateResolution;
	}
	public void setDateResolution(String dateResolution) {
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
