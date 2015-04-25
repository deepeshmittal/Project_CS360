package main.register;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.users.user.MedicalCase;
import main.users.user.Patient;

public class Register extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		doPost(request,response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String disease = (String) request.getParameter("disease");
		String severity = (String) request.getParameter("severity");
		String message = (String) request.getParameter("message");
		Patient patient = (Patient) request.getSession().getAttribute("patient");
		java.util.Date date= new java.util.Date();
		int caseId = new Timestamp(date.getTime()).getNanos();
		
		MedicalCase mCase = new MedicalCase();
		mCase.setActualSeverity(Integer.parseInt(severity));
		mCase.setCaseNumber(caseId);
		mCase.setDisease(disease);
		mCase.setSeverityLevel(Integer.parseInt(severity));
		mCase.setComment(message);
		mCase.setDateCreated(new SimpleDateFormat("MM/dd/yyyy").format(date));
		mCase.setCaseStatus("Open");
		mCase.setPatientEmail(patient.getRegisteredMail());
		
		String path = request.getServletContext().getRealPath("/WEB-INF/classes/resources/cases");
		CaseDAO caseDao = CaseDAO.getInstance(path);
		if(caseDao.registerCase(mCase))
		{
			response.sendRedirect("register-case-success.jsp");
		}
		
	}

}
