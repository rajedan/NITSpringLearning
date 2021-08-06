package com.autowiring.beanlifecycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee implements BeanNameAware, ApplicationContextAware, BeanPostProcessor {

	private Department department;

	public Employee() {
		System.out.println("in-employee-constructor");
	}

	@Autowired
	public void setDepartment(Department department) {
		System.out.println("in-emp-setDepartment");
		this.department = department;
	}

	public Department getDepartment() {
		System.out.println("in-emp-getDepartment");
		return department;
	}

	@PostConstruct
	public void initAfterConstructor() {
		// TODO Auto-generated method stub
		System.out.println("in-emp-post-construct");
	}

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		System.out.println("in-emp-set-bean-name and name is: " + name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("in-emp-set-application-context and appcontext is: " + applicationContext);
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("in-emp-postProcessBeforeInitialization and bean: " + bean + 
				" bean-name: " + beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("in-emp-postProcessAfterInitialization and bean: " + bean + 
				" bean-name: " + beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
