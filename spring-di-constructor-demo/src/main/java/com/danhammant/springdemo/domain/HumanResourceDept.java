package com.danhammant.springdemo.domain;

import com.danhammant.springdemo.service.RecruitmentService;

public class HumanResourceDept implements Department {
	
	private String deptName;
	private RecruitmentService recruitmentService;
	private Organisation organisation;	
	
	public HumanResourceDept(RecruitmentService recruitmentService, Organisation organisation) {
		this.recruitmentService = recruitmentService;
		this.organisation = organisation;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String hiringStatus(int numberOfRecruitments) {
		String hiringFacts = recruitmentService.recruitEmployees(organisation.getCompanyName(), 
				deptName, numberOfRecruitments);
		return hiringFacts;
	}
	

}
