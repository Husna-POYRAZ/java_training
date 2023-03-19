package org.example;
/*
 Sekil isminde bir soyut sınıf tanımlayın. Bu sınıfa renk özelliği ile
aşağıdaki metodları ekleyin.
 String getRenk()
 abstract double cevreHesapla()
 abstract double alanHesapla()

 Dikdortgen ve Ucgen siniflarını Sekil sinifindan extend edin.
 Dikdörtgen sınıfınının uzunKenar, kisaKenar özellikleri olsun ve
bu özellikleri kullanarak metodlarını gerçekleyin.
 Ucgen sınıfının tabanAlani, yukseklik özellikleri olsun ve bu
özellikleri kullanarak metodlarını gerçekleyin. (Dik üçgen)

 Test sınıfında metodları test ediniz.
 */
public class Main {
    public static void main(String[] args) {
        Sekil dikdortgen, ucgen;

        dikdortgen = new Dikdortgen(5, 10);
        dikdortgen.renk = "turuncu";
        ucgen = new Ucgen(3, 4);
        ucgen.renk = "yeşil";

        System.out.println("Dikdortgen çevresi = " + dikdortgen.cevreHesapla()
                + " alanı = " + dikdortgen.alanHesapla() + " rengi = " + dikdortgen.getRenk());
        System.out.println("Üçgen çevresi = " + ucgen.cevreHesapla()
                + " alan = " + ucgen.alanHesapla() + " rengi = " + ucgen.getRenk());


        System.out.println("");
    }
}