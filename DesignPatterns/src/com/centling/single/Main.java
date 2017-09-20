package com.centling.single;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月20日下午2:45:03
 *单例模式测试类
 */
public class Main {
	public static void main(String[] args) {
		Thread t1=new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < 5; i++) {
					//懒汉式
					//System.out.println("t1线程："+Girl1.getGirl());
					//饿汉式
					//System.out.println("t1线程："+Girl2.getGirl());
					//内部类式
					//System.out.println("t1线程："+Girl3.getGirl());
					//双重锁式
					//System.out.println("t1线程："+Girl4.getGirl());
				}
			}
		});
		Thread t2=new Thread(new Runnable(){
			public void run(){
				for (int i = 0; i < 5; i++) {
					//懒汉式
					//System.out.println("t2线程："+Girl1.getGirl());
					//饿汉式
					//System.out.println("t2线程："+Girl2.getGirl());
					//内部类式
					//System.out.println("t1线程："+Girl3.getGirl());
					//双重锁式
					//System.out.println("t1线程："+Girl4.getGirl());
				}
			}
		});
		t1.start();
		t2.start();
	}
	
}
