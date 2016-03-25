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
    Ext.form.Field.prototype.msgTarget = 'side';
  		year = new Ext.data.SimpleStore({
  			fields:['value','text'],
  			data:[['2008','2008'],['2009','2009']]
  		});
  		yearCombo = new Ext.form.ComboBox({
  			id:"ybid",
  			fieldLabel:'目标年份',//标签 
  			typeAhead : true, 
  			name:"year",
  			hiddenName:"hyear",
  			width:100,
  			store:year,
  			mode:'local',
  			emptyText:"请选择。。。",
  			readOnly:true,
  			value:(new Date()).YEAR,
  			triggerAction:'all',
  			allowBlank:false,
  			displayField:'text',
  			valueField:'value',
  			editable:false,
  			forceSelection:true,
  			blankText:'请选择',
  		});
  		month = new Ext.data.SimpleStore({
  			fields:['value','text'],
  			data:[['01','01'],['02','02'],['03','03'],['04','04'],['05','05']]
  		});
  		monthCombo = new Ext.form.ComboBox({
  			id:"mbid",
  			fieldLabel:'目标月份',//标签 
  			typeAhead : true, 
  			name:"month",
  			hiddenName:"hmonth",
  			width:100,
  			store:month,
  			mode:'local',
  			emptyText:"请选择。。。",
  			readOnly:true,
  			triggerAction:'all',
  			allowBlank:false,
  			displayField:'text',
  			valueField:'value',editable:false,
  			forceSelection:true,
  			blankText:'请选择',
  			listeners:{
  				select:{
  					fn:function(combo,record,index){
  						var store = day1;
  						if(record.get('value')=="01"){
  							store = day1;
  						}else if(record.get('value')=="02"){
  							store = day2;
  						}else if(record.get('value')=='03'){
  							store = day3;
  						}else if(record.get('value')=='04'){
  							store = day4;
  						}else if(record.get('value')=='05'){
  							store = day5;
  						}
  						Ext.getCmp('dbid').clearValue();
  						Ext.getCmp('dbid').store = store;
  						if(Ext.getCmp('dbid').view){
  							Ext.getCmp('dbid').view.setStore(store);
  						}
  						Ext.getCmp('dbid').enable();
  					}
  				}
  			}
  		});
  		day1 = new Ext.data.SimpleStore({
  			fields:['value','text'],
  			data:[['01','01'],['02','02'],['03','03'],['04','04'],['05','05']]
  		});
  		day2 = new Ext.data.SimpleStore({
  			fields:['value','text'],
  			data:[['06','06'],['07','07'],['08','08'],['09','09'],['10','10']]
  		});
  		day3 = new Ext.data.SimpleStore({
  			fields:['value','text'],
  			data:[['11','11'],['12','12'],['13','13'],['14','14'],['15','15']]
  		});
  		day4 = new Ext.data.SimpleStore({
  			fields:['value','text'],
  			data:[['16','16'],['17','17'],['18','18'],['19','19'],['20','20']]
  		});
  		day5 = new Ext.data.SimpleStore({
  			fields:['value','text'],
  			data:[['21','21'],['22','22'],['23','23'],['24','24'],['25','25']]
  		});
  		dayCombo = new Ext.form.ComboBox({
  			id:"dbid",
  			fieldLabel:'目标月份',//标签 
  			typeAhead : true, 
  			name:"day",
  			hiddenName:"hday",
  			width:100,
  			store:day1,
  			mode:'local',
  			emptyText:"请选择。。。",
  			readOnly:true,
  			triggerAction:'all',
  			allowBlank:false,
  			displayField:'text',
  			valueField:'value',editable:false,
  			forceSelection:true,
  			blankText:'请选择',
  		});
		new Ext.FormPanel({
			title:"combo",
			layout:"column",
			renderTo:"year",
			items:[
					monthCombo,
					dayCombo
			]
		});  
	});		
  	</script>
  	<div id="year"></div>
  </body>
</html>
