package com.cvnchina.test.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Netype entity. @author MyEclipse Persistence Tools
 */

public class Netype implements java.io.Serializable {

	// Fields

	private Integer netypeid;
	private Netype netype;
	private String netypename;
	private String netypeversion;
	private String netypedescription;
	private Short toptype;
	private Short selected;
	private String companyinfo;
	private String groupname;
	private Set netypes = new HashSet(0);
	private Set nes = new HashSet(0);
	private Set netypeactionRelas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Netype() {
	}

	/** minimal constructor */
	public Netype(String companyinfo) {
		this.companyinfo = companyinfo;
	}

	/** full constructor */
	public Netype(Netype netype, String netypename, String netypeversion,
			String netypedescription, Short toptype, Short selected,
			String companyinfo, String groupname, Set netypes, Set nes,
			Set netypeactionRelas) {
		this.netype = netype;
		this.netypename = netypename;
		this.netypeversion = netypeversion;
		this.netypedescription = netypedescription;
		this.toptype = toptype;
		this.selected = selected;
		this.companyinfo = companyinfo;
		this.groupname = groupname;
		this.netypes = netypes;
		this.nes = nes;
		this.netypeactionRelas = netypeactionRelas;
	}

	// Property accessors

	public Integer getNetypeid() {
		return this.netypeid;
	}

	public void setNetypeid(Integer netypeid) {
		this.netypeid = netypeid;
	}

	public Netype getNetype() {
		return this.netype;
	}

	public void setNetype(Netype netype) {
		this.netype = netype;
	}

	public String getNetypename() {
		return this.netypename;
	}

	public void setNetypename(String netypename) {
		this.netypename = netypename;
	}

	public String getNetypeversion() {
		return this.netypeversion;
	}

	public void setNetypeversion(String netypeversion) {
		this.netypeversion = netypeversion;
	}

	public String getNetypedescription() {
		return this.netypedescription;
	}

	public void setNetypedescription(String netypedescription) {
		this.netypedescription = netypedescription;
	}

	public Short getToptype() {
		return this.toptype;
	}

	public void setToptype(Short toptype) {
		this.toptype = toptype;
	}

	public Short getSelected() {
		return this.selected;
	}

	public void setSelected(Short selected) {
		this.selected = selected;
	}

	public String getCompanyinfo() {
		return this.companyinfo;
	}

	public void setCompanyinfo(String companyinfo) {
		this.companyinfo = companyinfo;
	}

	public String getGroupname() {
		return this.groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public Set getNetypes() {
		return this.netypes;
	}

	public void setNetypes(Set netypes) {
		this.netypes = netypes;
	}

	public Set getNes() {
		return this.nes;
	}

	public void setNes(Set nes) {
		this.nes = nes;
	}

	public Set getNetypeactionRelas() {
		return this.netypeactionRelas;
	}

	public void setNetypeactionRelas(Set netypeactionRelas) {
		this.netypeactionRelas = netypeactionRelas;
	}

}