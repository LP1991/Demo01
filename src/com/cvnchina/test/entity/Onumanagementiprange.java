package com.cvnchina.test.entity;

/**
 * Onumanagementiprange entity. @author MyEclipse Persistence Tools
 */

public class Onumanagementiprange implements java.io.Serializable {

	// Fields

	private Integer id;
	private String oltip;
	private String startip;
	private String endip;
	private String gateway;
	private String mask;
	private Integer vlanid;
	private Integer templateid;

	// Constructors

	/** default constructor */
	public Onumanagementiprange() {
	}

	/** full constructor */
	public Onumanagementiprange(String oltip, String startip, String endip,
			String gateway, String mask, Integer vlanid, Integer templateid) {
		this.oltip = oltip;
		this.startip = startip;
		this.endip = endip;
		this.gateway = gateway;
		this.mask = mask;
		this.vlanid = vlanid;
		this.templateid = templateid;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOltip() {
		return this.oltip;
	}

	public void setOltip(String oltip) {
		this.oltip = oltip;
	}

	public String getStartip() {
		return this.startip;
	}

	public void setStartip(String startip) {
		this.startip = startip;
	}

	public String getEndip() {
		return this.endip;
	}

	public void setEndip(String endip) {
		this.endip = endip;
	}

	public String getGateway() {
		return this.gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public String getMask() {
		return this.mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public Integer getVlanid() {
		return this.vlanid;
	}

	public void setVlanid(Integer vlanid) {
		this.vlanid = vlanid;
	}

	public Integer getTemplateid() {
		return this.templateid;
	}

	public void setTemplateid(Integer templateid) {
		this.templateid = templateid;
	}

}