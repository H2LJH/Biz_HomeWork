package com.biz.user.service;

import java.util.List;

import com.biz.user.model.UserVO;

public interface UserService 
{
	public List<UserVO> selectAll();
	public UserVO findByUser(Long Seq);
	public int update(UserVO userVO);
	public int insert(UserVO userVO);
	public int delete(Long Seq);
}
