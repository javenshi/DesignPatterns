package com.centling.proxy;

/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月25日下午3:33:10
 *需要相亲的女孩对象，有一个展示自己的方法
 */
public class Girl implements BlindDate {

	@Override
	public void show() {
		System.out.println("女孩展示自己");
	}
	
}
