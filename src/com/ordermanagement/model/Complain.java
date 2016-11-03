package com.ordermanagement.model;

/**
 * Complain entity. @author MyEclipse Persistence Tools
 */

public class Complain implements java.io.Serializable {

	// Fields

	private Integer id;
	private Order order;
	private Boolean type;
	private String title;
	private String content;
	private String result;

	// Constructors

	/** default constructor */
	public Complain() {
	}

	/** minimal constructor */
	public Complain(Integer id, Order order, Boolean type, String title,
			String content) {
		this.id = id;
		this.order = order;
		this.type = type;
		this.title = title;
		this.content = content;
	}

	/** full constructor */
	public Complain(Integer id, Order order, Boolean type, String title,
			String content, String result) {
		this.id = id;
		this.order = order;
		this.type = type;
		this.title = title;
		this.content = content;
		this.result = result;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Boolean getType() {
		return this.type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

}