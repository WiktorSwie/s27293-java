package com.example.s27293Bank;

import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class Dzialania {

    private final BazaKlientow bazaklientow;
    private final Bazaprzelewow bazaprzelwow;

    public Dzialania(BazaKlientow bazaklientow, Bazaprzelewow bazaprzelwow) {
        this.bazaklientow = bazaklientow;
        this.bazaprzelwow = bazaprzelwow;
    }
    public Optional<Klient> findklient(int id){
        return bazaklientow.getListaKlientow().stream()
                .filter(klient -> Objects.equals(klient.getid(), id))
                .findFirst();
    }

    public boolean klientistnieje(int id){
        boolean klientNieIstnieje = findklient(id).isEmpty();
        return !klientNieIstnieje;
    }

    public Klient register (int id, double saldo) {
        if (klientistnieje(id)){
            Klient klient = new Klient(id,saldo);
            bazaklientow.addKlient(klient);
            return klient;
        }
        return null;
    }

    public BazaKlientow zrobprzelew(int id, double wartosc){
        if (klientistnieje(id)){
            double nowe_saldo = 0;
            int idprzelewu = 123;
            Klient klient = new Klient(id, );
            double saldo = klient.getsaldo();
            if(saldo > wartosc)
                nowe_saldo = saldo - wartosc;
                klient.setsaldo(nowe_saldo);
                Przelew przelew = new Przelew(idprzelewu,id,wartosc,1 )
            bazaprzelow.addprzelew(klient);
            return null;
        }
        return null;
    }
    
}
