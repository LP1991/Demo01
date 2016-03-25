<%@ page language="java" import="java.util.*,java.io.*" pageEncoding="utf-8"%>
<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	BufferedReader br = request.getReader();
	String s = br.readLine();
	while(s!=null){
		System.out.println(s);
		s = br.readLine();
	}
	System.out.println("-----");
	//String name = request.getParameter("name");
	//System.out.println(name);
	response.getWriter().print("{}");
%>
