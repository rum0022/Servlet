package com.test.lesson04;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/quiz02_insert")
public class InsertQuiz02 extends HttpServlet{

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 사용자 정보 DB param 꺼내기
	 	String name = request.getParameter("name");
	 	String url = request.getParameter("url");
	 	
	 	// DB 연결
	 	MysqlService ms = MysqlService.getInstance();
	 	ms.connect();
	 	
	 	// DB쿼리 실행
	 	String insertQuery = "insert into `bookmark`"
				+ "(`name`, `url`)"
				+ "values"
				+ "('"+ name + "', '" + url + "')";
	 	try {
			ms.update(insertQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 	
	 	// DB연결해제
	 	ms.disconnect();
	 	
	 	//redirect
	 	response.sendRedirect("/lesson04/quiz02/quiz02_1.jsp");
	}
}
