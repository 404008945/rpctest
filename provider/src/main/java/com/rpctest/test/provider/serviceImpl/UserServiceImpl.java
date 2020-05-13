package com.rpctest.test.provider.serviceImpl;

import com.lxs.easyrpc.config.RpcProd;
import org.springframework.stereotype.Service;
import service.UserRequest;
import service.UserResponse;
import service.UserService;

@Service
@RpcProd
public class UserServiceImpl implements UserService {

    public UserResponse say(UserRequest req){
        UserResponse userResponse = new UserResponse();
        userResponse.setRes("say0:"+req.getReq());

        return userResponse;
    }
}
