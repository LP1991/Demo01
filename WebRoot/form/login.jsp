<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'testWindow.jsp' starting page</title>
    
	 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" type="text/css" href="../../ext/resources/css/ext-all.css">
	<script type="text/javascript" src="../../ext/adapter/ext/ext-base.js"></script>
	<script type="text/javascript" src="../../ext/ext-all.js"></script>
  </head>
  
  <body>
  <script type="text/javascript">
  	Ext.onReady(function(){
  		Ext.form.TTextField = Ext.extend(Ext.form.TextField,{
			tooltip:{text:'buyaoa'},
			onRender:function(ct, position){
				Ext.form.TTextField.superclass.onRender.call(this, ct, position);
				if(this.tooltip.text)
		        	new Ext.ToolTip({
		        		target:this.id,
		        		trackMouse:false,
		        		draggable:true,
		        		maxWidth:200,
		        		minWidth:100,
		        		title:this.tooltip.title,
		        		html:this.tooltip.text,
		        		closable:true
		        	});
			}
		});
		Ext.reg('ttextfield',Ext.form.TTextField);
  		var modi = new Ext.form.FormPanel({
  			labelAlign:'right',
  			defaultType:"textfield",
  			labelWidth:50,
  			frame:true,
  			url:'service.jsp',
  			height:100,
  			width:220,
  			title:'tijiao',
  			buttons:[
  				{
  					text:'按钮',
  					handler:function(){
  						modi.getForm().submit();
  					}
  				}
  			]
  		});
  		modi.add(new Ext.form.TTextField({
  			fieldLabel:"name",
  			name:'name'
  		}));
  		//form.submit 出现syntax error!!!!!!!!!!!!!!!!!
  		/*
  		modi.addButton({
  			text:'按钮',
  			handler:function(){
  				modi.getForm().submit();
  			}
  			
  			
  		});
  		*/
  		/*
  		//页面跳转型，最原始的表单提交    is not a function!!!!!!!!!!!!
  		modi.addButton({
  			text:"按钮",
  			handler:function(){
  				form.el.dom.action="service.jsp";
  				form.el.dom.submit();
  			}
  		});
  		*/
  		modi.render('form');
  	});
  	</script>
  	<div id="form"></div>
  </body>
</html>
