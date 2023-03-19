package org.example;

public class Ucgen extends Sekil{
    int tabanAlan;
    int yukseklik;

    public Ucgen(int tabanAlan, int yukseklik) {
        this.tabanAlan = tabanAlan;
        this.yukseklik = yukseklik;
    }
    @Override
    double cevreHesapla() {
        int hipotenus = (int) Math.sqrt(tabanAlan*tabanAlan + yukseklik* yukseklik);
        return tabanAlan + yukseklik + hipotenus;
    }

    @Override
    double alanHesapla() {
        return tabanAlan * yukseklik / 2;
    }
}
