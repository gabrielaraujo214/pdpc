package com.example;

public class Consumidor extends Thread {
    private String nome;
    private Estoque estoque;
    private int iteracoes;

    public Consumidor(String nome, Estoque estoque, int iteracoes) {
        this.nome = nome;
        this.estoque = estoque;
        this.iteracoes = iteracoes;
    }

    public void run() {
        try {
            for (int i = 0; i < iteracoes; i++) {
                int produto = estoque.retirar();
                System.out.println("CONSUMIDOR " + nome + " CONSUMIU PRODUTO: " + produto);
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }

    // Getters e setterss
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

}
