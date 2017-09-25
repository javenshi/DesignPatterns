package com.centling.proxy;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月25日下午3:35:17
 *代理模式测试类
 */
public class Main {
	public static void main(String[] args) {
		//静态代理模式测试
		BlindDate girl=new Girl();
		BlindDate matchMaker=new MatchMaker(girl);
		matchMaker.show();
		System.out.println("------------------------------");
		//动态代理模式测试
		girl=(BlindDate) new DynamicMatchMaker(girl).getProxy();
		girl.show();
		System.out.println("------------------------------");
		//Cglib代理测试
		CGirl cGirl=new CGirl();
		cGirl=(CGirl) new CglibMatchMaker(cGirl).getProxyInstance();
		cGirl.show();
	}

}
