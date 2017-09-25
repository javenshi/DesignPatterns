package com.centling.proxy;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月25日下午3:34:26
 *静态代理中媒人对象，持有一个相亲对象。
 */
public class MatchMaker implements BlindDate {
	BlindDate bd;
	
	MatchMaker(BlindDate bd){
		this.bd=bd;
	}
	@Override
	public void show() {
		System.out.println("媒人牵线搭桥");
		bd.show();
		System.out.println("媒人收取中介费");
	}
	
}
