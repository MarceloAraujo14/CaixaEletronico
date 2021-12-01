package Bank.account;

// Classe da Entidade Conta Corrente
public class Account {
    private String accountNumber = null;
    private String name;
    private double balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }


    protected void setAccountNumber(String accountNumber) {
        if (this.accountNumber == null) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("O número da conta não pode ser alterado.");
        }
    }

    protected void deposit(double balance) {
        this.balance += balance;
    }

    protected void withdraw(double balance) {
        this.balance -= balance;
    }


    @Override
    public String toString() {
        return "Account: " +
                "\n Account: " + accountNumber +
                "\n Client: " + name +
                "\n Balance: $" + balance;
    }
}
