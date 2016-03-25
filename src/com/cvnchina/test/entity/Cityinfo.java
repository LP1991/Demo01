package com.cvnchina.test.entity;

/**
 * Cityinfo entity. @author MyEclipse Persistence Tools
 */

public class Cityinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String city;
	private String province;
	private String phoneareacode;

	// Constructors

	/** default constructor */
	public Cityinfo() {
	}

	/** full constructor */
	public Cityinfo(String city, String province, String phoneareacode) {
		this.city = city;
		this.province = province;
		this.phoneareacode = phoneareacode;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPhoneareacode() {
		return this.phoneareacode;
	}

	public void setPhoneareacode(String phoneareacode) {
		this.phoneareacode = phoneareacode;
	}

}