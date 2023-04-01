package com.rishu.dao;

import com.rishu.entity.Stu;

public interface stu_dao_imp {
	
	public int insert(Stu stu);
	public boolean select(Stu stu);
	public boolean update(Stu stu);
	public boolean selectall();

}
