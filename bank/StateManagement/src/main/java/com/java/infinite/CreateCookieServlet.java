package com.java.infinite;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateCookieServlet
 */
public class CreateCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie ckSmruti = new Cookie ("Smruti" , "87");
		ckSmruti.setMaxAge(1000*60*60*24);
		response.addCookie(ckSmruti);
		
		Cookie ckPuja = new Cookie ("Puja" , "91");
		ckPuja.setMaxAge(1000*60*60*24);
		response.addCookie(ckPuja);
		
		Cookie ckSomu = new Cookie ("Somu" , "85");
		ckSomu.setMaxAge(1000*60*60*24);
		response.addCookie(ckSomu);
		
		PrintWriter out = response.getWriter();
		out.println("Cookies are created...");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
