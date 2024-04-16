package com.ravi.Enum;

enum Status{
    Running,Failed,Pending,Success; //Enum is constant value
    // 0        1      2      3     <- indexing
}
public class Demo {
    public static void main(String[] args) {
        Status s = Status.Running;
        // System.out.println(s);
        // System.out.println(s.ordinal()); // for index

        Status[] ss = Status.values();

        for (Status status : ss) {
            System.out.println(status + " has index: " + status.ordinal());
        }

    }
}
