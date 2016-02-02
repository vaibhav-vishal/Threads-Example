package com.training.threads;

public class Application {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread obj = new MyThread();
		obj.setName("Set Name Here");
		obj.start();
	
	}
}
