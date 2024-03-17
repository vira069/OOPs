package com.ravi.properties.polymorphism.overloading;

public class OverloadDemo {
        void test(double a){
            System.out.println("Inside test(double) a: " + a);
        }
    }
    class Overload {
        public static void main(String args[]) {
            OverloadDemo ob = new OverloadDemo();
            int i = 88;
            ob.test(i);        // this will invoke test(double)
            ob.test(123.2);    // this will invoke test(double)
        }
    }
