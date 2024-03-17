package com.example;

public class Main extends Thread {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        int iteracoes = 10;

        Produtor produtor1 = new Produtor("Renan", estoque, iteracoes);
        Produtor produtor2 = new Produtor("Vitoria", estoque, iteracoes);

        Consumidor consumidor1 = new Consumidor("Gabriel", estoque, iteracoes);
        Consumidor consumidor2 = new Consumidor("Luiz", estoque, iteracoes);

        Thread threadProdutor1 = new Thread(produtor1);
        Thread threadProdutor2 = new Thread(produtor2);
        Thread threadConsumidor1 = new Thread(consumidor1);
        Thread threadConsumidor2 = new Thread(consumidor2);

        threadProdutor1.start();
        threadConsumidor1.start();
        threadProdutor2.start();
        threadConsumidor2.start();
    }
}
