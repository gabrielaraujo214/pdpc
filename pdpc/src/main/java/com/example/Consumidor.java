package com.example;

public class Consumidor implements Runnable {
    private String nome;
    private Estoque estoque;
    private int iteracoes;
    private Object lock;

    public Consumidor(String nome, Estoque estoque, int iteracoes, Object lock) {
        this.nome = nome;
        this.estoque = estoque;
        this.iteracoes = iteracoes;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < iteracoes; i++) {
                synchronized (lock) {
                    int produto = estoque.retirar();
                    System.out.println("CONSUMIDOR " + nome + " CONSUMIU PRODUTO: " + produto);
                }

            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estoque getEstoque() {
        return estoque;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    public int getIteracoes() {
        return iteracoes;
    }

    public void setIteracoes(int iteracoes) {
        this.iteracoes = iteracoes;
    }

}
