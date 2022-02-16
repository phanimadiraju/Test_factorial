package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// Factorial of a number
        System.out.println("Enter a number");
        Scanner input =new Scanner(System.in);
        int number=input.nextInt();
        int factorial=1;
        for(int i=1;i<=number;i++){
            factorial= factorial * i;
        }
        System.out.println("Factorial of "+number +" is :"+factorial);
    }
}
