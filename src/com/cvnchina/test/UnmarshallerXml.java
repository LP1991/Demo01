package com.cvnchina.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

import org.exolab.castor.xml.Unmarshaller;

import com.cvnchina.test.entity.BaseEmp;

public class UnmarshallerXml {
	public static void main(String[] args) {
		String path = UnmarshallerXml.class.getResource("/").getPath();
		Set<String> files = initRoot(path+"Emp.xml");
		for(String s : files ){
			System.out.println(s);	
		}
	}
	public static Set<String> initRoot(String name) {
		InputStreamReader reader = null;
		String file = name;
		Set<String> fs = new HashSet<String>();
		try {
			reader = new InputStreamReader(new FileInputStream(file),"UTF-8");
			Unmarshaller un = new Unmarshaller(BaseEmp.class);
			System.out.println(un);
			BaseEmp conf = (BaseEmp) un.unmarshal(reader);
			fs = conf.getFiles();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return fs;
	}
}
