package com.jdbc.curd;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;

public class studentDAOimp implements studentDAO{

	private JdbcTemplate jdbc;
	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	
	
	public int insert(Student s) {
		String query ="INSERT INTO STUDENT VALUES(?,?,?)";//?-placeholders if we use sql injection any can hack the system so we need to use the place holder
	int up=	this.jdbc.update(query, s.getId(), s.getName(), s.getCity());//inbuilt method
		
		return up;
	}
	
	
	
	public Student singlestudent(int id) {
		String query="SELECT * FROM STUDENT WHERE ID=?";
	Student s =	this.jdbc.queryForObject(query, new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
			}
			
		},id);
	
    return  s;
	}
	
	
	
	public int update(Student s) {
		String query = "UPDATE STUDENT SET NAME=?,CITY=? WHERE ID =?";
		int up=	this.jdbc.update(query,  s.getName(), s.getCity(),s.getId());
		return up;
	}
	
	
	public int delete(int id) {
		String query ="DELETE FROM STUDENT WHERE ID =?";
		int del =	this.jdbc.update(query, id);
		return del;
	}

}
