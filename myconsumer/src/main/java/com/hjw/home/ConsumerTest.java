package com.hjw.home;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import come.hjw.home.hello.service.HelloService;
import come.hjw.home.user.bean.User;
import come.hjw.home.user.service.UserService;

public class ConsumerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");  
	    UserService userService=(UserService) context.getBean("userService"); 
	    User user=new User();
	    user.setId(111L);
	    user.setName("dubbotest");
	    userService.saveuser(user);
	    

	}
	
}
