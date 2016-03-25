package com.cvnchina.test.entity;

/**
 * CbatoffRela entity. @author MyEclipse Persistence Tools
 */

public class CbatoffRela implements java.io.Serializable {

	// Fields

	private CbatoffRelaId id;

	// Constructors

	/** default constructor */
	public CbatoffRela() {
	}

	/** full constructor */
	public CbatoffRela(CbatoffRelaId id) {
		this.id = id;
	}

	// Property accessors

	public CbatoffRelaId getId() {
		return this.id;
	}

	public void setId(CbatoffRelaId id) {
		this.id = id;
	}

}