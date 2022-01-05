package com.java.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/java/spr/Name.xml");
		Name objKushal = (Name)ctx.getBean("beanbhaskar");
		System.out.println(objKushal.fullName());
		
		Name objLakshmi = (Name)ctx.getBean("beanJaya");
		System.out.println(objLakshmi.fullName());
	}
}

