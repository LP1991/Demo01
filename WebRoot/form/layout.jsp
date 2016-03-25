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
  		var modi = new Ext.form.FormPanel({
  			labelAlign:'right',
  			labelWidth:60,
  			frame:true,
  			width: 600,
  			autoHeight:true,
  			url:'service.jsp',
  			bodyStyle:'padding:5px 5px 0',
  			title:'tijiao',
  			buttonAlign:'right',
  			/*
  			items:[
  				{
  					fieldLabel:'name',
  					allowBlank:false
  				},{
  					fieldLabel:'password',
  					allowBlank:false
  				},{
  					fieldLabel:'验证码',
  				},{
  					fieldLabel:'nice'
  				}
  			],*/
  			items:[
  				{
  					layout:'column',
  					items:[{
  							layout:'form',
  							columnWidth:0.5,
  							xtype:'fieldset',
  							autoHeight:true,
  							title:'password',
  							defaultType:'textfield',
  							items:[{xtype:'textfield',fieldLabel:'name',anchor:'95%'}
  								,{xtype:'textfield',fieldLabel:'password',anchor:'95%'}
  							]
  						},
  						{
  							layout:'form',
  							columnWidth:0.5,
  							xtype:'fieldset',
  							autoHeight:true,
  							title:'name',
  							items:[{xtype:'radio',boxLabel:'name',name:'box',inputValue:'4'}
  								,{xtype:'radio',boxLabel:'password',name:'box',inputValue:'5'}
  							]
  						}
  					]
  				},{
  					width:345,
  					height:100,
  					xtype:'textarea',
  					fieldLabel:'foreWords'
  				}
  			],
  			/*
  			//example
  			items: [{
            layout:'column',
            items:[{
                columnWidth:.5,
                layout: 'form',
                items: [{
                    xtype:'textfield',
                    fieldLabel: 'First Name',
                    name: 'first',
                    anchor:'95%'
                }, {
                    xtype:'textfield',
                    fieldLabel: 'Company',
                    name: 'company',
                    anchor:'95%'
                }]
            },{
                columnWidth:.5,
                layout: 'form',
                items: [{
                    xtype:'textfield',
                    fieldLabel: 'Last Name',
                    name: 'last',
                    anchor:'95%'
                },{
                    xtype:'textfield',
                    fieldLabel: 'Email',
                    name: 'email',
                    vtype:'email',
                    anchor:'95%'
                }]
            }]
        },{
            xtype:'htmleditor',
            id:'bio',
            fieldLabel:'Biography',
            height:200,
            anchor:'98%'
        }],
        */
  			buttons:[
  				{
  					text:'SAVE',
  					handler:function(){
  						modi.getForm().submit();
  					}
  				},{
  					text:'CANCEL'
  				}
  			]
  		});
  		modi.render('form');
  	});
  	</script>
  	<div id="form"></div>
  </body>
</html>
