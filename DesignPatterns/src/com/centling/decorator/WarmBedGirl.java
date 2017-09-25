package com.centling.decorator;
/**
 * @author javen.shi@centling.com
 * 2017年9月22日上午10:26:33
 *会暖床的女孩
 */
public class WarmBedGirl extends GirlDecorator {

	public WarmBedGirl(Girl girl) {
		super(girl);
	}
	public void sing(){
		girl.sing();
		warmBed();
	}
	public void warmBed(){
		System.out.println("我会暖床");
	}
}
