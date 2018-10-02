package com.danhammant.springdemo.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.danhammant.springdemo.domain.Organisation;

public class OrganisationRowMapper implements RowMapper<Organisation> {

	public Organisation mapRow(ResultSet rs, int rowNum) throws SQLException {
		Organisation org = new Organisation();
		org.setId(rs.getInt("id"));
		org.setCompanyName(rs.getString("company_name"));
		org.setYearOfIncorporation(rs.getInt("year_of_incorporation"));
		org.setPostCode(rs.getString("post_code"));
		org.setEmployeeCount(rs.getInt("employee_count"));
		org.setSlogan(rs.getString("slogan"));
		
		return org;
	}

}
