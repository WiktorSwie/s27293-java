package com.example.s27293Bank;
public class Przelew {
    
    private int idprzelewu;
    private Klient id;

    private double wartosc;
    private Status_przelewu status_przelewu;
    public Przelew(int idprzelewu, Klient id, double wartosc, Status_przelewu status_przelewu) {
        this.idprzelewu = idprzelewu;
        this.id = id;
        this.wartosc = wartosc;
        this.status_przelewu = status_przelewu;
    }

    public int getIdprzelewu() {
        return idprzelewu;
    }

    public void setIdprzelewu(int idprzelewu) {
        this.idprzelewu = idprzelewu;
    }

    public double getWartosc() {
        return wartosc;
    }

    public void setWartosc(double wartosc) {
        this.wartosc = wartosc;
    }

    public Status_przelewu getStatus_przelewu() {
        return status_przelewu;
    }

    public void setStatus_przelewu(Status_przelewu status_przelewu) {
        this.status_przelewu = status_przelewu;
    }
}
