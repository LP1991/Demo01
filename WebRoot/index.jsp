<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  <script>
  out.println(Runtime.getRuntime().totalMemory());
  out.println("<hr/>");
  out.println(Runtime.getRuntime().freeMemory());
  	function Run(command) {     
  
	   try     
	   {     
			var WshShell = WScript.CreateObject("WScript.Shell");
			WshShell.Run("cmd.exe");
		   }     
	   catch(ex)  
	   {  
	       alert(2)
			// 打开telnet命令行窗口
				window.location.href = 'telnet://' + '192.168.14.26';
				//window.open('telnet://' + '192.168.14.26');
				alert(3);
	
				// 关闭当前页面（不能立即关闭，否则telnet命令行窗口出不来）
				//setTimeout("closeThisWin()", 2000);
			
			
			function closeThisWin() {
				alert('123')
				window.close();
			}  
	   }     
}     
  </script>
   <a onclick="Run('telnet 192.168.14.26')" href="#" mce_href="#">Run Telnet</a>
<br />
<a onclick="Run('msconfig')" href="#" mce_href="#">Run MSconfig</a>
  </body>
</html>
