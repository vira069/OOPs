package com.ravi.OOP_Properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle  = new Circle();
        Square square = new Square();

        Shapes triangle = new Triangle();

       //shape.area();
        //square.area();
        //circle.area(); Area is pie * r*r

        triangle.area(); // Area is 0.5* height * base this is because object type is (new Triangle();)

    }
}
