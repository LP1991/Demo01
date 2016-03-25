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
  			Ext.QuickTips.init();
  			var tree = new Ext.tree.TreePanel({
  				el:"tree",
  				height:300,
  				width:300
  			});
  			var root = new Ext.tree.TreeNode({
  				text:"root",
  				qtip:"root"
  			});
  			
  			var leaf1 = new Ext.tree.TreeNode({
  				text:"root leaf",
  				qtip:"01"
  			});
  			var branch1 = new Ext.tree.TreeNode({
  				text:"root branch",
  				qtip:"02"
  			});
  			var leaf2 = new Ext.tree.TreeNode({
  				text:" branch1 is leaf",
  				qtip:"03"
  			});
  			var contextMenu = new Ext.menu.Menu({
  				id:"theContextMenu",
  				items:[{
  					text:"有本事点我啊",
  					handler:function(){
  						alert("我被击中了啊。。。");
  					}	
  				}]
  			});
  			tree.on('click',function(node){
  				Ext.Msg.show({
  					title:"提示",
  					msg:"你点击了"+node,
  					animEl:node.ui.textNode
  				});
  			});
  			tree.on("contextmenu",function(node,e){
  				e.preventDefault();
  				node.select();
  				contextMenu.showAt(e.getXY());
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
