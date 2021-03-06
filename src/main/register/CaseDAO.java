package main.register;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import main.users.user.MedicalCase;
import main.users.user.RegisteredUser;

public class CaseDAO {

	static String path;

	private static CaseDAO caseDao;

	private CaseDAO() {
	}

	public static CaseDAO getInstance(String p) {
		if (caseDao == null) {
			path = p;
			caseDao = new CaseDAO();
		}

		return caseDao;
	}

	public boolean registerCase(MedicalCase mCase) throws IOException {

		FileOutputStream f = new FileOutputStream(path + "cases", true);

		BufferedWriter bfr = new BufferedWriter(new OutputStreamWriter(f,
				"UTF-8"));

		bfr.newLine();
		bfr.append(mCase.getCaseNumber() + "|" + mCase.getPatientEmail() + "|"
				+ mCase.getDoctorEmail() + "|" + mCase.getDisease() + "|"
				+ mCase.getSeverityLevel() + "|" + mCase.getDateCreated() + "|"
				+ mCase.getDateResolution() + "|" + mCase.getCaseStatus() + "|"
				+ mCase.getActualSeverity() + "|" + mCase.getComment() + "|"
				+ mCase.getDocPrescription() + "|");
		bfr.flush();
		bfr.close();

		return true;
	}

	public int calculateActualSeverity(String patientEmail, String disease)
			throws IOException {
		int calseverity = 0;
		List<Double> prevseverity = new ArrayList<Double>();
		int i = 0;
		double mean = 0;
		double variance = 0;

		File file = new File(path + "cases");
		BufferedReader bfr = new BufferedReader(new FileReader(file));
		String line;

		while ((line = bfr.readLine()) != null && !"".equals(line)) {
			String[] lineArr = line.split("\\|");
			String patient_email = lineArr[1];
			String calDisease = lineArr[3];

			if (patient_email.equalsIgnoreCase(patientEmail)
					&& calDisease.equalsIgnoreCase(disease)) {

				prevseverity.add(Double.valueOf(lineArr[4]));
			}
		}

		for (i = 0; i < prevseverity.size(); i++) {
			mean += prevseverity.get(i);
		}

		mean /= prevseverity.size();

		List<Double> temp = new ArrayList<Double>();

		for (i = 0; i < prevseverity.size(); i++) {
			temp.add(i, Math.pow((prevseverity.get(i) - mean), 2));
		}

		for (i = 0; i < temp.size(); i++) {
			variance += temp.get(i);
		}

		calseverity = (int) Math.sqrt(variance);

		bfr.close();
		return calseverity;
	}

	public boolean updatePrescription(int casenum, String resDate, String docPres) throws IOException {
		boolean ret = true;
		File cases_old = new File(path + "cases");
		BufferedReader bfr = new BufferedReader(new FileReader(cases_old));
		String line;

		File cases_new = new File(path + "temp");
		FileOutputStream f_new = new FileOutputStream(cases_new, true);

		BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(f_new,
				"UTF-8"));

		while ((line = bfr.readLine()) != null && !"".equals(line)) {
			String[] lineArr = line.split("\\|");
			int caseNumDB = Integer.parseInt(lineArr[0]);

			if (caseNumDB != casenum) {
				bfw.append(line);
				bfw.newLine();
				bfw.flush();
			} else if (caseNumDB == casenum) {
				MedicalCase mCase = new MedicalCase();
				mCase.setCaseNumber(Integer.parseInt(lineArr[0]));
				mCase.setPatientEmail(lineArr[1]);
				mCase.setDoctorEmail(lineArr[2]);
				mCase.setDisease(lineArr[3]);
				mCase.setSeverityLevel(Integer.parseInt(lineArr[4]));
				mCase.setDateCreated(lineArr[5]);
				mCase.setDateResolution(resDate);
				mCase.setCaseStatus("Close");
				mCase.setActualSeverity(Integer.parseInt(lineArr[8]));
				mCase.setComment(lineArr[9]);
				mCase.setDocPrescription(docPres);

				bfw.append(mCase.getCaseNumber() + "|"
						+ mCase.getPatientEmail() + "|"
						+ mCase.getDoctorEmail() + "|" + mCase.getDisease()
						+ "|" + mCase.getSeverityLevel() + "|"
						+ mCase.getDateCreated() + "|"
						+ mCase.getDateResolution() + "|"
						+ mCase.getCaseStatus() + "|"
						+ mCase.getActualSeverity() + "|" + mCase.getComment()
						+ "|" + mCase.getDocPrescription() + "|");
				bfw.newLine();
				bfw.flush();
			} else {
				ret = false;
				break;
			}
			
		}
		bfr.close();
		bfw.close();

		cases_old.delete();
		cases_new.renameTo(cases_old);

		return ret;
	}

	public List<MedicalCase> fetchCasesFromDB(List<MedicalCase> caseList,
			RegisteredUser user) throws IOException {

		String usermail = user.getRegisteredMail();
		File file = new File(path + "cases");
		BufferedReader bfr = new BufferedReader(new FileReader(file));
		String line;

		if (user.getUser_type().equalsIgnoreCase("P")) {
			while ((line = bfr.readLine()) != null && !"".equals(line)) {
				String[] lineArr = line.split("\\|");
				String patient_email = lineArr[1];

				if (patient_email.equalsIgnoreCase(usermail)) {
					MedicalCase readcase = new MedicalCase();

					readcase.setCaseNumber(Integer.parseInt(lineArr[0]));
					readcase.setPatientEmail(lineArr[1]);
					readcase.setDoctorEmail(lineArr[2]);
					readcase.setDisease(lineArr[3]);
					readcase.setSeverityLevel(Integer.parseInt(lineArr[4]));
					readcase.setDateCreated(lineArr[5]);
					readcase.setDateResolution(lineArr[6]);
					readcase.setCaseStatus(lineArr[7]);
					readcase.setActualSeverity(Integer.parseInt(lineArr[8]));
					readcase.setComment(lineArr[9]);
					readcase.setDocPrescription(lineArr[10]);

					caseList.add(readcase);
				}
			}
		} else if (user.getUser_type().equalsIgnoreCase("D")) {
			while ((line = bfr.readLine()) != null && !"".equals(line)) {
				String[] lineArr = line.split("\\|");
				String doctor_email = lineArr[2];

				if (doctor_email.equalsIgnoreCase(usermail)) {
					MedicalCase readcase = new MedicalCase();

					readcase.setCaseNumber(Integer.parseInt(lineArr[0]));
					readcase.setPatientEmail(lineArr[1]);
					readcase.setDoctorEmail(lineArr[2]);
					readcase.setDisease(lineArr[3]);
					readcase.setSeverityLevel(Integer.parseInt(lineArr[4]));
					readcase.setDateCreated(lineArr[5]);
					readcase.setDateResolution(lineArr[6]);
					readcase.setCaseStatus(lineArr[7]);
					readcase.setActualSeverity(Integer.parseInt(lineArr[8]));
					readcase.setComment(lineArr[9]);
					readcase.setDocPrescription(lineArr[10]);

					caseList.add(readcase);
				}
			}
		}

		bfr.close();
		return caseList;
	}

}
