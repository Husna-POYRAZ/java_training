package org.example;
/*
 KolSaati sınıfı tanımlayın. Bu sınıfın saat, dakika, saniye özellikleri
olsun.
 Bu sınıfa birer integer değer alan saatiAyarla, dakikayiAyarla,
saniyeyiAyarla metodlarını yazın. Bu metodlarda parametreleri
özelliklere atamadan önce gerekli kontrolleri yapın, eğer geçersiz
bir değer girildiyse ekrana uyarı yazdırın.

 Başka bir pakette AkilliKolSaati ve Test sınıflarını tanımlayın. AkilliKolSaati sınıfı KolSaati sınıfından extend etsin. Bu sınıfa
zamanıAyarla metotdu ekleyin. Bu metod 3 integer değer alsın ve
değişkenlerin değerlerini sırayla saate, dakikaya ve saniyeye
atasın. Burada da gerekli kontrolleri yapınız.

 Test sınıfında kullanıcının, sınıfların özelliklerine doğrudan
erişmesini engelleyiniz. Test sınıfında metodları test ediniz.
 */
public class Main {
    public static void main(String[] args) {
        KolSaati kolSaati, akilliSaat;

        kolSaati = new KolSaati();
        kolSaati.saatiAyarla(12);
        kolSaati.dakikayiAyarla(30);
        kolSaati.saniyeyiAyarla(45);
        System.out.println("Kol saati : " + kolSaati.getSaat() + ":" + kolSaati.getDakika() + ":" + kolSaati.getSaniye());

        akilliSaat = new AkilliKolSaat();
        ((AkilliKolSaat) akilliSaat).zamaniAyarla(23, 59, 50);
        System.out.println("Akıllı saat : " + akilliSaat.getSaat() + ":" + akilliSaat.getDakika() + ":" + akilliSaat.getSaniye());
    }
}