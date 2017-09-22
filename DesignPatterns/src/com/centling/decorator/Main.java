package com.centling.decorator;
/**
 * @author javen.shi@centling.com
 * 2017年9月22日上午10:31:28
 *装饰者模式测试类
 */
public class Main {
	public static void main(String[] args) {
		//1.初始的女孩只能唱歌
		Girl girl =new Girl1();
		girl.sing();
		System.out.println("-----------------------------------");
		//2.能唱歌能跳舞的女孩
		Girl girl1=new DanceGirl(girl);
		girl1.sing();
		System.out.println("-----------------------------------");
		//3.能唱歌能暖床的女孩
		Girl girl2=new WarmBedGirl(girl1);
		girl2.sing();
	}

}
