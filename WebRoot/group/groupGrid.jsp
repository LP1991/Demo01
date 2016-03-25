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
  		var data = [
  			[1,"female","name1","desc1"],
  			[2,"male","name2","desc2"],
  			[3,"female","name3","desc3"],
  			[4,"male","name4","desc4"],
  			[5,"female","name5","desc5"]
  		];
  		var store = new Ext.data.GroupingStore({
  			data:data,
  			reader:new Ext.data.ArrayReader({
  				id:0
  			},Ext.data.Record.create(
  			[{name:"id"},{name:"sex"},{name:"name"},{name:"desc"}])),
  			groupField:"sex",
  			sortInfo:{field:"id",direction:"ASC"}
  		});
  		
  		/*
  		var store = new Ext.data.SimpleStore({data:data,
			fields:["id","name","organization","homepage"]});
		var colM=new Ext.grid.ColumnModel([
						{header:"项目名称",dataIndex:"name",sortable:true},
						{header:"开发团队",dataIndex:"organization",sortable:true},
						{header:"网址",dataIndex:"homepage",renderer:show,width:300}
			]);
			new Ext.grid.GridPanel({
				width:700,
				height:400,
				renderTo:"hello",
				title:"中国Java开源产品及团队",
				cm:colM,
				store:store,
				autoExpandColumn:1
			});
		*/
			
  		var cm = new Ext.grid.ColumnModel([
	  		{id:"id",header:"Id",dataIndex:"id"},
	  		{header:"Sex",dataIndex:"sex"},
	  		{header:"Name",dataIndex:"name"},
	  		{header:"Desc",dataIndex:"desc"}
  		]);
  		var grid = new Ext.grid.GridPanel({
  			id:"grid",
  			store:store,
  			cm:cm,
  			height:200,
  			view:new Ext.grid.GroupingView(),
  			renderTo:"hello"
  		});
  		//扩展 resize
  		var rz = new Ext.Resizable('grid',{
  			warp:false,
  			minHeight:200,
  			minWidth:200,
  			pinned:false,
  			handles:"se"
  		});
  		rz.on('resize',grid.autoSize,grid);
  	});
  	</script>
  	<div id="hello" style="height:400,width:500"></div>
  </body>
</html>
