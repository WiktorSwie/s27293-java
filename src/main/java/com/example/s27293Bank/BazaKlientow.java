package com.example.s27293Bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BazaKlientow {
    private final List<Klient> klienci = new ArrayList<>();

    public List<Klient> getListaKlientow() {return klienci;}
    public void addKlient(Klient klient) {klienci.add(klient);}
}
