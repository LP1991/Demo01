<%@page contentType="text/html;charset=utf-8" %>
<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	String data = request.getParameter("data");
	System.out.println(data);
	response.getWriter().print(data);
%>