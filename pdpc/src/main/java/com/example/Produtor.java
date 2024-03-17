package com.example;

import java.util.concurrent.atomic.AtomicInteger;

public class Produtor implements Runnable {
    private String nome;
    private Estoque estoque;
    private int iteracoes;
    private Object lock;
    private static AtomicInteger proximoId = new AtomicInteger(1);

    public Produtor(String nome, Estoque estoque, int iteracoes, Object lock) {
        this.nome = nome;
        this.estoque = estoque;
        this.iteracoes = iteracoes;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < iteracoes; i++) {
            synchronized (lock) {
                int id = proximoId.getAndIncrement();
                Produto produto = new Produto(id);

                System.out.println("PRODUTOR " + nome + " PRODUZIU PRODUTO: " + produto.getId());

                estoque.alocar(produto);
            }
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