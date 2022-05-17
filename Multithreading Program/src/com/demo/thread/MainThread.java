package com.demo.thread;

public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread obj1 = new MyThread("MyThread obj1");
        MyThread obj2 = new MyThread("MyThread obj2");
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
}
}

	


