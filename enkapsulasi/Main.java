package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount winaldi = new BankAccount(100);

        // beli minuman 10 (withdraw)
        winaldi.withdraw(10);
        System.out.println("Current balance is: " + winaldi.getBalance());
    }
}
