package Bank.account;

// Classe de interface de interação do usuário com o app que mostra todas a telas do programa.


import java.time.LocalTime;
import java.util.Scanner;

import static Bank.account.AccountOperations.*;

public class Display {


    public static void menuPrincipal() {
        // Cabeçalho do sistema
        Scanner sc = new Scanner(System.in);
        System.out.println("====== WELCOME TO 24H BANK ======");
        greetings();
        // Loop de sistema até que a pessoa escolha sair dele.
        while (true) {


            System.out.println("\n===============================");
            System.out.println("What do you want to do today? ");
            System.out.println(" 1 - Register the account \n 2 - Deposit \n 3 - Withdraw \n 4 - Change client name \n 5 - Exit\n");

            System.out.println("===============================");
            System.out.print("Type the number option: ");
            int ans = options(sc.nextLine());

            // Finalizando o sistema
            if (ans == 4) {
                goodbye();
                break;
            }

        }
    }

    // metodo para despedida do sistema de acordo com a hora do sistema
    public static void goodbye() {
        LocalTime hora = LocalTime.now();
        System.out.println("Thanks for choosin The 24H Bank");
        if (hora.getHour() > 0 && hora.getHour() < 12) {
            System.out.println("Have a good day!");
        } else if (hora.getHour() >= 12 && hora.getHour() < 18) {
            System.out.println("Have a good afternoon!");
        } else {
            System.out.println("Have a good night!");
        }

    }

    // metodo para boas vindas do sistema de acordo com a hora do sistema
    public static void greetings() {
        LocalTime hora = LocalTime.now();

        if (hora.getHour() > 0 && hora.getHour() < 12) {
            System.out.println("Good morning!");
        } else if (hora.getHour() >= 12 && hora.getHour() < 18) {
            System.out.println("Good afternoon!");
        } else {
            System.out.println("Good night!");
        }

    }

    public static int options(String answer) {
        out:
        while (true) {
            try {
                switch (Integer.parseInt(answer)) {
                    case 1:
                        register();
                        break out;
                    case 2:
                        deposit();
                        break out;
                    case 3:
                        withdraw();
                        break out;
                    case 4:
                        alterName();
                        break out;
                    case 5:
                        break out;
                    default:
                        System.out.println("Please, insert a valid answer.");
                        answer = sc.nextLine();
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please, insert a valid answer.");
                answer = sc.nextLine();
            }

        }
        return Integer.parseInt(answer);
    }


}



