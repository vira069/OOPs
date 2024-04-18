package com.ravi.ExceptionHandling;

class B{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}
public class DuckingException { // using throws

    static {
        System.out.println("Class is Loaded");
    }
    public static void main(String[] args) {
            B obj = new B();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
