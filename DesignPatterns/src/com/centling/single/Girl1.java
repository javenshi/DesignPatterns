package com.centling.single;


/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月20日下午2:40:10
 *懒汉式单例
 */
public class Girl1 {
	private static Girl1 GIRL;
	
	private Girl1(){}
	//线程不安全的
	public static Girl1 getGirl() {
		if(GIRL==null){
			GIRL=new Girl1();
		}
		return GIRL;
	}
	//线程不安全的
	/*public static synchronized Girl1 getGirl() {
		if(GIRL==null){
			GIRL=new Girl1();
		}
		return GIRL;
	}*/
}
