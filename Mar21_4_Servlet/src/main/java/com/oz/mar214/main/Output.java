package com.oz.mar214.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Output")
public class Output extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR" );
		response.setCharacterEncoding("EUC-KR");
		String id = request.getParameter("id");
		int pw = Integer.parseInt(request.getParameter("pw"));
		String gender = request.getParameter("gender");
		PrintWriter out = response.getWriter();
		
		out.printf("%s %d %s", id, pw, gender);
	}

}
