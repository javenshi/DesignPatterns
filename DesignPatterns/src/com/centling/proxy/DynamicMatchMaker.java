package com.centling.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * @author javen.shi@centling.com 2017年9月25日下午3:42:18 动态代理类
 */
public class DynamicMatchMaker {
	private Object girl;

	DynamicMatchMaker(Object girl) {
		this.girl = girl;
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(
				girl.getClass().getClassLoader(),
				girl.getClass().getInterfaces(),
				new InvocationHandler() {
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("媒人牵线搭桥");
						Object returnValue = method.invoke(girl, args);
						System.out.println("媒人收取中介费");
						return returnValue;
					}
				});

	}
}
