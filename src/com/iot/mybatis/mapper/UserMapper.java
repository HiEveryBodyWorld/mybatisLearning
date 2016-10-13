package com.iot.mybatis.mapper;

import java.util.List;

import com.iot.mybatis.po.User;

public interface UserMapper {
	
	//����id��ѯ�û���Ϣ
    public User findUserById(int id) throws Exception;

    //�����û����в�ѯ�û��б�
    public List<User> findUserByName(String name) throws Exception;

    //����û���Ϣ
    public void insertUser(User user) throws Exception;

    //ɾ���û���Ϣ
    public void deleteUser(int id) throws Exception;

    //�����û�
    public void updateUser(User user)throws Exception;

}
