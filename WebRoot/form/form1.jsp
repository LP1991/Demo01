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
  			var form = new Ext.form.FormPanel({
  				defaultType:"textfield",
  				labelAlign:'right',
  				labelWidth:50,
  				title:"form",
  				frame:true,
  				width:220,
  				items:[{
  					fieldLabel:"文本框"
  				}],
  				buttons:[{
  					text:"按钮"
  				}]
  			});
  			form.render("form");
  		});
  		
  	</script>
  	<div id="form"></div>
  </body>
</html>
