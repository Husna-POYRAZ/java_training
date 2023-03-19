package org.example;

public class AkilliKolSaat extends KolSaati{
    public void zamaniAyarla(int saat, int dakika, int saniye) {
        if (saat >= 0 && saat < 24)
            this.setSaat(saat);
        else
            System.out.println("Akıllı kol saat için girdiğiniz saat değerini kontrol ediniz.");

        if (dakika >= 0 && dakika < 60)
            this.setDakika(dakika);
        else
            System.out.println("Akıllı kol saat için girdiğiniz dakika değerini kontrol ediniz.");

        if (saniye >= 0 && saniye < 60)
            this.setSaniye(saniye);
        else
            System.out.println("Akıllı kol saat için girdiğiniz saniye değerini kontrol ediniz.");

    }
}
