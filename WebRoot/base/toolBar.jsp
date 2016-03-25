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
  			var tb = new Ext.Toolbar({
  				width:300,
  				renderTo:'toolbar',
  				items:[{
  					text:'增加',
  					menu:new Ext.menu.Menu({
  						items:[{
  							text:'选项一'
  						},{
  							text:'选项二'
  						},{
  							text:'选项三'
  						},{
  							text:'历史',
  							menu:new Ext.menu.Menu({
  								items:[{
  									text:'今天'
  								},{
  									text:'昨天'
  								},{
  									text:'一个月'
  								}]
  							})
  						}]
  					}),
  					handler:function(){
  						//alert("增加");
  					}
  				},{
  					text:'删除',
  					handler:function(){
  						alert("删除");
  					}
  				},{
  					text:'修改',
  					handler:function(){
  						alert("修改");
  					}
  				}]
  			});
  			
  		});	
  	</script>
  	<div id="toolbar"></div>
  </body>
</html>
