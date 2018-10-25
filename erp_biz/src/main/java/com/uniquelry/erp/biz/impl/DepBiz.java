package com.uniquelry.erp.biz.impl;

import java.util.List;

import com.uniquelry.erp.biz.IDepBiz;
import com.uniquelry.erp.dao.IDepDao;
import com.uniquelry.erp.entity.Dep;

/**
 * @author uniquelry
 * @Date 2018年7月28日 上午12:20:22
 * @Description 
 */
public class DepBiz implements IDepBiz{
	
	/**
	 * 数据访问注入
	 */
	private IDepDao depDao;
	
	public void setDepDao(IDepDao depDao) {
		this.depDao = depDao;
	}

	@Override
	public List<Dep> getList() {
		return depDao.getList();
	}

}
