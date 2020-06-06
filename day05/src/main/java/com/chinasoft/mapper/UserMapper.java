package com.chinasoft.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.chinasoft.pojo.User;

public interface UserMapper {
	// û�в�������ʽ������û�
	void addUserNoPar();
	// �в�������ʽ������û�
	void addUserByPar(User user);
	// �в����ͷ���ֵ����ʽ����ѯ�û�
	User selectOneByPar(int id);
	//��ѯ���е��û�
	@Select("select * from user")
	List<User>  selectAll();
	
	
	//��¼����
	User selectLogin(User user);
	
	//���ݲ�ͬ����������
	List<User> selectOrderBy(@Param("column")String column);
	
	
	
	//���Զ�̬sql_if
	User findUserWith_if(User user);
	
	
	//��ѯ�û�ΪĳЩ��Ӧid
	List<User>  findUsersWithList(List<Integer> list);
	
}
