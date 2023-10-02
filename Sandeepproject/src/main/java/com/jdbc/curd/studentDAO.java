package com.jdbc.curd;

public interface studentDAO {
      //c- create
	public int insert(Student s);//this is a method which takes student properties as input to insert the single row into the db
	
	//r-read or to obtain the data from table
	public Student singlestudent(int id);
	
	//u-update
	public int update(Student s); 
	
	//d-delete
	public int delete(int id);
}
