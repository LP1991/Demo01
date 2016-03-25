package com.cvnchina.test.entity;

import java.util.Date;

/**
 * Onuwhitetable entity. @author MyEclipse Persistence Tools
 */

public class Onuwhitetable implements java.io.Serializable {

	// Fields

	private Integer id;
	private String onuMac;
	private String cbatMac;
	private String onuip;
	private String gateway;
	private Integer vlanid;
	private String mask;
	private String oltip;
	private Integer portid;
	private Short configured;
	private Date configDate;
	private Short businessState;
	private Short mode;
	private Date businessDate;
	private Integer templateId;
	private Short retrycount;

	// Constructors

	/** default constructor */
	public Onuwhitetable() {
	}

	/** minimal constructor */
	public Onuwhitetable(String onuMac, String oltip) {
		this.onuMac = onuMac;
		this.oltip = oltip;
	}

	/** full constructor */
	public Onuwhitetable(String onuMac, String cbatMac, String onuip,
			String gateway, Integer vlanid, String mask, String oltip,
			Integer portid, Short configured, Date configDate,
			Short businessState, Short mode, Date businessDate,
			Integer templateId, Short retrycount) {
		this.onuMac = onuMac;
		this.cbatMac = cbatMac;
		this.onuip = onuip;
		this.gateway = gateway;
		this.vlanid = vlanid;
		this.mask = mask;
		this.oltip = oltip;
		this.portid = portid;
		this.configured = configured;
		this.configDate = configDate;
		this.businessState = businessState;
		this.mode = mode;
		this.businessDate = businessDate;
		this.templateId = templateId;
		this.retrycount = retrycount;
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

	public String getCbatMac() {
		return this.cbatMac;
	}

	public void setCbatMac(String cbatMac) {
		this.cbatMac = cbatMac;
	}

	public String getOnuip() {
		return this.onuip;
	}

	public void setOnuip(String onuip) {
		this.onuip = onuip;
	}

	public String getGateway() {
		return this.gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public Integer getVlanid() {
		return this.vlanid;
	}

	public void setVlanid(Integer vlanid) {
		this.vlanid = vlanid;
	}

	public String getMask() {
		return this.mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public String getOltip() {
		return this.oltip;
	}

	public void setOltip(String oltip) {
		this.oltip = oltip;
	}

	public Integer getPortid() {
		return this.portid;
	}

	public void setPortid(Integer portid) {
		this.portid = portid;
	}

	public Short getConfigured() {
		return this.configured;
	}

	public void setConfigured(Short configured) {
		this.configured = configured;
	}

	public Date getConfigDate() {
		return this.configDate;
	}

	public void setConfigDate(Date configDate) {
		this.configDate = configDate;
	}

	public Short getBusinessState() {
		return this.businessState;
	}

	public void setBusinessState(Short businessState) {
		this.businessState = businessState;
	}

	public Short getMode() {
		return this.mode;
	}

	public void setMode(Short mode) {
		this.mode = mode;
	}

	public Date getBusinessDate() {
		return this.businessDate;
	}

	public void setBusinessDate(Date businessDate) {
		this.businessDate = businessDate;
	}

	public Integer getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
	}

	public Short getRetrycount() {
		return this.retrycount;
	}

	public void setRetrycount(Short retrycount) {
		this.retrycount = retrycount;
	}

}