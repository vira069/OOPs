package com.ravi.ExceptionHandling;

public class ExampleException {
    public static void main(String[] args) {
        int a,b,ans;
        a = 10;
        b = 0;

        try {
            ans = a / b;
        }
//        catch(Exception e){
//            System.out.println(e);
//        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is always Executed ");
        }
    }
}
