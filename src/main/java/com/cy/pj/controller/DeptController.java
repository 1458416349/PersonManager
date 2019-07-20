package com.cy.pj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.common.vo.JsonResult;
import com.cy.pj.pojo.SysDept;
import com.cy.pj.service.DeptService;

@Controller
@RequestMapping("/log/")
public class DeptController {
	
	@Autowired
	DeptService deptService;
	
	/**
	 * 添加部门信息
	 * @param entity
	 * @return
	 */
	@RequestMapping("doSaveSaveObject")
	@ResponseBody
	public JsonResult doSaveobject(SysDept entity) {
		deptService.saveObject(entity);
		return new JsonResult("save ok");		
	}

}
