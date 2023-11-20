package com.java.infinite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    PrintWriter out = response.getWriter();    
		String user = request.getParameter("userName");
		String pwd = request.getParameter("password");
		String firstName=" ", lastName=" ";
		if (user.equals("Somu")&&pwd.equals("somu")) {
			firstName = "Soumya";
			lastName ="Panda";
		}
		if (user.equals("Lopu")&&pwd.equals("Lopu")) {
			firstName = "Lopamudra";
			lastName ="Rath";
		}
		if (user.equals("Asu")&&pwd.equals("Asu")) {
			firstName = "Asish";
			lastName ="Rath";
		}
		out.println("<a href = 'WelcomeServlet?firstName="+firstName+"&lastName="+lastName+" ' >Welcome<a/>");
	}

}
