package com.java8.features.lambda;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		// Java7
		Runnable t1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 1");
			}
			
		};
		new Thread(t1).start();
		
		
		// Java8
		Runnable t2 = ()->System.out.println("Thread 2");
		new Thread(t2).start();
		
		Runnable t3 = () -> {
			System.out.println("Thread 3");
			System.out.println("Thread 3.1");
		};
		new Thread(t3).start();
		
		new Thread(()->System.out.println("Thread 4")).start();

	}

}
