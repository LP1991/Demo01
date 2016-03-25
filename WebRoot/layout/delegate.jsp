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
		  Ext.QuickTips.init() 
		  var myclass=new Object(); 
		  //myclass并没有alert方法,我们也不打算为它写一个alert方法 
		  //我们希望它和window.alert有一样的行为,所以我们委托window来做  
		  myclass.alert=window.alert.createDelegate(window); 
		  //我们还希望他有个更漂亮的show方法和Ext.MessageBox的show功能一样 
		  //所以我们又得委托给Ext.MessageBox来做这事了
		  myclass.show=Ext.MessageBox.show.createDelegate(Ext.MessageBox); 
		  //我们的myclass也有alert和show方法了 
		  myclass.alert('alert1'); 
		  myclass.show({title:'title',msg:'message'}); 
		});  
  	</script>
  </body>
</html>
