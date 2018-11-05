package com.w3cjava.JavaArchitecture.CustomerMgr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.w3cjava.JavaArchitecture.CustomerMgr.dao.CustomerDAO;
import com.w3cjava.JavaArchitecture.CustomerMgr.vo.CustomerModel;

@Service
public class SpringMybatisTest {
	@Autowired
	private CustomerDAO customerDAO = null;
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		SpringMybatisTest t = (SpringMybatisTest)ctx.getBean("springMybatisTest");
		CustomerModel cm = new CustomerModel();
		cm.setCustomerId("c1");
		cm.setPwd("c1");
		cm.setRegisterTime("111");
		cm.setShowName("c1");
		cm.setTrueName("张三");
		t.customerDAO.create(cm);
		
	}
}
