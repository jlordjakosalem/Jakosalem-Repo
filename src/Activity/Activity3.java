package Activity;

import java.util.Scanner;

public class Activity3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("//instance 1");
            System.out.print("Enter a number: ");
            int num1 = sc.nextInt();
            if (num1 > 0) {
                System.out.println(num1 + " is a positive number");
            } else if (num1 < 0) {
                System.out.println(num1 + " is a negative number");
            } else {
                System.out.println("Inputted number Zero");
            }
            System.out.println();
            
            System.out.println("//instance 2");
            System.out.print("Enter a number: ");
            int num2 = sc.nextInt();
            if (num2 > 0) {
                System.out.println(num2 + " is a positive number");
            } else if (num2 < 0) {
                System.out.println(num2 + " is a negative number");
            } else {
                System.out.println("Inputted number Zero");
            }
            System.out.println();
            
            System.out.println("//instance 1");
            System.out.print("Enter a number: ");
            int num3 = sc.nextInt();
            if (num3 > 0) {
                System.out.println(num3 + " is a positive number");
            } else if (num3 < 0) {
                System.out.println(num3 + " is a negative number");
            } else {
                System.out.println("Inputted number Zero");
            }
        }
    }
}