package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.User;

public interface UserMapper {
	// 没有参数的形式来添加用户
	void addUserNoPar();
	// 有参数的形式来添加用户
	void addUserByPar(User user);
	// 有参数和返回值的形式来查询用户
	User selectOneByPar(int id);
	//查询所有的用户
	@Select("select * from user")
	List<User>  selectAll();
	
	
	//登录功能
	User selectLogin(User user);
	
	//根据不同的列来排序
	List<User> selectOrderBy(@Param("column")String column);
	
	
	
	//测试动态sql_if
	User findUserWith_if(User user);
	
	
	//查询用户为某些对应id
	List<User>  findUsersWithList(List<Integer> list);
	
}
