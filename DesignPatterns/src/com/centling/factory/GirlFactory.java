package com.centling.factory;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月21日上午10:40:00
 *女孩工厂
 */
public class GirlFactory {
	/**
	 * 
	 * @param type
	 * @return根据传来的类型返回同类型的女孩
	 */
	public static Girl getGirl(String type){
		Girl girl=null;
		switch (type) {
		case "温柔":
			girl=new Girl1();
			break;
		case "彪悍":
			girl=new Girl2();
			break;
		default:
			System.out.println("暂时还没有这种类型的女女哦。。。。。。。。。。。");
			break;
		}
		return girl;
	}
}
