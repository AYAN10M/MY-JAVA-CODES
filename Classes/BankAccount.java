
class BankAccount {

    String accountNumber;
    String accountHolderName;
    double balance;

    // Constructor to initialize account details
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Method to transfer money from person 1 to person 2
    public void transferMoney(BankAccount person1, BankAccount person2, int amount) {
        if (person1.balance >= amount) {
            person1.balance -= amount;
            person2.balance += amount;
            System.out.println("Transferred $" + amount + " from " + person1.accountHolderName + " to " + person2.accountHolderName);
        } else {
            System.out.println("Insufficient Balance in " + person1.accountHolderName + "'s account.");
        }
    }

    // Method to display account info (account number, account holder name, and balance)
    void info() {
        System.out.println("Account Number: " + accountNumber + " | Account Holder: " + accountHolderName + " | Balance: $" + balance);
    }

    public static void main(String[] args) {
        // Create two sample accounts
        BankAccount person1 = new BankAccount("1234567890", "Alice", 5000);
        BankAccount person2 = new BankAccount("9876543210", "Bob", 3000);

        // Display initial account info
        person1.info();
        person2.info();

        // Transfer money from person 1 to person 2
        person1.transferMoney(person1, person2, 1000);

        // Display updated account info after the transfer
        person1.info();
        person2.info();
    }
}
