package com.cvnchina.test.entity;

import java.sql.Timestamp;

/**
 * Syncnestatdata entity. @author MyEclipse Persistence Tools
 */

public class Syncnestatdata implements java.io.Serializable {

	// Fields

	private Integer id;
	private String areacode;
	private Integer eocnum;
	private Integer eocterminalnum;
	private Integer cmtsnum;
	private Integer cmnum;
	private Integer oltnum;
	private Integer onunum;
	private Integer tr069num;
	private Timestamp stattime;

	// Constructors

	/** default constructor */
	public Syncnestatdata() {
	}

	/** full constructor */
	public Syncnestatdata(String areacode, Integer eocnum,
			Integer eocterminalnum, Integer cmtsnum, Integer cmnum,
			Integer oltnum, Integer onunum, Integer tr069num, Timestamp stattime) {
		this.areacode = areacode;
		this.eocnum = eocnum;
		this.eocterminalnum = eocterminalnum;
		this.cmtsnum = cmtsnum;
		this.cmnum = cmnum;
		this.oltnum = oltnum;
		this.onunum = onunum;
		this.tr069num = tr069num;
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

	public Integer getEocnum() {
		return this.eocnum;
	}

	public void setEocnum(Integer eocnum) {
		this.eocnum = eocnum;
	}

	public Integer getEocterminalnum() {
		return this.eocterminalnum;
	}

	public void setEocterminalnum(Integer eocterminalnum) {
		this.eocterminalnum = eocterminalnum;
	}

	public Integer getCmtsnum() {
		return this.cmtsnum;
	}

	public void setCmtsnum(Integer cmtsnum) {
		this.cmtsnum = cmtsnum;
	}

	public Integer getCmnum() {
		return this.cmnum;
	}

	public void setCmnum(Integer cmnum) {
		this.cmnum = cmnum;
	}

	public Integer getOltnum() {
		return this.oltnum;
	}

	public void setOltnum(Integer oltnum) {
		this.oltnum = oltnum;
	}

	public Integer getOnunum() {
		return this.onunum;
	}

	public void setOnunum(Integer onunum) {
		this.onunum = onunum;
	}

	public Integer getTr069num() {
		return this.tr069num;
	}

	public void setTr069num(Integer tr069num) {
		this.tr069num = tr069num;
	}

	public Timestamp getStattime() {
		return this.stattime;
	}

	public void setStattime(Timestamp stattime) {
		this.stattime = stattime;
	}

}