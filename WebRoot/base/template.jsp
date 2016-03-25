<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'testWindow.jsp' starting page</title>
    
	 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="text/javascript" src="../../ext/adapter/ext/ext-base.js"></script>
	<script type="text/javascript" src="../../ext/ext-all-debug.js"></script>
	<link rel="stylesheet" type="text/css" href="../../ext/resources/css/ext-all.css">	
  </head>
  
  <body>
  	<script type="text/javascript">
  		Ext.onReady(function(){
  			var data = [
  				['1','male','name1','descn1'],
  				['2','female','name2','descn2'],
  				['3','male','name3','descn3'],
  				['4','female','name4','descn4'],
  				['5','male','name5','descn5']
  			];
  			var t = new Ext.Template(
  				'<tr>',
  					'<td>{0}</td>',
  					'<td>{1:this.renderSex}</td>',
  					'<td>{2:trim}</td>',
  					'<td>{3:trim}</td>',
  				'</tr>'
  			);
  			t.renderSex = function(value){
  				if(value == "male"){
  					return "<span style='color:red;font-weight:bold'>红男</span>";
  				}else{
  					return "<span style='color:green;font-weight:bold'>绿女</span>";
  				}
  			}
  			t.compile();
  			for(var i=0;i<data.length;i++){
  				t.append('some-element',data[i]);
  			}
  		});	
  	</script>
  	<table border="1">
  		<tbody id="some-element">
  			<tr>
  				<th>id</th>
  				<th>sex</th>
  				<th>name</th>
  				<th>descn</th>
  			</tr>
  		</tbody>
  	</table>
  </body>
</html>
