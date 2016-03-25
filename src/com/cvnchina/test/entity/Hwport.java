package com.cvnchina.test.entity;

import java.sql.Timestamp;

/**
 * Hwport entity. @author MyEclipse Persistence Tools
 */

public class Hwport implements java.io.Serializable {

	// Fields

	private Integer neid;
	private Ne ne;
	private Integer previd;
	private Integer slot;
	private Integer port;
	private String embedAddress;
	private Short ifAdminStatus;
	private Short ifOperStatus;
	private Integer distance;
	private Integer onuautofindenable;
	private Integer lastdowncause;
	private Timestamp lastuptime;
	private Timestamp lastdowntime;
	private Integer residualbandwidth;
	private Integer availablebandwidth;

	// Constructors

	/** default constructor */
	public Hwport() {
	}

	/** minimal constructor */
	public Hwport(Integer neid, Ne ne) {
		this.neid = neid;
		this.ne = ne;
	}

	/** full constructor */
	public Hwport(Integer neid, Ne ne, Integer previd, Integer slot,
			Integer port, String embedAddress, Short ifAdminStatus,
			Short ifOperStatus, Integer distance, Integer onuautofindenable,
			Integer lastdowncause, Timestamp lastuptime,
			Timestamp lastdowntime, Integer residualbandwidth,
			Integer availablebandwidth) {
		this.neid = neid;
		this.ne = ne;
		this.previd = previd;
		this.slot = slot;
		this.port = port;
		this.embedAddress = embedAddress;
		this.ifAdminStatus = ifAdminStatus;
		this.ifOperStatus = ifOperStatus;
		this.distance = distance;
		this.onuautofindenable = onuautofindenable;
		this.lastdowncause = lastdowncause;
		this.lastuptime = lastuptime;
		this.lastdowntime = lastdowntime;
		this.residualbandwidth = residualbandwidth;
		this.availablebandwidth = availablebandwidth;
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

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getEmbedAddress() {
		return this.embedAddress;
	}

	public void setEmbedAddress(String embedAddress) {
		this.embedAddress = embedAddress;
	}

	public Short getIfAdminStatus() {
		return this.ifAdminStatus;
	}

	public void setIfAdminStatus(Short ifAdminStatus) {
		this.ifAdminStatus = ifAdminStatus;
	}

	public Short getIfOperStatus() {
		return this.ifOperStatus;
	}

	public void setIfOperStatus(Short ifOperStatus) {
		this.ifOperStatus = ifOperStatus;
	}

	public Integer getDistance() {
		return this.distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Integer getOnuautofindenable() {
		return this.onuautofindenable;
	}

	public void setOnuautofindenable(Integer onuautofindenable) {
		this.onuautofindenable = onuautofindenable;
	}

	public Integer getLastdowncause() {
		return this.lastdowncause;
	}

	public void setLastdowncause(Integer lastdowncause) {
		this.lastdowncause = lastdowncause;
	}

	public Timestamp getLastuptime() {
		return this.lastuptime;
	}

	public void setLastuptime(Timestamp lastuptime) {
		this.lastuptime = lastuptime;
	}

	public Timestamp getLastdowntime() {
		return this.lastdowntime;
	}

	public void setLastdowntime(Timestamp lastdowntime) {
		this.lastdowntime = lastdowntime;
	}

	public Integer getResidualbandwidth() {
		return this.residualbandwidth;
	}

	public void setResidualbandwidth(Integer residualbandwidth) {
		this.residualbandwidth = residualbandwidth;
	}

	public Integer getAvailablebandwidth() {
		return this.availablebandwidth;
	}

	public void setAvailablebandwidth(Integer availablebandwidth) {
		this.availablebandwidth = availablebandwidth;
	}

}