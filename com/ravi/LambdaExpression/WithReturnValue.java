package com.ravi.LambdaExpression;

interface Player{
    int run(int speed,int time);
}
public class WithReturnValue { // Lambda Expression with return value
    public static void main(String[] args) {
        Player p = (speed,time)->speed*time;
                                //return value^

        int dist = p.run(58,4);
        System.out.println(dist);
    }
}
