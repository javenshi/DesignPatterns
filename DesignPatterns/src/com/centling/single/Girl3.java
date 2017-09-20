package com.centling.single;


/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月20日下午2:55:20
 *内部类方式
 */
public class Girl3 {
	private static class Girl{
		private static final Girl3 GIRL=new Girl3();
	}
	
	private Girl3(){}
	
	public static Girl3 getGirl() {
		
		return Girl.GIRL;
	}
	
}
