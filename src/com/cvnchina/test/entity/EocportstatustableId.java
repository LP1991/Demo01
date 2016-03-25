package com.cvnchina.test.entity;

/**
 * EocportstatustableId entity. @author MyEclipse Persistence Tools
 */

public class EocportstatustableId implements java.io.Serializable {

	// Fields

	private Integer neid;
	private Integer port;

	// Constructors

	/** default constructor */
	public EocportstatustableId() {
	}

	/** full constructor */
	public EocportstatustableId(Integer neid, Integer port) {
		this.neid = neid;
		this.port = port;
	}

	// Property accessors

	public Integer getNeid() {
		return this.neid;
	}

	public void setNeid(Integer neid) {
		this.neid = neid;
	}

	public Integer getPort() {
		return this.port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EocportstatustableId))
			return false;
		EocportstatustableId castOther = (EocportstatustableId) other;

		return ((this.getNeid() == castOther.getNeid()) || (this.getNeid() != null
				&& castOther.getNeid() != null && this.getNeid().equals(
				castOther.getNeid())))
				&& ((this.getPort() == castOther.getPort()) || (this.getPort() != null
						&& castOther.getPort() != null && this.getPort()
						.equals(castOther.getPort())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getNeid() == null ? 0 : this.getNeid().hashCode());
		result = 37 * result
				+ (getPort() == null ? 0 : this.getPort().hashCode());
		return result;
	}

}