package com.ShopKart;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class ProductsDAO {

	JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public ArrayList<Products> readRow()
	{
		ArrayList<Products> p;
		String sql="SELECT * FROM PRODUCTS";
		p=(ArrayList<Products>)jdbcTemplate.query(sql,new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rn) throws SQLException {
				Products p1=new Products();
				p1.setProductid(rs.getString(1));
				p1.setProductname(rs.getString(2));
				p1.setCategory(rs.getString(3));
				p1.setPrice(rs.getInt(4));
				p1.setQuantity(rs.getInt(5));
				p1.setDiscountperc(rs.getInt(6));
				p1.setTaxname(rs.getString(7));
				return p1;
			}
			
		});
		return p;
		
	}
	
}
