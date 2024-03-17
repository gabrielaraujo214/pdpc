package com.example;

import java.util.concurrent.LinkedBlockingQueue;

public class Estoque {
    private LinkedBlockingQueue<Integer> estoque;

    public Estoque() {
        estoque = new LinkedBlockingQueue<Integer>();
    }

    public void alocar(Produto produto) {
        estoque.add(produto.getId());
    }

    public int retirar() throws InterruptedException {
        return estoque.take();
    }

    public boolean vazio() {
        return estoque.isEmpty();
    }

    public LinkedBlockingQueue<Integer> getEstoque() {
        return estoque;
    }
}
