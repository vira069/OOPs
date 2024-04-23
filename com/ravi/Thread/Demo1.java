package com.ravi.Thread;

//class R implements Runnable{
//    @Override
//    public void run() {
//        for(int i=0;i<5;i++) {
//            System.out.println("Hey...!!!");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
//class K implements Runnable{
//    @Override
//    public void run() {
//        for(int i=0;i<5;i++) {
//            System.out.println("Vira...!!!");
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
public class Demo1 {
    public static void main(String[] args) {
        Runnable obj1 = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++) {
            System.out.println("Vira...!!!");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
            }
            }
        };
        Runnable obj2 =new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<5;i++) {
                    System.out.println("Hello");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();
    }
}