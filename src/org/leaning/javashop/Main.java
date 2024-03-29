package org.leaning.javashop;

public class Main {
    public static void main(String[] args) {
        Prodotto Mela = new Prodotto("Mela", "Bellissima e buonissima", 1.20, 10);
        Prodotto Vino = new Prodotto("Vino", "Rossissimo e buonissimo", 11.70, 20);

        System.out.println("Codice prodotto :" + Mela.codice);
        System.out.println("Nome prodotto :" + Mela.nome);
        System.out.println("Nome esteso prodotto :" + Mela.nomeEsteso());
        System.out.println("Descrizione prodotto :" + Mela.descrizione);
        System.out.println("Prezzo prodotto :" + String.format("%.2f €", Mela.price()));
        System.out.println("Prezzo+iva(" + Mela.iva + "%) prodotto :" + String.format("%.2f €", Mela.ivaPrice()));


        System.out.println(" ");
        System.out.println("Codice prodotto :" + Vino.codice);
        System.out.println("Nome prodotto :" + Vino.nome);
        System.out.println("Nome esteso prodotto :" + Vino.nomeEsteso());
        System.out.println("Descrizione prodotto :" + Vino.descrizione);
        System.out.println("Prezzo prodotto :" + String.format("%.2f €", Vino.price()));
        System.out.println("Prezzo+iva(" + Vino.iva + "%) prodotto :" + String.format("%.2f €", Vino.ivaPrice()));

    }
}
