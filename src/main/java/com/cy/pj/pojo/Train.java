package com.cy.pj.pojo;

import java.io.Serializable;

public class Train implements Serializable{
	private static final long serialVersionUID = -4720907958038965430L;
	private Integer id;
	private String tnMan;
	private String tnTitle;
	private String tnContent;
	private String tnTime;
	private String tnAddress;
	private String tnJoin;
	private String tnBz;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTnMan() {
		return tnMan;
	}
	public void setTnMan(String tnMan) {
		this.tnMan = tnMan;
	}
	public String getTnTitle() {
		return tnTitle;
	}
	public void setTnTitle(String tnTitle) {
		this.tnTitle = tnTitle;
	}
	public String getTnContent() {
		return tnContent;
	}
	public void setTnContent(String tnContent) {
		this.tnContent = tnContent;
	}
	public String getTnTime() {
		return tnTime;
	}
	public void setTnTime(String tnTime) {
		this.tnTime = tnTime;
	}
	public String getTnAddress() {
		return tnAddress;
	}
	public void setTnAddress(String tnAddress) {
		this.tnAddress = tnAddress;
	}
	public String getTnJoin() {
		return tnJoin;
	}
	public void setTnJoin(String tnJoin) {
		this.tnJoin = tnJoin;
	}
	public String getTnBz() {
		return tnBz;
	}
	public void setTnBz(String tnBz) {
		this.tnBz = tnBz;
	}
	
}
