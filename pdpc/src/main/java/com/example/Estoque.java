package com.example;

import java.util.concurrent.PriorityBlockingQueue;

public class Estoque {
    private PriorityBlockingQueue<Integer> estoque;

    public Estoque() {
        estoque = new PriorityBlockingQueue<Integer>();
    }

    public void alocar(int produtoId) {
        estoque.add(produtoId);
    }

    public int retirar() throws InterruptedException {
        return estoque.take();
    }

    public void mostrarEstoque() {
        System.out.println("Estoque: " + getEstoque());
    }

    // Setter
    public PriorityBlockingQueue<Integer> getEstoque() {
        return estoque;
    }
}
