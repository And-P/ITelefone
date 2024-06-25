package com.umbrella.services;

public class ReprodutorMusical implements Reprodudor {

    @Override
    public void tocar() {
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música.");
    }

    @Override
    public void selecionar() {
        System.out.println("Selecionar música");
    }
}
