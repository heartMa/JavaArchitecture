package com.w3cjava;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.w3cjava.JavaArchitecture.CustomerMgr.CustomerMgrDaoTest;
import com.w3cjava.JavaArchitecture.CustomerMgr.CustomerMgrServiceTest;


@RunWith(Suite.class)
@Suite.SuiteClasses({
	CustomerMgrDaoTest.class,
	CustomerMgrServiceTest.class
})
public class TestAllSuite {

}
