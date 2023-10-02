package com.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path ="com/autowire/b.xml";
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext(path);
//		 Address a1=(Address)c.getBean("h1");
//		 System.out.println(a1);
		 Place a2=(Place)c.getBean("k1");
		 System.out.println(a2);
		 c.close();
	}

}