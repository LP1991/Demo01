package com.cvnchina.test.entity;

import java.sql.Timestamp;

/**
 * Syncreceivedata entity. @author MyEclipse Persistence Tools
 */

public class Syncreceivedata implements java.io.Serializable {

	// Fields

	private Integer id;
	private String uid;
	private Integer opertype;
	private Integer maxtype;
	private String synccontent;
	private Timestamp receivetime;
	private String description;
	private String areacode;

	// Constructors

	/** default constructor */
	public Syncreceivedata() {
	}

	/** minimal constructor */
	public Syncreceivedata(String uid) {
		this.uid = uid;
	}

	/** full constructor */
	public Syncreceivedata(String uid, Integer opertype, Integer maxtype,
			String synccontent, Timestamp receivetime, String description,
			String areacode) {
		this.uid = uid;
		this.opertype = opertype;
		this.maxtype = maxtype;
		this.synccontent = synccontent;
		this.receivetime = receivetime;
		this.description = description;
		this.areacode = areacode;
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

	public String getSynccontent() {
		return this.synccontent;
	}

	public void setSynccontent(String synccontent) {
		this.synccontent = synccontent;
	}

	public Timestamp getReceivetime() {
		return this.receivetime;
	}

	public void setReceivetime(Timestamp receivetime) {
		this.receivetime = receivetime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAreacode() {
		return this.areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

}