package come.hjw.home.hello.service;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRun {
	public static void main(String[] args) throws IOException {
		 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
	     context.start(); 
	     System.out.println( "服务提供者启动（按任意键退出或在console窗口中停止）:" );   
	     System.in.read();   
	     System.out.println( "已退出:" );  
	}
}
