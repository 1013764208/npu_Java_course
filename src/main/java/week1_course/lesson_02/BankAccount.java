package week1_course.lesson_02;

public class BankAccount {

    double balance;
    double interestRate;


    public BankAccount() {
    }

    public BankAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    // 查看余额
    public void checkBalance() {
        System.out.println(balance);

    }


    // 存款
    public void deposit(double money) {
        balance += money;
    }

    // 取款
    public void withdrawMoney(double money) {
        balance -= money;

    }

    // 查看利息
    public void checkInterestRate() {
        System.out.println(interestRate);
    }


    // 设置利息
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000, 0.01);

        account.checkBalance();
        account.deposit(500);
        account.checkBalance();
        account.withdrawMoney(200);
        account.checkBalance();
        account.checkInterestRate();
        account.setInterestRate(0.015);
        account.checkInterestRate();
    }
}