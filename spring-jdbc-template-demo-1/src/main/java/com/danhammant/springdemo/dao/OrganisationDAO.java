package com.danhammant.springdemo.dao;

import java.util.List;

import javax.sql.DataSource;

import com.danhammant.springdemo.domain.Organisation;

public interface OrganisationDAO {
	
	//Set the data source that will be required to create a connection to the database.
	public void setDataSource(DataSource ds);
	
	//Create a record in the organisation table
	public boolean create(Organisation org);
	
	//Retrieve a single organisation
	public Organisation getOrganisation(Integer id);
	
	//Retrieve all organisations from the table
	public List<Organisation> getAllOrganisations();
	
	//Delete a specific organisation from the table
	public boolean delete(Organisation org);
	
	//Update an existing organisation;
	public boolean update(Organisation org);	
	
	public void cleanup();
}
