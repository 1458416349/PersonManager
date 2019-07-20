package com.cy.pj.dao;

import org.apache.ibatis.annotations.Mapper;
import com.cy.pj.pojo.SysInviteJob;

@Mapper
public interface ApplicantDao {
	/**
	 * 添加应聘人信息
	 * @param entity
	 * @return
	 */
	int insertApplicantMes(SysInviteJob entity);
}
