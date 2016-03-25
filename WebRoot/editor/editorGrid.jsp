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
 	function renderSex(sex){
 		if(sex == "male"){
 			return '<span style="color:red">男</span>';
 		}else{
			return '<span style="color:green">女</span>';
 		}
 	};
  	Ext.onReady(function(){
  
  		var data = {totalProperty:3,root:[
  			{id:1,name:"tom",sex:"male"},
  			{id:2,name:"jasic",sex:"female"},
  			{id:3,name:"tiger",sex:"male"}
  		]};
  		var store = new Ext.data.JsonStore({
  			data:data,
  			root:"root",
  			totalProperty:"totalProperty",
  			fields:[{name:"id",mapping:"id"},{name:"name",mapping:"name"},
  			{name:"sex",mapping:"sex"}]
  		});
  		var cm = new Ext.grid.ColumnModel([
  			{id:"id",header:"Id",dataIndex:"id",editor:new Ext.form.TextField()},
  			{header:"Name",dataIndex:"name",editor:new Ext.form.TextField()},
  			{header:"Sex",dataIndex:"sex",editor:new Ext.form.TextField()}
  		]);
  		new Ext.grid.EditorGrid('grid',{
  			store:store,
  			columns:[
  				{id:"id",header:"Id",dataIndex:"id",editor:new Ext.form.TextField()},
  				{header:"Name",dataIndex:"name",editor:new Ext.form.TextField()},
  				{header:"Sex",dataIndex:"sex",editor:new Ext.form.TextField()}
  			],
  			height:200,
			width:600,
			clicksToEdit:1,
  			renderTo:"hello"
  		});
  	});
  	</script>
  	<div id="hello"></div>
  </body>
</html>
