package org.leaning.javabank;

import java.util.Random;

public class Conto {
    int numeroConto;
    String nomeCliente;
    double saldo;


    // COSTRUTTORE

    public Conto(String nome, String cognome) {
        this.nomeCliente = nome + " " + cognome;
        this.numeroConto = this.randomCode();
        this.saldo = 0;
    }


    // METODI

    public void versare(double somma){

        saldo += somma;
        System.out.println("Nuovo saldo: " + saldo + "€");
    }

    public void prelevare(double somma){
        if(saldo > somma ){
            saldo -= somma;
            System.out.println("Prelievo effettuato correttamente - Saldo disponibile: " + saldo + "€");
        } else {
            System.out.println("Somma non disponibile - Saldo disponibile: " + saldo + "€");
        }
    }

    public void estrattoConto(){
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Numero conto: " + numeroConto);
        System.out.println("Saldo disponibile: " + saldo);
    }

    private int randomCode(){
        Random randomGen = new Random();
        return randomGen.nextInt(1000+1);
    }


}
