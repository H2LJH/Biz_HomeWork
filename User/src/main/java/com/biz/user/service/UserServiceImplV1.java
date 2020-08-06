package com.biz.user.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.user.model.UserVO;
import com.biz.user.model.DAO.UserDAO;

@Service
public class UserServiceImplV1 implements UserService 
{
	
	@Autowired
	SqlSession sqlsession;
	UserDAO userDAO;
	
	
	@Autowired
	public void GetMapper()
	{
		userDAO = sqlsession.getMapper(UserDAO.class);
	}
	

	@Override
	public List<UserVO> selectAll() {
		List<UserVO> userList = userDAO.selectAll();
		return userList;
	}

	@Override
	public UserVO findByUser(Long Seq) {
		UserVO vo = userDAO.findByUser(Seq);
		return vo;
	}

	@Override
	public int insert(UserVO userVO) {
		int ret = userDAO.insert(userVO);
		return ret;
	}

	@Override
	public int delete(Long Seq) {
		int ret = userDAO.delete(Seq);
		return 0;
	}

	@Override
	public int update(UserVO userVO) {
		int ret = userDAO.update(userVO);
		return ret;
	}
	
}
