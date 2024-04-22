package com.ravi.Thread;

class A extends Thread{
    public void run(){
        for(int i=0;i<=5;i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupt");
            }
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=5;i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                System.out.println("Thread2 Interrupt");
            }
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
//        try{
//            Thread.sleep(5);
//        }
//        catch(InterruptedException e){
//            e.printStackTrace();
//
//        }
        obj2.start();
    }
}
