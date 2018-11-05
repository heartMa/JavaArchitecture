package com.w3cjava.JavaArchitecture.CustomerMgr;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.w3cjava.JavaArchitecture.CustomerMgr.dao.CustomerDAO;
import com.w3cjava.JavaArchitecture.CustomerMgr.vo.CustomerModel;

@Service
public class CustomerMgrDaoTest {
	@Autowired
	private CustomerDAO customerDAO = null;
	ApplicationContext ctx = null;
	CustomerMgrDaoTest t = null;
	
	@Before
	public void before(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		t = (CustomerMgrDaoTest)ctx.getBean("customerMgrDaoTest");
	}
	@Test
	public void testDaoCreate(){
		CustomerModel cm = new CustomerModel();
		cm.setCustomerId("c1");
		cm.setPwd("c1");
		cm.setRegisterTime("111");
		cm.setShowName("c1");
		cm.setTrueName("张三");
		t.customerDAO.create(cm);
	}
}
