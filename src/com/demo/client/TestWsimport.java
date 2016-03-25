package com.demo.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class TestWsimport {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://192.168.13.153:8080/ems/service/DataSync?wsdl");
//         1.Qnameqname是qualified name 的简写  
         //2.构成：由名字空间(namespace)前缀(prefix)以及冒号(:),还有一个元素名称构成  
         //由发布的wsdl可知namespace为http://server.ws.platform.whaty.com/，  
         QName qname=new QName("http://server.ws.platform.whaty.com/","MyServiceImplService");  
         Service service=Service.create(url, qname);  
         
//		DataSync service  = ObjectFactory.createDataSync();
		List<String> l = new ArrayList<String>();
//		service.getIDataSyncPort().dataSync("021", l);
	}
}
