package com.celcom.day7;

public class AnonymousInnerClass {
	public static void main(String[] args)
	{
		//creating thread using anonymous inner class
		Runnable runnable = new Runnable() {
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("Thread t1 is running...");
					try {
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
					}
				}
			}
		};
		
		Thread t1=new Thread(runnable);
		t1.start();
		
		//thread creation using lambda Expression
		
		Runnable runnable1 =  () ->{
			for(int i=0;i<5;i++) {
				System.out.println("Thread t2 is running...");
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
				}
			}
		};
		Thread t2=new Thread(runnable1);
		t2.start();
		
	}
}
