package com.cy.pj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.cy.pj.common.vo.JsonResult;
import com.cy.pj.pojo.SysEmployee;
import com.cy.pj.service.EmployeeService;


@Controller
@RequestMapping("/log/")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	
	@RequestMapping("doSaveObject")
	@ResponseBody
	public JsonResult doSaveObject(SysEmployee entity) {
		employeeService.saveObject(entity);		
		return new JsonResult("save ok");
		
	}
	/**点击员工管理时加载*/
	 @RequestMapping("doEmployeeListUI")
	  public String doEmployeeListUI(){
		  return "sys/employee_list";
	  }
	 
	 
	 /**页面加载完成后，加载分页*/
	 @RequestMapping("doPageUI")
	 public String doPageUI(){
	 	 return "common/page";
	  }

}
