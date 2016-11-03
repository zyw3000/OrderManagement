package com.ordermanagement.model;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */

public class Address implements java.io.Serializable {

	// Fields

	private Integer id;
	private Customer customer;
	private Integer tel;
	private String address;
	private String name;

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** full constructor */
	public Address(Integer id, Customer customer, Integer tel, String address,
			String name) {
		this.id = id;
		this.customer = customer;
		this.tel = tel;
		this.address = address;
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Integer getTel() {
		return this.tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}