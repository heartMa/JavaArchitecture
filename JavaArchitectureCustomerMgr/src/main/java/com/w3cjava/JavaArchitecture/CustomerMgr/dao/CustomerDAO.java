package com.w3cjava.JavaArchitecture.CustomerMgr.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.w3cjava.JavaArchitecture.CustomerMgr.vo.CustomerModel;
import com.w3cjava.JavaArchitecture.CustomerMgr.vo.CustomerQueryModel;
@Repository
public interface CustomerDAO {
	public void create(CustomerModel cm);
	public void update(CustomerModel cm);
	public void delete(int uuid);
	public CustomerModel getByUuid(int uuid);
	public List<CustomerModel> getByConditionPage(CustomerQueryModel cqm);
}
