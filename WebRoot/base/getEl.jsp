<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'testWindow.jsp' starting page</title>
    
	 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="text/javascript" src="../../ext/adapter/ext/ext-base.js"></script>
	<script type="text/javascript" src="../../ext/ext-all.js"></script>
	<link rel="stylesheet" type="text/css" href="../../ext/resources/css/ext-all.css">
	<style type="text/css">
		.red{
			background:red;
			width:100px;
			height:100px;
		}
	</style>	
  </head>
  
  <body>
  	<script type="text/javascript">
  		Ext.onReady(function(){
  			var div = Ext.get("mydiv");
  			div.highlight();
  			div.addClass("red");
  			div.center();
  			div.setOpacity(.25);
  			div.setWidth(200,{
  				duration:2,
  				scope:this,
  				callback:this.highlight
  			});
  		});
  	</script>
  	<div id="mydiv"></div>
  </body>
</html>
