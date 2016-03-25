package com.cvnchina.test.entity;

import java.sql.Timestamp;

/**
 * Hwonu entity. @author MyEclipse Persistence Tools
 */

public class Hwonu implements java.io.Serializable {

	// Fields

	private Integer neid;
	private Ne ne;
	private Integer previd;
	private Integer slot;
	private Integer port;
	private Integer onuid;
	private String embedAddress;
	private String mac;
	private String type;
	private String hardwareversion;
	private String softwareversion;
	private String chipmanufacturerid;
	private String chipmodel;
	private String chipreleaseverion;
	private String chipdesigndate;
	private String firmwareversion;
	private String description;
	private Integer rtt;
	private Integer distance;
	private Timestamp lastuptime;
	private Timestamp lastdowntime;
	private String linetemplate;
	private String servicetemplate;
	private String serviceleveltemplate;

	// Constructors

	/** default constructor */
	public Hwonu() {
	}

	/** minimal constructor */
	public Hwonu(Integer neid, Ne ne) {
		this.neid = neid;
		this.ne = ne;
	}

	/** full constructor */
	public Hwonu(Integer neid, Ne ne, Integer previd, Integer slot,
			Integer port, Integer onuid, String embedAddress, String mac,
			String type, String hardwareversion, String softwareversion,
			String chipmanufacturerid, String chipmodel,
			String chipreleaseverion, String chipdesigndate,
			String firmwareversion, String description, Integer rtt,
			Integer distance, Timestamp lastuptime, Timestamp lastdowntime,
			String linetemplate, String servicetemplate,
			String serviceleveltemplate) {
		this.neid = neid;
		this.ne = ne;
		this.previd = previd;
		this.slot = slot;
		this.port = port;
		this.onuid = onuid;
		this.embedAddress = embedAddress;
		this.mac = mac;
		this.type = type;
		this.hardwareversion = hardwareversion;
		this.softwareversion = softwareversion;
		this.chipmanufacturerid = chipmanufacturerid;
		this.chipmodel = chipmodel;
		this.chipreleaseverion = chipreleaseverion;
		this.chipdesigndate = chipdesigndate;
		this.firmwareversion = firmwareversion;
		this.description = description;
		this.rtt = rtt;
		this.distance = distance;
		this.lastuptime = lastuptime;
		this.lastdowntime = lastdowntime;
		this.linetemplate = linetemplate;
		this.servicetemplate = servicetemplate;
		this.serviceleveltemplate = serviceleveltemplate;
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

	public Integer getOnuid() {
		return this.onuid;
	}

	public void setOnuid(Integer onuid) {
		this.onuid = onuid;
	}

	public String getEmbedAddress() {
		return this.embedAddress;
	}

	public void setEmbedAddress(String embedAddress) {
		this.embedAddress = embedAddress;
	}

	public String getMac() {
		return this.mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHardwareversion() {
		return this.hardwareversion;
	}

	public void setHardwareversion(String hardwareversion) {
		this.hardwareversion = hardwareversion;
	}

	public String getSoftwareversion() {
		return this.softwareversion;
	}

	public void setSoftwareversion(String softwareversion) {
		this.softwareversion = softwareversion;
	}

	public String getChipmanufacturerid() {
		return this.chipmanufacturerid;
	}

	public void setChipmanufacturerid(String chipmanufacturerid) {
		this.chipmanufacturerid = chipmanufacturerid;
	}

	public String getChipmodel() {
		return this.chipmodel;
	}

	public void setChipmodel(String chipmodel) {
		this.chipmodel = chipmodel;
	}

	public String getChipreleaseverion() {
		return this.chipreleaseverion;
	}

	public void setChipreleaseverion(String chipreleaseverion) {
		this.chipreleaseverion = chipreleaseverion;
	}

	public String getChipdesigndate() {
		return this.chipdesigndate;
	}

	public void setChipdesigndate(String chipdesigndate) {
		this.chipdesigndate = chipdesigndate;
	}

	public String getFirmwareversion() {
		return this.firmwareversion;
	}

	public void setFirmwareversion(String firmwareversion) {
		this.firmwareversion = firmwareversion;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getRtt() {
		return this.rtt;
	}

	public void setRtt(Integer rtt) {
		this.rtt = rtt;
	}

	public Integer getDistance() {
		return this.distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
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

	public String getLinetemplate() {
		return this.linetemplate;
	}

	public void setLinetemplate(String linetemplate) {
		this.linetemplate = linetemplate;
	}

	public String getServicetemplate() {
		return this.servicetemplate;
	}

	public void setServicetemplate(String servicetemplate) {
		this.servicetemplate = servicetemplate;
	}

	public String getServiceleveltemplate() {
		return this.serviceleveltemplate;
	}

	public void setServiceleveltemplate(String serviceleveltemplate) {
		this.serviceleveltemplate = serviceleveltemplate;
	}

}