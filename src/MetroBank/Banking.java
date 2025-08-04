package Banking;

import MetroBank.BankingClass;
import java.util.Scanner;

public class Banking {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("HELLO WELCOME TO THE SYSTEM!");
            System.out.println("What do you feel doing today? ");
            System.out.println("1. Banking");
            System.out.println("2. Doctors Appointment");
            System.out.println("3. Shopping");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    BankingClass bc = new BankingClass();
                    
                    while (!bc.isAccountLocked()) {
                        System.out.println("--- Banking Login ---");
                        System.out.print("Enter your Account No: ");
                        int accountNo = sc.nextInt();
                        
                        System.out.print("Enter your Pin: ");
                        int pin = sc.nextInt();
                        
                        if (bc.verifyAccount(accountNo, pin)) {
                            System.out.println("LOGIN SUCCESS");
                            bc.viewBalance(); 
                            break; 
                        } else {
                           
                            if (bc.isAccountLocked()) {
                                System.out.println("Account locked due to too many failed attempts. Please contact support.");
                            }
                        }
                        System.out.println("--------------------"); 
                    }
                    break; 
                case 2:
                    System.out.println("Doctors Appointment functionality is not yet implemented.");
                    break;
                case 3:
                    System.out.println("Shopping functionality is not yet implemented.");
                    break;
                default:
                    System.out.println("Invalid Selection!");
            }
        }
    }
}