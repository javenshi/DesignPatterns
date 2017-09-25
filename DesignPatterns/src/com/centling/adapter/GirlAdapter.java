package com.centling.adapter;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月22日上午9:43:48
 *适配器
 */
public class GirlAdapter extends Girl1 implements Girl {
	
	Girl1 girl;
	
	GirlAdapter(Girl1 girl){
		this.girl=girl;
	}
	
	@Override
	public void warmBed() {
		System.out.println("我会暖床哦");	
	}	
}
