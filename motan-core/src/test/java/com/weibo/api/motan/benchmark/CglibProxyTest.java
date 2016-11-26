package com.weibo.api.motan.benchmark;

import com.weibo.api.motan.protocol.example.Hello;
import com.weibo.api.motan.proxy.spi.CglibProxy;
import com.weibo.api.motan.proxy.spi.CglibProxyFactory;

/**
 * Created by hanhansongjiang on 16/11/25.
 */
public class CglibProxyTest {
    public static void main(String args[]){

        CglibProxyFactory cglibProxyFactory=new CglibProxyFactory();
        HelloWorld call= (HelloWorld) cglibProxyFactory.getProxy(HelloWorld.class);
        call.sayHello();



    }
}




