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
    public double getbalance(){
        return balance;
    }
    public String getAccountName(){
        return AccountName;
    }
    public String getownerName(){
        return ownerName;
    }
    public void setownerName(String ownerName){
        if(ownerName==null || ownerName.isblank()){
            System.out.println("Error : it can not be blank");
            return; //اگه رترن نذاریم قسمت مقداری دهی انجام میشود و نام قبلی از بین میرود
        }
        this.ownerName = ownerName; // مقدار دهی نام جدید
    }
    public void desposite(double amount){
        if(amount<=0){
            System.out.println("Error : deposite number must be positive")
            return;
        }
        balance += amount;
        System.out.println("Deposited" + amount);
    }
    public void withdraw(doublde amount){
        if (amount <= 0) {
            System.out.println("Error: Withdrawa amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient funds.");
            return;

            balanc -= amount;
        System.out,println(amount + "withdrew")
    }
        public void displayAccountInfo(){
            System.out.println("Account Number: " + accountNumber
                    + ", Owner: " + ownerName
                    + ", Balance: $" + balance);
        }

}