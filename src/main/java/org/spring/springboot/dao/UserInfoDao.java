package org.spring.springboot.dao;

import org.apache.ibatis.annotations.Param;
import org.spring.springboot.domain.UserInfo;
/**
 * 城市 DAO 接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface UserInfoDao {
	//UserInfo userinfo=new UserInfo(1,@Param("UserId") String UserId,@Param("Psw") String Psw));
	UserInfo selectByNamePwd( @Param("UserId") String UserId,@Param("Psw") String Psw);
	UserInfo selectByPrimaryKey ( int Id);

}
