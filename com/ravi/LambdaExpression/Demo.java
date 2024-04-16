package com.ravi.LambdaExpression;

interface A{
    void show();
}

public class Demo {
    public static void main(String[] args) {
        // Before java 8
/*        A obj = new A() {
            @Override
            public void show() {
                System.out.println("In Show");
            }
        };                 */

        // After java 8 the Lambda Expression is added
        A obj = ()->{
            System.out.println("In Show ");
        };

        obj.show();
    }
}
