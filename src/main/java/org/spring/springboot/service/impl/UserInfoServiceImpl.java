package org.spring.springboot.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.spring.springboot.dao.UserInfoDao;
import org.spring.springboot.domain.UserInfo;
import org.spring.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoDao userDao;

    public UserInfo selectByNamePwd(String UserId,String Psw) {
        return userDao.selectByNamePwd( UserId, Psw);
    }
   public UserInfo selectByPrimaryKey(int id){
	   
	   return userDao.selectByPrimaryKey(id);
   }
}
