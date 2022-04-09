package com.bridgelabz;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int number1=0,number2=1,number3,i,number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the boundry value for fibonacci series :");
        number=scanner.nextInt();
        if(number==0)
            System.out.println(number);
        else {
            System.out.print(number1+"   "+number2);
            for(i=2;i<number;i++)
            {
                number3=number1+number2;
                System.out.print("   "+number3);
                number1=number2;
                number2=number3;
            }
        }
    }
}
