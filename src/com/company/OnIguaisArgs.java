package com.company;

import java.time.LocalDate;
import java.util.EventObject;

public class OnIguaisArgs extends EventObject {
    public LocalDate Quando;
    public int Aposta;

    public OnIguaisArgs(Object source, int aposta) {
        super(source);
        this.Aposta = aposta;
        Quando = LocalDate.now();
    }
}
