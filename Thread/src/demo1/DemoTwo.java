package demo1;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月22日下午3:32:16
 *线程的两种创建方式
 */
public class DemoTwo extends Thread {
	public void run() {
		System.out.println("线程启动");
	}

	public static void main(String[] args) {
		// 继承Thread
		DemoTwo demo1 = new DemoTwo();
		demo1.start();
		// 实现接口
		Demo demo2 =new DemoTwo().new Demo();
		demo2.run();
	}
	class Demo implements Runnable {
		public void run() {
			System.out.println("线程启动");
		}
	}
}

 
