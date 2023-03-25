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
	
	// ����ڰ� �Է��� �����Ͱ� �ּҿ�
	// ���ͳ� �ּҿ� �ѱ��� �ȵ�
	// GET��� ��û�Ķ���� �ѱ�ó��
	//			EUC-KR �� ���߱�!
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


