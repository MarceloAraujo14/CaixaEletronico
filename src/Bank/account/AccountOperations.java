package Bank.account;

import java.util.Locale;
import java.util.Scanner;

public class AccountOperations {
    static Scanner sc = new Scanner(System.in);
    static Account account = new Account();

    public static void register() {


        //------- Inserção de número da conta e nome do cliente ------------------
        System.out.println("===============================");
        if (account.getAccountNumber() == null) {
            System.out.print("Please, insert the account number: ");
            String accountNumber = sc.nextLine();
            account.setAccountNumber(accountNumber);
            System.out.print("Please, insert the client name: ");
            String name = sc.nextLine();
            account.setName(name);

            // ---------- Primeiro depósito ou sem depósito ------------------

            do {
                System.out.print("Do the client will make a initial deposit? [s/n] ");
                String answer = sc.next().toLowerCase(Locale.ROOT);
                if (answer.equals("s")) {
                    System.out.print("Please, insert the initial deposit: $ ");
                    double balance = sc.nextDouble();
                    account.deposit(balance);

                    break;
                } else if (answer.equals("n")) {
                    break;
                } else {
                    System.out.println("Please, entry a valid answer.");
                }
            } while (true);
        } else {
            System.out.println("Account already registered.");
        }

        System.out.println(account);

    }

    // ---------------- Método Depósito -------------------------------

    public static void deposit() {
        System.out.println("===============================");
        System.out.print("Please, insert the deposit value: $ ");
        double balance = sc.nextDouble();
        account.deposit(balance);

        System.out.println(account);

    }


    // ---------------- Método Saque ----------------------------------

    public static void withdraw() {
        System.out.println("===============================");
        System.out.print("Please, insert the withdraw value: $ ");
        double balance = sc.nextDouble();
        account.withdraw(balance);

        System.out.println(account);

    }

    //------- Alterar o nome do cliente ------------------

    public static void alterName() {
        System.out.println("===============================");
        System.out.print("Please, insert the new client name: ");
        String name = sc.nextLine();
        account.setName(name);
    }
}
