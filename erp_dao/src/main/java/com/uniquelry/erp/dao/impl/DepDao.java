package com.uniquelry.erp.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.uniquelry.erp.dao.IDepDao;
import com.uniquelry.erp.entity.Dep;

/**
 * @author uniquelry
 * @Date 2018年7月27日 下午11:53:32
 * @Description 部门的数据访问层
 */
public class DepDao extends HibernateDaoSupport implements IDepDao {
	
	/**
	 *查询所有的部门信息 
	 */
	@Override
	public List<Dep> getList() {
		return (List<Dep>) this.getHibernateTemplate().find("from Dep");
	}

}
