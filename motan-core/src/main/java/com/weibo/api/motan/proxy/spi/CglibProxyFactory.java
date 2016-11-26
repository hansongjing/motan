package com.weibo.api.motan.proxy.spi;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by hanhansongjiang on 16/11/25.
 */
public class CglibProxyFactory implements MethodInterceptor {

    Enhancer enhancer=new Enhancer();

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        before();
        Object object=methodProxy.invokeSuper(o,objects);
        return object;
    }

    public void before(){
        System.out.println("before call");
    }

    public Object getProxy(Class tClass){
        enhancer.setSuperclass(tClass);
        enhancer.setCallback(this);
        return  enhancer.create();
    }
}



