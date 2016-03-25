<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'testWindow.jsp' starting page</title>
    
	 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="text/javascript" src="../../ext/adapter/ext/ext-base.js"></script>
	<script type="text/javascript" src="../../ext/ext-all.js"></script>
	<link rel="stylesheet" type="text/css" href="../../ext/resources/css/ext-all.css">	
  </head>
  
  <body>
  	<script type="text/javascript">
  		Ext.onReady(function(){
  			var viewport = new Ext.Viewport({
  				layout:'border',
  				items:[{
  					region:'center',
  					title:'Table Layout',
  					layout:'table',
  					defaults:{	
  						bodyStyle:'padding:20px'
  					},
  					layoutConfig:{
  						columns:3,
  						cellspadding:5
  					},
  					items:[{
  						html:'<p>Cell A content</p>',
  						rowspan:2
  					},{
  						html:'<p>Cell B content</p>',
  						colspan:2
  					},{
  						html:'<p>Cell C content</p>'
  					},{
  						html:'<p>Cell D content</p>'
  					}]
  				}]
  			});
  		});
  	</script>
  </body>
</html>
