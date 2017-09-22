package demo1;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月22日下午4:02:46 
 *线程的wait和notify方法
 */
public class DemoThree {
	static int a = 0;
	final static Object object = new Object();

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					synchronized (object) {
						a++;
						if (a == 2) {
							try {
								object.wait();
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						System.out.println("t1:" + a);
					}
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (object) {
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}finally {
						object.notify();
						//object.notifyAll();
					}
				}
			}
		});

		t1.start();
		t2.start();
	}
}
