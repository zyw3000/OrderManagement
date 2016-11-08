package com.ordermanagement.model;

import java.util.HashSet;
import java.util.Set;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * Produce entity. @author MyEclipse Persistence Tools
 */

public class Produce implements java.io.Serializable {

	// Fields

	private Integer id;
	private Type type;
	private Enterprise enterprise;
	private String picture;
	private String introduction;
	private String pname;
	private Double price;
	private String favourable;
	private Integer status;
	private Integer number;
	private Double score;
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Produce() {
	}

	/** minimal constructor */
	public Produce(Integer id, Type type, Enterprise enterprise,
			String picture, String pname, Double price, String favourable,
			Integer status, Integer number, Double score) {
		this.id = id;
		this.type = type;
		this.enterprise = enterprise;
		this.picture = picture;
		this.pname = pname;
		this.price = price;
		this.favourable = favourable;
		this.status = status;
		this.number = number;
		this.score = score;
	}
	
	public String toJsonString(){
		JsonConfig jc=new JsonConfig();
		jc.setExcludes(new String[]{"orders","enterprise","type"});
		JSONObject json = JSONObject.fromObject(this, jc);
		return json.toString();
	}

	/** full constructor */
	public Produce(Integer id, Type type, Enterprise enterprise,
			String picture, String introduction, String pname, Double price,
			String favourable, Integer status, Integer number, Double score,
			Set orders) {
		this.id = id;
		this.type = type;
		this.enterprise = enterprise;
		this.picture = picture;
		this.introduction = introduction;
		this.pname = pname;
		this.price = price;
		this.favourable = favourable;
		this.status = status;
		this.number = number;
		this.score = score;
		this.orders = orders;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getFavourable() {
		return this.favourable;
	}

	public void setFavourable(String favourable) {
		this.favourable = favourable;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getScore() {
		return this.score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}