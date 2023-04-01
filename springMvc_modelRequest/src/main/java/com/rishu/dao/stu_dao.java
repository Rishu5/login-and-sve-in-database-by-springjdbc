package com.rishu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rishu.entity.Stu;

@Repository
public class stu_dao implements stu_dao_imp{

	@Autowired
	JdbcTemplate jdbctemplate;
	
	
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}

	@Override
	public int insert(Stu stu) {
		String query  ="insert into Stu(email,userid,password) values(?,?,?)";
	       int result =this. jdbctemplate.update(query,stu.getEmail(),stu.getUserid(),stu.getPassword());
		return result;
	}

	@Override
	public boolean select(Stu stu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Stu stu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean selectall() {
		// TODO Auto-generated method stub
		return false;
	}

}
