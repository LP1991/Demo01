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
  	Object.prototype.toString = function(){
  		for(_param in this){
  			console.log(_param+"  ");
  		}
  	}
  	function convertNeStatus(){
  		if(this.status == 1){
  			console.log('上线');
  		}else{
  			console.log('离线');
  		}
  	}
  	function AirForce(){
  		this.station = 'CSB01';
  		this.airplaneSort = 'FigerterPlane';
  		this.age = 3;
  	}
  	var convertWocStatus;
  	var Soldier = function(){
  		this.name = 'lp';
  		this.sex = 'male';
  		this.age = 24;
  	}
  	var soldier = new Soldier();
  	soldier.name = 'lp';
  	soldier.sex = 'man';
  	soldier.age = 13; 
  	for(param in soldier){
  	//	console.log(param+" "+soldier[param]);
  	}
  	//console.log(Soldier.prototype.constructor);
  	AirForce.prototype = new Soldier();
  	var air = new AirForce();
  	air.prototype = new Soldier();
  	console.log(air.prototype.age);
  	//console.log(air.name,air.airplaneSort);
  
  	//toString
  	soldier.toString();
  	//constructor
  	var str  = new String("the example string");
  	console.log(str.constructor == String); // true
  	//typeof
  	if((typeof(str)=="object")&&(str.constructor == String)){ //true
  		console.log("nice");
  	}
  	//toLocalString 默认与toString  valueOf 一样
  	var ob = {name:'lp',rank:'corporal'};
  	console.log('是否存在参数'+ob.hasOwnProperty("name")); //true
  	console.log('是否存在参数'+ob.hasOwnProperty("age")); //false
  	console.log('是否存在参数'+ob.hasOwnProperty("toString")); //false
  	
  	//propertylsEnumerable
  	console.log("属性name是否可以迭代"+ob.propertyIsEnumerable("name"));
  	console.log("属性toString是否可以迭代"+ob.propertyIsEnumerable("toString"));
  	
  	//isPrototypeOf是不是原型对象
  	console.log("Object.prototype是不是ob的原型对象"+Object.prototype.isPrototypeOf(ob));
  	console.log("Object是不是ob的原型对象"+Object.isPrototypeOf(ob));  
  	
  	
  </script>
  <div id="hello" style="height:600px"></div>
  
  </body>
</html>
