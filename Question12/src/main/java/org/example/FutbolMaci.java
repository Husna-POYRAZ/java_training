package org.example;

public class FutbolMaci extends SporMusabakasi implements Mac{
    String hakem;
    String evSahibiTakim;
    String deplasmanTakimi;

    @Override
    public String getHakem() {
        return hakem;
    }

    @Override
    public void setHakem(String hakem) {
        this.hakem = hakem;
    }
}
