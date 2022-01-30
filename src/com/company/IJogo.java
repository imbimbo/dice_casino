package com.company;

public interface IJogo {

    static final int MINIMAPOSTA = 10;
    void setMontante(int montante);
    int getMontante();
    void jogar(int aposta);
    String getJogador();

    static void publicidade(String nome){
        System.out.println("Bem vindo ao Casino " + nome);
    }

    default void cumprimenta(){
        System.out.println("Boa noite");
    }



}
