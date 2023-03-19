package org.example;

public class Dikdortgen extends Sekil{
    int uzunKenar;
    int kisaKenar;

    public Dikdortgen(int uzunKenar, int kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }
    @Override
    double cevreHesapla() {
        return 2*(uzunKenar + kisaKenar);
    }

    @Override
    double alanHesapla() {
        return uzunKenar*kisaKenar;
    }
}
