package com.rpctest.test.consumer.controller;

import com.lxs.easyrpc.config.RpcConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserRequest;
import service.UserResponse;
import service.UserService;

@Controller
public class UserController {
    @RpcConsumer(timeout = 10,retryTime = 3)
    private UserService userService;


    @ResponseBody
    @RequestMapping("index")
    public UserResponse sayHello(){
        UserRequest userRequest = new UserRequest();
        userRequest.setReq("Hello World");
        long time1 = System.currentTimeMillis();
        UserResponse userResponse =  userService.say(userRequest);
        System.out.println("接口调用耗时:"+(System.currentTimeMillis()-time1));
        return userResponse;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
