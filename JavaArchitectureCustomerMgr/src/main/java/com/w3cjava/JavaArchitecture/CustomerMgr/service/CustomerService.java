package com.w3cjava.JavaArchitecture.CustomerMgr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.w3cjava.JavaArchitecture.CustomerMgr.dao.CustomerDAO;
import com.w3cjava.JavaArchitecture.CustomerMgr.vo.CustomerModel;
import com.w3cjava.JavaArchitecture.CustomerMgr.vo.CustomerQueryModel;
import com.w3cjava.JavaArchitecture.common.service.BaseService;
@Service
public class CustomerService extends BaseService<CustomerModel, CustomerQueryModel> implements ICustomerService {
	private CustomerDAO dao = null;
	@Autowired
	private void setDao(CustomerDAO dao){
		this.dao = dao;
		super.setDAO(dao);
	}
}
