package com.gangyu.tools;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author Chencongye
 * @version 0.0.0.1
 * @function 这是Hibernate工具帮手
 */

public class HibernateUtil {
	
	/**
	 * 创建sessionFactory变量，并初始化
	 */
	private static SessionFactory sessionFactory;
	
	/**
	 * 创建静态方法区域，读取hibernate的配置文件
	 */
	static{
		try {
			Configuration cfg = new Configuration().configure();
			sessionFactory = cfg.buildSessionFactory();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取到SessionFactory
	 */
	public static SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		return sessionFactory;
	}
	
	/**
	 * 获取到Session
	 */
	public static Session getSession() {
		// TODO Auto-generated method stub
		return sessionFactory.openSession();
	}
	
	/**
	 * 关闭Session
	 */
	public static void closeSession(Session session) throws HibernateException {
		// TODO Auto-generated method stub
		if(session!=null){
			if(session.isOpen()){
				session.close();
			}
		}
	}
	
	/**
	 * 关闭SessionFactory
	 */
	public static void closeSessionFactory(SessionFactory seFactory) throws HibernateException {
		// TODO Auto-generated method stub
		if (seFactory!=null) {
			seFactory.close();
		}
	}
	
	/**
	 * 进行事务回滚
	 */
	public static void rollback(Transaction tran) {
		// TODO Auto-generated method stub
		 try {
			if (tran!=null) {
				tran.rollback();
			}
		} catch (HibernateException he) {
			// TODO Auto-generated catch block
			he.printStackTrace();
			System.out.println("" + he);
		}
	}
}
