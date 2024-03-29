package org.leaning.oop;

import java.util.Random;

public class Prodotto {
    int codice;
    String nome;
    String descrizione;
    double prezzo;
    int iva;

    // COSTRUTTORI


    public Prodotto(String nome, String descrizione, double prezzo, int iva) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
        this.codice = this.randomCode();

    }

    // METODI
    public String price(){
        return String.format("%.2f €", prezzo);
    }
    public String ivaPrice(){
        double ivaPrice = prezzo + (iva * prezzo / 100);
        return String.format("%.2f €", ivaPrice);
    }

    public String nomeEsteso(){
        String codeString = String.format("%08d", codice);
        return codeString + "-" + this.nome;
    }

    private int randomCode(){
        Random randomGen = new Random();
        int code = randomGen.nextInt(99999999+1);
        return code;
    }
}
