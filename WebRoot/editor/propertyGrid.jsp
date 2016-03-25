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
  			new Ext.grid.PropertyGrid({
  				renderTo:"hello",
  				title:"属性表单",
  				autoHeight:true,
  				width:300,
  				sm:new Ext.grid.RowSelectionModel({singleSelect:true}),
  				source:{
  					"名字":"我不告诉你",
  					"创建实际那":new Date(Date.parse("09/09/2014")),
  					"是否有效":false,
  					"版本号":.01,
  					"描述":"没有什么号讲的额"
  				}
  			});
  		});
  	</script>
  	<div id="hello"></div>
  </body>
</html>
