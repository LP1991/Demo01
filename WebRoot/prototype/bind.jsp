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
		var bindEventListener = function(el,type,handler){
			if(window.addEventListener){
				el.addEventListener(type,handler,false);
			}else if(window.attachEvent){
				el.attachEvent('on' + type,handler);
			}else{
				el['on' + type] = handler;
			}
		}
		function handler(){
			alert(this.name);
		}
		var obj = {name:'LP'};
		Function.prototype.bind = function(){
	        var _this = this;
	        var _obj = arguments[0];
	        var _params = Array.prototype.slice.call(arguments,1);
	        return function(){
	            var _args = _params.concat(Array.prototype.slice.call(arguments,0)); //合并后的参数数组
	            return _this.apply(_obj,_args);
	        }
	    }
		bindEventListener(document.getElementById('btn'),'click',handler.bind(obj));
  </script>
  <div id="hello" style="height:600px"></div>
  
  </body>
</html>
