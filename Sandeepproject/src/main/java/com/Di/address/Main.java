package com.Di.address;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) { 

//        Address a= new Address();
//        a.setDistrict("Banglore");
//        a.setTaluk("hoskote");
//        a.setPincode(562114);
//        System.out.println(a.getDistrict());
//        System.out.println(a);
		
		
		String path ="com/Di/address/v.xml";
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext(path);
		
		Address a1 =(Address) con.getBean("a1");
		System.out.println(a1.hashCode());
                                                   //spring follows the the singleton pattern where the object is once created
		Address a2 =(Address) con.getBean("a1");
		System.out.println(a2.hashCode());

		Address a3=(Address) con.getBean("a1");
		a1.setDistrict("kolar");// by using the reference we change the value
		System.out.println(a3);

		Address a4 =(Address) con.getBean("a2");
		a4.setDistrict("kgf");// by using the reference we change the value
		System.out.println(a4);
       con.close();
	}

}
