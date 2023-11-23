package com.test.thread;

public class Test {

	int i=0;
	String next=null;
	
	
	public synchronized void inc() throws Exception 
	{
		notify();

		i++;
		if(i>10) 
		{
			Thread.currentThread().stop();
			return;
		}
		System.out.println(Thread.currentThread().getName()+" : "+i);
		wait();
		
	}
	
	
	public static void main(String[] args) throws Exception
	{
		Test t=new Test();
		
		Runnable r=()->
		{
			while(true) 
			{
				try {
					t.inc();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t1= new Thread(r,"t1");
		Thread t2= new Thread(r,"t2");
		
		t1.start();t2.start();
		t1.join();t2.join();
		System.out.println("Done");
	}
	
	
	
}
