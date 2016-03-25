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
		 var navhandler=function(direction){
		 var wizard=Ext.getCmp('wizard').layout;
		 var pre=Ext.getCmp('move_prev');
		 var next=Ext.getCmp('move_next');
		 var activeId=wizard.activeItem.id;
		 if(activeId=='card-0'){
		     if(direction==1){
		       wizard.setActiveItem(1);
		       pre.setDisabled(false);
		     }
		 }else if(activeId=='card-1'){
		     if(direction==-1){
		         wizard.setActiveItem(0);
		         pre.setDisabled(true);
		      }else{
		          wizard.setActiveItem(2);
		          next.setDisabled(true);
		                }
		 }else if(activeId=='card-2'){
		     if(direction==-1){
		        wizard.setActiveItem(1);
		        next.setDisabled(false);
		        }
		     }
		      
	   }
	   
	   new Ext.Viewport({
	     layout:'border',
	      items:[
	      {region:'north',title:'north',html:'north',height:50,collapsible:true},
	      {region:'south',title:'south',html:'south',height:50,collapsible:true},
	      {region:'west',title:'west',width:200,collapsible:true,
	        layout:'accordion', //accordion布局模式
	        layoutConfig:{
	           animate:true
	          //titleCollapse:true,
	          //activeOnTop:false
	                     },
	          items:[{
	          title:'第一栏',
	          html:'第一栏'
	          },{
	          title:'第二栏',
	          html:'第二栏'
	          },{
	          title:'第三栏',
	          html:'第三栏'
	          }
	                ]},
	      {
	        region:'east',id:"wizard",title:'向导',activeItem:0,width:200,collapsible:true,
	        layout:'card',//card布局模式
	        bodyStyle:'padding:15px',
	        defaults:{
	        border:false
	                 },
	        bbar:[{
	             id:'move_prev',
	             text:'上一步',
	             handler: navhandler.createDelegate(this,[-1]),
	             disabled:true
	             },
	              '->',// 表示会占据所有空白的区域
	             {
	             id:'move_next',
	             text:'下一步',
	             handler:navhandler.createDelegate(this,[1])
	             }],
	         items:[{
	             id:'card-0',
	             html:'<h1>hehe</h1><p>第一步</p>'
	             },{
	             id:'card-1',
	             html:'<h1>hehe</h1><p>第二步</p>'
	             },{
	             id:'card-2',
	             html:'<h1>hehe</h1><p>第三步</p>'
	              }]
	       },
	      {region:'center',title:'center',html:'center'}
	           ]
	        });
		});
  	</script>
  	
  </body>
</html>
