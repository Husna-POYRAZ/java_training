package org.example;

import java.util.ArrayList;

public class Hastane {
    ArrayList<Doktor> doktorListesi = new ArrayList<>();
    public static int toplamDoktor;
    public static class Doktor {
        private String adi;
        private String soyadi;

        public Doktor(String adi, String soyadi){
            this.adi = adi;
            this.soyadi = soyadi;
            toplamDoktor++;
        }

        public String getAdi() {
            return adi;
        }

        public void setAdi(String adi) {
            this.adi = adi;
        }

        public String getSoyadi() {
            return soyadi;
        }

        public void setSoyadi(String soyadi) {
            this.soyadi = soyadi;
        }

        public void doktoruYazdir() {
            System.out.println("Doktar adı : " + getAdi() + " soyadi : " + getSoyadi());
        }
    }

    public void doktorUret(String adi, String soyadi) {
        Doktor yeniDoktor = new Doktor(adi, soyadi);
        doktorListesi.add(yeniDoktor);
    }
}