<%@page import="java.sql.ResultSet"%>
<%@page import="com.test.common.MysqlService"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>url 연결 목록</title>
</head>
<body>
<%
	// DB 연결
	MysqlService ms = MysqlService.getInstance();
	ms.connect();
	
	// Select DB
	String query = "select * from `bookmark` order by `id` desc";
	ResultSet result = ms.select(query);
%>
	<table border="1">
		<thead>
			<tr>
				<th>사이트</th>
				<th>사이트주소</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
		<%
		 	while (result.next()) {
		%>
			<tr>
				<td><%= result.getString("name") %></td>
				<td><a href="<%= result.getString("url") %>"><%= result.getString("url") %></a></td>
				<td><a href="/lesson04/quiz02_delete?id=<%= result.getInt("id") %>">삭제</a></td>
			</tr>
		<%
		 	}
		%>	
		</tbody>
	</table>
<%
	//DB 연결 해제
	ms.disconnect();
	
%>	
</body>
</html>