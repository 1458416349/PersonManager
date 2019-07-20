package com.cy.pj.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.cy.pj.common.exception.ServiceException;
import com.cy.pj.dao.ApplicantDao;
import com.cy.pj.pojo.SysInviteJob;
import com.cy.pj.service.ApplicantService;


@Service
public class ApplicantServiceImp implements ApplicantService {
	@Autowired
	ApplicantDao applicantDao;
	/**
	 * 对应聘人信息进行保存
	 * @throws IllegalAccessException 
	 */
	@Override
	public int saveApplicantMes(SysInviteJob entity){
		if(entity==null)
			throw new IllegalArgumentException("保存对象不能为空");
		if(StringUtils.isEmpty(entity.getName()))
			throw new IllegalArgumentException("应聘人员姓名不能为空");
		//将对象写入到数据库
		int rows=0;
		try {
			rows=applicantDao.insertApplicantMes(entity);
		}catch(Throwable e){
			e.printStackTrace();
			throw new ServiceException("save error");
		}				
		return rows;
	}





}
