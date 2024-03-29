package org.leaning.javabank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nome cliente?: ");
        String name = scan.nextLine();

        System.out.print("Cognome cliente?: ");
        String surname = scan.nextLine();

        Conto nuovoConto = new Conto(name, surname);

        boolean inEsecuzione = true;

        while(inEsecuzione == true) {

            System.out.println("SELEZIONA UNA DELLE OPERAZIONI SEGUENTI:");
            System.out.println("1 - VERSAMENTI");
            System.out.println("2 - PRELIEVI");
            System.out.println("3 - DETTAGLI CONTO");
            System.out.println("4 - ESCI");
            int select = Integer.parseInt(scan.nextLine());

            switch (select) {
                case 1:
                    System.out.println("Che importo vuoi versare? ");
                    double deposit = Double.parseDouble(scan.nextLine());

                    nuovoConto.versare(deposit);
                    break;

                case 2:
                    System.out.println("Che importo vuoi prelevare? ");
                    double withdrawal = Double.parseDouble(scan.nextLine());

                    nuovoConto.prelevare(withdrawal);
                    break;

                case 3:
                    nuovoConto.estrattoConto();
                    break;

                case 4:
                    inEsecuzione = false;

                default:
                    break;
            }

        }

    }
}
