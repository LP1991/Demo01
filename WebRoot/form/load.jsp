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
  			Ext.QuickTips.init();
  			Ext.form.Field.prototype.msgTarget = 'side';
  			var fs = new Ext.form.FormPanel({
  				frame:true,
  				title:'XML Form',
  				labekAlign:'right',
  				labelWidth:85,
  				width:340,
  				height:300,
  				waitMsgTarget:true,
  				reader:new Ext.data.XmlReader({
  					record:'contact',
  					success:'@success'
  				},[
  					{name:'first',mapping:'name/first'},
  					{name:'last',mapping:'name/last'},
  					'company','email','state',
  					{name:'dob',type:'date',dateFormat:'m/d/Y'}
  				]),
  				//errorReader:new Ext.form.XmlErrorReader(),
  				items:[
  				new Ext.form.FieldSet({
  					title:'Contact Infomation',
  					autoHeight:true,
  					defaultType:'textfield',
  					items:[{
  						fieldLabel:'First name',
  						name:'first',
  						width:190
  					},{
  						fieldLabel:'Last Name',
  						name:'last',
  						width:190
  					},{
  						fieldLabel:'Company',
  						name:'company',
  						width:190
  					},{
  						fieldLabel:'Email',
  						name:'email',
  						vtype:'email',
  						width:190
  					},
  					new Ext.form.ComboBox({
  						fieldLabel:'State',
  						hiddeName:'state',
  						name:'state',
  						store:new Ext.data.SimpleStore({
  							fields:['value','text'],
  							data:[['value1','text1'],['value2','text2'],['value3','text3']]
  						}),
  						valueField:'abbr',
  						displayField:'text',
  						valueField:'value',
  						typeAhead:true,
  						mode:'local',
  						triggerAction:'all',
  						emptyText:'select a state',
  						selectOnFocus:true,
  						width:190
  					}),
  					new Ext.form.DateField({
  						fieldLabel:'Date Of Birth',
  						name:'dob',
  						width:190,
  						allowBlank:false
  					})
  					]	
  				})
  				]
  			});
  			fs.addButton('Load',function(){
  				fs.getForm().load({url:'xml-form.xml',waitMsg:'Loading'});
  			});
  			var submit = fs.addButton({
  				text:'Submit',
  				disabled:true,
  				handler:function(){
  					fs.getForm().submit({url:'xml-errors.xml',waitMsg:'Saving Data...'});
  				}
  			});
  			fs.on({
  				actioncomplete:function(form,action){
  					if(action.type == 'load'){
  						submit.enable();
  					}
  				}
  			});
  			fs.render('form');
  		});
  	</script>
  </body>
  <div id="form"></div>
</html>
