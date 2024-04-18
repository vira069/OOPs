package com.ravi.ExceptionHandling;
class RaviException extends Exception{
    RaviException(String str){
        super(str);
    }
}

public class Example4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;
        try{
            b = 18/a;
            if(b==0){
                throw new RaviException("I don't want to print zero ");
                }
        }
        catch (RaviException e){
            b = a/1;
            System.out.println("This is the default output " +b );
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
