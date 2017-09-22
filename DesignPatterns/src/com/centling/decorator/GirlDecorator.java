package com.centling.decorator;
/**
 * @author javen.shi@centling.com
 * 2017年9月22日上午10:22:30
 *负责装饰的类
 */
public abstract class GirlDecorator implements Girl  {
	
	private Girl girl;
	
	public GirlDecorator() {
	}

	public GirlDecorator(Girl girl){
		this.girl= girl;
	}

	public Girl getGirl() {
		return girl;
	}
	
	
}
