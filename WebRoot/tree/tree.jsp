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
  				el:"tree",
  				height:300,
  				width:300
  			});
  			var root = new Ext.tree.TreeNode({
  				text:"root"
  			});
  			
  			var leaf1 = new Ext.tree.TreeNode({
  				text:"root leaf"
  			});
  			var branch1 = new Ext.tree.TreeNode({
  				text:"root branch"
  			});
  			var leaf2 = new Ext.tree.TreeNode({
  				text:" branch1 is leaf"
  			});
  			tree.on('expand',function(node){
  				Ext.log(node+"展开了");
  			});
  			tree.on('collapse'+function(node){
  				Ext.log(node+"折叠了");
  			});
  			tree.on('dblclick',function(node){
  				Ext.log("你双击了"+node);
  			});
  			tree.on('click',function(node){
  				Ext.log("你点击了"+node);
  			});
  			root.appendChild(leaf1);
  			root.appendChild(branch1);
  			branch1.appendChild(leaf2);
  			tree.expand(true,true);
  			tree.setRootNode(root);
  			tree.render();
  		});
  	</script>
  	<div id="tree"></div>
  </body>
</html>
