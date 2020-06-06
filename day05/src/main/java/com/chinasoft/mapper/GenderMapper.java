package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.Gender;
import com.chinasoft.pojo.Student;

public interface GenderMapper {
	
	//查询某个班级的所有的学生
	Gender   selectGenderWithUser(int id);
	
}
