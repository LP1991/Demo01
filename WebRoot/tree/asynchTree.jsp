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
  			var tree = new Ext.tree.TreePanel({
  				loader:new Ext.tree.TreeLoader({
					url:"tree2.js"  				
  				}),
  				el:'tree',
  				height:300
  			});
  			var root = new Ext.tree.AsyncTreeNode({
  				text:"root"
  			});
  			
  			tree.setRootNode(root);
  			tree.render();
  		});
  	</script>
  	<div id="tree"></div>
  </body>
</html>
