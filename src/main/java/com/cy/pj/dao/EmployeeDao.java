package com.cy.pj.dao;



import org.apache.ibatis.annotations.Mapper;
import com.cy.pj.pojo.SysEmployee;


@Mapper
public interface EmployeeDao {
	/**
	 * 添加员工信息
	 * @param entity
	 * @return
	 */	
	int insertEmployee(SysEmployee entity);
	
	/*** 根据输入的部门名称，查询员工信息 */

	
}
