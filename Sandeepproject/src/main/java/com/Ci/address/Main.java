package com.Ci.address;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path ="com/Ci/address/b.xml";
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext(path);
		 Address a1=(Address)c.getBean("b1");
		 System.out.println(a1);
		 c.close();
		 System.out.println("hi");
	}

}
