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
	
	// GET방식 요청 받으면
	//	주소를 알고 있으면 직접 타이핑해서 접속
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 랜선에 붙어있는 응답용 빨대 
//		PrintWriter out = response.getWriter();
//		out.print("<html>");
//		out.print("<head><title>Hello!</title><mete charset='EUC-KR'></head>");
//		out.print("<body>");
//		for (int i = 0; i < 5; i++) {
//			out.print("<marquee>Hello!</marquee>");
//		}
//		out.print("</body>");
//		out.print("</html>");
		
		// 클라이언트에게 서버측이 어떤 방식으로 인코딩을 했는지 알려줘야함!	
		
		response.setCharacterEncoding("EUC-KR");
		
		// ?변수명=값&변수명=값&... 
		String language = request.getParameter("lang");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head><title>Language</title><mete charset='EUC-KR'></head>");
		out.print("<body>");
			if (language.equals("korean")) {
				out.print("네");
			} else if (language.equals("english")) {
				out.print("Yes");
			} else {
				out.print("몰루");
			}
		out.print("</body>");
		out.print("</html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
