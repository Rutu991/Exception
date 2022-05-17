package com.demo.thread;

class MyThread implements Runnable{

	//@Override
	//public void run() {
		// TODO Auto-generated method stub
		
	//}
	String message;
    MyThread(String msg)
    {
          message = msg;
    }
    public void run()
    {
          for(int count=0;count<=5;count++)
          {
                try
                {
                      System.out.println("Run method: " + message);
                      Thread.sleep(100);
                }
                catch (InterruptedException ie)
                {
                      System.out.println("Exception in thread: "+ie.getMessage());
                }
          }
    }

}


