package demo1;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月22日下午3:11:43 
 *测试线程的可见性
 */
public class DemoOne {
	 static  int a=0;
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {
			@Override
			public  void run() {
				for (int i = 0; i < 5000; i++) {
					a++;
				}
				System.out.println("t1:"+a);
			}
		});
		Thread t2=new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5000; i++) {
					a--;
				}
				System.out.println( "t2:"+a);
			}
		});
		t1.start();
		t2.start();
	}
}
