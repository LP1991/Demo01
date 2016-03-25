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
  			var form = new Ext.form.FormPanel({
  				layoutAlign:'right',
  				labelWidth:50,
  				fileUpload:true,
  				fileType:['jpg','txt'],
  				url:'load.do',
  				rame:true,
  				items:[
  					{
  						xtype:'textfield',
  						fieldLabel:'上传',
  						name:'file',
  						inputType:'file',
  						regex:/.jpg/,
  						allowBlank:false
  					},{
  						fieldLabel:'name',
  						regex:/^[\u4e00-\u9fa5]+$/,
  						regexText:'只接受中文',
  						xtype:'textfield'
  					}
  				],
  				buttons:[
	  				{
	  					text:'按钮',
	  					handler:function(){
		  					if(form.getForm().isValid()){
		  						form.getForm().submit({
		  							method:'post',
		  							waitMsg:'文件这正在上传',
		  							success:function(form,action){
		  								Ext.Msg.alert("系统提示","文件上传成功");
		  							},
		  							failure:function(form,action){
		  								Ext.Msg.alert("系统提示",'文件上传失败');
		  							}
		  						});
		  					}else{
		  						Ext.Msg.alert("系统提示",'文件错误');
		  					}
	  					}
	  				}
  				],
  				height:200,
  				renderTo:'form'
  			});
  		});
  	</script>
  	<div id="form"></div>
  </body>
</html>
