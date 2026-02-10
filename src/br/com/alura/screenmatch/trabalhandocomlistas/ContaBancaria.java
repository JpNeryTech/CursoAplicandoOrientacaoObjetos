package br.com.alura.screenmatch.trabalhandocomlistas;

import java.util.ArrayList;

public class ContaBancaria {
    private int numeroDaConta;
    private double saldo;


    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaBancaria(int numeroDaConta, double saldo){
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

}
