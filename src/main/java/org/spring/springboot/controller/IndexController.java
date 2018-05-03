package org.spring.springboot.controller;

import org.spring.springboot.domain.UserInfo;
import org.spring.springboot.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/5/12.
 */

@Controller
@RequestMapping("/front/*")
public class IndexController {

    @Autowired
    private UserInfoService userinfos;
    
    //index页面
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    //注册页面
    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    //登录页面
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    //注册方法
    @RequestMapping("/addregister")
    public String register(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");
        if (password.equals(password2)){
            UserInfo userEntity = new UserInfo();
            userEntity.setUser_id(username);
            userEntity.setPassword(password);
           // userDao;
            return "login";
        }else {
            return "register";
        }
    }

    //登录方法
    @RequestMapping("/addlogin")
    public String login(HttpServletRequest request){

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        //Map map=new HashMap();
        //map.put("user_id", username);
        //map.put("password", password);

        UserInfo userEntity = userinfos.selectByNamePwd(username,password);
        
        //UserInfo userEntity = userinfos.selectByPrimaryKey(1);
        String str = "";
        if (userEntity !=null){
            str = "index";
        }else {
            str = "login";
        }
        return str;
    }

}
