package com.cvnchina.test.entity;

/**
 * Hwcard entity. @author MyEclipse Persistence Tools
 */

public class Hwcard implements java.io.Serializable {

	// Fields

	private Integer neid;
	private Ne ne;
	private Integer previd;
	private Integer slot;
	private String embedAddress;
	private Integer type;
	private String name;
	private Integer status;
	private String softwareversion;
	private String serialnumber;
	private Integer temperature;

	// Constructors

	/** default constructor */
	public Hwcard() {
	}

	/** minimal constructor */
	public Hwcard(Integer neid, Ne ne) {
		this.neid = neid;
		this.ne = ne;
	}

	/** full constructor */
	public Hwcard(Integer neid, Ne ne, Integer previd, Integer slot,
			String embedAddress, Integer type, String name, Integer status,
			String softwareversion, String serialnumber, Integer temperature) {
		this.neid = neid;
		this.ne = ne;
		this.previd = previd;
		this.slot = slot;
		this.embedAddress = embedAddress;
		this.type = type;
		this.name = name;
		this.status = status;
		this.softwareversion = softwareversion;
		this.serialnumber = serialnumber;
		this.temperature = temperature;
	}

	// Property accessors

	public Integer getNeid() {
		return this.neid;
	}

	public void setNeid(Integer neid) {
		this.neid = neid;
	}

	public Ne getNe() {
		return this.ne;
	}

	public void setNe(Ne ne) {
		this.ne = ne;
	}

	public Integer getPrevid() {
		return this.previd;
	}

	public void setPrevid(Integer previd) {
		this.previd = previd;
	}

	public Integer getSlot() {
		return this.slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	public String getEmbedAddress() {
		return this.embedAddress;
	}

	public void setEmbedAddress(String embedAddress) {
		this.embedAddress = embedAddress;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getSoftwareversion() {
		return this.softwareversion;
	}

	public void setSoftwareversion(String softwareversion) {
		this.softwareversion = softwareversion;
	}

	public String getSerialnumber() {
		return this.serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	public Integer getTemperature() {
		return this.temperature;
	}

	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}

}