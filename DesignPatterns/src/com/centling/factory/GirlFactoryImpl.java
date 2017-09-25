package com.centling.factory;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月21日上午11:13:20
 *抽象工厂模式的女孩工厂的实现工厂
 */

public class GirlFactoryImpl implements GirlFactoryInterface {

	@Override
	public Girl1 createSoftGirl() {
		return new Girl1();
	}

	@Override
	public Girl2 createDoughtyGirl() {
		return new Girl2();
	}

}
