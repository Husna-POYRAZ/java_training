package org.example;
/*
 SporMusabakasi sınıfı tanımlayın. Bu sınıfın musabakaGunu ve
musabakaSaati özellikleri olsun.

 Mac arayuzu tanımlayın. Bu arayüzde setHakem, getHakem
metodu tanımlayın.

 FutbolMaci sınıfı SporMusabakasi sınıfını extend, Mac arayuzunu
implement etsin. Bu sınıfın hakem, evSahibiTakim ve
deplasmanTakimi özellikleri olsun.

 Test sınıfında testlerinizi yapınız.
 */
public class Main {
    public static void main(String[] args) {
        FutbolMaci futbolMaci = new FutbolMaci();
        futbolMaci.hakem = "Ali Torun";
        futbolMaci.evSahibiTakim = "FB";
        futbolMaci.deplasmanTakimi = "GS";
        futbolMaci.musabakaGunu = "12/02/2023";
        futbolMaci.musabakaSaati = "13:00:00";

        System.out.println("Futbol maçı hakkında bilgi:");
        System.out.println("Ev sahibi takım : " + futbolMaci.evSahibiTakim + " - " + "Deplasman takımı : " + futbolMaci.deplasmanTakimi);
        System.out.println("Maçın hakemi : " + futbolMaci.getHakem());
        System.out.println("Maç günü ve saati : " + futbolMaci.musabakaGunu + ", " + futbolMaci.musabakaSaati);

    }
}