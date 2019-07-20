package com.cy.pj.pojo;

import java.io.Serializable;

import lombok.Data;
/**
 * 部门信息
 * @author Administrator
 *
 */

@Data
public class SysDept implements Serializable {	
	private static final long serialVersionUID = 1L;
	private int id;
	private String dtName;
	private String dtCreateTime;
	private String dtBz;
}
