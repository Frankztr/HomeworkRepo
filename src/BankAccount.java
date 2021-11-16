public class BankAccount {
    private String name;
    private int balance;
    BankAccount(String name, int initialBalance){
        this.name=name;
        this.balance=initialBalance;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }

    public void deposit(int num){
        balance+=num;
    }
    public void withdraw(int num){
        if(num>balance){
            System.out.println("Withdraw Failed");
        }else{
            balance-=num;
        }
    }

    @Override
    public String toString() {
        return "Name:    "+name+"\n" +
               "Balance: "+balance;
    }
}
