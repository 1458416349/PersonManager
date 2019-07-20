package com.cy.pj.dao;

import org.apache.ibatis.annotations.Mapper;
import com.cy.pj.pojo.SysDept;

@Mapper
public interface DeptDao {
	/**
	 * 添加部门信息
	 * @param entity
	 * @return
	 */
	int insertDept(SysDept entity);
}
