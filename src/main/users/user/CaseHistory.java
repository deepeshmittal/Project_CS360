package main.users.user;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.register.CaseDAO;

public class CaseHistory extends HttpServlet{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		doPost(req,res);
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		List<MedicalCase> caseList = new ArrayList<MedicalCase>();
		
		RegisteredUser user = (RegisteredUser) req.getSession().getAttribute("user");
		
		String path = req.getServletContext().getRealPath("/WEB-INF/classes/resources/cases");
		CaseDAO caseDao = CaseDAO.getInstance(path);
		caseList = caseDao.fetchCasesFromDB(caseList, user);
		
		req.setAttribute("caseList", caseList);
		RequestDispatcher dispatcher = 
				getServletContext().getRequestDispatcher("/patient-case-history.jsp");
		dispatcher.forward(req, res);
	}

}
