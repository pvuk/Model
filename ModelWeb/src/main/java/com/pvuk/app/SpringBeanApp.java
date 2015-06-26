package com.pvuk.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pvuk.controller.bean.HelloWorldBean;

public class SpringBeanApp {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorldBean helloWorldBean = (HelloWorldBean) applicationContext.getBean("helloWorld");
		helloWorldBean.getMessage();
	}
}
