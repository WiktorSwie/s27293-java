package com.example.s27293Bank;

public enum Status_przelewu {
    ACCEPTED(1), DECLINED(0);

    private final int i;
    Status_przelewu(int i) {
        this.i = i;
    }
    public int getI(){
        return i;
    }
}
