package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.servce.IWHUserTypeService;
@Controller
@RequestMapping("/user")
public class WHUsrTypeController {

		@Autowired 
		private IWHUserTypeService service; 
		@RequestMapping("/reg")
	    public String showReg()
	    {
			return "WHUserTypeRegister";
	    }
}
