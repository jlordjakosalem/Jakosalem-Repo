package MetroBank;

import java.util.Scanner;

public class Banking {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE Metro System!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Apply for a Loan");
        System.out.println("3. Foreign Currency Exchange");
        
        BankingClass metrobApp[] = new BankingClass[10];
        int accountCount = 0;
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        int resp;
        switch(choice){
            case 1:
              do{
                System.out.println("1. Register Account");
                System.out.println("2. Login Account");
                System.out.println("3. View All Accounts");
                System.out.println("Enter Selection: ");
                int action = sc.nextInt();
                
                switch(action){
                    case 1:
                                if (accountCount < metrobApp.length) {
                                metrobApp[accountCount] = new BankingClass();
                                System.out.print("Enter Account No.: ");
                                metrobApp[accountCount].setAccountNo(sc.nextInt());
                                System.out.print("Enter Account Pin: ");
                                metrobApp[accountCount].setPin(sc.nextInt());
                                System.out.println("Account registered successfully!");
                                accountCount++;
                            } else {
                                System.out.println("Invalid!");
                            }
                            break;
                    case 2:
                        int attempts = 3;
                        boolean loginSuccess = false;
                        BankingClass bc = new BankingClass();

                        while(attempts > 0 && !loginSuccess) {
                                System.out.print("Enter your Account No: ");
                                int accountNo = sc.nextInt();
                                System.out.print("Enter your Pin: ");
                                int pin = sc.nextInt();                             
                                for (int i = 0; i < accountCount; i++) {
                                    if (metrobApp[i].verifyAccount(accountNo, pin)) {
                                        System.out.println("You have Successfully Login");
                                        System.out.println("Current Balance: 1,003,241$/n");
                                        System.out.print("Enter Amount for Withdrawal:");
                                        int withd = sc.nextInt();
                                            System.out.println("\n\nThe transaction was successfully completed, just imagine your holding it.\nYou cannot see it, but it's there. Trust Me.\n");                              
                            
                                        loginSuccess = true;
                                        break;
                                    }
                                }
                                if (!loginSuccess) {
                                    attempts--;
                                    System.out.println("INVALID ACCOUNT! Attempt Left: " + attempts);
                                    if(attempts == 0) {
                                        System.out.println("ATTEMPT LIMIT REACHED!");
                                        System.exit(0);
                                    }
                                }
                            }
                            break;
                    case 3:
                        break;
                
                }
                  System.out.print("Do you want to continue? (Yes-1/No-0):");
                  resp = sc.nextInt();
              }while(resp == 1);
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
            
    }
    
}