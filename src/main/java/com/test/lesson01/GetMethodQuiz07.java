package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/lesson01/quiz07")
public class GetMethodQuiz07 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글깨짐방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");

		//request parameter 꺼내기
		String address = request.getParameter("address");
		String paycard = request.getParameter("paycard");
		int price = Integer.parseInt(request.getParameter("price"));

		//응답HTML화면
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>주문결과</title></head><body>");

		//조건문
		if (address.contains("서울시") == true && paycard.contains("신한") == false) {
			out.print(address + " 배달준비중" + "<br>" + "결제금액:" + price);

		} else if (paycard.contains("신한")) {
			out.print("결제불가카드입니다.");

		} else {
			out.print("배달불가지역입니다.");
		}
		/*
		 * if (address.startsWith("서울시") == false) {
		 *  배달불가지역입니다.
		 * } else if (paycard.equals("신한카드") == true) {
		 *  결제불가카드
		 * } else {
		 *  address 
		 *  "<b>배달준비중<b>" + "<br>" + 
		 *  "결제금액:" + price
		 * }
		*/

		out.print("</body></html>");
	}

}
