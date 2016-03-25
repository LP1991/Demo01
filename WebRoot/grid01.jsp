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
  		function renderSex(sex){
  			if(sex == "male"){
  				return '<span style="color:red">男</span>';
  			}else{
  				return '<span style="color:green">女</span>';
  			}
  		};
  		
  			
  		var store = new Ext.data.JsonStore({
  			proxy:new Ext.data.HttpProxy({url:"data01.jsp"}),
  			reader:new Ext.data.JsonReader(
  			{totalProperty:'totalProperty',root:'root'},
  			[
  			{name:"id"},{name:"name"},{name:"desc"}
  			])
  		});
  		
  		var sm = new Ext.grid.CheckboxSelectionModel({handleMouseDown:Ext.emptyFn});
  		var grid = new Ext.grid.GridPanel({
  			store:store,
  			columns:[sm,
  			new Ext.grid.RowNumberer({header:"NO",width:30}),
  			{header:"Id",sortable:true,dataIndex:"id",id:"id"},
  			{header:"Name",dataIndex:"name",sortable:true},
  			{header:"Desc",dataIndex:"desc",sortable:true},
  			],
  			title:"first",
  			sm:sm,
  			//viewConfig:{forceFit:true},
  			width:600,height:200,
  			bbar:new Ext.PagingToolbar({
  				store:store,
  				pageSize:5,
  				displayInfo:true,
  				displayMsg:'显示第 {0} 到第 {1} 条记录，一共  {2} 条',
  				emptyMsg:'没有记'
  			}),
  			renderTo:"hello"
  		});
  	store.load({params:{start:0,limit:5}});	
  	});
  </script>
  <div id="hello" style="height:600px"></div>
  
  </body>
</html>
