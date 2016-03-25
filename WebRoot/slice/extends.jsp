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
  	var Person = function(age,name){
  		this.age = age;
  		this.name = name;
  		if(!Person.prototype.say){
  			Person.prototype.say = function(){
  				console.log("hello my name is "+this.name);
  			}
  		}
  	}
  	// 1.使用apply 或者call 改变作用域实现继承
 // 	var Student = function(grade,age,name){
  		//Person.apply(this,[age,name]);
 // 		Person.call(this,age,name);
 // 		this.grade = grade;
 // 	}
   //2. 使用prototype实现继承
   	var Student = function(grade,age,name){
	   	Person.call(this,age,name);
   		this.grade = grade;
   	}
   	//3.prototype 实现继承
   	Student.prototype = new Person();
   	
  	var stu = new Student(1,15,'stu');
  	var stu2 = new Student(1,15,'stu2');
  	
  	stu2.age = 20;
  	console.log(stu.age+" "+stu.grade+" "+stu.name+" "+stu2.age);
  	console.log(stu.hasOwnProperty("age"));
  	stu2.say();
  	stu.say();
  	console.log(Student.prototype.isPrototypeOf(stu));
  </script>
  <div id="hello" style="height:600px"></div>
  </body>
</html>
