public class BankAccount{
    private string accountNumber;
    private string ownerName;
    private double balance;

    public BankAccount( String accountNumber,String ownerName, double balance ){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;

        if(balance >=0){
            this.balance = balance;
        }
        else{
            this.balance = 0;
        }
        //constructor
    }






}