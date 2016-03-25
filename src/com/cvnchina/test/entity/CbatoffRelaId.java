package com.cvnchina.test.entity;

/**
 * CbatoffRelaId entity. @author MyEclipse Persistence Tools
 */

public class CbatoffRelaId implements java.io.Serializable {

	// Fields

	private Offlinetemplate offlinetemplate;
	private Cbattemplate cbattemplate;

	// Constructors

	/** default constructor */
	public CbatoffRelaId() {
	}

	/** full constructor */
	public CbatoffRelaId(Offlinetemplate offlinetemplate,
			Cbattemplate cbattemplate) {
		this.offlinetemplate = offlinetemplate;
		this.cbattemplate = cbattemplate;
	}

	// Property accessors

	public Offlinetemplate getOfflinetemplate() {
		return this.offlinetemplate;
	}

	public void setOfflinetemplate(Offlinetemplate offlinetemplate) {
		this.offlinetemplate = offlinetemplate;
	}

	public Cbattemplate getCbattemplate() {
		return this.cbattemplate;
	}

	public void setCbattemplate(Cbattemplate cbattemplate) {
		this.cbattemplate = cbattemplate;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CbatoffRelaId))
			return false;
		CbatoffRelaId castOther = (CbatoffRelaId) other;

		return ((this.getOfflinetemplate() == castOther.getOfflinetemplate()) || (this
				.getOfflinetemplate() != null
				&& castOther.getOfflinetemplate() != null && this
				.getOfflinetemplate().equals(castOther.getOfflinetemplate())))
				&& ((this.getCbattemplate() == castOther.getCbattemplate()) || (this
						.getCbattemplate() != null
						&& castOther.getCbattemplate() != null && this
						.getCbattemplate().equals(castOther.getCbattemplate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getOfflinetemplate() == null ? 0 : this.getOfflinetemplate()
						.hashCode());
		result = 37
				* result
				+ (getCbattemplate() == null ? 0 : this.getCbattemplate()
						.hashCode());
		return result;
	}

}