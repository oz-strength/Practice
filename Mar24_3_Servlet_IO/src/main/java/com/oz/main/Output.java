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
				
				// ���ε��� ���ϸ�(�ߺ�ó����)
				String fileName = mr.getFilesystemName("picture");
				fileName = URLEncoder .encode(fileName, "EUC-KR");
				
				String name = mr.getParameter("name");
				Double height =Double.parseDouble(mr.getParameter("height")); 
				Double weight = Double.parseDouble(mr.getParameter("weight"));  
//				Double bmi = (Double) weight / (height * height); �̰� ��ü...
				Double bmi =  weight / ((height/100) * (height/100));
				String result = null;
				
				if (bmi < 20) {
					result = "��ü��";
				} else if (bmi >= 20 && bmi < 24) {
					result = "����";
				} else if (bmi >=25 && bmi < 29) {
					result = "��ü��";
				} else {
					result = "��";
				}
				
				PrintWriter out = response.getWriter();
				out.println("<h1>�񸸵� �˻� ���</h1>");
				out.println("<ul>");
				out.printf("<img src='img/%s'>", fileName);
				out.println("<li �̸� : >" + name + "</li>");
				out.printf("<li>Ű: %.2f</li>", height);
				out.printf("<li>������: %.2f</li>", weight);
				out.printf("<li>bmi: %.2f</li>", bmi);
				out.printf("<li>���: %s</li>", result);
				out.println("</ul>");
	}

}
