package com.centling.factory;

/**
 * 
 * @author javen.shi@centling.com 2017年9月21日上午10:30:41 工厂模式测试类
 */
public class Main {
	public static void main(String[] args) {
		// 简单工厂测试
		/*
		 * Girl girl1 = GirlFactory.getGirl("温柔"); 
		 * girl1.say();
		 *  Girl girl2 =GirlFactory.getGirl("彪悍"); 
		 *  girl2.say();
		 */
		// 抽象工厂模式
		GirlFactoryInterface girlFactory = new GirlFactoryImpl();
		Girl girl1 = girlFactory.createSoftGirl();
		girl1.say();
		Girl girl2 = girlFactory.createDoughtyGirl();
		girl2.say();

	}

}
