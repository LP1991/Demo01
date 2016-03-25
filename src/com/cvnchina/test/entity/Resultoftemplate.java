package com.cvnchina.test.entity;

import java.sql.Timestamp;

/**
 * Resultoftemplate entity. @author MyEclipse Persistence Tools
 */

public class Resultoftemplate implements java.io.Serializable {

	// Fields

	private Integer id;
	private Offlinetemplate offlinetemplate;
	private Vlanpool vlanpool;
	private String mac;
	private Short result;
	private String desc;
	private Timestamp resulttime;

	// Constructors

	/** default constructor */
	public Resultoftemplate() {
	}

	/** minimal constructor */
	public Resultoftemplate(Integer id, String mac, Short result) {
		this.id = id;
		this.mac = mac;
		this.result = result;
	}

	/** full constructor */
	public Resultoftemplate(Integer id, Offlinetemplate offlinetemplate,
			Vlanpool vlanpool, String mac, Short result, String desc,
			Timestamp resulttime) {
		this.id = id;
		this.offlinetemplate = offlinetemplate;
		this.vlanpool = vlanpool;
		this.mac = mac;
		this.result = result;
		this.desc = desc;
		this.resulttime = resulttime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Offlinetemplate getOfflinetemplate() {
		return this.offlinetemplate;
	}

	public void setOfflinetemplate(Offlinetemplate offlinetemplate) {
		this.offlinetemplate = offlinetemplate;
	}

	public Vlanpool getVlanpool() {
		return this.vlanpool;
	}

	public void setVlanpool(Vlanpool vlanpool) {
		this.vlanpool = vlanpool;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public Short getResult() {
		return this.result;
	}

	public void setResult(Short result) {
		this.result = result;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Timestamp getResulttime() {
		return this.resulttime;
	}

	public void setResulttime(Timestamp resulttime) {
		this.resulttime = resulttime;
	}

}