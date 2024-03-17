package com.example;

public class Produtor extends Thread {
    private String nome;
    private Estoque estoque;
    private int iteracoes;
    private int produto;

    public Produtor(String nome, Estoque estoque, int iteracoes) {
        this.nome = nome;
        this.estoque = estoque;
        this.iteracoes = iteracoes;
        produto = 0;
    }

    public void run() {
        while (produto < iteracoes) {
            produto++;
            System.out.println("PRODUTOR " + nome + " PRODUZIU PRODUTO: " + produto);
            estoque.alocar(produto);
        }
    }

    // Getters e setters
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

    public int getproduto() {
        return produto;
    }
}