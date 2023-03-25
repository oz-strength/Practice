package com.oz.mar221.main;

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
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 기존 방식으로 전송된 파라미터 한글처리
//		request.setCharacterEncoding("EUC-KR");
		
		// 기존 방식으로 전송된 파라미터 읽기
//		String title = request.getParameter("title");
		
		response.setCharacterEncoding("EUC-KR");
		
		// 파일 업로드를 해보자!
		
//		파일이 업로드 될 서버상의 폴더의 절대경로
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
		
			String title = mr.getParameter("title");
			
			// 업로드한 파일명(중복처리된)
			String fileName = mr.getFilesystemName("photo");
			
			//DB에 파일명 저장할 때 -> 용량을 상당히 여유있게 만들어야!
			//			f_name varchar2(200 char)
			
			// 그 이유는 : 톰캣이 한글로 된 파일명 인식 못함
			fileName = URLEncoder .encode(fileName, "EUC-KR");
			
			String fileName2 = mr.getFilesystemName("etc");
			fileName2 = URLEncoder.encode(fileName2, "EUC-KR");
			fileName2 = fileName2.replace("+", " ");
			
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<head><meta charset='EUC-KR'></head>");
			out.print("<body>");
			
			out.printf("<h1>제목 : %s</h1>", title);
			out.printf("<h1>파일명 : %s</h1>", fileName);
			out.printf("<img src='img/%s'>", fileName);	// 상대경로 o
			out.printf("<h1>%s</h>", fileName2);
			out.printf("<a href='img/%s'>다운</a>", fileName2);
			
			out.print("</body");
			out.print("/html");
	}

}
