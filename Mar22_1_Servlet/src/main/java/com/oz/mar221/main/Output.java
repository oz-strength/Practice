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
		// ���� ������� ���۵� �Ķ���� �ѱ�ó��
//		request.setCharacterEncoding("EUC-KR");
		
		// ���� ������� ���۵� �Ķ���� �б�
//		String title = request.getParameter("title");
		
		response.setCharacterEncoding("EUC-KR");
		
		// ���� ���ε带 �غ���!
		
//		������ ���ε� �� �������� ������ ������
		String path = request.getServletContext().getRealPath("img");
		System.out.println(path); // ���� ����� ��ġ
		
		//���� ���ε�
		MultipartRequest mr = new MultipartRequest(
				request, path,
				// ����� ������ �ִ� ũ��(byte)
				10 * 1024 * 1024,
				// ��û �Ķ������ ���ڵ� ���
				"EUC-KR",
				// ����ڰ� ���ε��� ���ϸ� �ߺ��� �� ó��
				// �ߺ��ÿ� ���ϸ� �ڿ� ���ڸ� ���̴� ���
				new DefaultFileRenamePolicy()
				);
		
			String title = mr.getParameter("title");
			
			// ���ε��� ���ϸ�(�ߺ�ó����)
			String fileName = mr.getFilesystemName("photo");
			
			//DB�� ���ϸ� ������ �� -> �뷮�� ����� �����ְ� ������!
			//			f_name varchar2(200 char)
			
			// �� ������ : ��Ĺ�� �ѱ۷� �� ���ϸ� �ν� ����
			fileName = URLEncoder .encode(fileName, "EUC-KR");
			
			String fileName2 = mr.getFilesystemName("etc");
			fileName2 = URLEncoder.encode(fileName2, "EUC-KR");
			fileName2 = fileName2.replace("+", " ");
			
			PrintWriter out = response.getWriter();
			out.print("<html>");
			out.print("<head><meta charset='EUC-KR'></head>");
			out.print("<body>");
			
			out.printf("<h1>���� : %s</h1>", title);
			out.printf("<h1>���ϸ� : %s</h1>", fileName);
			out.printf("<img src='img/%s'>", fileName);	// ����� o
			out.printf("<h1>%s</h>", fileName2);
			out.printf("<a href='img/%s'>�ٿ�</a>", fileName2);
			
			out.print("</body");
			out.print("/html");
	}

}
