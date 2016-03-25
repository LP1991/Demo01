package com.cvnchina.test.entity;

import java.util.HashSet;
import java.util.Set;

public class BaseEmp {
	public Set<String> files = new HashSet<String>();

	public void addFiles(String file){
		files.add(file);
	}
	public Set<String> getFiles() {
		return files;
	}

	public void setFiles(Set<String> files) {
		this.files = files;
	} 
	
}
