var ndtree;
function getNdGroupTree(){			// 分组的树
//		var rolelist = getLoginActionRoleByNodeId(11);
		var snode = null;
		ndtree = new Ext.tree.TreePanel({
			title:'TOPO树',
			rootVisible:false,
			animCollapse:false,
			border:false,
		  	//split:true,//
		  	autoScroll:true,
		  	region:'center',//
		  	//collapsible: true,//
		  	width:200,//
			id:'nedevicegroup_panel',
			//selModel: selmodel,		
			enableDD:true,
			ddGroup:'firstGridDDGroup',	
			root: new Ext.tree.AsyncTreeNode({
				text: 'ROOT',
				draggable: false,
				expanded: true, 
				iconCls: 'icon-root',
				enableDrag:false,
				leaf:false,
				type:'dm',
				id: 'rootid'
			}),			
			loader: new Ext.tree.TreeLoader({
				dataUrl : path+'topo/ajax/topo!getTopoTree.action?istopo=true&leaftype='+NODE_TYPE_RP*NODE_TYPE_CARD*NODE_TYPE_ONU,
				baseParams:{
					type:'dm',
					currenttreetype:CURRENT_SYS_TYPE
				},				
				listeners:{					
					beforeload:function(treeLoader, node){
						this.baseParams.type = node.attributes.type;						
					},
					load:function(obj, node, response){
						checklogin_location(Ext.util.JSON.decode(response.responseText).jsonData);
						if(beforereload.length>0){
							for(var i=0;i<beforereload.length;i++){
								if(beforereload[i]==node.id){
									afterreload.push(node.id);
									break;
								}
							}
						}
						
					}
				}
			})	
		});	
		
		setInterval(		//定时刷新选中的局端设备的数据库同步
			function(){
				var selectnode = ndtree.getSelectionModel().getSelectedNode();
				if(selectnode == null){
					return;
				}
				
				if(isHeadNe(selectnode.attributes.type)){				
					oldobj.getForm().submit({
			      		clientValidation: true,
						url:path+"topo/ajax/autofind!manualRefresh.action",
						method:'POST',
						params: {
					       	type:'ne',
					       	neid:selectnode.id,
					       	devicetype:netypeName2Id(selectnode.attributes.type)
					    },
					    success: function(form, action) {	 	
					    },
					    failure: function(form, action) {
					       
					    }
	       			});
	       			
	       			updateTreeNodeInfo(selectnode.attributes.type,selectnode.id);
				}
			},180000		
		);
		
		ndtree.runner = new Ext.util.TaskRunner();
		var task = {
		    run: function(){
		    	syncNodeInfo(ndtree.getRootNode());
		    },
		    interval: 60000 //10 second = 10000
		};
		ndtree.runner.start(task);
	
	   	var GroupMenu=new Ext.menu.Menu({		//组菜单
	   	  minWidth:140, 
	   	  items:[	   		
	   		{
	   			text:'展开全部',
				iconCls:'icon-expandall',
				handler:function(){				
					snode.expand(true);
				}
	   		}
	   		,
	   		{
	   			text:'关闭全部',
				iconCls:'icon-collapseall',
				handler:function(){				
					snode.collapse(true);
				}
	   		}
	   		,
 			new Ext.menu.Separator({
	 			id:'devicetree_menu_16'
	 		}),
		   {
				text:'添加组',
				iconCls:'icon-ndgroup'+(!isRoleAllow(FUNAUTH_GROUP_ADD,false)?' icon_gray':''),
				id:'devicetree_menu_2',
				disabled:!isRoleAllow(FUNAUTH_GROUP_ADD,false),
				handler:function(){
					if(!isRoleAllow(FUNAUTH_GROUP_ADD)){
						return;
					}
 					var snodetype = snode.attributes.type;
 					if(snode.id == "-2_gp"){
 						Ext.Msg.alert("提示信息","未分组设备不能添加组!");
 						return;
 					}
 					if(snodetype == "gp" || snodetype == "dm"){			   							
 						var gpobj = createGroupObject('add',0,null,null,snode.id,snode.text);
 						groupmanager(gpobj);
 					}else{
 						Ext.Msg.alert("提示信息","只能在区或者组里添加组!");
 					}
 				}	  
			},
			{
				text:'添加设备',
				id:'devicetree_menu_3',
				iconCls:'icon-nd'+(!isRoleAllow(FUNAUTH_NE_ADD,false)?' icon_gray':''),
				disabled:!isRoleAllow(FUNAUTH_NE_ADD,false),
				handler:function(){
					if(isLimitVersion()){
						return;	
					}
					if(!isRoleAllow(FUNAUTH_NE_ADD)){
						return;	
					}
 					var snodetype = snode.attributes.type;
 					if(snodetype == "gp"){	
 						addNePanel(snode.id.substring(0,snode.id.length-3),snode.text);
 					}else{
 						Ext.Msg.alert("提示信息","只能在组上添加设备!");
 					}
 				}	  
			},
 			{
 				text:'修改',
 				id:'devicetree_menu_4',
 				iconCls:'icon-modify',
 				handler:function(){			 				
 					topotree_editNe(snode); 					
 				},
 				listeners:{
 					show:function(obj){
 					 	var snodetype = snode.attributes.type;
 					 	if(!obj.hidden){
 					 		var aid = 0;
 					 		if(snodetype=='gp'){
 					 			aid = FUNAUTH_GROUP_EDIT;
 					 		}else if(snodetype!='dm'){
 					 			aid = FUNAUTH_NE_EDIT;					 		
 					 		}
 					 		
 					 		if(aid>0){
								if(isRoleAllow(aid,false)){
									obj.enable();	
									obj.setIconClass('icon-modify');
								}else{
									obj.disable();
									obj.setIconClass('icon-modify icon_gray');
								}
							}
 					 	}
 					}
 				}
 			}
 			,{
 				text:'删除',
 				id:'devicetree_menu_5',
 				iconCls:'icon-del',
 				handler:function(){
 					var snodetype = snode.attributes.type;
			 		var action = "/topo/ajax/topo!delNe.action?checkAuth="+FUNAUTH_NE_DEL;
			 		var params;
			 		if(snodetype == "gp"){
			 			if(snode.id == "-2_gp"){
			 				Ext.Msg.alert("提示信息","'"+snode.text+"' 不能删除!");
			 				return;
			 			}
			 			action = "/topo/ajax/group!delGroup.action?checkAuth="+FUNAUTH_GROUP_DEL;
			 			params = {
			 				groupids:snode.id.substring(0,snode.id.length-3)
			 			};
			 		}else if(isHeadNe(snodetype)){
			 			var cls = snode.ui.getIconEl().className;
		 				if(snodetype == "ND" && snode.attributes.mixtype==MIXTYPE_MIX && cls!=null && cls.indexOf("_2")==-1){
				 			Ext.Msg.alert("提示信息","MIXEOC下未离线的ND不能删除！");
				 			return;
				 		}

			 			params = {
			 				neids:snode.id,
							type:snodetype.toLowerCase()
			 			};
			 		}else if(isMidNe(snodetype)){
			 			//左右同步图标时修改的是className而非snode.attributes.iconCls。
				 		var cls = snode.ui.getIconEl().className;
				 		if(cls!=null && cls.indexOf("_2")==-1){
				 			Ext.Msg.alert("提示信息","未离线的"+snodetype+"不能删除！");
				 			return;
				 		}
			 			params = {
			 				neids:(snodetype=='RP'?snode.attributes.f_id:snode.id),
							type:snodetype.toLowerCase()
			 			};
			 		}else{
			 			Ext.Msg.alert("提示信息","无法删除设备或组!");
			 			return;
			 		}
			 		
			 		if(snodetype == "gp"){
			 			if(!isRoleAllow(FUNAUTH_GROUP_DEL)){
				 			return;
				 		}
			 		}else{
			 			if(!isRoleAllow(FUNAUTH_NE_DEL)){
				 			return;
				 		}
			 		}
			 		
			 		Ext.Msg.show({
					   title:'注意',
					   msg: '你确定要删除吗?',
					   buttons: Ext.Msg.YESNO,
					   fn: function(btn, text){
						   	if (btn == 'yes'){
								oldobj.getForm().submit({
						      		clientValidation: true,
									url:path + action,
									method:'POST',
									params: params,
								    success:true,
								    success: function(form, action) {
								  		Ext.Msg.alert("提示信息","删除成功!");
								  		var p = snode.parentNode;
								  		snode.remove();
								  		
								  		if(snodetype == "gp"){
								  			var trees = getOtherTreeList();
								  			for(var i=0;i<trees.length;i++){
							     		 		var nodetemp = trees[i].getNodeById(snode.id);
										     	if(nodetemp != null){
										     		nodetemp.remove();
										     	}
							     		 	}
								  		}else{
								  			//因OLT删除时需要同时删除MIXEOC设备，所以刷新上层节点。
								  			if(snodetype=="OLT" || snodetype=="CARD"){
								  				if(snodetype=="CARD"){
								  					if(p){
								  						p = p.parentNode;
								  					}
								  				}
									  			if(p){
									  				p.reload();
									  			}
								  			}
								  		}
								  		gridRemoveRecord(snode.id,snodetype);
								    },
								    failure: function(form, action) {							       
								        if(action.result != null && action.result.msg != null){
								        	Ext.Msg.alert("提示信息",action.result.msg);
								        	if(action.result.msg=="删除成功!"){
								        		snode.remove();
								        		if(snodetype == "gp"){
										  			var trees = getOtherTreeList();
										  			for(var i=0;i<trees.length;i++){
									     		 		var nodetemp = trees[i].getNodeById(snode.id);
												     	if(nodetemp != null){
												     		nodetemp.remove();
												     	}
									     		 	}
										  		}
								        	}
								        }else{
								        	if(checklogin_location2(action)){
				  	  							Ext.Msg.alert("提示信息","删除失败!");
				  							 }	
								        }
								    }
						       });						
							}else{
								return;
							}								
						},
						animEl: 'elId',
			   			icon: Ext.MessageBox.QUESTION
					});
 				},
 				listeners:{
 					show:function(obj){
 					 	var snodetype = snode.attributes.type;
 					 	if(!obj.hidden){
 					 		var aid = 0;
 					 		if(snodetype=='gp'){
 					 			aid = FUNAUTH_GROUP_DEL;
 					 		}else if(snodetype!='dm'){
 					 			aid = FUNAUTH_NE_DEL;					 		
 					 		}
 					 		
 					 		if(aid>0){
								if(isRoleAllow(aid,false)){
									obj.enable();
									obj.setIconClass('icon-del');
								}else{
									obj.disable();
									obj.setIconClass('icon-del icon_gray');
								}
							}
 					 	}
 					}
 				}			   					
 			},{
 				text:'替换局端',
 				id:'devicetree_menu_27',
 				iconCls:'icon-showtype'+(!isRoleAllow(FUNAUTH_NE_REPLACE,false)?' icon_gray':''),
 				disabled:!isRoleAllow(FUNAUTH_NE_REPLACE,false),
 				handler:function(){			 				
 					topotree_replaceNe(snode); 					
 				}			   					
 			},
 			'-',
			{
	 			text:'设备流量监控',
	 			id:'devicetree_menu_7',
				iconCls:'icon-chart_line'+(!isRoleAllow(MENUAUTH_MONI,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_MONI,false),
				handler:function(){
					topotree_moni(snode);						
				}
	 		},{
	 			text:'设备重启',
	 			id:'devicetree_menu_8',
	 			iconCls:'icon-reset',
	 			handler:function(){
	 				topotree_rebootNe(snode);				 				
	 			},
 				listeners:{
 					show:function(obj){
 					 	var snodetype = snode.attributes.type;
 					 	if(!obj.hidden){
 					 		var aid = 0;
 					 		if(isBiocNe(snodetype) && !isEndNe(snodetype)){//ND MULTI-ND ND-CARD
 					 			aid = FUNAUTH_ND_REBOOT;
 					 		}else if(isPlcMixeocNe(snodetype) && !isEndNe(snodetype)){//CBAT MIXEOC CBAT-CARD
 					 			aid = FUNAUTH_CBAT_REBOOT;					 		
 					 		}else if(isApsNe(snodetype) && isHeadNe(snodetype)){//AP
 					 			aid = FUNAUTH_AP_REBOOT;					 		
 					 		}else if(isEponNe(snodetype) && isMidNe(snodetype)){//CARD
 					 			aid = FUNAUTH_CARD_REBOOT;					 		
 					 		}
 					 		
 					 		if(aid>0){
								if(isRoleAllow(aid,false)){
									obj.enable();	
									obj.setIconClass('icon-reset');
								}else{
									obj.disable();
									obj.setIconClass('icon-reset icon_gray');
								}
							}
 					 	}
 					}
 				}				 			
	 		},{
				text:'设备信息管理',
				id:'devicetree_menu_20',
				iconCls:'icon-worldgo'+(!isRoleAllow(MENUAUTH_DEVICEINFOMGM,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_DEVICEINFOMGM,false),
				handler:function(){
					devicemanager();
				}
			},{
				text:'批量添加设备',
				id:'devicetree_menu_21',
				iconCls: 'icon-import'+(!isRoleAllow(MENUAUTH_BATCHADDNE,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_BATCHADDNE,false),
				handler: function(){
					if(isLimitVersion()){
						return;	
					}
					addactionPanel(importNe_Panel());
				}
			},{
				text:'设备批量重命名',
				id:'devicetree_menu_14',
				iconCls: 'icon-history'+(!isRoleAllow(MENUAUTH_BATCHRENAME,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_BATCHRENAME,false),
				handler: function(){
					addactionPanel(export_Panel());
				}
			},{
	   			text:'设备统计',
	   			id:'devicetree_menu_22',
	   			//hidden:getLoginActionRoleByName(rolelist,"统计")==true?false:true,
	   			iconCls:'icon-count',
	   			handler:function(){
					if(snode.id == "rootid"){
						countDevice('root',0,0);
						return;	
					}					
					var groupid = snode.id.substring(0,snode.id.length-3);
					var type = snode.attributes.type;
					
					if(isHeadNe(type) || isMidNe(type)){
						countDevice(type.toLowerCase(),snode.id,0);	
						return;
					}
					
					if(type == "gp"){
						countDevice('gp',groupid,0);
						return;
					}
					if(type == "dm"){
						countDevice('dm',groupid,0);
						return;
					}						  			
		   		}
		   	},{
				text:'严重告警定位',
				id:'devicetree_menu_18',
				iconCls: 'icon-find'+(!isRoleAllow(MENUAUTH_ALAEMSEARCH,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_ALAEMSEARCH,false),
				handler: function(){
		   			alarmLocation(snode.attributes.ip);
				}
			},{
				text:'加入白名单开关列表',
				id:'devicetree_menu_19',
				iconCls: 'icon-add'+(!isRoleAllow(MENUAUTH_WHITELIST,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_WHITELIST,false),
				handler:function(){
					topogrid_whitelist(snode.attributes.ip);
				}
			},{
				text:'发送到设备升级',
				id:'devicetree_menu_25',
				iconCls: 'icon-add'+(!isRoleAllow(MENUAUTH_UPDATE,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_UPDATE,false),
				handler:function(){
					topotree_update(snode);
				}
			},
	 		new Ext.menu.Separator({
	 			id:'devicetree_menu_15'
	 		}),{
				text:'配置BIOC设备',
				id:'devicetree_menu_11',
				iconCls:'icon-nd'+(!isRoleAllow(MENUAUTH_BIOCCONFIG,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_BIOCCONFIG,false),
				handler:function(){	
					topotree_biocconfig(snode);						
				}
			},{
				text:'配置PLC设备',
				id:'devicetree_menu_17',
				iconCls:'icon-cbat'+(!isRoleAllow(MENUAUTH_PLCCONFIG,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_PLCCONFIG,false),
				handler:function(){	
					topotree_plcconfig(snode);						
				}
			},{
				text:'配置CMTS设备',
				id:'devicetree_menu_30',
				iconCls:'icon-cbat'+(!isRoleAllow(MENUAUTH_PLCCONFIG,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_PLCCONFIG,false),
				handler:function(){	
					topotree_cmtsconfig(snode);						
				}
			},{
				text:'配置AP设备',
				id:'devicetree_menu_23',
				iconCls:'icon-ap'+(!isRoleAllow(MENUAUTH_APCONFIG,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_APCONFIG,false),
				handler:function(){	
					topotree_apconfig(snode);						
				}
			},{
				text:'终端用户列表',
				id:'devicetree_menu_24',
				iconCls:'icon-device'+(!isRoleAllow(MENUAUTH_APCONFIG,false)?' icon_gray':''),
				disabled:!isRoleAllow(MENUAUTH_APCONFIG,false),
				handler:function(){	
					if(isLimitVersion()){
						return;	
					}
					if(snode.attributes.type == 'AP'){
						apEndUserwin(snode.id,snode.attributes.type.toLowerCase());
					}else{
						Ext.Msg.alert("提示信息","只能查看AP设备！");
					}						
				}
			},{
				text:'打开机架图',
				id:'devicetree_menu_26',
				iconCls:'icon-olt'+(!isRoleAllow(FUNAUTH_OLT_LOGICPANEL,false)?' icon_gray':''),
				disabled:!isRoleAllow(FUNAUTH_OLT_LOGICPANEL,false),
				handler:function(){	
					topotree_eponconfig(snode);						
				}
			},{
				text:'未认证ONU管理',
				id:'devicetree_menu_28',
				iconCls:'blist'+(!isRoleAllow(FUNAUTH_ONU_UNAUTH,false)?' icon_gray':''),
				disabled:!isRoleAllow(FUNAUTH_ONU_UNAUTH,false),
				handler:function(){	
					topotree_onuunauth(snode);						
				}
			},{
				text:'Telnet',
				id:'devicetree_menu_29',
				iconCls:'icon-device',
				handler:function(){	
					topotree_telnet(snode);						
				}
			},
	 		'-',
	 	{
			text:'刷新组结构',
			iconCls:'icon-refresh_group',
			handler:function(){
				if(!snode.leaf){
					snode.reload(); 	
				}
												
			}
		},{
			text:'刷新全部组结构',
			iconCls:'icon-refresh_group',
			handler:function(){							
				getCurrentTree().root.reload(); 									
			}
		},{
			text:'设备信息同步',
			id:'devicetree_menu_13',
			iconCls:'icon-refresh_nd',
			handler:function(){	
				var snodetype = snode.attributes.type;								
				if(isHeadNe(snodetype)){
					refreshNeorGroup("ne",snode.id,1,headNeTypeName2BigSysType(snodetype,true),netypeName2Id(snodetype));
				}else if(snodetype == "gp"){
					var ndid = snode.id;
					ndid = ndid.substring(0,ndid.length-3);
					refreshNeorGroup("gp",ndid,1,CURRENT_SYS_TYPE);
				}else{
					Ext.Msg.alert("提示信息","只有局端设备和组才能设备信息同步");
				}
			}
		}
	   	  ]
	   	});
	    var selectOldNodeType = "";
		ndtree.on("contextmenu", function(node, e){
			node.select();
			snode = node;								
			var nodetype = snode.attributes.type;
			
			if(nodetype == "ONU"){//ONU屏蔽菜单
				return;
			}
			
			if(nodetype != selectOldNodeType || nodetype == "gp" || nodetype == "CARD"){
				for(var i=1;i<=30;i++){
					var m = Ext.getCmp("devicetree_menu_"+i);
					if(m!=null){
						m.setVisible(true);
//						var aid = 0;
//						if(nodetype == "dm"){
//							
//						}else if(nodetype == "gp"){
//							if(i==4){
//								aid = FUNAUTH_GROUP_EDIT;
//							}else if(i==5){
//								aid = FUNAUTH_GROUP_DEL;
//							}
//						}else{
//							if(i==4){//修改
//								aid = FUNAUTH_NE_EDIT;
//							}else if(i==5){//删除
//								aid = FUNAUTH_NE_DEL;
//							}else if(i==8){//重启
//								if(isBiocNe(nodetype) && !isEndNe(nodetype)){
//									aid = FUNAUTH_ND_REBOOT;
//								}
//								
//							}
//						}
//						
//						if(aid>0){
//							if(isRoleAllow(aid,false)){
//								m.enable();	
//							}else{
//								m.disable();
//							}
//						}
					}
					
				}
				
				//EPON全局屏蔽，下面单独开启
				hiddenMenu("devicetree_menu_","28,29");
				
				selectOldNodeType = nodetype;
				if(nodetype == "dm"){
					hiddenMenu("devicetree_menu_","3,4,5,7,8,11,12,13,14,15,17,18,19,23,24,25,26,27,30");
				}else if(nodetype == "gp"){					
					hiddenMenu("devicetree_menu_","7,8,11,12,15,17,18,19,23,24,25,26,27,30");
					if(node.id == '-2_gp'){
						hiddenMenu("devicetree_menu_","2,3,4,5,16,18,19,24,25");
					}
				}else if(nodetype == "ND"){
					hiddenMenu("devicetree_menu_","2,3,17,23,24,26,30");
				}else if(nodetype == "MULTI-ND"){
					hiddenMenu("devicetree_menu_","2,3,17,23,24,26,30");
				}else if(nodetype == "ND-CARD"){
					hiddenMenu("devicetree_menu_","2,3,7,11,13,15,17,18,19,23,24,26,27,30");
				}else if(nodetype == "RP"){
					hiddenMenu("devicetree_menu_","2,4,3,7,8,11,12,13,15,17,18,19,23,24,25,26,27,30");
				}else if(nodetype == "CBAT-CARD"){
					if(snode.attributes.mixtype == MIXTYPE_DEFAULT){
						hiddenMenu("devicetree_menu_","15,17");
					}
					hiddenMenu("devicetree_menu_","2,3,7,11,13,18,19,23,24,25,26,27,30");				
				}else if(nodetype == "CBAT"){
					hiddenMenu("devicetree_menu_","2,3,7,11,19,23,24,26");
				}else if(nodetype == "AP"){
					hiddenMenu("devicetree_menu_","2,3,11,17,19,26,30");	
				}else if(nodetype == "MIXEOC"){
					hiddenMenu("devicetree_menu_","2,3,7,11,15,17,19,23,24,26,30");	
				}else if(nodetype == "OLT"){
					hiddenMenu("devicetree_menu_","2,3,7,8,11,17,19,22,23,24,25,30");
				}else if(nodetype == "CARD"){
					hiddenMenu("devicetree_menu_","2,3,7,11,13,15,17,18,19,22,23,24,25,26,27,30");				
				}else if(nodetype == "PORT"){
					hiddenMenu("devicetree_menu_","2,3,5,7,8,11,13,15,17,18,19,22,23,24,25,26,27,30");				
				}
				
			}
			
			//因同类型节点菜单不变化，故局端严重告警定位需特殊处理
			if(isHeadNe(nodetype)){
				Ext.getCmp("devicetree_menu_"+18).setVisible(true);
				var tempcls = snode.ui.getIconEl().className;
				if(tempcls.indexOf("_ALARM")==-1){
					hiddenMenu("devicetree_menu_","18");
				}
				
				//只有海亿康设备才支持替换局端
				Ext.getCmp("devicetree_menu_"+27).setVisible(true);
				if(nodetype != "CBAT" || !isSea(snode.attributes.devicetype)){
					hiddenMenu("devicetree_menu_","27");
				}
				
				if(snode.attributes.epontype == EPON_TYPE_ZTE){
					showMenu("devicetree_menu_","28");					
				}else{
					hiddenMenu("devicetree_menu_","28");
				}
				
				//局端telnet全开
				showMenu("devicetree_menu_","29");
			}
			
			GroupMenu.showAt(e.getPoint());	
			
		});
		
		ndtree.on("click", function(node, e){
			snode = node;
			//************以下更新TOPO列表***************
			var type = node.attributes.type;
				
//			if(type == "ND"){
//				refreshNeorGroup('ne',node.id,0,SYS_TYPE_BIOC,SYS_ND_TYPE);
//				changeBottonInfoView(countDevice('nd',node.id,1));	
//			}else if(type == "dm"){
//				changeBottonInfoView(countDevice(node.id=="rootid"?'root':'dm',node.id=="rootid"?0:node.id.substring(0,node.id.length-3),1));	
//			}else if(type == "gp"){	
//				refreshNeorGroup('gp',node.id.substring(0,node.id.length-3),0,CURRENT_SYS_TYPE);
//				changeBottonInfoView(countDevice('gp',node.id.substring(0,node.id.length-3),1));
//			}else if(type == "RP") {
//				changeBottonInfoView(countDevice('rp',snode.id,1));	
//			}else if(type == "CBAT"){
//				refreshNeorGroup('ne',node.id,0,SYS_TYPE_PLC,SYS_CBAT_TYPE);
//				changeBottonInfoView(countDevice('cbat',node.id,1));	
//			}else if(type == "CBAT-CARD"){
//				changeBottonInfoView(countDevice('cbat-card',node.id,1));	
//			}else if(type == "MULTI-ND"){
//				refreshNeorGroup('ne',node.id,0,SYS_TYPE_BIOC,SYS_MULTIND_TYPE);
//				changeBottonInfoView(countDevice('multi-nd',node.id,1));	
//			}else if(type == "ND-CARD"){
//				changeBottonInfoView(countDevice('nd-card',node.id,1));	
//			}
			
			if(type == "dm"){
			//	changeBottonInfoView(countDevice(node.id=="rootid"?'root':'dm',node.id=="rootid"?0:node.id.substring(0,node.id.length-3),1));	
			}else if(type == "gp"){	
				refreshNeorGroup('gp',node.id.substring(0,node.id.length-3),0,CURRENT_SYS_TYPE);
			//	changeBottonInfoView(countDevice(type.toLowerCase(),node.id.substring(0,node.id.length-3),1));
			}else if(isHeadNe(type)){
				refreshNeorGroup('ne',node.id,0,headNeTypeName2BigSysType(type,true),netypeName2Id(type));
			//	changeBottonInfoView(countDevice(type.toLowerCase(),node.id,1));
			}else if(isMidNe(type)) {
			//	changeBottonInfoView(countDevice(type.toLowerCase(),snode.id,1));
			}
			
			if(mainTabpanel.findById('grid_topopanel') == null){
				return;
			}
			if(dblclickTopoTree == 0){
				if(type == "dm"){					
					if(node.id == 'rootid'){
						topoGrid(-1,'ROOT','dm',0,'');				
						return;
					}					
					groupid = 0;
					topoGrid(node.id.substring(0,node.id.length-3),snode.text,'dm',groupid,'');
					
					return;				
				}else if(type == "gp"){	
					var groupid = 0;
					if(node.id != "rootid"){
						groupid = node.id.substring(0,node.id.length-3);
					}	
					topoGrid(groupid,node.text=="组"?"ROOT":node.text,'gp',groupid,node.text=="组"?"ROOT":node.text);
					
					return;
				}else{
					var groupid;
					var groupname;
					var nodetemp = node;
					while(true){
						var parentnode = nodetemp.parentNode;
						nodetemp = parentnode;
						if(parentnode.attributes.type == "gp"){
							var temp = parentnode.id;
							groupid = temp.substring(0,temp.length-3);
							groupname = parentnode.text;
							break;
						}
					}
					//ND  MULTI-ND ND-CARD CBAT CBAT-CARD RP
					topoGrid(node.id,snode.text,type.toLowerCase(),groupid,groupname=="组"?"ROOT":groupname);	   				
					return;
				}
				
				
			}
		});
		
//		var mouseovertimer;
		
		//grid drop to tree
		ndtree.on("beforenodedrop",function(e){	//e.target   e.dropNode
			//alert("beforenodedrop"+e.dropNode);
			if(e.dropNode == null){ //	from grid drop
				var newNode = e.target;
				var type = 0;		
				if(newNode.attributes.type=="dm"){	//only move group			
					type = 0;
				}else if(newNode.attributes.type=="gp"){		//move group and nd
					//未分组设备不可移入设备或组
					if(newNode.id == "-2_gp"){
						return false;
					}
					type = 1;
				}else{
					return false;
				}
				var grid = Ext.getCmp('grid_topopanel_grid');
				var store =  grid.getStore();
				var selects = grid.getSelectionModel().getSelections();
				var selectsndcount = 0;
				var selectsmultindcount = 0;
				var selectscltcount = 0;
				var selectsapcount = 0;
				var selectsoltcount = 0;
				var selectstr069count = 0;
				var ndids = "";
				var multindids = "";
				var cbatids = "";
				var mixids = "";
				var apids = "";
				var oltids = "";
				var tr069ids = "";
				var gpids = "";
				var hasalarm = false;
			 	var nodeid = topogrid_id;
			 	if(topogrid_type == "gp"){
			 		nodeid += "_gp";
			 	}else if(topogrid_type == "dm"){
			 		nodeid += "_dm";
			 	}
			 	var oldparent =ndtree.getNodeById(nodeid);
				for(var i=0;i<selects.length;i++){
					var record = selects[i];
					var netype = record.get("type");								
					if(type ==0 && netype != "组"){
						continue;
					}
					if(type ==1 && (netype != "组" && netype != "nd" && netype != "multi-nd" 
						&& netype != "cbat" && netype != "mixeoc" && netype != "ap" && netype != "olt" && netype != "tr069")){
						continue;
					}

					if(record.get('ne_neid')!='' && netype == 'tr069'){//如果作为终端的tr069设备，则不允许移动,终端没有上层neid
						continue;
				 	}
					
					//未分组设备不可移动
					if(record.get("id") == "-2"){
						continue;
					}
					
					//未分组设备不可移动
					if(netype == "mixeoc" && record.get("ptype")!=null && record.get("ptype")=="onu"){
						continue;
					}
					
					if(netype == "组"){
						gpids += record.get("id") + ",";
					}
					if(netype == "nd"){
						ndids += record.get("id") + ",";
						selectsndcount++;
					}
					if(netype == "multi-nd"){
						multindids += record.get("id") + ",";
						selectsmultindcount++;
					}
					if(netype == "cbat"){
						cbatids += record.get("id") + ",";
						selectscltcount++;
					}
					if(netype == "mixeoc"){
						mixids += record.get("id") + ",";
						selectscltcount++;
					}
					if(netype == "ap"){
						apids += record.get("id") + ",";
						selectsapcount++;
					}
					if(netype == "olt"){
						oltids += record.get("id") + ",";
						selectsoltcount++;
					}
					if(netype == "tr069"){
						tr069ids += record.get("id") + ",";
						selectstr069count++;
					}
					if(!hasalarm && record.get('icon')!=null && record.get('icon').indexOf("_ALARM")>-1){
						hasalarm = true;
					}
				}
				
				var loadmask = new Ext.LoadMask(
		  			Ext.getCmp('nedevicegroup_panel').getEl(),
		  			{
		  				msg:"操作中..."
		  			}
		  		);
		  		
		  		if((ndids != "" || cbatids != "" || mixids != "" || multindids != "" || apids != "" || oltids != "" || tr069ids != "") && gpids != ""){
		  			Ext.Msg.alert("提示信息","类型不一致，不能同时拖动!");
					return false;
		  		}

				if(ndids != "" || cbatids != "" || mixids != "" || multindids != "" || apids != "" || oltids != "" || tr069ids != ""){
					var childnodes = newNode.childNodes; 
					var countnd = 0;
					var countmultind = 0;
					var countcbat = 0;
					var countmix = 0;
					var countap = 0;
					var countolt = 0;
					for(var i=0;i<childnodes.length;i++){
						if(childnodes[i].attributes.type == "ND"){
							countnd++;
						}
						
						if(childnodes[i].attributes.type == "MULTI-ND"){
							countmultind++;
						}
						
						if(childnodes[i].attributes.type == "CBAT"){
							countcbat++;
						}
						
						if(childnodes[i].attributes.type == "MIXEOC"){
							countmix++;
						}
						
						if(childnodes[i].attributes.type == "AP"){
							countap++;
						}
						
						if(childnodes[i].attributes.type == "OLT"){
							countolt++;
						}
					}
					//判断新组下ND个数是否超过限制(从树上判断)
					if(countnd+countmultind+selectsndcount+selectsmultindcount>GROUP_NE_MAX){
						Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个BIOC设备，不能拖动!");
						return false;
					}
					
					//判断新组下CBAT个数是否超过限制(从树上判断)
					if(countcbat+selectscltcount>GROUP_NE_MAX){
						Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个PLC设备，不能拖动!");
						return false;
					}
					
					//判断新组下MIXEOC个数是否超过限制(从树上判断)
					if(countmix+selectscltcount>GROUP_NE_MAX){
						Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个MIXEOC设备，不能拖动!");
						return false;
					}
					
					//判断新组下AP个数是否超过限制(从树上判断)
					if(countap+selectsapcount>GROUP_NE_MAX){
						Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个AP设备，不能拖动!");
						return false;
					}
					
					//判断新组下OLT个数是否超过限制(从树上判断)
					if(countolt+selectsoltcount>GROUP_NE_MAX){
						Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个EPON设备，不能拖动!");
						return false;
					}
					if(ndids!=""){
						ndids = ndids.substring(0,ndids.length-1);
					}else{
						ndids = "@";
					}
					if(multindids!=""){
						multindids = multindids.substring(0,multindids.length-1);
					}else{
						multindids = "@";
					}
					if(cbatids!=""){
						cbatids = cbatids.substring(0,cbatids.length-1);
					}else{
						cbatids = "@";
					}
					if(mixids!=""){
						mixids = mixids.substring(0,mixids.length-1);
					}else{
						mixids = "@";
					}
					if(apids!=""){
						apids = apids.substring(0,apids.length-1);
					}else{
						apids = "@";
					}
					if(oltids!=""){
						oltids = oltids.substring(0,oltids.length-1);
					}else{
						oltids = "@";
					}
					if(tr069ids!=""){
						tr069ids = tr069ids.substring(0,tr069ids.length-1);
					}else{
						tr069ids = "@";
					}
					loadmask.show();
					oldobj.getForm().submit({
		       			clientValidation: true,
						url:path+"topo/ajax/topo!editNesGroup.action?checkAuth="+FUNAUTH_NE_MOVE,
						method:'POST',
						params: {					
							neids:ndids+"|"+cbatids+"|"+multindids+"|"+apids+"|"+mixids+"|"+oltids+"|"+tr069ids,
					       	groupid:newNode.id.substring(0,newNode.id.length-3)
					    },
					    success: function(form, action) {
					    	loadmask.hide();
							isreload = true;															
							store.reload(); 
							reloadNode(newNode,oldparent,hasalarm);
					 
					    },
					    failure: function(form, action) {
					    	loadmask.hide();
					     	if(checklogin_location2(action)){
					     		var val = action.result.msg;
					     		if(val != null){
					     			if(val%2 == 0 || val%5 == 0){
							     		Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个BIOC设备，不能拖动!");
							     	}
							     	if(val%3 == 0){
							     		Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个PLC设备，不能拖动!");
							     	}
							     	if(val%7 == 0){
							     		Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个AP设备，不能拖动!");
							     	}
							     	if(val%11 == 0){
							     		Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个MIXEOC设备，不能拖动!");
							     	}
							     	if(val%13 == 0){
							     		Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个EPON设备，不能拖动!");
							     	}
					     		}
								return false;
					     	}
					    }
		       		});
		       	}
		       	if(gpids != ""){
		       		gpids = gpids.substring(0,gpids.length-1);
		       		var ids = gpids.split(",");
		       		if(ids.length>1){
		       			Ext.Msg.alert("提示信息","一次只能移动一个组!");
		       			return;
		       		}

		       		for(var i = 0;i<ids.length;i++){
		       			if(newNode.id==ids[i]+'_gp' || newNode.findChild('id', ids[i]+'_gp') || isParentMore(newNode,ids[i]+'_gp')){
		       				Ext.Msg.alert("提示信息","无法移动!");
		       				return false;
		       			}		       			
		       		}
					loadmask.show();					
					oldobj.getForm().submit({
		       			clientValidation: true,
						url:path+"topo/ajax/group!editGroupParent.action?checkAuth="+FUNAUTH_GROUP_EDIT,
						method:'POST',
						params: {					
							type:newNode.attributes.type,
							groupids:gpids,
						    g_groupid:newNode.id.substring(0,newNode.id.length-3)
					    },
					    success: function(form, action) {
					    	loadmask.hide();
							isreload = true;
							store.reload();  
							//newNode.reload();
							reloadNode(newNode,oldparent,hasalarm);
					    },
					    failure: function(form, action) {
					    	loadmask.hide();
						    if(checklogin_location2(action)){
						    	store.reload();  
						    	reloadNode(newNode,oldparent,hasalarm);
					     		if(action.result == 1){
						     		Ext.Msg.alert("提示信息","未知错误，失败！");
						     	}else if(action.result == 2){
						     		Ext.Msg.alert("提示信息","同级存在相同名称的组！");
						     	}else if(action.result == 3){
						     		Ext.Msg.alert("提示信息","超出最大组级数"+maxgrouplevel+"！");
						     	}else if(action.result == 4){
						     		Ext.Msg.alert("提示信息","非法移动！");
						     	}
						     	return false;
						     }	
					    }
		       		});
		       	}
			}
		});
		ndtree.on("movenode",function(tree, node, oldParent, newParent, index ){	
			if(oldParent.id == newParent.id){
				return;
			}
			var hasalarm = false;
			if(!hasalarm && node.ui != null && node.ui.getIconEl() != null && node.ui.getIconEl().className.indexOf("_ALARM")>-1){
				hasalarm = true;
			}
			var ndid = node.id;
			var netype = node.attributes.type;
			var groupid = "0";
			var temp = newParent.id;
			if(temp != "rootid"){
				groupid = temp;
			}			
			if(ndid.indexOf("_")>-1){
				ndid = ndid.substring(0,ndid.length-3);
			}			
			if(groupid.indexOf("_")>-1){
				groupid = groupid.substring(0,groupid.length-3);
			}				
			var action = "";
			var params = "";
			
			if(isHeadNe(netype)){
				action = "/topo/ajax/topo!editNeGroup.action?checkAuth="+FUNAUTH_NE_MOVE;
				params = {					
					neid:ndid,
			       	groupid:groupid,
			       	type:netype
			    };			
			}else if(netype == "gp"){
				action = "/topo/ajax/group!editGroupParent.action?checkAuth="+FUNAUTH_GROUP_EDIT;
				params = {
					type:newParent.attributes.type,
					groupids:ndid,
				    g_groupid:groupid
			    };
				
			}

			var loadmask = new Ext.LoadMask(
	  			Ext.getCmp('nedevicegroup_panel').getEl(),
	  			{
	  				msg:"操作中..."
	  			}
	  		);
	  		loadmask.show();
			oldobj.getForm().submit({
       			clientValidation: true,
				url:path+action,
				method:'POST',
				params: params,
			    success:true,
			    success: function(form, action) {
		     		loadmask.hide();   	 
			    },
			    failure: function(form, action) {
			    	loadmask.hide();
				    if(checklogin_location2(action)){
				    	reloadNode(newParent,oldParent,hasalarm);
				     	if(netype == "gp"){
				     		if(action.result == 1){
					     		Ext.Msg.alert("提示信息","未知错误，失败！");
					     	}else if(action.result == 2){
					     		Ext.Msg.alert("提示信息","同级存在相同名称的组！");
					     	}else if(action.result == 3){
					     		Ext.Msg.alert("提示信息","超出最大组级数"+maxgrouplevel+"！");
					     	}else if(action.result == 4){
					     		Ext.Msg.alert("提示信息","非法移动！");
					     	}
					     }else if(isHeadNe(netype)){
					     	if(action.result == 0){
					     		Ext.Msg.alert("提示信息","未知错误，失败!");
					     	}else if(action.result == -1){
					     		Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个"+headNeTypeName2BigSysType(nodetype)+"设备，不能拖动!");
					     	}else if(action.result == -2){
					     		Ext.Msg.alert("提示信息","同组重名");
					     	}
					     }
				     	return false;
				     }	
			    }
       		});
		});
		ndtree.on("beforemovenode",function(tree, node, oldParent, newParent, index){
			//alert("beforemovenode");
			if(oldParent.id == newParent.id){
				return false;
			}			
			if(node.id == "-2_dm" || node.id == "-2_gp"){
				return false;
			}
			if(newParent.id == "-2_gp"){
				return false;
			}
			var newtype = newParent.attributes.type;			
			var nodetype = node.attributes.type;
			if(nodetype=="dm"){
				return false;
			}
			
			if((isHeadNe(nodetype) && newtype=="gp")
				|| (nodetype=="gp" && ((newtype=="gp" && newParent.id != "-2_gp") || (newtype=="dm") && newParent.id != "rootid")) 
				|| (nodetype=="dm" && newtype=="dm")){
					
				if(isHeadNe(nodetype) && !isRoleAllow(FUNAUTH_NE_MOVE)){
					return false;
				}
				
				if(nodetype=="gp" && !isRoleAllow(FUNAUTH_GROUP_EDIT)){
					return false;
				}
					
				var childnodes = newParent.childNodes; 
				var count = 0;
				for(var i=0;i<childnodes.length;i++){
					if(childnodes[i].text == node.text){
						Ext.Msg.alert("提示信息","新拖到的节点下已有此名!");
						return false;
					}
					if(childnodes[i].attributes.type == nodetype && isHeadNe(nodetype)){
						count++;
					}					
				}
				
				if(isHeadNe(nodetype) && newtype=="gp"){
					
					
					//判断新组下ND、AP或者CBAT,MIXEOC个数是否超过限制(本地树)
					if(count>=GROUP_NE_MAX){
						Ext.Msg.alert("提示信息","每组最多可放"+GROUP_NE_MAX+"个"+headNeTypeName2BigSysType(nodetype)+"设备，不能拖动!");
						return false;
					}
					//判断新组该类设备个数是否超过限制(服务器)
					var groupid = "0";
					var temp = newParent.id;
					if(temp != "rootid"){
						groupid = temp;
					}			
					if(groupid.indexOf("_")>-1){
						groupid = groupid.substring(0,groupid.length-3);
					}
					var loadmask = new Ext.LoadMask(
			  			Ext.getCmp('nedevicegroup_panel').getEl(),
			  			{
			  				msg:"操作中..."
			  			}
			  		);
			  		loadmask.show();
					return true;
				}
			}else{
				return false;
			}
		});
		ALL_TREE.push(ndtree);
		return ndtree;
}

function topotree_editNe(snode){
	var snodetype = snode.attributes.type;
	if(snodetype == "gp"){
		if(!isRoleAllow(FUNAUTH_GROUP_EDIT)){
			return;
		}
		if(snode.id == "-2_gp"){
			Ext.Msg.alert("提示信息","'"+snode.text+"' 不能修改!");
			return;
		}
		var panertnode = snode.parentNode;
		var gpobj = createGroupObject('edit',snode.id.substring(0,snode.id.length-3),snode.text,snode.attributes.desc,panertnode.id,panertnode.text);
		groupmanager(gpobj);
		return;
	}
	if(isHeadNe(snodetype)){
		getNeEditPanel(snode.id,snodetype.toLowerCase(),snode.text,snode.attributes.ip,snode.attributes.desc,snode.attributes.addr,snode.attributes.parentonu,snode.attributes.outvlanid);
		return;			 						
	}else if(isMidNe(snodetype)){
		getNeEditPanel(snode.id,snodetype.toLowerCase(),snode.text,snode.attributes.mac,snode.attributes.desc,snode.attributes.addr);
		return;
	}
}

function topotree_replaceNe(snode){
	var config={
		'neid':snode.id,
		'type':snode.attributes.type,
		'ip':snode.attributes.ip
	};
	replaceHeadNe(config);
}

function topotree_moni(snode){
	var type = snode.attributes.type;								
	var devicetype = 1;
	var title = snode.text;
	if(type == "ND"){
		devicetype=1;
		title=snode.attributes.ip;
	}else if(type == "CPE"){
		devicetype=2;
	}else if(type == "MULTI-ND"){
		devicetype=3;
		title=snode.attributes.ip;
	}else if(type == "AP"){
		devicetype=4;
		title=snode.attributes.ip;
	}else if(type == "ANT"){
		devicetype=5;
	}else{
		Ext.Msg.alert("提示信息","该类型设备不支持流量监控！");
		return;
	}							
	
	createMoniPanByTopo(devicetype,snode.id,title,snode.text);	
}

function topotree_rebootNe(snode){
	if(snode.attributes.type == "ND"){
		ndReboot(snode.id,SYS_ND_TYPE);
	}else if(snode.attributes.type == "MULTI-ND"){
		ndReboot(snode.id,SYS_MULTIND_TYPE);
	}else if(snode.attributes.type == "ND-CARD"){
		ndReboot(snode.id,SYS_NDCARD_TYPE);
	}else if(snode.attributes.type == "CBAT" || snode.attributes.type == "MIXEOC"){
		cbatReboot(snode.id,"rebootcbat");
	}else if(snode.attributes.type == "CBAT-CARD"){
		cbatReboot(snode.id,"rebootcard");
	}else if(snode.attributes.type == "AP"){
		apReboot(snode.id,SYS_AP_TYPE);
	}else if(snode.attributes.type == "CARD"){
		if(snode.attributes.epontype == EPON_TYPE_ZTE){
			var params = {
				'card.reset':'1',
				'card.neid':snode.id
			};
			cardReset(params);
		}else if(snode.attributes.epontype == EPON_TYPE_BODA){
			var params = {};
			params['boda_CardInfo.neid'] = snode.id;
			params['boda_CardInfo.bd_nms_card_reset'] = 1;
			params['loadtype'] = 'eponBodaCardReset';
			boda_cardreset(params);
		}
		
		
		
	}else{
		Ext.Msg.alert("提示信息","只能重启局端或者板卡!");
	}
}

function topotree_update(snode){
	if(isLimitVersion()){
		return;	
	}
	if(snode.attributes.mac == ""){
		Ext.Msg.alert("提示信息","数据不完整，无法操作！");
		return
	}
	if(mainTabpanel.findById('deviceupdate_pan')!= null && Ext.getCmp('du_secondgird').getStore().getCount() > 0 
			&& Ext.getCmp('du_devicetype').getValue() != netypeName2Id(snode.attributes.type)){
		Ext.Msg.alert("提示信息","设备类型不一致，无法操作！");
		return
	}
	createDeviceUpdatePan();
	Ext.getCmp('du_devicetype').setValue(netypeName2Id(snode.attributes.type));
	if(Ext.getCmp('du_secondgird').getStore().getCount() == 0){
		Ext.getCmp('du_devicetype').fireEvent('select',Ext.getCmp('du_devicetype'),null,null);
	}
	Ext.getCmp('deviceupdate_group').setValue('');
	Ext.getCmp('deviceupdate_groupid').setValue('');
	Ext.getCmp('du_nettypename').setValue('');
	Ext.getCmp('du_deviceversion').setValue('');
	Ext.getCmp('du_macaddr').setValue('');
	Ext.getCmp('du_allcheck').setValue('false');
	Ext.getCmp('du_macaddr').setValue(snode.attributes.mac);
	Ext.getCmp("deviceResult").lefttoright = true;
	Ext.getDom('deviceupdate_search').click();
}

function topotree_biocconfig(snode){
	if(isLimitVersion()){
		return;	
	}
	if(snode.attributes.type == 'ND' || snode.attributes.type == 'MULTI-ND'){
		var config = {
			'ndname':snode.text,
			'ndid':snode.id,
			'netype':netypeName2Id(snode.attributes.type),
			'mixtype':snode.attributes.mixtype
		};
		
		initNDConfigWinByTopo(config);	
	}else{
		Ext.Msg.alert("提示信息","只能配置BIOC设备！");
	}
}

function topotree_plcconfig(snode){
	if(isLimitVersion()){
		return;	
	}
	if(snode.attributes.type == 'CBAT'){
		var config = {
			'cbatname':snode.text,
			'cbatneid':snode.id,
			'mixtype':snode.attributes.mixtype
		};
		initCBATConfigWinByTopo(config);	
	}else if(snode.attributes.type == 'CBAT-CARD' && snode.attributes.mixtype == MIXTYPE_MIX){
		var parent = snode.parentNode;
		if(parent!=null){
			var config = {
				'cbatname':parent.text,
				'cbatneid':parent.id,
				'cardname':snode.text,
				'cardneid':snode.id,
				'mixtype':parent.attributes.mixtype
			};
			initCBATConfigWinByTopo(config);	
		}
	}else{
		Ext.Msg.alert("提示信息","只能配置CBAT");
	}
}

function topotree_cmtsconfig(snode){
	if(isLimitVersion()){
		return;	
	}
	if(snode.attributes.type == 'CBAT'){
		var config = {
			'cmtsname':snode.text,
			'cmtsneid':snode.id
		};
		initCMTSConfigWinByTopo(config);	
	}else{
		Ext.Msg.alert("提示信息","只能配置CMTS");
	}
}

function topotree_eponconfig(snode){
	if(isLimitVersion()){
		return;	
	}
	
	if(snode.attributes.type == 'OLT'){
		var config = {
			'oltname':snode.text,
			'oltneid':snode.id,
			'oltip':snode.attributes.ip,
			'mixtype':snode.attributes.mixtype,
			'topnetypeid':snode.attributes.topnetypeid
		};
		if(snode.attributes.epontype==EPON_TYPE_BODA){
			if(snode.attributes.topnetypeid == SYS_OLT_TYPE_BODA_S8506){
				logicalPanel_boda(config);
				Ext.getCmp('logicalbdpanel_devicetype').setText(snode.attributes.devicetype);
			}else if(snode.attributes.topnetypeid == SYS_OLT_TYPE_BODA_P3616){
				logicalPanel_boda_P3616(config);
				Ext.getCmp('logicalbdpanel_P3616_devicetype').setText(snode.attributes.devicetype);
			}
		}else if(snode.attributes.epontype==EPON_TYPE_ZTE){
			if(snode.attributes.topnetypeid == SYS_OLT_TYPE_ZTE_C220){
				logicalPanel(config,"c220",14,662,475,645,450,logicalBottomCaller_c220).CARD_STORE_LOAD();
				Ext.getCmp('logicalpanel_c220_devicetype').setText(snode.attributes.devicetype);
			}else if(snode.attributes.topnetypeid == SYS_OLT_TYPE_ZTE_C300){
				logicalPanel(config,"c300",20,705,475,680,450,logicalBottomCaller_c300).CARD_STORE_LOAD();
				Ext.getCmp('logicalpanel_c300_devicetype').setText(snode.attributes.devicetype);
			}else if(snode.attributes.topnetypeid == SYS_OLT_TYPE_ZTE_C320){
				logicalPanel(config,"c320",4,570,228,558,205,logicalBottomCaller_c320).CARD_STORE_LOAD();
				Ext.getCmp('logicalpanel_c320_devicetype').setText("E3808");
			}
		}else if(snode.attributes.epontype == EPON_TYPE_FIBER){
			if(snode.attributes.topnetypeid == SYS_OLT_TYPE_FIBER_AN5516){
				logicalPanel(config,"an5516_01",20,705,475,680,450,logicalBottomCaller_an5516_01).CARD_STORE_LOAD();
				Ext.getCmp('logicalpanel_an5516_01_devicetype').setText(snode.attributes.devicetype);
			}
		}
	}
}

function topotree_apconfig(snode){
	if(isLimitVersion()){
		return;	
	}
	if(snode.attributes.type == 'AP'){
		var config = {
			'apid':snode.id,
			'apname':snode.text
		};
		initAPConfigWinByTopo(config);	
	}else{
		Ext.Msg.alert("提示信息","只能配置AP设备！");
	}
}

function topotree_onuunauth(snode){
	if(!isRoleAllow(FUNAUTH_ONU_UNAUTH)){
		return;	
	}
	
	if(isLimitVersion()){
		return;	
	}

	var config={
		'portneid':snode.id,
		'portname':snode.text,
		'oltneid':snode.id
	};
	
	onuunauth_win(config);
}

function topotree_telnet(snode){
	if(isLimitVersion()){
		return;	
	}

	var config={
		'ip':snode.attributes.ip
	};
	
	initTelnetCmd(config);
}

