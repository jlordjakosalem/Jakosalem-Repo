package MetroBank;

public class BankingClass {
    
    private int accountNo;
    private float initialBalance;
    private int pin;

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }
    
    public boolean verifyAccount(int acc, int pn){
        
        return acc == accountNo && pn == pin;
    }
    
    public int setAccount(){
        return accountNo;
    }
    
    public void viewBalance(){
    
    
    }
      
}