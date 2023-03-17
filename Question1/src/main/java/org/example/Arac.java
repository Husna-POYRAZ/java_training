package org.example;

public class Arac implements UlasimAraci, KaraAraci{
    int hiz;
    public Arac(int hiz) {
        this.hiz = hiz;
    }

    @Override
    public boolean calisiyorMu() {
        if (hiz > 0)
            return true;
        return false;
    }

    @Override
    public int hiziGetir() {
        return hiz;
    }

    @Override
    public int dur() {
        return hiz=0;
    }

    @Override
    public int hizlan() {
        return hiz + 10;
    }

    @Override
    public int yavasla(int x) {
        return hiz - 10;
    }
}
