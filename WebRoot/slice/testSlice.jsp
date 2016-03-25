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
  <input type="button" value="点击" id="btn"/>
  <script type="text/javascript">
  	function handler(greet){
  		console.log(greet,this.name);
  	}
  	var obj = {name:'world'};
  	Function.prototype.bind = function(){
  		var _this = this;
  		var _obj = arguments[0];
  		var _param = Array.prototype.slice.call(arguments,1);
  		return function(){ 
  			_this.apply(_obj,_param);
  		}
  	};
  	Function.prototype.methodize = function(){
  		var _this = this;
  		//console.log(this);
  		var _obj = arguments[0];
  		var _param = Array.prototype.slice.call(arguments,1);
  		return function(){ 
  			var caller = this;
  		//	console.log(this);
  			 var param = Array.prototype.slice.call(arguments, 0);
  			_this.apply(this,param);
  		}
  	}
  	obj.handler = handler.methodize();
  	obj.handler('hello');
  </script>
  <div id="hello" style="height:600px"></div>
  
  </body>
</html>
