package com.ordermanagement.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

/**
 * Enterprise entity. @author MyEclipse Persistence Tools
 */

public class Enterprise implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String password;
	private Double longitude;
	private Double latitude;
	private String address;
	private String ename;
	private String tel;
	private String manager;
	private String registrationNumber;
	private String licensePhoto;
	private String photo;
	private Double credit;
	private Integer authentication;
	private Date registerTime;
	private Set produces = new HashSet(0);

	// Constructors

	/** default constructor */
	public Enterprise() {
	}

	/** minimal constructor */
	public Enterprise(Integer id, String username, String password,
			Double longitude, Double latitude, String address, String ename,
			String tel, String manager, String registrationNumber,
			String licensePhoto, String photo, Integer authentication,
			Date registerTime) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.longitude = longitude;
		this.latitude = latitude;
		this.address = address;
		this.ename = ename;
		this.tel = tel;
		this.manager = manager;
		this.registrationNumber = registrationNumber;
		this.licensePhoto = licensePhoto;
		this.photo = photo;
		this.authentication = authentication;
		this.registerTime = registerTime;
	}

	/** full constructor */
	public Enterprise(Integer id, String username, String password,
			Double longitude, Double latitude, String address, String ename,
			String tel, String manager, String registrationNumber,
			String licensePhoto, String photo, Double credit,
			Integer authentication, Date registerTime, Set produces) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.longitude = longitude;
		this.latitude = latitude;
		this.address = address;
		this.ename = ename;
		this.tel = tel;
		this.manager = manager;
		this.registrationNumber = registrationNumber;
		this.licensePhoto = licensePhoto;
		this.photo = photo;
		this.credit = credit;
		this.authentication = authentication;
		this.registerTime = registerTime;
		this.produces = produces;
	}

	// Property accessors

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

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getLicensePhoto() {
		return this.licensePhoto;
	}

	public void setLicensePhoto(String licensePhoto) {
		this.licensePhoto = licensePhoto;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Double getCredit() {
		return this.credit;
	}

	public void setCredit(Double credit) {
		this.credit = credit;
	}

	public Integer getAuthentication() {
		return this.authentication;
	}

	public void setAuthentication(Integer authentication) {
		this.authentication = authentication;
	}

	public Date getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public Set getProduces() {
		return this.produces;
	}

	public void setProduces(Set produces) {
		this.produces = produces;
	}
	
	public void update(Enterprise enterprise){
	
	}

	public String toJsonString() {
		JsonConfig jc=new JsonConfig();
		jc.setExcludes(new String[]{"produces"});
		JSONObject o = JSONObject.fromObject(this,jc);
		return o.toString();
	}
	
	public static Enterprise parseJsonString(String JsonString){
		JSONObject json = JSONObject.fromObject(JsonString);
		Enterprise e = new Enterprise();
		
		e.setId(json.optInt("id"));
		e.setUsername(json.optString("username"));
		e.setPassword(json.optString("password"));
		e.setLongitude(json.optDouble("longitude"));
		e.setLatitude(json.optDouble("latitude"));
		e.setAddress(json.optString("address"));
		e.setEname(json.optString("ename"));
		e.setTel(json.optString("tel"));
		e.setManager(json.optString("manager"));
		e.setRegistrationNumber(json.optString("registrationNumber"));
		e.setLicensePhoto(json.getString("licensePhoto"));
		e.setPhoto(json.optString("photo"));
		e.setCredit(json.optDouble("credit"));
		e.setAuthentication(json.optInt("authentication"));

		JSONObject time = json.optJSONObject("registertime");
		Date date = new Date(time.optLong("time"));
		e.setRegisterTime(date);
		return e;
	}

}