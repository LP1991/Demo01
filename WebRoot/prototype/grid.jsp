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
  		function baseClass(name){
  			this.name = name;
  			this.introduce = function(){
  				alert("my name is " + name);
  			}
  		}
  		baseClass.run = function(){
  			alert("yes! i can run");
  		}
  		baseClass.prototype.IntroduceChinese = function(){
  			alert("我的名字是"+this.name);
  		}
  		var baseInstance = new baseClass("linpeng");
//  		baseInstance.introduce();
//  		baseInstance.IntroduceChinese();
//  		baseClass.run();
		function Car(){
		}
		Car.prototype.color = 'Red';
		Car.prototype.size = 100;
		Car.prototype.showSize = function(){
			alert("Car.size "+this.size);
		}
		var c1 = new Car();
		var c2 = new Car();
		c1.color = 'yellow';
		c1.showSize = function(){
			alert("changesize");
		};
		alert("c1.color "+ c1.color);
		alert("c2.color "+ c2.color);
		c1.showSize();
		c2.showSize();
  		
  	});
  </script>
  <div id="hello" style="height:600px"></div>
  
  </body>
</html>
