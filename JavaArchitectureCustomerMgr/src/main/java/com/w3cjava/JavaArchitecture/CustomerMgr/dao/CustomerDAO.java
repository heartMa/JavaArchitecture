package com.w3cjava.JavaArchitecture.CustomerMgr.dao;
import org.springframework.stereotype.Repository;

import com.w3cjava.JavaArchitecture.CustomerMgr.vo.CustomerModel;
import com.w3cjava.JavaArchitecture.CustomerMgr.vo.CustomerQueryModel;
import com.w3cjava.JavaArchitecture.common.dao.BaseDAO;
@Repository
public interface CustomerDAO extends BaseDAO<CustomerModel, CustomerQueryModel>{
	
}
