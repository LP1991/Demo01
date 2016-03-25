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
  		function fn(val){
			if(val>10){
				return '<span style="color:green;">'+val+"</span>";
			}else{
				return '<span style="color:red;">'+val+"</span>";
			}
		}
		Ext.onReady(function(){
		/**
		
			var data = { 'results': 2, 'rows': [
				{ id: 1, title: '测试', author: '小王', loginTimes: 3,lastLoginTime:'2014-7-1'},
				{ id: 2, title: 'Ben', author: 'williamraym', loginTimes:13,lastLoginTime:'2014-9-5'} ]
			}
			var store = new Ext.data.JsonStore({
				data:data,
				totalProperty:'results',
				root:"rows",
				fields:[{name:"id"},
					'title',
					{name:"username",mapping:"author"},
					{name:"loginTimes",type:"int"},
					{name:"lastLoginTime",type:"date",dateFormat:'Y-n-j'}
				]
			});
			var grid = new Ext.grid.GridPanel({
				store:store,
				width:400,
				height:600,
				columns:[
					{header:"Id",dataIndex:"id",sortable:true,width:50},
					{header:"Author",dataIndex:"username",sortable:true,width:100},
					{header:"Title",dataIndex:"title",width:100},
					{header:"LoginTimes",dataIndex:"loginTimes",sortable:true,width:80
						,renderer:fn},
					{header:"LastLoginTime",dataIndex:"lastLoginTime",sortable:true,
					renderer: Ext.util.Format.dateRenderer('Y年m月d日')}
				],
				autoExpandColumn:2,
	        	title:'Json Grid'
			});
			*/
			var form = new Ext.form.FormPanel({
  				defaultType:"textfield",
  				labelAlign:'right',
  				labelWidth:50,
  				title:"form",
  				frame:true,
  				items:[{
  					fieldLabel:"文本框"
  				}],
  				buttons:[{
  					text:"按钮"
  				}]
  			});
			function createCmFlapInfoPan(){
				var store= null;
				store=new Ext.data.Store({ 
					proxy:new Ext.data.HttpProxy({
						url:path+"conf/ajax/cmconfig!queryCmConfigList.action"
					}), 
					
					reader:new Ext.data.JsonReader(
						{ 
							root: 'records',
							relogin:'jsonData'
						}, 
						[{name:"cmflapinfo_downstreamindex", mapping:"downstreamifindex"},
						 {name:"cmflapinfo_upstreamindex", mapping:"upstreamifindex"},
						 {name:"cmflapinfo_macaddr", mapping:"macaddr"},
						 {name:"cmflapinfo_lastflaptime", mapping:"lastflaptime"},
						 {name:"cmflapinfo_createtime", mapping:"createtime"},
						 {name:"cmflapinfo_insertionfailnum", mapping:"insertionfailnum"},
						 {name:"cmflapinfo_hitnum", mapping:"hitnum"},
						 {name:"cmflapinfo_missnum", mapping:"missnum"},
						 {name:"cmflapinfo_crcerrornum", mapping:"crcerrornum"},
						 {name:"cmflapinfo_poweradjustmentnum", mapping:"poweradjustmentnum"},
						 {name:"cmflapinfo_totalnum", mapping:"totalnum"},
						 {name:"cmflapinfo_resetnow", mapping:"resetnow"},
						 {name:"cmflapinfo_lastresettime", mapping:"lastresettime"},
						 {name:"cmflapinfo_rowstatus", mapping:"rowstatus"}
						]
					)
					
				});
			    var grid = new Ext.grid.GridPanel({
					id:'cmflapconfig_grid',
					store:store,
					width: 770,
					height: 240,
					frame:true,
					stripeRows : true,
					cm:new Ext.grid.ColumnModel([
			        	{header: "downStreamIndex",width: 80, dataIndex: 'cmflapinfo_downstreamindex'},
			        	{header: "upStreamIndex",width: 65,dataIndex: 'cmflapinfo_upstreamindex'},
						{header: "macaddr",width: 65, dataIndex: 'cmflapinfo_macaddr'},
						{header: "Flap创建时间",width: 80,sortable: true, dataIndex: 'cmflapinfo_lastflaptime'},
						{header: "最后Flap时间",width: 65,sortable: true, dataIndex: 'cmflapinfo_createtime'},
						{header: "插入失败次数",width: 65,sortable: true, dataIndex: 'cmflapinfo_insertionfailnum'},
						{header: "撞击次数",width: 120,sortable: true, dataIndex: 'cmflapinfo_hitnum'},
						{header: "miss次数",width: 80,sortable: true, dataIndex: 'cmflapinfo_missnum'},
						{header: "crc错误次数",width: 100,sortable: true, dataIndex: 'cmflapinfo_crcerrornum'},
						{header: "电源调整次数",width: 80,sortable: true, dataIndex: 'cmflapinfo_poweradjustmentnum'},
						{header: "总数",width: 100,sortable: true, dataIndex: 'cmflapinfo_totalnum'},
					{header: "resetNow",width: 80,sortable: true, dataIndex: 'cmflapinfo_resetnow'},
						{header: "最后重置时间",width: 130,sortable: true, dataIndex: 'cmflapinfo_lastresettime'},
						{header: "行状态",width: 80,sortable: true, dataIndex: 'cmflapinfo_rowstatus'}
					]),
					loadMask:true
				});
				
				return grid;
			}
			var win = new Ext.Window({
				el:'window',
				autoDomMove:false,
				//modal:true,
				layout:'fit',
				width:700,
				height:400,
				title:'form',
				closeAction:'hide',
				items:[createCmFlapInfoPan()],
				buttons:[{
					text:'按钮'
				}],
				onEsc:function(){
				//	win.close();
				alert("escape");
				}
			});
			win.show();			
		});
  	</script>
  	<div id="window"></div>
  </body>
</html>
