package com.example;

public class Main {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("Pedro", 5000, 1282);
        contaBancaria.depositar(1200);
        System.out.println(contaBancaria.getSaldo());
        contaBancaria.sacar(500);
        System.out.println(contaBancaria.getSaldo());
    }
}