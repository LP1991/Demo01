<html>
<head>
  	
 	<meta http-equiv="content-type" content="text/xml" />
 </head>
 <body>
 	<%
	String start = request.getParameter("start");
	String limit = request.getParameter("limit");
	System.out.println(start+":"+limit);
	try{
		int index = Integer.parseInt(start);
		int pageSize = Integer.parseInt(limit);
		String json = "{totalProperty:100,root:[";
		for(int i=index;i<pageSize+index;i++){
			json+="{id:"+i+",name:'name"+i+"',desc:'desc"+i+"'}";
		
			if(i!=pageSize+index-1){
				json+=",";
			}
		}
		json+="]}";
		response.getWriter().write(json);
	}catch(Exception e){
		e.printStackTrace();
	}
 %>
 </body>
</html>
