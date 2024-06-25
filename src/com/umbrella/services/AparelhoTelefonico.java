package com.umbrella.services;

public class AparelhoTelefonico implements Telefone {

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
        correioDeVoz();
    }

    @Override
    public void correioDeVoz() {
        System.out.println("Correio de voz.");
    }
}
