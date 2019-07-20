package com.cy.pj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.pj.common.vo.JsonResult;
import com.cy.pj.pojo.SysInviteJob;
import com.cy.pj.service.ApplicantService;





@RestController
@RequestMapping("/log/")
public class ApplicantController {
	
	@Autowired
	ApplicantService applicantService;
	
	/**
	 * 保存应聘人信息
	 * @param entity
	 * @return
	 */
	@RequestMapping("doSaveObject")
	public JsonResult doSaveObject(SysInviteJob entity) {
		applicantService.saveApplicantMes(entity);
		return new JsonResult("save ok");	
	}


}
