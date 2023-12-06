<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!--부트스트랩 CDN주소-->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<title>레이아웃 - 전체 페이지</title>

<style>
	#wrap {width:100%; height:1000px;}
	header {height:50px;}
	.section {height:900px;}
	.content {height:90%}
	footer {height:10%}
</style>
</head>
<body>
<!-- 조각 jsp에서 태그도 부트스트랩이 물려짐! 또 붙여넣을필요없음! -->
	<div id="wrap">
			<jsp:include page="header.jsp"/>
		<div class="section d-flex">
			<jsp:include page="menu.jsp"/>
			<div class="col-10 bg-warning">
			<%
				String viewName = "content1.jsp";
			%>
				<jsp:include page="<%= viewName %>"/>
				<jsp:include page="footer.jsp"/>
			</div>
		</div>
	</div>
</body>
</html>