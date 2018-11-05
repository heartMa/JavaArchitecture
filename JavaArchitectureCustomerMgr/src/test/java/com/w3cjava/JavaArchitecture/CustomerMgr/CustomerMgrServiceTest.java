package com.w3cjava.JavaArchitecture.CustomerMgr;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.w3cjava.JavaArchitecture.CustomerMgr.dao.CustomerDAO;
import com.w3cjava.JavaArchitecture.CustomerMgr.service.ICustomerService;
import com.w3cjava.JavaArchitecture.CustomerMgr.vo.CustomerModel;
import com.w3cjava.JavaArchitecture.CustomerMgr.vo.CustomerQueryModel;
import com.w3cjava.pageutil.Page;

@Service
public class CustomerMgrServiceTest {
	@Autowired
	private ICustomerService s = null;
	ApplicationContext ctx = null;
	CustomerMgrServiceTest t = null;
	public ICustomerService getS(){
		return s;
	}
	
	@Before
	public void before(){
		ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		t = (CustomerMgrServiceTest)ctx.getBean("customerMgrServiceTest");
	}
	
	@Test
	public void testServiceCreate(){
		CustomerModel cm = new CustomerModel();
		cm.setCustomerId("c1");
		cm.setPwd("c1");
		cm.setRegisterTime("111");
		cm.setShowName("c1");
		cm.setTrueName("张三");
		t.s.create(cm);
		CustomerQueryModel cqm = new CustomerQueryModel();
		cqm.getPage().setNowPage(1);
		cqm.getPage().setPageShow(1);
		Page<CustomerModel> p = t.getS().getByConditionPage(cqm);
		System.out.println("list=="+p);
	}
	
	
	@Test
	public void testServiceQueryByPage(){
		CustomerQueryModel cqm = new CustomerQueryModel();
		cqm.getPage().setNowPage(1);
		cqm.getPage().setPageShow(1);
		Page<CustomerModel> p = t.getS().getByConditionPage(cqm);
		System.out.println("list=="+p);
		Page<CustomerModel> p2 = t.getS().getByConditionPage(cqm);
		System.out.println("list2222=="+p);		
	}
}
