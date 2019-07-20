package com.cy.pj.service;

import com.cy.pj.pojo.SysInviteJob;



public interface ApplicantService {
	
	/**
	 * 保存插入的应聘者信息
	 * @param entity
	 * @return
	 */
	int saveApplicantMes(SysInviteJob entity);
}
