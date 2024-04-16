package com.ravi.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter a number ");
            int num = sc.nextInt();
            if(num%2==0){
                System.out.println(num+"is Even");
            }
            else{
                System.out.println(num+" is odd");
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. Please enter an integer.");
        }
    }
}
