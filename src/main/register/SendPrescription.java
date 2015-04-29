package main.register;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendPrescription
 */
@WebServlet("/SendPrescription")
public class SendPrescription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendPrescription() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String docpres = request.getParameter("pres");
		int caseNum = Integer.parseInt(request.getParameter("caseNumber"));
		java.util.Date date= new java.util.Date();
		date.getTime();
		String resolutionDate = new SimpleDateFormat("MM/dd/yyyy").format(date);
				
		String path = request.getServletContext().getRealPath("/WEB-INF/classes/resources/");
		CaseDAO caseDao = CaseDAO.getInstance(path);
		
		if (caseDao.updatePrescription(caseNum, resolutionDate, docpres)){
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("doctor-case-history.jsp");
			 reqDispatcher.forward(request,response);
		}
		
	}

}
