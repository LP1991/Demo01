<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	String s = request.getParameter("text");
	System.out.println(s);
	
	response.getWriter().println("success");
 %>