package com.rpctest.test.provider;

import com.lxs.easyrpc.config.EasyRpcEnable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EasyRpcEnable
public class ProviderApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
