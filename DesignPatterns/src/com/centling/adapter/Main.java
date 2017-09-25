package com.centling.adapter;

/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月22日上午9:44:10
 *适配器模式测试类
 */
public class Main {
	public static void main(String[] args) {
		
		Girl1 girl=new Girl1();
		GirlAdapter girlAdapter=new GirlAdapter(girl);
		girlAdapter.sing();
		girlAdapter.dance();
		girlAdapter.warmBed();
	}

}
