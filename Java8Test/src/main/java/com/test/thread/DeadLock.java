package com.test.thread;

public class DeadLock {

	
		static String ob1="ob1";
		static String ob2="ob2";
	
	public static void main(String[] args)  throws Exception
	{
	
		
		Runnable r=()->
		{
			try {
			
				System.out.println("wating for object :" +ob1);
				synchronized(ob1) 
				{
				System.out.println("Using Object :"+ob1);
				
				Thread.sleep(2000);
				System.out.println("wating for object :" +ob2);
				synchronized(ob2) 
				{
					System.out.println("Using Object :"+ob2);
				}
				
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		};
		
		
		Runnable r1=()->
		{
			try {
				System.out.println("wating for object :" +ob2);
				synchronized(ob2) 
				{
					System.out.println("Using Object :"+ob2);
				
				Thread.sleep(2000);
				System.out.println("wating for object :" +ob1);
					synchronized(ob1) 
					{
						
					System.out.println("Using Object :"+ob1);
					}
				}
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		};
		
		
		Thread t= new Thread(r);
		Thread t1= new Thread(r1);
		
		t.start();
		t1.start();
		
		t.join();
		t1.join();
		System.out.println("All DONE");

	}

}
