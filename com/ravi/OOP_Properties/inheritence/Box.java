package com.ravi.OOP_Properties.inheritence;

public class Box {
    private double l;
    double h;
    double w;
    static void greeting(){
        System.out.println("Hey! , I am in Box class. Greetings! ");
    }
    public double getL() {
        return l;
    }

    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    //Cube
    Box(double side){
        this.w=side;
        this.l=side;
        this.h=side;
    }
    Box(double l,double h,double w){
        System.out.println("Box class constructor");
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
}
