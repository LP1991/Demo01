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
  				enableDD:true,
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
  			tree.on('nodedrop',function(e){
  				Ext.Msg.alert("提示","节点"+e.dropNode+"掉到了"+e.target+"上，掉落方式为"+e.point);
  				var item={
  					dropNode:e.dropNode.id,
  					target:e.target.id,
  					point:e.point
  				};
  				Ext.lib.Ajax.request(
  					'POST',
  					'server.jsp',
  					{success:function(response){
  							Ext.Msg.alert("信息:"+response.responseText);
  						},
  					 failure:function(){
  							Ext.Msg.alert("错误","与后台联系 的时候出现了问题");
  					   }
  					},
  					"data="+encodeURIComponent(Ext.encode(item))
  				);
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
