package com.cvnchina.test.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Offlinetemplate entity. @author MyEclipse Persistence Tools
 */

public class Offlinetemplate implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private String desc;
	private Timestamp createtime;
	private Set vlanpooloffRelas = new HashSet(0);
	private Set cbatoffRelas = new HashSet(0);
	private Set resultoftemplates = new HashSet(0);
	private Set groupoffRelas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Offlinetemplate() {
	}

	/** minimal constructor */
	public Offlinetemplate(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/** full constructor */
	public Offlinetemplate(Integer id, String name, String desc,
			Timestamp createtime, Set vlanpooloffRelas, Set cbatoffRelas,
			Set resultoftemplates, Set groupoffRelas) {
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.createtime = createtime;
		this.vlanpooloffRelas = vlanpooloffRelas;
		this.cbatoffRelas = cbatoffRelas;
		this.resultoftemplates = resultoftemplates;
		this.groupoffRelas = groupoffRelas;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	public Set getVlanpooloffRelas() {
		return this.vlanpooloffRelas;
	}

	public void setVlanpooloffRelas(Set vlanpooloffRelas) {
		this.vlanpooloffRelas = vlanpooloffRelas;
	}

	public Set getCbatoffRelas() {
		return this.cbatoffRelas;
	}

	public void setCbatoffRelas(Set cbatoffRelas) {
		this.cbatoffRelas = cbatoffRelas;
	}

	public Set getResultoftemplates() {
		return this.resultoftemplates;
	}

	public void setResultoftemplates(Set resultoftemplates) {
		this.resultoftemplates = resultoftemplates;
	}

	public Set getGroupoffRelas() {
		return this.groupoffRelas;
	}

	public void setGroupoffRelas(Set groupoffRelas) {
		this.groupoffRelas = groupoffRelas;
	}

}