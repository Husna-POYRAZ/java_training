package org.example;

import static org.example.Hastane.toplamDoktor;

/*
 Bir önceki sorunun devamı olarak;
 Hastane sınıfına static bir toplamDoktorSayisi özelliği ekleyiniz.
 Hastane sınıfına isim ve soyismi parametre olarak alan
doktorUret metodu ekleyin. Bu metodun içinde yeni bir doktor
nesnesi üretip, Doktor iç sınıfının toplamDoktorSayisi özelliğini
bir artırın. Bu üretilen doktoru da doktorListesi ArrayList’ine
ekleyin.
 Doktor iç sınıfının yapıcı metodunda da toplamDoktorSayisi
özelliğini bir artırın.
 Test sınıfınızda bu metodu test edin ve toplamDoktorSayisi
özelliğini yazdırın.
 */
public class Main {
    public static void main(String[] args) {
        Hastane hastane = new Hastane();
        
        System.out.println("Hastanedeki toplam doktor sayısı = " + toplamDoktor);

        hastane.doktorUret("Fatma", "Demir");
        hastane.doktorUret("Macide", "Soy");
        System.out.println("Hastanedeki güncel toplam doktor sayısı = " + toplamDoktor);
    }
}