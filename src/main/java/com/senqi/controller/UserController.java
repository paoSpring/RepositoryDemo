package com.senqi.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.dubbo.config.annotation.Reference;
import com.senqi.service.IUserService;
@Controller
public class UserController {
	@Reference
	private IUserService userService;	
	@RequestMapping("/showName")
	@ResponseBody
	public String showName(){
		return userService.getName();
	}
}