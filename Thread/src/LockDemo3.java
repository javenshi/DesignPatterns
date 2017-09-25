package demo2;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
/**
 * @author javen.shi@centling.com
 * 2017年9月25日上午9:51:50
 *
 */
public class LockDemo3 implements Runnable{
	
	public static final CountDownLatch count=new CountDownLatch(10);
	public static final LockDemo3 demo3=new LockDemo3();
	@Override
	public void run() {
		try {
			Thread.sleep(new Random().nextInt(10)*1000);
			System.out.println(Thread.currentThread().getId()+"检查完成");
			count.countDown();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService ex=Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			ex.submit(demo3);
		}
		count.await();
		System.out.println("完成！");
		ex.shutdown();
	}

}
