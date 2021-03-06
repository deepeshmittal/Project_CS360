package main.newuser;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.users.user.Patient;

/**
 * Servlet implementation class Newuser
 */
@WebServlet("/Newuser")
public class Newuser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Newuser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String gender = request.getParameter("user");
		String address = request.getParameter("address");
		String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));
		String doctor = request.getParameter("doctor");
		
		String path_reguser = request.getServletContext().getRealPath("/WEB-INF/classes/resources/registered_users");
		String path_patient = request.getServletContext().getRealPath("/WEB-INF/classes/resources/Patient");
		NewuserDAO newpatientDAO = NewuserDAO.getInstance(path_reguser,path_patient);
		
		Patient newpatient = new Patient();
		
		String[] temp = doctor.split(" ", 2);
		
		String docfname = temp[0];
		String doclname = temp[1];
		
		doctor = newpatientDAO.fetchDocEmail(docfname, doclname);
		
		newpatient.setFirstName(fname);
		newpatient.setLastName(lname);
		newpatient.setGender(gender);
		newpatient.setAddress(address);
		newpatient.setContactNumber(mobile);
		newpatient.setRegisteredMail(email);
		newpatient.setPassword(password);
		newpatient.setAge(age);
		newpatient.setAssigned_doctor(doctor);
		
		if(newpatientDAO.enterData(newpatient))
		{
			response.sendRedirect("new-user-success.jsp");
		}
		
	}

}
