package com.cvnchina.test.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Vlanpool entity. @author MyEclipse Persistence Tools
 */

public class Vlanpool implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Integer total;
	private Integer available;
	private Short priority;
	private String vlan;
	private Integer publicvlan;
	private Set vlanpooloffRelas = new HashSet(0);
	private Set resultoftemplates = new HashSet(0);

	// Constructors

	/** default constructor */
	public Vlanpool() {
	}

	/** minimal constructor */
	public Vlanpool(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/** full constructor */
	public Vlanpool(Integer id, String name, Integer total, Integer available,
			Short priority, String vlan, Integer publicvlan,
			Set vlanpooloffRelas, Set resultoftemplates) {
		this.id = id;
		this.name = name;
		this.total = total;
		this.available = available;
		this.priority = priority;
		this.vlan = vlan;
		this.publicvlan = publicvlan;
		this.vlanpooloffRelas = vlanpooloffRelas;
		this.resultoftemplates = resultoftemplates;
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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getAvailable() {
		return this.available;
	}

	public void setAvailable(Integer available) {
		this.available = available;
	}

	public Short getPriority() {
		return this.priority;
	}

	public void setPriority(Short priority) {
		this.priority = priority;
	}

	public String getVlan() {
		return this.vlan;
	}

	public void setVlan(String vlan) {
		this.vlan = vlan;
	}

	public Integer getPublicvlan() {
		return this.publicvlan;
	}

	public void setPublicvlan(Integer publicvlan) {
		this.publicvlan = publicvlan;
	}

	public Set getVlanpooloffRelas() {
		return this.vlanpooloffRelas;
	}

	public void setVlanpooloffRelas(Set vlanpooloffRelas) {
		this.vlanpooloffRelas = vlanpooloffRelas;
	}

	public Set getResultoftemplates() {
		return this.resultoftemplates;
	}

	public void setResultoftemplates(Set resultoftemplates) {
		this.resultoftemplates = resultoftemplates;
	}

}