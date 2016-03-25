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
  		var navHandler=function(direction){  
		     var wizard=Ext.getCmp('wizard').layout;  
		     var pre=Ext.getCmp('move-prev');  
		     var next=Ext.getCmp('move-next');  
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
  		var viewport = new Ext.Viewport({
  			layout:'border',
  			items:[{
  				region:'west',
  				id:'wizard',
  				width:200,
  				title:'某某向导',
  				layout:'card',
  				activeItem:0,
  				bodyStyle:'padding:15px',
  				defaults:{
  					border:false
  				},
  				bbar:[{
  					id:'move-prev',
  					text:'上一步',
  					handler:navHandler.createDelegate(this,[-1]),
  					disabled:true
  				},'->',{
  					id:'move-next',
  					text:'下一步',
  					handler:navHandler.createDelegate(this,[1])
  				}],
  				items:[{
  					id:'card-0',
  					html:'<h1>哈哈<br>欢迎用砸门的向导</h1><p>第一步，共三步</p>'
  				},{
  					id:'card-1',
  					html:'第二部，一共三步'
  				},{
  					id:'card-2',
  					html:'<h1>恭喜你，完成了。</h1><p>第三步，一共三步，最后一步了</p>'
  				}]
  			},{
  				region:'center',
  				split:true,border:true
  			}]
  		});
  	});
  	</script>
  	
  </body>
</html>
