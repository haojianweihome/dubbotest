package com.hjw.home.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hjw.home.core.page.PageBean;
import com.hjw.home.core.page.PageParam;

import come.hjw.home.user.bean.User;
import come.hjw.home.user.service.UserService;
@Controller
@RequestMapping("/user/")
public class UserController {
	@Autowired
	private UserService userService;
	
	@ResponseBody
	@RequestMapping("test")
	public String testmvc() throws Exception{
		User user=new User();
		user.setId(8L);
		user.setName("admin1");
		user.setAge(15);
		user.setSex("鐢�");
		userService.saveuser(user);
		return "鎴愬姛";
	}
	
	@ResponseBody
	@RequestMapping("list")
	public PageBean list(PageParam pageParam){
		return userService.getalluser(pageParam);
	}
}
