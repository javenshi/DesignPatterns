package com.centling.decorator;
/**
 * @author javen.shi@centling.com
 * 2017年9月22日上午10:26:49
 *会跳舞的女孩
 */
public class DanceGirl extends GirlDecorator {

	public DanceGirl(Girl girl) {
		super(girl);
	}
	public void sing(){
		girl.sing();
		dance();
	}
	public void dance(){
		System.out.println("我会跳舞");
	}
}
