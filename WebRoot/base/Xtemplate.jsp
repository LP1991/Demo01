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
  			var data = {
  				name:'s',
  				size:3,
  				options:[
  				//	{value:'河北',text:'河北省'},
  				//	{value:'唐山',text:'唐三市'},
  				//	{value:'路北',text:'路北区'}
  				"河北省","唐三市","路北区"
  				]
  			};
  			
  			var t = new Ext.XTemplate(
  				'<select name="{name}" size="{size}">',
  				'<tpl for="options">',
  					'<tpl if="xindex%2==0">',
  					'<option value="{.:trim}">{.:ellipsis(10)}</option>',
  					'</tpl>',
  					'<tpl if="xindex%2==1">',
  					'<option value="{.:trim}" selected="true">{.:ellipsis(10)}</option>',
  					'</tpl>',
  				'</tpl>',
  				'</select>'
  			);
  			t.append('f',data);
  		});	
  	</script>
  	<form id="f">
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
  	</form>
  </body>
</html>
