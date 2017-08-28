package com.gangyu.dao.imp;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.gangyu.dao.CustomerCareDao;
import com.gangyu.model.CustomerCareInfo;
import com.gangyu.tools.HibernateUtil;

/**
 * @author Chencongye
 * @version 0.0.0.1
 * @remark 这是关注客户的dao层实现过程
 */
public class CustomerCareDAOImpl implements CustomerCareDao {
	
	//创建SessionFactory全局变量	
	private SessionFactory sessionFactory;
	//创建Session全局变量
	private Session session;
	//创建Transaction全局变量
	private Transaction tx;
	//创建全局变量
	private Query query;
	//初始化HibernateUtil
	HibernateUtil util = null;
	
	@Override
	public List<CustomerCareInfo> getList(String customerInput, String queryType) {
		// TODO Auto-generated method stub
		
		return null;
	}

	/**
	 * @author Chencongye
	 * @remark 获得关注用户信息
	 */
	@Override
	public CustomerCareInfo getCare(int careId) {
		// TODO Auto-generated method stub
		
		CustomerCareInfo cci = null;
		try {
			sessionFactory = util.getSessionFactory();
			session = sessionFactory.openSession();
			
			session.beginTransaction();
			String querybyid_sql = "from CustomerCareInfo where careId=?"; 
			query = session.createQuery(querybyid_sql);
			query.setInteger(0, careId);
			
			cci = (CustomerCareInfo) query.uniqueResult();
			
			query = null;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(tx!=null)
			{
				tx.rollback();
			}
			util.closeSession(session);
			/*util.closeSessionFactory(sessionFactory);*/
		}
		
		return cci;
	}

	/**
	 * @author Chencongye
	 * @remark 添加一个关注用户到数据库中
	 */
	@Override
	public boolean add(CustomerCareInfo careInfo) {
		// TODO Auto-generated method stub
		
		try {
			//获取到sessionFactory			
			sessionFactory = util.getSessionFactory();
			//获取到session			
			session = sessionFactory.openSession();
			//session开启事务
			tx = session.beginTransaction();
			
			//进行添加关注用户的信息				
			session.save(careInfo);
			
			//进行事务提交			
			tx.commit();
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if(tx!=null)
			{
				//如果事务不为空，那么进行回滚				
				tx.rollback();
				return false;
			}
			//打印异常信息
			e.printStackTrace();
		} finally {
			//关闭响应资源				
			try {
				if(session!=null)
				{
					if(session.isOpen())
					{
						session.close();
					}
				}
				/*if(sessionFactory!=null)
				{
					sessionFactory.close();
				}*/
			} catch (HibernateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	/**
	 * @author Chencongye
	 * @remark 根据关注的id删除对应的关注用户
	 */
	@Override
	public boolean delete(int careId) {
		// TODO Auto-generated method stub
		try {
			
			//获取到sessionFactory		
			sessionFactory = util.getSessionFactory();
			session = sessionFactory.openSession();
			
			tx = session.beginTransaction();
			
			String deleteid_sql = "delete from CustomerCareInfo where careId = ?";
			query = session.createQuery(deleteid_sql);
			query.setInteger(0, careId);
			
			query.executeUpdate();
			
			tx.commit();
			
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			if(tx!=null){
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			if(query!=null)
			{
				query = null;
			}
			util.closeSession(session);
			/*util.closeSessionFactory(sessionFactory);*/
		}
		return false;
	}

	@Override
	public boolean update(CustomerCareInfo careInfo,int careId) {
		// TODO Auto-generated method stub
		
		try {
			sessionFactory = util.getSessionFactory();
			session = sessionFactory.openSession();
			
			tx = session.beginTransaction();
			
			String update_sql = "update CustomerCareInfo set careTheme=?,careWay=?,customerId=?,careTime=?,careNexttime=?,careRemark=?, carePeople=? where careId=?";
			query = session.createQuery(update_sql);
			query.setString(0, careInfo.getCareTheme());
			query.setString(1, careInfo.getCareWay());
			query.setInteger(2, careInfo.getCustomerId());
			query.setTimestamp(3, careInfo.getCareTime());
			query.setTimestamp(4, careInfo.getCareNexttime());
			query.setString(5, careInfo.getCareRemark());
			query.setString(6, careInfo.getCarePeople());
			query.setInteger(7, careId);
			
			int i = query.executeUpdate();
			
			if (i>0) {
				return true;
			}
			//session.update(careInfo);
			
			tx.commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			if(tx!=null)
			{
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			util.closeSession(session);
		}
		
		return false;
	}

}
