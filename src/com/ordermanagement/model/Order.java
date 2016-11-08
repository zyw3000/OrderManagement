package com.ordermanagement.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Hibernate;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	private Integer id;
	private Customer customer;
	private Produce produce;
	private Integer number;
	private Double price;
	private Integer scoreEToC;
	private Integer scoreCToE;
	private Integer status;
	private Date createTime;
	private Date payTime;
	private Date finishTime;
	private Integer deliverType;
	private Integer courierNumber;
	private Integer payType;
	private String message;
	private Set complains = new HashSet(0);

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Integer id, Customer customer, Produce produce,
			Integer number, Double price, Integer scoreEToC, Integer scoreCToE,
			Integer status, Date createTime) {
		this.id = id;
		this.customer = customer;
		this.produce = produce;
		this.number = number;
		this.price = price;
		this.scoreEToC = scoreEToC;
		this.scoreCToE = scoreCToE;
		this.status = status;
		this.createTime = createTime;
	}

	/** full constructor */
	public Order(Integer id, Customer customer, Produce produce,
			Integer number, Double price, Integer scoreEToC, Integer scoreCToE,
			Integer status, Date createTime, Date payTime, Date finishTime,
			Integer deliverType, Integer courierNumber, Integer payType,
			String message, Set complains) {
		this.id = id;
		this.customer = customer;
		this.produce = produce;
		this.number = number;
		this.price = price;
		this.scoreEToC = scoreEToC;
		this.scoreCToE = scoreCToE;
		this.status = status;
		this.createTime = createTime;
		this.payTime = payTime;
		this.finishTime = finishTime;
		this.deliverType = deliverType;
		this.courierNumber = courierNumber;
		this.payType = payType;
		this.message = message;
		this.complains = complains;
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

	public Produce getProduce() {
		return this.produce;
	}

	public void setProduce(Produce produce) {
		this.produce = produce;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getScoreEToC() {
		return this.scoreEToC;
	}

	public void setScoreEToC(Integer scoreEToC) {
		this.scoreEToC = scoreEToC;
	}

	public Integer getScoreCToE() {
		return this.scoreCToE;
	}

	public void setScoreCToE(Integer scoreCToE) {
		this.scoreCToE = scoreCToE;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getPayTime() {
		return this.payTime;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}

	public Date getFinishTime() {
		return this.finishTime;
	}

	public void setFinishTime(Date finishTime) {
		this.finishTime = finishTime;
	}

	public Integer getDeliverType() {
		return this.deliverType;
	}

	public void setDeliverType(Integer deliverType) {
		this.deliverType = deliverType;
	}

	public Integer getCourierNumber() {
		return this.courierNumber;
	}

	public void setCourierNumber(Integer courierNumber) {
		this.courierNumber = courierNumber;
	}

	public Integer getPayType() {
		return this.payType;
	}

	public void setPayType(Integer payType) {
		this.payType = payType;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Set getComplains() {
		return this.complains;
	}

	public void setComplains(Set complains) {
		this.complains = complains;
	}
	
	//extra function

	public String toJsonString(){
//		JsonConfig jc = new JsonConfig();
//		jc.setExcludes(new String[]{"complains"});
//		JSONObject o = JSONObject.fromObject(this, jc);
		JSONObject json = new JSONObject();
		json.put("id",this.getId());
		json.put("number", this.getNumber());
		json.put("price", this.getPrice());
		json.put("scoreEToc", this.getScoreEToC());
		json.put("scoreCToe", this.getScoreCToE());
		json.put("status", this.getStatus());
		json.put("createTime", this.getCreateTime());
		json.put("payTime", this.getPayTime());
		json.put("finishTime", this.getFinishTime());
		json.put("deliverType", this.getDeliverType());
		json.put("courierNumber", this.getCourierNumber());
		json.put("payType", this.getPayType());
		json.put("message", this.getMessage());
		
		JsonConfig jc=new JsonConfig();
		jc.setExcludes(new String[]{"addresses","orders"});
		JSONObject customer = JSONObject.fromObject(this.getCustomer(), jc);
		json.put("customer", customer);
		
		
		JsonConfig jc2=new JsonConfig();
		jc2.setExcludes(new String[]{"type","enterprise","orders"});
		JSONObject produce = JSONObject.fromObject(this.getProduce(), jc2);
			JsonConfig jc3=new JsonConfig();
			jc3.setExcludes(new String[]{"produces"});
			JSONObject type = JSONObject.fromObject(this.getProduce().getType(), jc3);
			produce.put("type", type);
		json.put("produce", produce);
		
		return json.toString();
	}
	
	public static Order parseJsonString(String JsonString){
		JSONObject json = JSONObject.fromObject(JsonString);
		
//		order.pid = cmddeta.id;
//        order.cid = MainActivity.id;
//        order.number = number;
//        order.price = price;
//        order.status = 0;
//        order.createTime=date;
//        order.deliverType=i;
//        order.payType = i;
//        order.message = mMessageEditText.getText().toString();
		
		Order o = new Order();
		return o;
		
	}

}