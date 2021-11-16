public class Proj6_5 {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("Frank",1000);
        System.out.println(account);
        account.deposit(200);
        System.out.println(account);
        account.withdraw(3300);
        account.withdraw(400);
        System.out.println(account);

    }
}
