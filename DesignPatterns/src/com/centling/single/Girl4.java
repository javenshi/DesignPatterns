package com.centling.single;


/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月20日下午2:58:43
 *双重锁方式
 */
public class Girl4 {
	
		private static volatile Girl4 GIRL;
	
	
	private Girl4(){}
	
	public static Girl4 getGirl() {
		if(GIRL==null){
			synchronized(Girl4.class){
				if(GIRL==null){
					GIRL=new Girl4();
				}
			}
		}
		return GIRL;
	}
	
}
