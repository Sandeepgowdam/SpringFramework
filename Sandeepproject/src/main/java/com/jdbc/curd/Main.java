package com.jdbc.curd;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) { 


		
		
		String path ="com/jdbc/curd/b.xml";
		ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext(path);
		
		studentDAOimp r =(studentDAOimp) con.getBean("a");
	
		int insertrow =r.insert(new Student(9,"gowda","Khajihosalli"));
	 	System.out.println(insertrow);
		
		
//		Student b = new Student(23,"baz","uk");
//		int row = r.insert(b);
//		System.out.println(row);
//		r.singlestudent(99);
//		System.out.println(	r.singlestudent(99));
		
		
//		System.out.println(r.update(new Student(99,"sandeepgowda","ui")));
//		System.out.println(	r.singlestudent(99));
		
		
//		System.out.println(r.delete(99));// if it returns 1 existing item is deleted if 0 then no such items are present
//		System.out.println(	r.singlestudent(23));
	}
}