package demo2;

import java.util.concurrent.locks.ReentrantLock;
/**
 * 
 * @author javen.shi@centling.com
 * 2017年9月25日上午9:38:30
 *
 */
public class LockDemo1 implements Runnable{
	
	public static int i=0;
	public static ReentrantLock reentrantLock=new ReentrantLock();
	@Override
	public void run() {
		for (int j = 0; j < 10000; j++) {
			reentrantLock.lock();
			try{
				i++;
			}finally {
				reentrantLock.unlock();
			}
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		LockDemo1 t=new LockDemo1();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(i);
		
	}

}
