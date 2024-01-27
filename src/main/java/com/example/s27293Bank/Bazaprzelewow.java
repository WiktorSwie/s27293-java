package com.example.s27293Bank;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Bazaprzelewow {

     private final List<Przelew> przelewy = new ArrayList<>();

    public List<Przelew> getlistaPrzelewow() {return przelewy;}
    public void addPrzelew(Przelew przelew) {przelewy.add(przelew);}
}
