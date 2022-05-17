package com.demo.example;

public class MultipleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTest thread1 = new ThreadTest( "First Thread");
        thread1.start();
  
        ThreadTest thread2 = new ThreadTest( "Second Thread");
        thread2.start();
  }   

	}


