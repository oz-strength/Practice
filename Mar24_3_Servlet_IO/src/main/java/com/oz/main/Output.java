package com.oz.main;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;


@WebServlet("/Output")
public class Output extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("EUC-KR");
		
		
		String path = request.getServletContext().getRealPath("img");
		System.out.println(path); // 절대 경로의 위치
		
		//파일 업로드
				MultipartRequest mr = new MultipartRequest(
						request, path,
						// 허용할 파일의 최대 크기(byte)
						10 * 1024 * 1024,
						// 요청 파라미터의 인코딩 방식
						"EUC-KR",
						// 사용자가 업로드한 파일명 중복될 때 처리
						// 중복시에 파일명 뒤에 숫자를 붙이는 방식
						new DefaultFileRenamePolicy()
						);
				
				// 업로드한 파일명(중복처리된)
				String fileName = mr.getFilesystemName("picture");
				fileName = URLEncoder .encode(fileName, "EUC-KR");
				
				String name = mr.getParameter("name");
				Double height =Double.parseDouble(mr.getParameter("height")); 
				Double weight = Double.parseDouble(mr.getParameter("weight"));  
//				Double bmi = (Double) weight / (height * height); 이게 대체...
				Double bmi =  weight / ((height/100) * (height/100));
				String result = null;
				
				if (bmi < 20) {
					result = "저체중";
				} else if (bmi >= 20 && bmi < 24) {
					result = "정상";
				} else if (bmi >=25 && bmi < 29) {
					result = "과체중";
				} else {
					result = "비만";
				}
				
				PrintWriter out = response.getWriter();
				out.println("<h1>비만도 검사 결과</h1>");
				out.println("<ul>");
				out.printf("<img src='img/%s'>", fileName);
				out.println("<li 이름 : >" + name + "</li>");
				out.printf("<li>키: %.2f</li>", height);
				out.printf("<li>몸무게: %.2f</li>", weight);
				out.printf("<li>bmi: %.2f</li>", bmi);
				out.printf("<li>결과: %s</li>", result);
				out.println("</ul>");
	}

}
