public class Bank {
    long accountNumber;
    double balance;

    Bank(long accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double withdraw(double amount){
        if(balance < amount){
            System.out.println("Balance is low!!");
        }
        else{
            balance = balance - amount;
            System.out.println("rupee " + amount + " is withdraw succesfully. The available balance is: " + balance);
        }
        return amount;
    }

    public void deposite(double amount){
        balance = balance + amount;
        System.out.println("Money Deposited succesfully");

    }

    public void showBalance(){
        System.out.println("The available balance is: " + balance);
    }

    public static void main(String[] args) {
        Bank bank = new Bank(65494964448L, 15000);

        bank.withdraw(10000);
        bank.showBalance();
        bank.deposite(200);
        bank.showBalance();

    }
}
