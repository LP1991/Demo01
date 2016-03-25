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
		HR {
			clear:both;
			visibility:visible;
		}
		.block {
			border:1px red solid;
			margin:10px;
			min-height:80px;
		}
		.item {
			border:1px green solid;
			background: green;
			float:left;
			margin:10px;
			width:50px;
			min-height:50px;
			text-align:center;
		}
	</style>
	
  </head>
  
  <body>
  	<script type="text/javascript">
  		Ext.onReady(function(){
  			//new Ext.dd.DDProxy('block');
  			var proxy = new Ext.dd.DragSource('proxy',{group:'dd'});
  			var target = new Ext.dd.DDTarget('target','dd');
  			proxy.afterDragDrop = function(target,e,id){
  				var destEl = Ext.get(id);
  				var srcEl = Ext.get(proxy.getEl());
  				srcEl.insertBefore(destEl);
  			};
  		});
  	</script>
  	<div id="proxy" class="item">item</div>
  	<hr/>
  	<div id="target" class="block"><hr/></div>
  </body>
</html>
