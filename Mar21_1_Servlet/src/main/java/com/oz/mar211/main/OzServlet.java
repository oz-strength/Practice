package com.oz.mar211.main;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OzServlet")
public class OzServlet extends HttpServlet {
	
	// GET��� ��û ������
	//	�ּҸ� �˰� ������ ���� Ÿ�����ؼ� ����
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ������ �پ��ִ� ����� ���� 
//		PrintWriter out = response.getWriter();
//		out.print("<html>");
//		out.print("<head><title>Hello!</title><mete charset='EUC-KR'></head>");
//		out.print("<body>");
//		for (int i = 0; i < 5; i++) {
//			out.print("<marquee>Hello!</marquee>");
//		}
//		out.print("</body>");
//		out.print("</html>");
		
		// Ŭ���̾�Ʈ���� �������� � ������� ���ڵ��� �ߴ��� �˷������!	
		
		response.setCharacterEncoding("EUC-KR");
		
		// ?������=��&������=��&... 
		String language = request.getParameter("lang");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Language</title><mete charset='EUC-KR'></head>");
		out.print("<body>");
			if (language.equals("korean")) {
				out.print("��");
			} else if (language.equals("english")) {
				out.print("Yes");
			} else {
				out.print("����");
			}
		out.print("</body>");
		out.print("</html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
