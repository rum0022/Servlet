package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz06")
public class GetMethodQuiz06 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/json");
		
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		PrintWriter out = response.getWriter();
		
		int addtion = num1 + num2;
		int subtraction = num1 - num2;
		int multiplication = num1 * num2;
		int division = num1 / num2;
		
//		out.print("addtion:" + addtion);
//		out.print("subtraction:" + subtraction);
//		out.print("multiplication:" + multiplication);
//		out.print("division:" + division);
//		
		
		out.print("{\"addtion\":" + addtion + ", \"subtraction\":" + subtraction 
				+ ", \"multiplication\":" + multiplication + ", \"division\":" + division + "}");
		
	}
}
