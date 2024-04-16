package com.ravi.ExceptionHandling;

public class Example2 {
    public static void main(String[] args) {
        int[] a = {1,3,78,97,9,6,3,9};


        try{
            System.out.println(a[12]);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is final block  always Executed ");
        }
    }
}
