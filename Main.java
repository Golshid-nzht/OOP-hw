public class Main{
    public static void main(String[] args){
        BankAccount acc = new BankAccount("ACC-101", "Alice", 1000);
        acc.deposit(-200);
        acc.deposit(500);
        acc.withdraw(2000);
        acc.withdraw(300);
        acc.displayAccountInfo();
    }
}