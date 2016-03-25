package com.cvnchina.test.entity;

/**
 * Addressrange entity. @author MyEclipse Persistence Tools
 */

public class Addressrange implements java.io.Serializable {

	// Fields

	private Integer addressrangeid;
	private Rgroup rgroup;
	private String addressrangestart;
	private String addressrangeend;
	private String netdescription;
	private Integer type;
	private String readCommunity;
	private String writeCommunity;

	// Constructors

	/** default constructor */
	public Addressrange() {
	}

	/** full constructor */
	public Addressrange(Rgroup rgroup, String addressrangestart,
			String addressrangeend, String netdescription, Integer type,
			String readCommunity, String writeCommunity) {
		this.rgroup = rgroup;
		this.addressrangestart = addressrangestart;
		this.addressrangeend = addressrangeend;
		this.netdescription = netdescription;
		this.type = type;
		this.readCommunity = readCommunity;
		this.writeCommunity = writeCommunity;
	}

	// Property accessors

	public Integer getAddressrangeid() {
		return this.addressrangeid;
	}

	public void setAddressrangeid(Integer addressrangeid) {
		this.addressrangeid = addressrangeid;
	}

	public Rgroup getRgroup() {
		return this.rgroup;
	}

	public void setRgroup(Rgroup rgroup) {
		this.rgroup = rgroup;
	}

	public String getAddressrangestart() {
		return this.addressrangestart;
	}

	public void setAddressrangestart(String addressrangestart) {
		this.addressrangestart = addressrangestart;
	}

	public String getAddressrangeend() {
		return this.addressrangeend;
	}

	public void setAddressrangeend(String addressrangeend) {
		this.addressrangeend = addressrangeend;
	}

	public String getNetdescription() {
		return this.netdescription;
	}

	public void setNetdescription(String netdescription) {
		this.netdescription = netdescription;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getReadCommunity() {
		return this.readCommunity;
	}

	public void setReadCommunity(String readCommunity) {
		this.readCommunity = readCommunity;
	}

	public String getWriteCommunity() {
		return this.writeCommunity;
	}

	public void setWriteCommunity(String writeCommunity) {
		this.writeCommunity = writeCommunity;
	}

}