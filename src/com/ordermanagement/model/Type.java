package com.ordermanagement.model;

import java.util.HashSet;
import java.util.Set;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * Type entity. @author MyEclipse Persistence Tools
 */

public class Type implements java.io.Serializable {

	// Fields

	private Integer id;
	private String tname;
	private double referencePrice;
	private Set produces = new HashSet(0);

	// Constructors
	
	public String toJsonString(){
		JsonConfig jc=new JsonConfig();
		jc.setExcludes(new String[]{"produces"});
		JSONObject json = JSONObject.fromObject(this, jc);
		return json.toString();
	}

	/** default constructor */
	public Type() {
	}

	/** minimal constructor */
	public Type(Integer id, String tname, Integer referencePrice) {
		this.id = id;
		this.tname = tname;
		this.referencePrice = referencePrice;
	}

	/** full constructor */
	public Type(Integer id, String tname, Integer referencePrice, Set produces) {
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

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}


	public double getReferencePrice() {
		return referencePrice;
	}

	public void setReferencePrice(double referencePrice) {
		this.referencePrice = referencePrice;
	}

	public Set getProduces() {
		return this.produces;
	}

	public void setProduces(Set produces) {
		this.produces = produces;
	}

}