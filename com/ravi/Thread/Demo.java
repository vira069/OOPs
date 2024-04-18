package com.ravi.Thread;

class A extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hi");
        }
        try{
            Thread.sleep(5);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("Hello");
        }
        try{
            Thread.sleep(10);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj2.start();
        try{
            Thread.sleep(2);
        }
        catch(InterruptedException e){
            e.printStackTrace();

        }
        obj1.start();
    }
}
