package org.example;

public class Sozluk {
    String [] kelimeler = {"Elma", "Üzüm", "Muz", "Çilek", "Karpuz"};

    public void kelimeleriListele() {
        class Kelime {
            public void getKelimeler() {
                for(String kelime : kelimeler) {
                    System.out.println(kelime);
                }
            }
        }

        Kelime kelime = new Kelime();
        kelime.getKelimeler();

    }
}
