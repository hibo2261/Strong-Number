package com.bridgelabz;
import java.util.Scanner;

public class StrongNumber {
    public static int fac(int num) //created method for factorial of no.
    {
        int f = 1;
        for (int i = 1; i <= num; i++)
            f = f * i;
        return f;
    }

    public static void main (String[] args) {

        System.out.println("********************************************");
        System.out.println(" Welcome to Strong Number....");   //Printing Welcome Meassage
        System.out.println("********************************************");


        Scanner sc = new Scanner(System.in); // Created a Scanner object
        System.out.println("Please Enter A Number ---> ");
        int num = sc.nextInt();
        int sum =0, temp = num;

        while (num > 0) {
            int d = num % 10; //For getting remainder
            sum = sum + fac(d);
            num = num / 10;
        }

        if (sum == temp)
            System.out.println(temp+" Is A Strong Number.");

        else

            System.out.println(temp+" Is Not A Strong Number.");
    }
}







