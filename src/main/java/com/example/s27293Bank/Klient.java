package com.example.s27293Bank;

public class Klient {
    int id;
    double saldo;
    public Klient(int ID, double SALDO)
    {
        id = ID;
        saldo = SALDO;
    }
    public void setid(int id) {
        this.id = id;
    }

    public int getid() {
        return id;
    }
    public double setsaldo() {
        return saldo;
    }
    public double getsaldo() {
        return saldo;
    }

}
