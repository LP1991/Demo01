package com.cvnchina.test.entity;

/**
 * GroupoffRelaId entity. @author MyEclipse Persistence Tools
 */

public class GroupoffRelaId implements java.io.Serializable {

	// Fields

	private Rgroup rgroup;
	private Offlinetemplate offlinetemplate;

	// Constructors

	/** default constructor */
	public GroupoffRelaId() {
	}

	/** full constructor */
	public GroupoffRelaId(Rgroup rgroup, Offlinetemplate offlinetemplate) {
		this.rgroup = rgroup;
		this.offlinetemplate = offlinetemplate;
	}

	// Property accessors

	public Rgroup getRgroup() {
		return this.rgroup;
	}

	public void setRgroup(Rgroup rgroup) {
		this.rgroup = rgroup;
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
		if (!(other instanceof GroupoffRelaId))
			return false;
		GroupoffRelaId castOther = (GroupoffRelaId) other;

		return ((this.getRgroup() == castOther.getRgroup()) || (this
				.getRgroup() != null && castOther.getRgroup() != null && this
				.getRgroup().equals(castOther.getRgroup())))
				&& ((this.getOfflinetemplate() == castOther
						.getOfflinetemplate()) || (this.getOfflinetemplate() != null
						&& castOther.getOfflinetemplate() != null && this
						.getOfflinetemplate().equals(
								castOther.getOfflinetemplate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRgroup() == null ? 0 : this.getRgroup().hashCode());
		result = 37
				* result
				+ (getOfflinetemplate() == null ? 0 : this.getOfflinetemplate()
						.hashCode());
		return result;
	}

}