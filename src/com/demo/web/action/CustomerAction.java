package com.demo.web.action;

import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.demo.domain.Customer;
import com.demo.service.ICustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 *	 �ͻ��Ķ�����
 * @author Huangjiping
 *
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer> {
	//ģ������
	private Customer customer = new Customer() ;
	private List<Customer> customers ;
	private ICustomerService customerService ;
	
//	
//	//�õ�Ӧ����
//	ServletContext sc = ServletActionContext.getServletContext() ;
//	//�õ�Spring����
//	ApplicationContext ac =  WebApplicationContextUtils.getWebApplicationContext(sc) ;
//	
//	private ICustomerService customerService = (ICustomerService) ac.getBean("customerService") ;
//	//���Ǵ�ʱû��������Ҫ��web�����ü���������action�д�Ӧ������ȡ����������ȡ��bean
//	
	
	
	public void setCustomerService(ICustomerService customerService) {
		this.customerService = customerService;
	}
	//customers��getter and setter,����ֵջ
	
	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	@Override
	public Customer getModel() {
		return customer ;
	}
	//��ȡ����û��Ľ���
	public String addUICustomer() {
		return "addUICustomer" ;
	}
	//��ȡ�û��б�
		public String findAllCustomer() {
			//���ÿͻ����ѯ�ͻ��б�
			customers = customerService.findAllCustomer() ;
			 
			return "findAllCustomer" ;
		}
}
