<%@page contentType="text/html;charset=utf-8" %>
<%
	request.setCharacterEncoding("utf-8");
	response.setCharacterEncoding("utf-8");
	//获取node参数，对应的是正在展开的节点id
	String node = request.getParameter("node");
	System.out.println(node);
	
	String json = "";
	if("0".equals(node)){
		json+="[{id:1,text:'节点1'},{id:2,text:'节点2'}]";
	}else if("1".equals(node)){
		json+="[{id:11,text:'节点11'},{id:12,text:'节点12',leaf:true}]";
	}else if("2".equals(node)){
		json+="[{id:21,text:'节点21',leaf:true},{id:22,text:'节点22',leaf:true}]";
	}else if("11".equals(node)){
		json+="[{id:111,text:'节点111',leaf:true},{id:112,text:'节点112',leaf:true}]";
	}
	response.getWriter().print(json);
%>