package com.cvnchina.test.entity;

import java.sql.Timestamp;

/**
 * Syncalarmstatdata entity. @author MyEclipse Persistence Tools
 */

public class Syncalarmstatdata implements java.io.Serializable {

	// Fields

	private Integer id;
	private String areacode;
	private Integer alarmlevel1;
	private Integer alarmlevel2;
	private Integer alarmlevel3;
	private Integer alarmlevel4;
	private Integer alarmlevel5;
	private Integer alarmlevel6;
	private Integer alarmlevel7;
	private Timestamp stattime;

	// Constructors

	/** default constructor */
	public Syncalarmstatdata() {
	}

	/** full constructor */
	public Syncalarmstatdata(String areacode, Integer alarmlevel1,
			Integer alarmlevel2, Integer alarmlevel3, Integer alarmlevel4,
			Integer alarmlevel5, Integer alarmlevel6, Integer alarmlevel7,
			Timestamp stattime) {
		this.areacode = areacode;
		this.alarmlevel1 = alarmlevel1;
		this.alarmlevel2 = alarmlevel2;
		this.alarmlevel3 = alarmlevel3;
		this.alarmlevel4 = alarmlevel4;
		this.alarmlevel5 = alarmlevel5;
		this.alarmlevel6 = alarmlevel6;
		this.alarmlevel7 = alarmlevel7;
		this.stattime = stattime;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAreacode() {
		return this.areacode;
	}

	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}

	public Integer getAlarmlevel1() {
		return this.alarmlevel1;
	}

	public void setAlarmlevel1(Integer alarmlevel1) {
		this.alarmlevel1 = alarmlevel1;
	}

	public Integer getAlarmlevel2() {
		return this.alarmlevel2;
	}

	public void setAlarmlevel2(Integer alarmlevel2) {
		this.alarmlevel2 = alarmlevel2;
	}

	public Integer getAlarmlevel3() {
		return this.alarmlevel3;
	}

	public void setAlarmlevel3(Integer alarmlevel3) {
		this.alarmlevel3 = alarmlevel3;
	}

	public Integer getAlarmlevel4() {
		return this.alarmlevel4;
	}

	public void setAlarmlevel4(Integer alarmlevel4) {
		this.alarmlevel4 = alarmlevel4;
	}

	public Integer getAlarmlevel5() {
		return this.alarmlevel5;
	}

	public void setAlarmlevel5(Integer alarmlevel5) {
		this.alarmlevel5 = alarmlevel5;
	}

	public Integer getAlarmlevel6() {
		return this.alarmlevel6;
	}

	public void setAlarmlevel6(Integer alarmlevel6) {
		this.alarmlevel6 = alarmlevel6;
	}

	public Integer getAlarmlevel7() {
		return this.alarmlevel7;
	}

	public void setAlarmlevel7(Integer alarmlevel7) {
		this.alarmlevel7 = alarmlevel7;
	}

	public Timestamp getStattime() {
		return this.stattime;
	}

	public void setStattime(Timestamp stattime) {
		this.stattime = stattime;
	}

}