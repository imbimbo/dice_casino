package com.company;

public abstract class Jogo implements IJogo{

    private String _jogador;
    protected int _montante;
    public Jogo(String jogador, int montante){
        this._montante = montante;
        this._jogador = jogador;
    }

    public void ver(){
        System.out.println("----------------------");
        System.out.println("Jogador: " + this._jogador);
        System.out.println("Montante: " + this._montante);
    }


    @Override
    public void setMontante(int montante) {
        if (montante >= 0)this._montante = montante;
    }

    @Override
    public int getMontante() {
        return this._montante;
    }

    @Override
    public abstract void jogar(int aposta);

    @Override
    public String getJogador() {
        return _jogador;
    }




}
