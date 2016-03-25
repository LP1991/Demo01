package com.cvnchina.test.entity;

/**
 * Eocportstatustable entity. @author MyEclipse Persistence Tools
 */

public class Eocportstatustable implements java.io.Serializable {

	// Fields

	private EocportstatustableId id;
	private Integer eocPortStatusLinkStatus;
	private Integer cnuCfgPortCfgVlanId;
	private Short cnuCfgPortCfgVlanMode;

	// Constructors

	/** default constructor */
	public Eocportstatustable() {
	}

	/** minimal constructor */
	public Eocportstatustable(EocportstatustableId id,
			Integer eocPortStatusLinkStatus) {
		this.id = id;
		this.eocPortStatusLinkStatus = eocPortStatusLinkStatus;
	}

	/** full constructor */
	public Eocportstatustable(EocportstatustableId id,
			Integer eocPortStatusLinkStatus, Integer cnuCfgPortCfgVlanId,
			Short cnuCfgPortCfgVlanMode) {
		this.id = id;
		this.eocPortStatusLinkStatus = eocPortStatusLinkStatus;
		this.cnuCfgPortCfgVlanId = cnuCfgPortCfgVlanId;
		this.cnuCfgPortCfgVlanMode = cnuCfgPortCfgVlanMode;
	}

	// Property accessors

	public EocportstatustableId getId() {
		return this.id;
	}

	public void setId(EocportstatustableId id) {
		this.id = id;
	}

	public Integer getEocPortStatusLinkStatus() {
		return this.eocPortStatusLinkStatus;
	}

	public void setEocPortStatusLinkStatus(Integer eocPortStatusLinkStatus) {
		this.eocPortStatusLinkStatus = eocPortStatusLinkStatus;
	}

	public Integer getCnuCfgPortCfgVlanId() {
		return this.cnuCfgPortCfgVlanId;
	}

	public void setCnuCfgPortCfgVlanId(Integer cnuCfgPortCfgVlanId) {
		this.cnuCfgPortCfgVlanId = cnuCfgPortCfgVlanId;
	}

	public Short getCnuCfgPortCfgVlanMode() {
		return this.cnuCfgPortCfgVlanMode;
	}

	public void setCnuCfgPortCfgVlanMode(Short cnuCfgPortCfgVlanMode) {
		this.cnuCfgPortCfgVlanMode = cnuCfgPortCfgVlanMode;
	}

}