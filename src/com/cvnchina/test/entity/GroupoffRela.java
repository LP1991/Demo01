package com.cvnchina.test.entity;

/**
 * GroupoffRela entity. @author MyEclipse Persistence Tools
 */

public class GroupoffRela implements java.io.Serializable {

	// Fields

	private GroupoffRelaId id;

	// Constructors

	/** default constructor */
	public GroupoffRela() {
	}

	/** full constructor */
	public GroupoffRela(GroupoffRelaId id) {
		this.id = id;
	}

	// Property accessors

	public GroupoffRelaId getId() {
		return this.id;
	}

	public void setId(GroupoffRelaId id) {
		this.id = id;
	}

}