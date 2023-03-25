package com.oz.mar213.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Output")
public class Output extends HttpServlet {
	
	// 사용자가 입력한 데이터가 주소에
	// 인터넷 주소에 한글은 안됨
	// GET방식 요청파라미터 한글처리
	//			EUC-KR 로 맞추기!
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("EUC-KR");
		String a = request.getParameter("a");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>hi</title><mete charset='EUC-KR'></head>");
		out.print("<body>");
		out.printf("<h2>Output-GET</h2>");
		out.printf("<h2>%s</h2>", a);
		out.print("</body>");
		out.print("</html>");
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("EUC-KR" );
		response.setCharacterEncoding("EUC-KR");
		String a = request.getParameter("a");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>hi</title><mete charset='EUC-KR'></head>");
		out.print("<body>");
		out.printf("<h2>Output-GET</h2>");
		out.printf("<h2>%s</h2>", a);
		out.print("</body>");
		out.print("</html>");
	}
	
	}


