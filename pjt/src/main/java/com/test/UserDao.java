package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<User> listForBeanPropertyRowMapper(){
		String sql = "SELECT * FROM user";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
	}
	
	public int insert(User user){
		String sql = "INSERT INTO user(userNum, userName) VALUES(?,?)";
		return jdbcTemplate.update(sql, user.getUserNum(), user.getUserName());
	}
	
}
