package com.cvnchina.test.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Rdomain entity. @author MyEclipse Persistence Tools
 */

public class Rdomain implements java.io.Serializable {

	// Fields

	private Integer domainid;
	private Rdomain rdomain;
	private String domainname;
	private String domaindescription;
	private Long uid;
	private Set rdomains = new HashSet(0);
	private Set rauthorities = new HashSet(0);
	private Set rgroups = new HashSet(0);

	// Constructors

	/** default constructor */
	public Rdomain() {
	}

	/** full constructor */
	public Rdomain(Rdomain rdomain, String domainname,
			String domaindescription, Long uid, Set rdomains, Set rauthorities,
			Set rgroups) {
		this.rdomain = rdomain;
		this.domainname = domainname;
		this.domaindescription = domaindescription;
		this.uid = uid;
		this.rdomains = rdomains;
		this.rauthorities = rauthorities;
		this.rgroups = rgroups;
	}

	// Property accessors

	public Integer getDomainid() {
		return this.domainid;
	}

	public void setDomainid(Integer domainid) {
		this.domainid = domainid;
	}

	public Rdomain getRdomain() {
		return this.rdomain;
	}

	public void setRdomain(Rdomain rdomain) {
		this.rdomain = rdomain;
	}

	public String getDomainname() {
		return this.domainname;
	}

	public void setDomainname(String domainname) {
		this.domainname = domainname;
	}

	public String getDomaindescription() {
		return this.domaindescription;
	}

	public void setDomaindescription(String domaindescription) {
		this.domaindescription = domaindescription;
	}

	public Long getUid() {
		return this.uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public Set getRdomains() {
		return this.rdomains;
	}

	public void setRdomains(Set rdomains) {
		this.rdomains = rdomains;
	}

	public Set getRauthorities() {
		return this.rauthorities;
	}

	public void setRauthorities(Set rauthorities) {
		this.rauthorities = rauthorities;
	}

	public Set getRgroups() {
		return this.rgroups;
	}

	public void setRgroups(Set rgroups) {
		this.rgroups = rgroups;
	}

}