package Activity;

import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks in Science: ");
        int sMarks = sc.nextInt();

        System.out.print("Enter marks in History: ");
        int hMarks = sc.nextInt();

        System.out.print("Enter marks in Math: ");
        int mMarks = sc.nextInt();

        System.out.print("Enter marks in Soc: ");
        int socMarks = sc.nextInt();

        System.out.print("Enter marks in Arts: ");
        int aMarks = sc.nextInt();

        int tm = sMarks + hMarks + mMarks + socMarks + aMarks;
        System.out.println("Total Marks: " + tm);

        double tp = (tm / 500.0) * 100;
        System.out.printf("Total percentage: %.2f%n", tp); 

        String remarks;
        String message;

        if (tp < 70) {
            remarks = "Fail";
            message = "Try Again";
        } else if (tp >= 70 && tp <= 75) {
            remarks = "Poor";
            message = "Congrats " + name + " you Passed.";
        } else if (tp >= 76 && tp <= 80) {
            remarks = "Fair";
            message = "Congrats " + name + " you Passed.";
        } else if (tp >= 81 && tp <= 85) {
            remarks = "Good";
            message = "Congrats " + name + " you Passed.";
        } else if (tp >= 86 && tp <= 90) {
            remarks = "Very Good";
            message = "Congrats " + name + " you Passed.";
        } else if (tp >= 91 && tp <= 100) {
            remarks = "Excellent";
            message = "Congrats " + name + " you Passed.";
        } else {
            remarks = "Invalid Percentage";
            message = "Please check marks entered.";
        }

        System.out.println("Remarks: " + remarks);
        System.out.println(message);

        sc.close();
    }
}