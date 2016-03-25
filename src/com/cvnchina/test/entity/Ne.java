package com.cvnchina.test.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Ne entity. @author MyEclipse Persistence Tools
 */

public class Ne implements java.io.Serializable {

	// Fields

	private Integer neid;
	private Rgroup rgroup;
	private Ne ne;
	private Netype netype;
	private Short nestatus;
	private String nename;
	private String devicetype;
	private Short nealarmstatus;
	private String nedescription;
	private String addr;
	private String parentonu;
	private Integer outvlanid;
	private String ipAddress;
	private String macAddress;
	private Short mixtype;
	private String embedAddress;
	private Integer maxtype;
	private String softversion;
	private Integer maxid;
	private String nepath;
	private String firstletter;
	private String companyinfo;
	private String uid;
	private String readCommunity;
	private String writeCommunity;
	private Set zxonuadmintables = new HashSet(0);
	private Set raps = new HashSet(0);
	private Set fiberonutables = new HashSet(0);
	private Set bodaonutables = new HashSet(0);
	private Set zxeponporttables = new HashSet(0);
	private Set rembeds = new HashSet(0);
	private Set rupdates = new HashSet(0);
	private Set alarmpolicies = new HashSet(0);
	private Set fiberporttables = new HashSet(0);
	private Set cmtses = new HashSet(0);
	private Set rcltswitchs = new HashSet(0);
	private Set rnds = new HashSet(0);
	private Set rresets = new HashSet(0);
	private Set hwports = new HashSet(0);
	private Set monlists = new HashSet(0);
	private Set zxancardtables = new HashSet(0);
	private Set cmtsports = new HashSet(0);
	private Set zxanshelftables = new HashSet(0);
	private Set virtualnes = new HashSet(0);
	private Set rstattasks = new HashSet(0);
	private Set neinfostats = new HashSet(0);
	private Set tr069tables = new HashSet(0);
	private Set bodacardtables = new HashSet(0);
	private Set bodaporttables = new HashSet(0);
	private Set rrps = new HashSet(0);
	private Set hwonus = new HashSet(0);
	private Set outvlaninfos = new HashSet(0);
	private Set fibercardtables = new HashSet(0);
	private Set zxponsystables = new HashSet(0);
	private Set rmultinds = new HashSet(0);
	private Set hwcards = new HashSet(0);
	private Set batchrenames = new HashSet(0);
	private Set zxanracktables = new HashSet(0);
	private Set cms = new HashSet(0);
	private Set nes = new HashSet(0);
	private Set rclts = new HashSet(0);
	private Set rlogs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Ne() {
	}

	/** minimal constructor */
	public Ne(Netype netype, Short nealarmstatus) {
		this.netype = netype;
		this.nealarmstatus = nealarmstatus;
	}

	/** full constructor */
	public Ne(Rgroup rgroup, Ne ne, Netype netype, Short nestatus,
			String nename, String devicetype, Short nealarmstatus,
			String nedescription, String addr, String parentonu,
			Integer outvlanid, String ipAddress, String macAddress,
			Short mixtype, String embedAddress, Integer maxtype,
			String softversion, Integer maxid, String nepath,
			String firstletter, String companyinfo, String uid,
			String readCommunity, String writeCommunity, Set zxonuadmintables,
			Set raps, Set fiberonutables, Set bodaonutables,
			Set zxeponporttables, Set rembeds, Set rupdates, Set alarmpolicies,
			Set fiberporttables, Set cmtses, Set rcltswitchs, Set rnds,
			Set rresets, Set hwports, Set monlists, Set zxancardtables,
			Set cmtsports, Set zxanshelftables, Set virtualnes, Set rstattasks,
			Set neinfostats, Set tr069tables, Set bodacardtables,
			Set bodaporttables, Set rrps, Set hwonus, Set outvlaninfos,
			Set fibercardtables, Set zxponsystables, Set rmultinds,
			Set hwcards, Set batchrenames, Set zxanracktables, Set cms,
			Set nes, Set rclts, Set rlogs) {
		this.rgroup = rgroup;
		this.ne = ne;
		this.netype = netype;
		this.nestatus = nestatus;
		this.nename = nename;
		this.devicetype = devicetype;
		this.nealarmstatus = nealarmstatus;
		this.nedescription = nedescription;
		this.addr = addr;
		this.parentonu = parentonu;
		this.outvlanid = outvlanid;
		this.ipAddress = ipAddress;
		this.macAddress = macAddress;
		this.mixtype = mixtype;
		this.embedAddress = embedAddress;
		this.maxtype = maxtype;
		this.softversion = softversion;
		this.maxid = maxid;
		this.nepath = nepath;
		this.firstletter = firstletter;
		this.companyinfo = companyinfo;
		this.uid = uid;
		this.readCommunity = readCommunity;
		this.writeCommunity = writeCommunity;
		this.zxonuadmintables = zxonuadmintables;
		this.raps = raps;
		this.fiberonutables = fiberonutables;
		this.bodaonutables = bodaonutables;
		this.zxeponporttables = zxeponporttables;
		this.rembeds = rembeds;
		this.rupdates = rupdates;
		this.alarmpolicies = alarmpolicies;
		this.fiberporttables = fiberporttables;
		this.cmtses = cmtses;
		this.rcltswitchs = rcltswitchs;
		this.rnds = rnds;
		this.rresets = rresets;
		this.hwports = hwports;
		this.monlists = monlists;
		this.zxancardtables = zxancardtables;
		this.cmtsports = cmtsports;
		this.zxanshelftables = zxanshelftables;
		this.virtualnes = virtualnes;
		this.rstattasks = rstattasks;
		this.neinfostats = neinfostats;
		this.tr069tables = tr069tables;
		this.bodacardtables = bodacardtables;
		this.bodaporttables = bodaporttables;
		this.rrps = rrps;
		this.hwonus = hwonus;
		this.outvlaninfos = outvlaninfos;
		this.fibercardtables = fibercardtables;
		this.zxponsystables = zxponsystables;
		this.rmultinds = rmultinds;
		this.hwcards = hwcards;
		this.batchrenames = batchrenames;
		this.zxanracktables = zxanracktables;
		this.cms = cms;
		this.nes = nes;
		this.rclts = rclts;
		this.rlogs = rlogs;
	}

	// Property accessors

	public Integer getNeid() {
		return this.neid;
	}

	public void setNeid(Integer neid) {
		this.neid = neid;
	}

	public Rgroup getRgroup() {
		return this.rgroup;
	}

	public void setRgroup(Rgroup rgroup) {
		this.rgroup = rgroup;
	}

	public Ne getNe() {
		return this.ne;
	}

	public void setNe(Ne ne) {
		this.ne = ne;
	}

	public Netype getNetype() {
		return this.netype;
	}

	public void setNetype(Netype netype) {
		this.netype = netype;
	}

	public Short getNestatus() {
		return this.nestatus;
	}

	public void setNestatus(Short nestatus) {
		this.nestatus = nestatus;
	}

	public String getNename() {
		return this.nename;
	}

	public void setNename(String nename) {
		this.nename = nename;
	}

	public String getDevicetype() {
		return this.devicetype;
	}

	public void setDevicetype(String devicetype) {
		this.devicetype = devicetype;
	}

	public Short getNealarmstatus() {
		return this.nealarmstatus;
	}

	public void setNealarmstatus(Short nealarmstatus) {
		this.nealarmstatus = nealarmstatus;
	}

	public String getNedescription() {
		return this.nedescription;
	}

	public void setNedescription(String nedescription) {
		this.nedescription = nedescription;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getParentonu() {
		return this.parentonu;
	}

	public void setParentonu(String parentonu) {
		this.parentonu = parentonu;
	}

	public Integer getOutvlanid() {
		return this.outvlanid;
	}

	public void setOutvlanid(Integer outvlanid) {
		this.outvlanid = outvlanid;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getMacAddress() {
		return this.macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public Short getMixtype() {
		return this.mixtype;
	}

	public void setMixtype(Short mixtype) {
		this.mixtype = mixtype;
	}

	public String getEmbedAddress() {
		return this.embedAddress;
	}

	public void setEmbedAddress(String embedAddress) {
		this.embedAddress = embedAddress;
	}

	public Integer getMaxtype() {
		return this.maxtype;
	}

	public void setMaxtype(Integer maxtype) {
		this.maxtype = maxtype;
	}

	public String getSoftversion() {
		return this.softversion;
	}

	public void setSoftversion(String softversion) {
		this.softversion = softversion;
	}

	public Integer getMaxid() {
		return this.maxid;
	}

	public void setMaxid(Integer maxid) {
		this.maxid = maxid;
	}

	public String getNepath() {
		return this.nepath;
	}

	public void setNepath(String nepath) {
		this.nepath = nepath;
	}

	public String getFirstletter() {
		return this.firstletter;
	}

	public void setFirstletter(String firstletter) {
		this.firstletter = firstletter;
	}

	public String getCompanyinfo() {
		return this.companyinfo;
	}

	public void setCompanyinfo(String companyinfo) {
		this.companyinfo = companyinfo;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
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

	public Set getZxonuadmintables() {
		return this.zxonuadmintables;
	}

	public void setZxonuadmintables(Set zxonuadmintables) {
		this.zxonuadmintables = zxonuadmintables;
	}

	public Set getRaps() {
		return this.raps;
	}

	public void setRaps(Set raps) {
		this.raps = raps;
	}

	public Set getFiberonutables() {
		return this.fiberonutables;
	}

	public void setFiberonutables(Set fiberonutables) {
		this.fiberonutables = fiberonutables;
	}

	public Set getBodaonutables() {
		return this.bodaonutables;
	}

	public void setBodaonutables(Set bodaonutables) {
		this.bodaonutables = bodaonutables;
	}

	public Set getZxeponporttables() {
		return this.zxeponporttables;
	}

	public void setZxeponporttables(Set zxeponporttables) {
		this.zxeponporttables = zxeponporttables;
	}

	public Set getRembeds() {
		return this.rembeds;
	}

	public void setRembeds(Set rembeds) {
		this.rembeds = rembeds;
	}

	public Set getRupdates() {
		return this.rupdates;
	}

	public void setRupdates(Set rupdates) {
		this.rupdates = rupdates;
	}

	public Set getAlarmpolicies() {
		return this.alarmpolicies;
	}

	public void setAlarmpolicies(Set alarmpolicies) {
		this.alarmpolicies = alarmpolicies;
	}

	public Set getFiberporttables() {
		return this.fiberporttables;
	}

	public void setFiberporttables(Set fiberporttables) {
		this.fiberporttables = fiberporttables;
	}

	public Set getCmtses() {
		return this.cmtses;
	}

	public void setCmtses(Set cmtses) {
		this.cmtses = cmtses;
	}

	public Set getRcltswitchs() {
		return this.rcltswitchs;
	}

	public void setRcltswitchs(Set rcltswitchs) {
		this.rcltswitchs = rcltswitchs;
	}

	public Set getRnds() {
		return this.rnds;
	}

	public void setRnds(Set rnds) {
		this.rnds = rnds;
	}

	public Set getRresets() {
		return this.rresets;
	}

	public void setRresets(Set rresets) {
		this.rresets = rresets;
	}

	public Set getHwports() {
		return this.hwports;
	}

	public void setHwports(Set hwports) {
		this.hwports = hwports;
	}

	public Set getMonlists() {
		return this.monlists;
	}

	public void setMonlists(Set monlists) {
		this.monlists = monlists;
	}

	public Set getZxancardtables() {
		return this.zxancardtables;
	}

	public void setZxancardtables(Set zxancardtables) {
		this.zxancardtables = zxancardtables;
	}

	public Set getCmtsports() {
		return this.cmtsports;
	}

	public void setCmtsports(Set cmtsports) {
		this.cmtsports = cmtsports;
	}

	public Set getZxanshelftables() {
		return this.zxanshelftables;
	}

	public void setZxanshelftables(Set zxanshelftables) {
		this.zxanshelftables = zxanshelftables;
	}

	public Set getVirtualnes() {
		return this.virtualnes;
	}

	public void setVirtualnes(Set virtualnes) {
		this.virtualnes = virtualnes;
	}

	public Set getRstattasks() {
		return this.rstattasks;
	}

	public void setRstattasks(Set rstattasks) {
		this.rstattasks = rstattasks;
	}

	public Set getNeinfostats() {
		return this.neinfostats;
	}

	public void setNeinfostats(Set neinfostats) {
		this.neinfostats = neinfostats;
	}

	public Set getTr069tables() {
		return this.tr069tables;
	}

	public void setTr069tables(Set tr069tables) {
		this.tr069tables = tr069tables;
	}

	public Set getBodacardtables() {
		return this.bodacardtables;
	}

	public void setBodacardtables(Set bodacardtables) {
		this.bodacardtables = bodacardtables;
	}

	public Set getBodaporttables() {
		return this.bodaporttables;
	}

	public void setBodaporttables(Set bodaporttables) {
		this.bodaporttables = bodaporttables;
	}

	public Set getRrps() {
		return this.rrps;
	}

	public void setRrps(Set rrps) {
		this.rrps = rrps;
	}

	public Set getHwonus() {
		return this.hwonus;
	}

	public void setHwonus(Set hwonus) {
		this.hwonus = hwonus;
	}

	public Set getOutvlaninfos() {
		return this.outvlaninfos;
	}

	public void setOutvlaninfos(Set outvlaninfos) {
		this.outvlaninfos = outvlaninfos;
	}

	public Set getFibercardtables() {
		return this.fibercardtables;
	}

	public void setFibercardtables(Set fibercardtables) {
		this.fibercardtables = fibercardtables;
	}

	public Set getZxponsystables() {
		return this.zxponsystables;
	}

	public void setZxponsystables(Set zxponsystables) {
		this.zxponsystables = zxponsystables;
	}

	public Set getRmultinds() {
		return this.rmultinds;
	}

	public void setRmultinds(Set rmultinds) {
		this.rmultinds = rmultinds;
	}

	public Set getHwcards() {
		return this.hwcards;
	}

	public void setHwcards(Set hwcards) {
		this.hwcards = hwcards;
	}

	public Set getBatchrenames() {
		return this.batchrenames;
	}

	public void setBatchrenames(Set batchrenames) {
		this.batchrenames = batchrenames;
	}

	public Set getZxanracktables() {
		return this.zxanracktables;
	}

	public void setZxanracktables(Set zxanracktables) {
		this.zxanracktables = zxanracktables;
	}

	public Set getCms() {
		return this.cms;
	}

	public void setCms(Set cms) {
		this.cms = cms;
	}

	public Set getNes() {
		return this.nes;
	}

	public void setNes(Set nes) {
		this.nes = nes;
	}

	public Set getRclts() {
		return this.rclts;
	}

	public void setRclts(Set rclts) {
		this.rclts = rclts;
	}

	public Set getRlogs() {
		return this.rlogs;
	}

	public void setRlogs(Set rlogs) {
		this.rlogs = rlogs;
	}

}