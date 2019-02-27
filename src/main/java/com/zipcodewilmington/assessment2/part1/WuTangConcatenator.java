package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer wutang;
    public WuTangConcatenator(Integer input) {
        this.wutang = input;
        isWu();
        isTang();
        isWuTang();
    }

    public Boolean isWu() {
        return wutang%3 == 0;
    }

    public Boolean isTang() {
        return wutang%5 == 0;
    }

    public Boolean isWuTang() {
        return isTang() && isWu();
    }
}
