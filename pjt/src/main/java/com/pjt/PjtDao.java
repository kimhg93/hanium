package com.pjt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PjtDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<VO> listForBeanPropertyRowMapper(){
		String sql = "SELECT * FROM hanium1";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<VO>(VO.class));
	}
	
	public int insert(VO vo){
		String sql = "INSERT INTO hanium1(price, dprt, dprt_date,"
				+ "ariv, ariv_date, cargo, cargo_kind,"
				+ "cargo_weight, via) VALUES(?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, vo.getPrice(), vo.getDprt(), vo.getDprt_date(), vo.getAriv(),
				vo.getAriv_date(), vo.getCargo(), vo.getCargo_kind(), vo.getCargo_weight(), vo.getVia());
		
	}
	
}
