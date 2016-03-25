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
  			var combo = new Ext.form.ComboBox({
  				triggerAction:'all',
  				emptyText:'请选择',
  				mode:'local',
  				hiddenName:'combo',
  				hiddenId:'com',
  				transform:'combo'
  			});
  		});
  	</script>
  	<select id="combo">
  		<option value="value1">text1</option>
  		<option value="value2">text2</option>
  		<option value="value3">text3</option>
  		<option value="value4">text4</option>
  		<option value="value5">text5</option>
  		<option value="value6">text6</option>
  	</select>
  </body>
</html>
