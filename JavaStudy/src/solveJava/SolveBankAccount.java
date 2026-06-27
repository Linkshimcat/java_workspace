package solveJava;

class MyBankAccount {
    int balance;

    int getBalance() {
        return balance;
    }

    void setBalance(int money) {
        if(money < 0) {
            System.out.println("잘못된 금액입니다.");
            return;
        }
        balance = money;
    }

}

public class SolveBankAccount {
    public static void main(String[] args) {
        MyBankAccount bank = new MyBankAccount();
        bank.setBalance(10000);
        System.out.println("잔액: " + (bank.getBalance()));
        bank.setBalance(-1000);
//        System.out.println("잔액: " + (bank.getBalance()));
    }
}
