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
  			Ext.Msg.show({
  				title:'请选择按钮',
  				msg:'三个按钮随便选',
  				width:400,
  				buttons:Ext.Msg.YESNOCANCEL,
  				fn:function(btn){
  					alert("你点击了"+btn);
  				},
  				animEl:'dialog'
  			});
  		});
  	</script>
  	<div id="dialog"></div>
  </body>
</html>
