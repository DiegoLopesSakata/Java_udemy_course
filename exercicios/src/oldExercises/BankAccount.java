package oldExercises;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private float balance;

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public float getBalance() {
        return balance;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public BankAccount (int accountNumber, String holderName){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        balance = 0;
    }

    public BankAccount (int accountNumber, String holderName, float value){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        balance = value;
    }

    public void deposit(float value){
        balance+=value;
    }

    public boolean withdraw(float value){
        if(value > balance) return false;

        balance-=value;
        return true;
    }

    public String toString(){
        return "Account "
                + accountNumber
                + ", Holder: "
                + holderName
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
