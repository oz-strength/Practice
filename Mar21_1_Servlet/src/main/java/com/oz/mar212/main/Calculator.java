package com.oz.mar212.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	
	// GET방식 요청 - 정수 x,y값을 받았을 때
	// 사칙연산에 대한 결과를 출력하는 페이지
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setCharacterEncoding("EUC-KR");
		
		int x = Integer.parseInt(request.getParameter("x"));
		int y = Integer.parseInt(request.getParameter("y"));
		
		PrintWriter out = response.getWriter();   
		out.print("<html>");
		out.print("<head><title>사칙연산</title><mete charset='EUC-KR'></head>");
		out.print("<body>");
			out.printf("<table border='1'>");
			out.printf("<tr><td>%d + %d = %d</td></tr>", x , y,  x+y);
			out.printf("<tr><td>%d - %d = %d</td></tr>", x , y,  x-y);
			out.printf("<tr><td>%d * %d = %d</td></tr>", x , y,  x*y);
			out.printf("<tr><td>%d / %d = %.2f</td></tr>", x , y, (double) x/y);
			out.print("</table>");
			out.print("</body>");
		out.print("</html>");
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
