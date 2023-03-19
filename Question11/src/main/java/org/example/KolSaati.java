package org.example;

public class KolSaati {
    private int saat;
    private int dakika;
    private int saniye;

    /*
    public KolSaati(int saat, int dakika, int saniye) {
        this.saat = saat;
        this.dakika = dakika;
        this.saniye = saniye;
    }*/

    public int getSaat() {
        return saat;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }

    public int getDakika() {
        return dakika;
    }

    public void setDakika(int dakika) {
        this.dakika = dakika;
    }

    public int getSaniye() {
        return saniye;
    }

    public void setSaniye(int saniye) {
        this.saniye = saniye;
    }

    public void saatiAyarla(int saat) {
        if (saat > 0 && saat <= 12)
            this.saat = saat;
        else
            System.out.println("Kol saat için girdiğiniz saat değerini kontrol ediniz.");
    }

    public void dakikayiAyarla(int dakika) {
        if (dakika > 0 && dakika < 60)
            this.dakika = dakika;
        else
            System.out.println("kol saat için girdiğiniz dakika değerini kontrol ediniz.");
    }

    public void saniyeyiAyarla(int saniye) {
        if (saniye > 0 && saniye < 60)
            this.saniye = saniye;
        else
            System.out.println("kol saat için girdiğiniz saniye değerini kontrol ediniz.");
    }
}
