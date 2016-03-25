package com.cvnchina.test.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Rgroup entity. @author MyEclipse Persistence Tools
 */

public class Rgroup implements java.io.Serializable {

	// Fields

	private Integer groupid;
	private Rdomain rdomain;
	private Rgroup rgroup;
	private String groupname;
	private String groupdescription;
	private Integer rdomainid;
	private String grouppath;
	private String firstletter;
	private Long uid;
	private Set rgroups = new HashSet(0);
	private Set userauthgroups = new HashSet(0);
	private Set addressranges = new HashSet(0);
	private Set nes = new HashSet(0);

	// Constructors

	/** default constructor */
	public Rgroup() {
	}

	/** full constructor */
	public Rgroup(Rdomain rdomain, Rgroup rgroup, String groupname,
			String groupdescription, Integer rdomainid, String grouppath,
			String firstletter, Long uid, Set rgroups, Set userauthgroups,
			Set addressranges, Set nes) {
		this.rdomain = rdomain;
		this.rgroup = rgroup;
		this.groupname = groupname;
		this.groupdescription = groupdescription;
		this.rdomainid = rdomainid;
		this.grouppath = grouppath;
		this.firstletter = firstletter;
		this.uid = uid;
		this.rgroups = rgroups;
		this.userauthgroups = userauthgroups;
		this.addressranges = addressranges;
		this.nes = nes;
	}

	// Property accessors

	public Integer getGroupid() {
		return this.groupid;
	}

	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}

	public Rdomain getRdomain() {
		return this.rdomain;
	}

	public void setRdomain(Rdomain rdomain) {
		this.rdomain = rdomain;
	}

	public Rgroup getRgroup() {
		return this.rgroup;
	}

	public void setRgroup(Rgroup rgroup) {
		this.rgroup = rgroup;
	}

	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public String getGroupdescription() {
		return this.groupdescription;
	}

	public void setGroupdescription(String groupdescription) {
		this.groupdescription = groupdescription;
	}

	public Integer getRdomainid() {
		return this.rdomainid;
	}

	public void setRdomainid(Integer rdomainid) {
		this.rdomainid = rdomainid;
	}

	public String getGrouppath() {
		return this.grouppath;
	}

	public void setGrouppath(String grouppath) {
		this.grouppath = grouppath;
	}

	public String getFirstletter() {
		return this.firstletter;
	}

	public void setFirstletter(String firstletter) {
		this.firstletter = firstletter;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Set getRgroups() {
		return this.rgroups;
	}

	public void setRgroups(Set rgroups) {
		this.rgroups = rgroups;
	}

	public Set getUserauthgroups() {
		return this.userauthgroups;
	}

	public void setUserauthgroups(Set userauthgroups) {
		this.userauthgroups = userauthgroups;
	}

	public Set getAddressranges() {
		return this.addressranges;
	}

	public void setAddressranges(Set addressranges) {
		this.addressranges = addressranges;
	}

	public Set getNes() {
		return this.nes;
	}

	public void setNes(Set nes) {
		this.nes = nes;
	}

}