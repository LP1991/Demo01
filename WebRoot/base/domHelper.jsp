<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'testWindow.jsp' starting page</title>
    
	 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="text/javascript" src="../../ext/adapter/ext/ext-base.js"></script>
	<script type="text/javascript" src="../../ext/ext-all-debug.js"></script>
	<link rel="stylesheet" type="text/css" href="../../ext/resources/css/ext-all.css">
	<style type="text/css">
		.red{
			color:red;
		}
	</style>	
  </head>
  
  <body>
  	<script type="text/javascript">
  		Ext.onReady(function(){
  			var win = new Ext.Window({
				el:'window',
				id:'ws',
				autoDomMove:false,
				//modal:true,
				layout:'fit',
				width:700,
				height:400,
				title:'form',
				closeAction:'hide',
				items:[{id:'element',html:'element'}],
				buttons:[{
					text:'按钮',
					scope:this,
					handler:function(){
						Ext.DomHelper.append('xp',{
							tag:'span',
							html:'nice day',
							cls:'red'
						});
					}
				}],
				onEsc:function(){
				//	win.close();
				alert("escape");
				}
			});
			win.show();	
  		});
  	</script>
  	<div id="window"></div>
  	<div id="xp" style="width:200;height:200;border:1px solid red">
  	</div>
  </body>
</html>
