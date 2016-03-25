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
  		var myData = { 'totalProperty':10,
			'records' : [ 
				{ name : "Rec 0", column1 : "0", column2 : "0" }, 
				{ name : "Rec 1", column1 : "1", column2 : "1" }, 
				{ name : "Rec 2", column1 : "2", column2 : "2" }, 
				{ name : "Rec 3", column1 : "3", column2 : "3" }, 
				{ name : "Rec 4", column1 : "4", column2 : "4" }, 
				{ name : "Rec 5", column1 : "5", column2 : "5" }, 
				{ name : "Rec 6", column1 : "6", column2 : "6" }, 
				{ name : "Rec 7", column1 : "7", column2 : "7" }, 
				{ name : "Rec 8", column1 : "8", column2 : "8" }, 
				{ name : "Rec 9", column1 : "9", column2 : "9" } 
			] 
		}; 
		// Generic fields array to use in both store defs. 
			var fields = [ 
				{name: 'name', mapping : 'name'}, 
				{name: 'column1', mapping : 'column1'}, 
				{name: 'column2', mapping : 'column2'} 
			]; 

    	// create the data store 
		    var firstGridStore = new Ext.data.JsonStore({ 
		        fields : fields, 
				data   : myData, 
				totalProperty:'totalProperty',
				root   : 'records' 
		    }); 


			var cols = [ 
				{ id : 'name', header: "Record Name", width: 160, sortable: true, dataIndex: 'name'}, 
				{header: "column1", width: 50, sortable: true, dataIndex: 'column1'}, 
				{header: "column2", width: 50, sortable: true, dataIndex: 'column2'} 
			]; 
			
			    var firstGrid = new Ext.grid.GridPanel({ 
					//ddGroup          : 'secondGridDDGroup', 
			        store            : firstGridStore, 
			        columns          : cols, 
					enableDragDrop   : true, 
			       // stripeRows       : true, 
			        //autoExpandColumn : 'name', 
			        title            : 'First Grid' ,
			        height:300,
			        width:500,
			        renderTo:"panel"
			    }); 
			
  	});
  </script>
  <div id="panel"></div>
  </body>
</html>
