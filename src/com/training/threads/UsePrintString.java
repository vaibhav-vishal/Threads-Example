package com.training.threads;

public class UsePrintString implements Runnable {

	private String str1;
	private String str2;

	public UsePrintString(String str1, String str2) {
		super();
		this.str1 = str1;
		this.str2 = str2;
		// TODO Auto-generated constructor stub
	Thread t = new Thread(this);
	t.start();
		}

	@Override
	public void run() {
PrintString.print(str1, str2);		
	}

}
