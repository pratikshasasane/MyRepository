package org.multithread.example;
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread is running..");
    }
}


public class ThreadExample1 {

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        t1.start();
        
        MyThread t2=new MyThread();
        t2.start();

    }

}

