package main.users.authentication;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import main.users.user.RegisteredUser;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("email");
		String password = request.getParameter("password");

		String path = request.getServletContext().getRealPath("/WEB-INF/classes/resources/");

		RegisteredUser user = Authenticator.getInstance(path).authenticate(username, password);
		request.getSession().setAttribute("user", user);

		RequestDispatcher dispatcher;
		
		//request.setAttribute("userName", user.getFirstName());
		
		if (user.getUser_type().equalsIgnoreCase("P")) {

			dispatcher = getServletContext().getRequestDispatcher(
					"/patient-home.jsp");
		} else {
			dispatcher = getServletContext().getRequestDispatcher(
					"/doctor-home.jsp");
		}

		dispatcher.forward(request, response);
	}

}
