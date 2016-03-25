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
 			[1.1,1,new Date(),false],
 			[2.2,2,new Date(),true],
 			[3.3,0,new Date(),false],
 			[4.4,1,new Date(),false],
 			[5.5,2,new Date(),true]
 			];
 		
	 		var comboData = [['0','新版本教程'],['1','ext在线支持'],['2','ext扩展']];
	 		var cm = new Ext.grid.ColumnModel([
	 			{
	 				header:"数字列",dataIndex:"number",
	 				editor:new Ext.grid.GridEditor(new Ext.form.NumberField({
	 					allowBlank:false,allowNegative:false,
	 					maxValue:10
	 				}))
	 			},{
	 				header:"combo列",dataIndex:"combo",
	 				editor:new Ext.grid.GridEditor(new Ext.form.ComboBox({
	 					store:new Ext.data.SimpleStore({
	 						fields:['value','text'],
	 						data:comboData
	 					}),
	 					emptyText:"请选择",
	 					mode:"local",
	 					triggerAction:'all',
	 					valueField:"value",
	 					displayField:"text",
	 					readOnly:true
	 				})),
	 				renderer:function(value){
	 					return comboData[value][1];
	 				}
	 			},{
	 				header:'日期列',
	 				dataIndex:"date",
	 				editor:new Ext.grid.GridEditor(new Ext.form.DateField({
	 					format:'Y-m-d',
	 					minValue:'2007-12-14',
	 					disableDays:[0,6],
	 					disableDaysText:"只能选择工作日"
	 				})),
	 				renderer:function(value){
	 					return value.format('Y-m-d');
	 				}
	 			},{
	 				header:"判断列",
	 				dataIndex:"check",
	 				editor:new Ext.grid.GridEditor(new Ext.form.Checkbox({
	 					allowBlank:false
	 				})),
	 				renderer:function(value){
	 					return value?"是":"否";
	 				}
	 			}
	 		]);
	 		var store = new Ext.data.SimpleStore({
	 				data:data,
	 				fields:[{name:"number",type:"int"},
	 				{name:"combo",type:"int"},{name:"date",type:"date",format:"Y-m-d"},
	 				{name:"check"}]
	 			});
	 		var grid = new Ext.grid.EditorGridPanel({
	 			cm:cm,
	 			store:store,
	 			sm:new Ext.grid.RowSelectionModel({singleSelect:true}),
	 			width:400,
	 			height:300,
	 			renderTo:"hello"
	 		});
	 		grid.on('click',function(){
	 			var selections = grid.getSelectionModel().getSelections();
	 			for(var i=0;i<selections.length;i++){
	 				var record = selections[i];
	 				Ext.Msg.alert("你点击了"+record.get("number")+","+
	 				record.get("combo")+","+record.get("date"));
	 			}
	 		});
 		});
  	</script>
  	<div id="hello" style="height:500px"></div>
  </body>
</html>
