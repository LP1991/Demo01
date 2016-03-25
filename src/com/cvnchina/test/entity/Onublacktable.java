package com.cvnchina.test.entity;

import java.util.Date;

/**
 * Onublacktable entity. @author MyEclipse Persistence Tools
 */

public class Onublacktable implements java.io.Serializable {

	// Fields

	private Integer id;
	private String onuMac;
	private Date inDate;

	// Constructors

	/** default constructor */
	public Onublacktable() {
	}

	/** full constructor */
	public Onublacktable(String onuMac, Date inDate) {
		this.onuMac = onuMac;
		this.inDate = inDate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOnuMac() {
		return this.onuMac;
	}

	public void setOnuMac(String onuMac) {
		this.onuMac = onuMac;
	}

	public Date getInDate() {
		return this.inDate;
	}

	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}

}