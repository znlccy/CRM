package com.gangyu.service.imp;

import java.util.List;

import javax.swing.JOptionPane;

import com.gangyu.dao.CustomerCareDao;
import com.gangyu.dao.imp.CustomerCareDAOImpl;
import com.gangyu.model.CustomerCareInfo;
import com.gangyu.service.CustomerCareService;

public class CustomerCareServiceImpl implements CustomerCareService {
	
	CustomerCareDao daoCareDao = new CustomerCareDAOImpl();
	
	@Override
	public List<CustomerCareInfo> getList(String customerInput, String queryType) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public CustomerCareInfo getCare(int careId) {
		// TODO Auto-generated method stub
		try {
			if(careId>0){
				System.out.println("执行ID查询");
				return daoCareDao.getCare(careId);
			}
			else
			{
				System.out.println("没有执行ID查询");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean add(CustomerCareInfo careInfo) {
		// TODO Auto-generated method stub
		try {
			if(careInfo!=null)
			{
				System.out.println("执行添加操作");
				return daoCareDao.add(careInfo);
			}
			else
			{
				System.out.println("没有执行添加操作");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int careId) {
		// TODO Auto-generated method stub
		try {
			if(careId>0)
			{
				System.out.println("执行ID删除操作");
				return daoCareDao.delete(careId);
			}
			else{
				System.out.println("没有执行ID删除操作");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(CustomerCareInfo careInfo,int careId) {
		// TODO Auto-generated method stub
		try {
			if(careInfo!=null)
			{
				if(careId!=0)
				{
					//查询数据库中的内容
					CustomerCareInfo cci = daoCareDao.getCare(careId);
					careInfo = cci;
					//这个更新操作没有实现					
					System.out.println("执行修改操作");
					careInfo.setCareNexttime(careInfo.getCareNexttime());
					careInfo.setCarePeople(careInfo.getCarePeople());
					careInfo.setCareRemark(careInfo.getCareRemark());
					careInfo.setCareTheme(careInfo.getCareTheme());
					careInfo.setCareTime(careInfo.getCareTime());
					careInfo.setCareWay(careInfo.getCareWay());
					careInfo.setCustomerId(careInfo.getCustomerId());
					careInfo.setCustomerName(careInfo.getCustomerName());
					careInfo.setIsUsed(careInfo.getIsUsed());
					daoCareDao.update(careInfo,careId);
				}
			}
			else
			{
				System.out.println("没有执行更新操作");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
}
