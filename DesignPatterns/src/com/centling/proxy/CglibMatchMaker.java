package com.centling.proxy;

import java.lang.invoke.MethodHandleInfo;
import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月25日下午4:08:45
 *Cglib实现的媒人代理
 */
public class CglibMatchMaker implements MethodInterceptor {
	
	private Object girl;
	
	CglibMatchMaker(Object girl){
		this.girl=girl;
	}

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(girl.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("媒人牵线搭桥");
		Object returnValue = method.invoke(girl, args);
		System.out.println("媒人收取中介费");
		return returnValue;
	}
	
}
