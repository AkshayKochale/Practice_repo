package com.test.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPool 
{

		public static void main(String[] args) throws Exception {
			
			
				/*ExecutorService pool = Executors.newFixedThreadPool(5);
			pool.submit(()->
			{
				System.out.println("hey");
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});*/
			
			
			////////////Scheduler pool////////////////
			
//			ScheduledExecutorService pool1 = Executors.newScheduledThreadPool(5);
//		
//		
//		  pool1.schedule(()->{
//		  
//		  },5000,TimeUnit.MILLISECONDS);
//		  
//		  
//		 
//			
//			pool1.scheduleWithFixedDelay(()->{
//					
//					System.out.println("After 3 sec");
//					
//				}, 0, 3000, TimeUnit.MILLISECONDS);
//				
//					pool1.awaitTermination(9000, TimeUnit.MILLISECONDS);
//				List<Runnable> shutdownNow = pool1.shutdownNow();
//				
			
			
			
			/// Callable //////
		/*
		 * ExecutorService pool = Executors.newFixedThreadPool(4); Future<Integer>
		 * submit = pool.submit(new Callable<Integer>() {
		 * 
		 * @Override public Integer call() throws Exception {
		 * 
		 * // logic
		 * 
		 * return 1101; } });
		 * 
		 * Integer integer = submit.get(); System.out.println(integer);
		 */
			
			
			
			
		}
	
}
