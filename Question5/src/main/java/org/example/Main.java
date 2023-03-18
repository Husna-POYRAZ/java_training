package org.example;
/*
 Hastane sınıfı tanımlayın. Bu sınıfın içine Doktor iç sınıfı
tanımlayın.
 Hastane sınıfının, doktor nesnelerini tutan bir doktorListesi
ArrayList özelliği olsun.
 Doktor iç sınıfının, adi ve soyadi özellikleri olsun. Bu sınıfa, adi ve
soyadi özelliklerini alan bir yapıcı metod yazın. Ayrıca, doktorun
adini ve soyadini ekrana yazdıran doktoruYazdir metodu ekleyin.
 Test sınıfında Hastane sınıfından bir nesne ve Doktor sınıfından
birkaç nesne oluşturun. Doktor nesnelerini hastane nesnesinin
doktorListesi özelliğine ekleyin.
 Son olarak, hastane nesnesinin doktorListesi özelliğindeki
doktorları, doktoruYazdir metodu ile sırayla ekrana yazdırın.
 */
public class Main {
    public static void main(String[] args) {
        Hastane hastane = new Hastane();

        Hastane.Doktor dahiliye = new Hastane.Doktor("Ali", "Yıldırım");
        Hastane.Doktor kbb = new Hastane.Doktor("Veli", "Yılmaz");
        Hastane.Doktor ftr = new Hastane.Doktor("Ayşe", "Türk");

        hastane.doktorListesi.add(dahiliye);
        hastane.doktorListesi.add(kbb);
        hastane.doktorListesi.add(ftr);

        for (Hastane.Doktor doktor : hastane.doktorListesi) {
            doktor.doktoruYazdir();
        }
    }
}