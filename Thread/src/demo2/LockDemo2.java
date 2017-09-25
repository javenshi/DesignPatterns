package demo2;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @author javen.shi@centling.com
 * 2017年9月25日上午9:51:50
 *
 */
public class LockDemo2 implements Runnable{
	
	public static int i=0;
	public static ReentrantLock reentrantLock=new ReentrantLock();
	@Override
	public void run() {
		try {
			if(reentrantLock.tryLock(2, TimeUnit.SECONDS)){
				Thread.sleep(3000);
				System.out.println("线程："+Thread.currentThread().getName());
			}else{
				System.out.println("放弃");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			if(reentrantLock.isHeldByCurrentThread()){
				reentrantLock.unlock();
			}
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		LockDemo2 t=new LockDemo2();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();
		t2.start();
		
		
	}

}
