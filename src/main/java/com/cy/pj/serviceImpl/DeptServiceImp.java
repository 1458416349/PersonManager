package com.cy.pj.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.common.exception.ServiceException;
import com.cy.pj.dao.DeptDao;
import com.cy.pj.pojo.SysDept;
import com.cy.pj.service.DeptService;

@Service
public class DeptServiceImp implements DeptService {
	
	@Autowired
	DeptDao deptDao;

	/**
	 * 添加部门信息
	 */
	@Override
	public int saveObject(SysDept entity) {
		if(entity==null)
		throw new IllegalArgumentException("保存对象不能为空");
		if(entity.getDtName()==null)
			throw new IllegalArgumentException("应聘人员姓名不能为空");
		int rows;
		try {
			rows=deptDao.insertDept(entity);
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServiceException("save erro");			
		}
		return rows;
	}
	
	
}
