package com.example;

import java.util.concurrent.LinkedBlockingQueue;

public class Estoque {
    private LinkedBlockingQueue<Produto> estoque;

    public Estoque() {
        estoque = new LinkedBlockingQueue<Produto>();
    }

    public void alocar(Produto produto) {
        estoque.add(produto);

    }

    public int retirar() throws InterruptedException {
        Produto produto = estoque.take();
        // pode dar ruim
        return produto.getId();
    }

    public boolean vazio() {
        return estoque.isEmpty();
    }

    public LinkedBlockingQueue<Produto> getEstoque() {
        return estoque;
    }
}
