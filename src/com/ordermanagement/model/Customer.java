package com.ordermanagement.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private String tel;
	private Integer authentication;
	private String cname;
	private Double credit;
	private Double longitude;
	private Double latitude;
	private Date registerTime;
	private Double totalConsumption;
	private Set addresses = new HashSet(0);
	private Set orders = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer id, String username, String password, String tel,
			Integer authentication, String cname, Double credit,
			Double longitude, Double latitude, Date registerTime,
			Double totalConsumption) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.tel = tel;
		this.authentication = authentication;
		this.cname = cname;
		this.credit = credit;
		this.longitude = longitude;
		this.latitude = latitude;
		this.registerTime = registerTime;
		this.totalConsumption = totalConsumption;
	}

	/** full constructor */
	public Customer(Integer id, String username, String password, String tel,
			Integer authentication, String cname, Double credit,
			Double longitude, Double latitude, Date registerTime,
			Double totalConsumption, Set addresses, Set orders) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.tel = tel;
		this.authentication = authentication;
		this.cname = cname;
		this.credit = credit;
		this.longitude = longitude;
		this.latitude = latitude;
		this.registerTime = registerTime;
		this.totalConsumption = totalConsumption;
		this.addresses = addresses;
		this.orders = orders;
	}

	// Property accessors
	public String toJsonString(){
		JsonConfig jc=new JsonConfig();
		jc.setExcludes(new String[]{"addresses","orders"});
		JSONObject o=JSONObject.fromObject(this, jc);
		return o.toString();
	}
	public static Customer parseJsonString(String jsonString){
		JSONObject o = JSONObject.fromObject(jsonString);
		Customer c = new Customer();
		
		c.setId(o.optInt("id"));
		c.setAuthentication(o.optInt("authentication"));
		c.setCname(o.optString("cname"));
		c.setCredit(o.optDouble("credit"));
		c.setLatitude(o.optDouble("latitude"));
		c.setLongitude(o.optDouble("longitude"));
		c.setPassword(o.optString("password"));
		JSONObject time=o.optJSONObject("registerTime");
		Date date=new Date(time.optLong("time"));
		System.out.println(date.toString());
		
		c.setRegisterTime(date);
		c.setTel(o.optString("tel"));
		c.setTotalConsumption(o.getDouble("totalConsumption"));
		c.setUsername(o.optString("username"));
		return c;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getAuthentication() {
		return this.authentication;
	}

	public void setAuthentication(Integer authentication) {
		this.authentication = authentication;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Double getCredit() {
		return this.credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Double getTotalConsumption() {
		return this.totalConsumption;
	}

	public void setTotalConsumption(Double totalConsumption) {
		this.totalConsumption = totalConsumption;
	}

	public Set getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set addresses) {
		this.addresses = addresses;
	}

	public Set getOrders() {
		return this.orders;
	}

	public void setOrders(Set orders) {
		this.orders = orders;
	}

}