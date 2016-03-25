package com.cvnchina.test.entity;

import java.sql.Timestamp;

/**
 * Syncsenddata entity. @author MyEclipse Persistence Tools
 */

public class Syncsenddata implements java.io.Serializable {

	// Fields

	private Integer id;
	private String uid;
	private Integer opertype;
	private Integer maxtype;
	private Timestamp synctime;
	private Integer synccount;
	private String description;

	// Constructors

	/** default constructor */
	public Syncsenddata() {
	}

	/** minimal constructor */
	public Syncsenddata(String uid) {
		this.uid = uid;
	}

	/** full constructor */
	public Syncsenddata(String uid, Integer opertype, Integer maxtype,
			Timestamp synctime, Integer synccount, String description) {
		this.uid = uid;
		this.opertype = opertype;
		this.maxtype = maxtype;
		this.synctime = synctime;
		this.synccount = synccount;
		this.description = description;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public Integer getOpertype() {
		return this.opertype;
	}

	public void setOpertype(Integer opertype) {
		this.opertype = opertype;
	}

	public Integer getMaxtype() {
		return this.maxtype;
	}

	public void setMaxtype(Integer maxtype) {
		this.maxtype = maxtype;
	}

	public Timestamp getSynctime() {
		return this.synctime;
	}

	public void setSynctime(Timestamp synctime) {
		this.synctime = synctime;
	}

	public Integer getSynccount() {
		return this.synccount;
	}

	public void setSynccount(Integer synccount) {
		this.synccount = synccount;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}