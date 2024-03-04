package com.ravi.packages.staticPractice;

public class Main {
    public static void main(String[] args) {

    Human  ravi = new Human(20,"Vira",8900000,false);
        Human nikkii = new Human(19,"Nikkii",9000000,false);

        System.out.println(ravi.name);
        System.out.println(nikkii.name);
        System.out.println(Human.population);

    }
}
