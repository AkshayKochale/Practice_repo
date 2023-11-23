package com.test.thread;

public class CreateSynchronizationWithTimeOut 
{

	
	public static void main(String[] args) 
	{
		
		demo d=new demo();
		
		Runnable r=()->{
			
			synchronized (d.getObj())
			{
				try {
					
					for(int i=0;i<3;i++) {
					d.getObj();
					
					Thread.sleep(1000);
					
					d.relObj();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		};
		
		
		Runnable r1=()->{
			
				for(int i=0;i<10;i++)
				System.out.println(d.getObj());
			

		};
		
		
		Thread t= new Thread(r);
		Thread t1= new Thread(r1);
		
		t.start();
		t1.start();
		
	}
	
	
}

class demo
{
	private static String obj="obj";
	 private static boolean isReady=true;
	 private static int timeoutInMiliSec= 2000;
	 private String currentOwner=null;
	 
	 
	 
	public String getObj() 
	{
		makeReady() ;
		if(isReady || Thread.currentThread().getName().equals(currentOwner))
		{	
			isReady=false;
			currentOwner=Thread.currentThread().getName();
			return obj;
		}
		
		return "Cannot Get the Object :used by someone else";
	}
	
	
	
	public void relObj() 
	{
		if(isReady)
		{
			System.out.println("You dont have object lock");
		}
		else 
		{
			isReady=true;
			currentOwner=null;
		}
		
		
	}
	
	private static void makeReady() 
	{
		long currentTimeMillis = System.currentTimeMillis();
		long timeLeft=timeoutInMiliSec;
		while(!isReady && System.currentTimeMillis()-currentTimeMillis<timeoutInMiliSec){} 
		
	} 
	
	
	private static void changeStatus() 
	{
		synchronized (obj) {
			isReady=true;
			obj.notifyAll();
		}
	}
	
}