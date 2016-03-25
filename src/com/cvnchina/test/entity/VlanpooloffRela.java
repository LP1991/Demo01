package com.cvnchina.test.entity;

/**
 * VlanpooloffRela entity. @author MyEclipse Persistence Tools
 */

public class VlanpooloffRela implements java.io.Serializable {

	// Fields

	private VlanpooloffRelaId id;
	private Offlinetemplate offlinetemplate;
	private Vlanpool vlanpool;

	// Constructors

	/** default constructor */
	public VlanpooloffRela() {
	}

	/** full constructor */
	public VlanpooloffRela(VlanpooloffRelaId id,
			Offlinetemplate offlinetemplate, Vlanpool vlanpool) {
		this.id = id;
		this.offlinetemplate = offlinetemplate;
		this.vlanpool = vlanpool;
	}

	// Property accessors

	public VlanpooloffRelaId getId() {
		return this.id;
	}

	public void setId(VlanpooloffRelaId id) {
		this.id = id;
	}

	public Offlinetemplate getOfflinetemplate() {
		return this.offlinetemplate;
	}

	public void setOfflinetemplate(Offlinetemplate offlinetemplate) {
		this.offlinetemplate = offlinetemplate;
	}

	public Vlanpool getVlanpool() {
		return this.vlanpool;
	}

	public void setVlanpool(Vlanpool vlanpool) {
		this.vlanpool = vlanpool;
	}

}