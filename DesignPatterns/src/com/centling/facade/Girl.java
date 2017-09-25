package com.centling.facade;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月25日下午2:31:25
 *外观的女孩，提供一个统一的服务
 */
public  class Girl {
	
	private Girl1 girl1=new Girl1();
	private Girl2 girl2=new Girl2();
	private Girl3 girl3=new Girl3();
	
	public void service(){
		girl1.sing();
		girl2.dance();
		girl3.warmBed();
	}

}
