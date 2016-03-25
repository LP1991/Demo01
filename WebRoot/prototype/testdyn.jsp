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
		function Polygon(iSides){
			this.sides = iSides;
			this.type = "polygon";
			if(typeof Polygon._initalized == 'undefined'){
				Polygon.prototype.getArea = function(){
					return 0;
				}
				Polygon._initalized = true;
			}
		}
		Polygon.Lang = 'English';
		Polygon.speak = function(){
			alert(this.Lang);
		}
		Polygon.prototype.intriduce = function(){
			alert("3q");
		}
		function Triangle(iBase,iHeight){
			Polygon.call(); 
			this.base = iBase;
			this.height = iHeight;
			if(typeof Triangle._initalized == 'undefined'){
				Triangle.prototype.getArea = function(){
					return .5*this.base*this.height;
				}
				Triangle._initalized = true;
			}
		}  	
		Triangle.prototype = new Polygon();
		var tri1 = new Triangle(3,4);
		var tri2 = new Triangle(3,4);		
		Triangle.prototype.type = "triangle"; 
		Triangle.prototype.sex = "sex"; 
		//alert(tri1.getArea());  
		//tri1.intriduce();
		alert(tri2.sex);
  </script>
  <div id="hello" style="height:600px"></div>
  
  </body>
</html>
