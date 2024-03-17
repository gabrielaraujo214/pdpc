package com.example;

public class Main extends Thread {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Produtor renan = new Produtor("Renan", estoque, 10);
        Consumidor gabriel = new Consumidor("Gabriel", estoque, 10);

        renan.start();
        gabriel.start();
    }
}
