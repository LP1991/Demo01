package com.cvnchina.test.entity;

/**
 * Onucbattemplate entity. @author MyEclipse Persistence Tools
 */

public class Onucbattemplate implements java.io.Serializable {

	// Fields

	private Integer id;
	private Short port;
	private Integer mode;
	private Integer vlanid;
	private String serverip;
	private Integer serverport;

	// Constructors

	/** default constructor */
	public Onucbattemplate() {
	}

	/** full constructor */
	public Onucbattemplate(Short port, Integer mode, Integer vlanid,
			String serverip, Integer serverport) {
		this.port = port;
		this.mode = mode;
		this.vlanid = vlanid;
		this.serverip = serverip;
		this.serverport = serverport;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getPort() {
		return this.port;
	}

	public void setPort(Short port) {
		this.port = port;
	}

	public Integer getMode() {
		return this.mode;
	}

	public void setMode(Integer mode) {
		this.mode = mode;
	}

	public Integer getVlanid() {
		return this.vlanid;
	}

	public void setVlanid(Integer vlanid) {
		this.vlanid = vlanid;
	}

	public String getServerip() {
		return this.serverip;
	}

	public void setServerip(String serverip) {
		this.serverip = serverip;
	}

	public Integer getServerport() {
		return this.serverport;
	}

	public void setServerport(Integer serverport) {
		this.serverport = serverport;
	}

}