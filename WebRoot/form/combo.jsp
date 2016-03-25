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
  			var data = [
  				['value1','1'],
  				['value2','12'],
  				['value3','123'],
  				['value4','1234'],
  				['value5','12345123'],
  			];
  			var store = new Ext.data.SimpleStore({
  				data:data,
  				fields:['value','text']
  			});
  			var combo = new Ext.form.ComboBox({
  				store:store,
  				emptyText:"请选择",
  				mode:"local",
  				triggerAction:"all",
  				typeAhead:true,
  				typeAheadDelay:500,
  				valueField:"value",
  				displayField:"text",
  				renderTo:"combo"
  			});
  			
  		});
  		
  	</script>
  	<div id="combo"></div>
  </body>
</html>
