package com.rishu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rishu.dao.stu_dao;
import com.rishu.entity.Stu;

@Service
public class Student_service {

	@Autowired
	private stu_dao studao;

	public int createstudent(Stu stu) {
		return this.studao.insert(stu);
	}

	public void selectstu() {
		this.studao.selectall();

	}

	public boolean updatestudent(Stu stu) {
		return this.studao.update(stu);

	}

}
