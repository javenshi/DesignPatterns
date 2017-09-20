package com.centling.single;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月20日下午2:50:05
 *饿汉式单例
 */
public class Girl2 {
	
	private static Girl2 GIRL=new Girl2();
	
	public static Girl2 getGirl() {
		return GIRL;
	}
	
}
