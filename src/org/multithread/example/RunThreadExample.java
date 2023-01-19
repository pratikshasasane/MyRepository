package org.multithread.example;

class Thread1 extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println(i);
        }
    }
}


class Thread2 extends Thread
{
    public void run()
    {
        for(int i=101;i<=200;i++)
        {
            System.out.println(i);
        }
    }
}

class Thread3 extends Thread
{
    public void run()
    {
        for(int i=201;i<=300;i++)
        {
            System.out.println(i);
        }
    }
}

public class RunThreadExample {

    public static void main(String[] args) {
    
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();

        t1.start();
        t2.start();
        t3.start();
    }

}


