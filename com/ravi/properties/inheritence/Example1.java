package com.ravi.properties.inheritence;

public class Example1 {
    public static class Animal {
        String color;

        void eat() {
            System.out.println("Eats");
        }

        void breathe() {
            System.out.println("Breathing...");
        }

        void walk() {
            System.out.println("walking");
        }
    }
    public static class Fish extends Animal {
        int fins;
        void swim(){
            System.out.println("Swims in water");
        }
    }

    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}

