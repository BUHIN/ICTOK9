<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>formResult.jsp</title>
</head>
<body>
	<%
		String hong = "홍길동";

		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String age = request.getParameter("age");
		String email = request.getParameter("email");

		// 문자 -> 날짜형
		String birth = request.getParameter("birth");

		//<input type="radio" name="food" value="라면" checked>라면
		//radio 타입은 value가 없으면 아무 값도 넘어오지 않는다.
		String food = request.getParameter("food");

		// 단일 변수에 여러 값이 담긴 경우. checkbox, multi select -> String 배열로 받아야 한다.
		String[] food1 = request.getParameterValues("food1");

		// option의 value 값을 담아서 넘어온다.
		String study = request.getParameter("study");

		// Multi select
		String[] study1 = request.getParameterValues("study1");

		String sogam = request.getParameter("sogam");

		/* out.println(name); */
	%>

	<!-- HTML 내부에서 자바의 어떤 값을 출력하고자 할 경우에 사용 -->
	이름은
	<%=name%>
	아아디:
	<%=id%>
	패스워드:
	<%=password%>
	나이:
	<%=age%>
	이메일:
	<%=email%>
	생일:
	<%=birth%>
	좋아하는 음식:
	<%=food%>
	<br> 배열로 받은 항목 출력
	<br>
	<%
		for (int i = 0; i < food1.length; i++) {
			//out.println(food1[i]);
	%>
	<div>
		그 외에 좋아하는 음식:
		<%=food1[i]%></div>
	<%
		}
	%>
	<br> 좋아하는 과목:<%=study%><br>
	<%
		for (int k = 0; k < study1.length; k++) {
			//out.println(food1[i]);
	%>
	<div>
		그 외에 좋아하는 과목:
		<%=study1[k]%></div>
	<%
		}
	%>
	<br> 소감은
	<%=sogam%><br>
	
	요청 아이피: <%=request.getRemoteAddr() %><br>
	주소1: <%=request.getRequestURI() %><br>
	주소2: <%=request.getRequestURL() %><br>
	
</body>
</html>