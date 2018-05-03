package org.spring.springboot.service;


import org.spring.springboot.domain.UserInfo;;

/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface UserInfoService {

   
    UserInfo selectByNamePwd(String UserId,String Psw);
    UserInfo selectByPrimaryKey(int id);
}
