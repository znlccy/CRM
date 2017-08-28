package com.gangyu.dao.imp;

import static org.junit.Assert.*;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import com.gangyu.model.CustomerCareInfo;
import com.gangyu.service.CustomerCareService;
import com.gangyu.service.imp.CustomerCareServiceImpl;
import com.gangyu.tools.HibernateUtil;

public class CustomerCareDAOImplTest {

	@Test
	public void add() {
		
		CustomerCareInfo cci = new CustomerCareInfo();
		cci.setCareNexttime(new Date());
		cci.setCarePeople("李四");
		cci.setCareRemark("将军");
		cci.setCareTheme("欢迎将军莅临我军指导");
		cci.setCareWay("QQ新闻");
		cci.setCareTime(new Date());
		cci.setCustomerName("王二麻");
		cci.setIsUsed("0");
		
		CustomerCareService ccs = new CustomerCareServiceImpl();
		ccs.add(cci);
		
	}
	
	@Test
	public void getCare() {
		// TODO Auto-generated method stub
		CustomerCareInfo cci;
		CustomerCareService ccs = new CustomerCareServiceImpl();
		cci = ccs.getCare(13);
		System.out.println(cci.getCarePeople()+"\t"+cci.getCareRemark()+"\t"+cci.getCareTheme()+"\t"+cci.getCustomerName());
	}
	
	@Test
	public void delete() {
		// TODO Auto-generated method stub
		CustomerCareInfo cci = new CustomerCareInfo();
		CustomerCareService ccs = new CustomerCareServiceImpl();
		ccs.delete(0);
	}
	
	@Test
	public void update() {
		// TODO Auto-generated method stub
		CustomerCareService ccs = new CustomerCareServiceImpl();
		
		CustomerCareInfo ccy = new CustomerCareInfo();
		
		ccy.setCarePeople("毛泽东");
	
		ccs.update(ccy,17);
		/*CustomerCareService ccs = new CustomerCareServiceImpl();
		SessionFactory seFactory = HibernateUtil.getSessionFactory();
		Session session = seFactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		CustomerCareInfo cci = ccs.getCare(14);
		
		cci.setCareTheme("中国龙");
		
		session.update(cci);
		
		tx.commit();*/
	}
}
