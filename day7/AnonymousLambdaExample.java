package com.celcom.day7;

public class AnonymousLambdaExample {
	public static void main(String[] args) {
		Runnable runnable3 = new Runnable() {
			public void run() {
				for(int i=1;i<=10;i++) {
					System.out.println(i + " * 2 = "+(i*2));
					try {
						Thread.sleep(2000);
					}
					catch(InterruptedException e) {
					}
				}
			}
		};
		Thread t3=new Thread(runnable3);
		t3.start();
		
		Runnable runnable4 =  () ->{
			for(int i=1;i<=10;i++) {
				System.err.println(i+" * 5 = "+(i*5));
				try {
					Thread.sleep(2000);
				}
				catch(InterruptedException e) {
				}
			}
		};
		Thread t4=new Thread(runnable4);
		t4.start();
	}

}
