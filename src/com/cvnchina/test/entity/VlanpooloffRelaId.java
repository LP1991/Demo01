package com.cvnchina.test.entity;

/**
 * VlanpooloffRelaId entity. @author MyEclipse Persistence Tools
 */

public class VlanpooloffRelaId implements java.io.Serializable {

	// Fields

	private Vlanpool vlanpool;
	private Offlinetemplate offlinetemplate;

	// Constructors

	/** default constructor */
	public VlanpooloffRelaId() {
	}

	/** full constructor */
	public VlanpooloffRelaId(Vlanpool vlanpool, Offlinetemplate offlinetemplate) {
		this.vlanpool = vlanpool;
		this.offlinetemplate = offlinetemplate;
	}

	// Property accessors

	public Vlanpool getVlanpool() {
		return this.vlanpool;
	}

	public void setVlanpool(Vlanpool vlanpool) {
		this.vlanpool = vlanpool;
	}

	public Offlinetemplate getOfflinetemplate() {
		return this.offlinetemplate;
	}

	public void setOfflinetemplate(Offlinetemplate offlinetemplate) {
		this.offlinetemplate = offlinetemplate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof VlanpooloffRelaId))
			return false;
		VlanpooloffRelaId castOther = (VlanpooloffRelaId) other;

		return ((this.getVlanpool() == castOther.getVlanpool()) || (this
				.getVlanpool() != null && castOther.getVlanpool() != null && this
				.getVlanpool().equals(castOther.getVlanpool())))
				&& ((this.getOfflinetemplate() == castOther
						.getOfflinetemplate()) || (this.getOfflinetemplate() != null
						&& castOther.getOfflinetemplate() != null && this
						.getOfflinetemplate().equals(
								castOther.getOfflinetemplate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getVlanpool() == null ? 0 : this.getVlanpool().hashCode());
		result = 37
				* result
				+ (getOfflinetemplate() == null ? 0 : this.getOfflinetemplate()
						.hashCode());
		return result;
	}

}