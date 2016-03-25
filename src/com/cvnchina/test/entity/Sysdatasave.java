package com.cvnchina.test.entity;

/**
 * Sysdatasave entity. @author MyEclipse Persistence Tools
 */

public class Sysdatasave implements java.io.Serializable {

	// Fields

	private Integer alarmlevelid;
	private String keepmonth;

	// Constructors

	/** default constructor */
	public Sysdatasave() {
	}

	/** minimal constructor */
	public Sysdatasave(Integer alarmlevelid) {
		this.alarmlevelid = alarmlevelid;
	}

	/** full constructor */
	public Sysdatasave(Integer alarmlevelid, String keepmonth) {
		this.alarmlevelid = alarmlevelid;
		this.keepmonth = keepmonth;
	}

	// Property accessors

	public Integer getAlarmlevelid() {
		return this.alarmlevelid;
	}

	public void setAlarmlevelid(Integer alarmlevelid) {
		this.alarmlevelid = alarmlevelid;
	}

	public String getKeepmonth() {
		return this.keepmonth;
	}

	public void setKeepmonth(String keepmonth) {
		this.keepmonth = keepmonth;
	}

}