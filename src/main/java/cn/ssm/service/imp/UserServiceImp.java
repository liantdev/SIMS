package cn.ssm.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ssm.mapper.UserMapper;
import cn.ssm.po.User;
import cn.ssm.service.UserService;

@Service
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User searchUser(User user) throws Exception {

		return userMapper.searchUser(user);
	}
	

}
