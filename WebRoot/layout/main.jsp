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
  			var tree = new Ext.tree.TreePanel({
  				loader:new Ext.tree.TreeLoader({url:'tree/treeData.jsp'}),
  				title:'west',
  				
  				collapsible:true,
  				width:120
  				
  			}); 
  			var form = new Ext.form.FormPanel({
  				defaultType:"textfield",
  				labelAlign:'right',
  				labelWidth:50,
  				title:"form",
  				frame:true,
  				width:220,
  				region:'west',
  				items:[{
  					fieldLabel:"文本框"
  				}],
  				buttons:[{
  					text:"按钮"
  				}]
  			});
  			var viewPort= new Ext.Viewport({
  				layout:'border',
  				items:[{
  					region:'north',
  					contentEl:'north-div',
  					height:80,
  					bodyStyle:'background-color:#BBCCEE'
  				},{
  					region:'south',
  					contentEl:'south-div',
  					height:20,
  					bodyStyle:'background-color:#BBCCEE'
  				},form,{
  					region:'center',
  					contentEl:'center-div',
  					height:20,
  					bodyStyle:'background-color:#BBCCEE'
  				}]
  			});
  		});
  	</script>
  	<div id="north-div">north</div>
  	<div id="south-div">south</div>
  	<div id="center-div">center</div>
  </body>
</html>
