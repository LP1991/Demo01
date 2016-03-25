<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'testWindow.jsp' starting page</title>
    
	 <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<script type="text/javascript" src="../../ext/adapter/ext/ext-base.js"></script>
	<script type="text/javascript" src="../../ext/ext-all-debug.js"></script>
	<link rel="stylesheet" type="text/css" href="../../ext/resources/css/ext-all.css">	
  </head>
  
  <body>
  	<script type="text/javascript">
  		Ext.onReady(function(){
  		
  			Ext.MessageBox.alert = function(title, msg, fn, scope){
			    this.show({
			        title : title,
			        msg : msg,
			        buttons: this.OKCANCEL,
			        fn: fn,
			        scope : scope,
			        icon: this.ERROR
			    });
			    return this;
			}
			
  			Ext.Msg.alert("提示","谢谢",function(btn){
  				alert("你刚刚点击了"+btn);
  			});
  			
  			/*
  			Ext.Msg.confirm("你确定?","不要后悔哦!",function(btn){
  				alert("你点击了"+btn);
  			});
  			*/
  			/*
  			Ext.Msg.prompt("请输入","期望薪资:",function(btn,text){
  				alert("你点击了"+btn+",期望薪资："+text);
  			});
  			*/
  			
  			
			/*
  			Ext.Msg.show({
  				title:'进度条',
  				msg:'更新中',
  				width:400,
  				progress:true,
  				closable:false
  			});
  			*/
  			/*
  			var f = function(v){
  				return function(){
  					if(v==11){	
  						Ext.Msg.hide();
  					}else{
  						Ext.Msg.updateProgress(v/10,'正在读取'+v+'个，一共10个');
  					}
  				}
  			}
  			for(var i=1;i<12;i++){
  				setTimeout(f(i),i*1000);
  			}*/
  			var v=1;
  			var runner = new Ext.util.TaskRunner();
  			var task = {
  				run:function(){
  					if(v==11){	
  						//runner.stop();
  						Ext.Msg.hide();
  						v = 1;
  						return false;
  					}else{
  						Ext.Msg.updateProgress(v/10,'正在读取'+v+'个，一共10个');
  					}
  					v++;
  				},
  				interval:1000,
  				duration:11000
  			};
  			//runner.start(task);
  		});
  	</script>
  </body>
</html>
