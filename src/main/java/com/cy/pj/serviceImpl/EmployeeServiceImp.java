package com.cy.pj.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.common.exception.ServiceException;
import com.cy.pj.dao.EmployeeDao;
import com.cy.pj.pojo.SysEmployee;
import com.cy.pj.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	/**
	 * 添加员工信息
	 * @param entity
	 * @return
	 */	
	@Override
	public int saveObject(SysEmployee entity) {
		if(entity==null)
			throw new IllegalArgumentException("保存对象不能为空");
			if(entity.getEmCreateName()==null)
				throw new IllegalArgumentException("应聘人员姓名不能为空");
			int rows;
			try {
				rows=employeeDao.insertEmployee(entity);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServiceException("save erro");			
			}
			return rows;
	}


	
}
