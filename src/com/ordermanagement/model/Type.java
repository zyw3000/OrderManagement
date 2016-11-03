package com.ordermanagement.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Type entity. @author MyEclipse Persistence Tools
 */

public class Type implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer tname;
	private Integer referencePrice;
	private Set produces = new HashSet(0);

	// Constructors

	/** default constructor */
	public Type() {
	}

	/** minimal constructor */
	public Type(Integer id, Integer tname, Integer referencePrice) {
		this.id = id;
		this.tname = tname;
		this.referencePrice = referencePrice;
	}

	/** full constructor */
	public Type(Integer id, Integer tname, Integer referencePrice, Set produces) {
		this.id = id;
		this.tname = tname;
		this.referencePrice = referencePrice;
		this.produces = produces;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTname() {
		return this.tname;
	}

	public void setTname(Integer tname) {
		this.tname = tname;
	}

	public Integer getReferencePrice() {
		return this.referencePrice;
	}

	public void setReferencePrice(Integer referencePrice) {
		this.referencePrice = referencePrice;
	}

	public Set getProduces() {
		return this.produces;
	}

	public void setProduces(Set produces) {
		this.produces = produces;
	}

}