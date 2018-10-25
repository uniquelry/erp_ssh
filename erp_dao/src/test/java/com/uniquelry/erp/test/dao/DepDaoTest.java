package com.uniquelry.erp.test.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.uniquelry.erp.dao.IDepDao;

/**
 * @author uniquelry
 * @Date 2018年7月28日 上午12:01:15
 * @Description 
 */
public class DepDaoTest {
	@Test
	public void TestDep() {
		ApplicationContext ac=new ClassPathXmlApplicationContext("classpath*:applicationContext_*.xml");
		IDepDao depDao=(IDepDao) ac.getBean("depDao");
		System.out.println(depDao.getList().size());
	}
}
