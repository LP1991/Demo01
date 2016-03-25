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
  			/*
  			var store = new Ext.data.SimpleStore({
  				url:'combo.txt',
  				fields:["value","text"]
  			});
  			*/
  			var store = new Ext.data.Store({
  				proxy:new Ext.data.HttpProxy({url:'combo.txt'}),
  				reader: new Ext.data.ArrayReader({},[{name:'value'},{name:'text'}])
  			});
  			
  			var combo = new Ext.form.ComboBox({
  				store:store,
  				triggerAction:'all',
  				emptyText:'请选择',
  				hiddenName:'combo',
  				valueField:"value",
  				displayField:"text",
  				pageSize:5,
  				resizable:true,
  				renderTo:'combo'
  			});
  			combo.on('select',function(comboBox){
  				Ext.Msg.alert("你选择了",comboBox.getValue()+"-"+comboBox.getRawValue());
  			});
  		});
  	</script>
  	<div id="combo"></div>
  </body>
</html>
