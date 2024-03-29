package org.leaning.javashop;

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
    public double price(){
        return prezzo;
    }
    public double ivaPrice(){
        return prezzo + (iva * prezzo / 100);
    }

    public String nomeEsteso(){
        String codeString = String.format("%08d", codice);
        return codeString + "-" + this.nome;
    }

    private int randomCode(){
        Random randomGen = new Random();
        return randomGen.nextInt(99999999+1);
    }
}
