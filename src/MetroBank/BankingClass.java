
package MetroBank;

import java.util.Scanner;

public class BankingClass {

    int accountNo = 10001;
    String name;
    float ib = 0;
    int pin = 1234;
    private int la = 0; 
    private final int ma = 3; 

    public boolean verifyAccount(int acc, int pn) {
        if (acc == accountNo && pn == pin) {
            this.la = 0; 
            return true;
        } else {
            this.la++;
            System.out.println("Invalid account number or PIN. Attempts left: " + (ma - this.la));
            return false;
        }
    }

    public boolean isAccountLocked() {
        return this.la >= ma;
    }

    public int setAccount() {
        return accountNo;
    }

    public void viewBalance() {
        System.out.println("Current balance: $" + ib);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BankingClass bank = new BankingClass();
            
            System.out.println("Welcome to the Banking System!");
            
            while (!bank.isAccountLocked()) {
                System.out.print("Enter account number: ");
                int accNum = scanner.nextInt();
                System.out.print("Enter PIN: ");
                int pinNum = scanner.nextInt();
                
                if (bank.verifyAccount(accNum, pinNum)) {
                    System.out.println("Login successful!");
                    bank.viewBalance();
                    break;
                } else if (bank.isAccountLocked()) {
                    System.out.println("Account locked due to too many failed attempts. Please contact support.");
                }
                System.out.println("--------------------");
            }
        }
    }
}
