package com.cy.pj.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 应聘人信息
 * @author Administrator
 *
 */
@Data
public class SysInviteJob implements Serializable{	
	private static final long serialVersionUID = 1L;	
	private int id ;	
	private String name;
	private int age;
	private String specialty;
	private String experience;
	private String tel;
	private String address;
	private String sex;
	private String born;
	private String teachSchool;
	private String afterSchool;
	private String createtime;
	private String content;
	private int isstock;
	private String job;
	
	
}
