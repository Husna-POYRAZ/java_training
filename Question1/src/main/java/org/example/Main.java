package org.example;

/*
 UlasimAraci arayuzu tanımlayın. Bu arayüze aşağıdaki metodları
yazın.
 Dur() //Aracın hızını sıfırlar
 Hizlan() //Aracın hızını 10 km/h artırır
 Yavasla(int x) //Aracın hızını x kadar azaltır
 KaraAraci arayuzu tanımlayın. Bu arayuze aşağıdaki metodları yazin.
 Calisiyormu() //Aracın hızına bakarak true yada false döner
 HiziGetir() //Aracın hızını döner
 Hiz özelliği olan bir Arac sınıfı tanımlayın ve yukarıdaki iki arayüzü bu
sınıfta implement edin. Test sınıfında arayüz değişkenleri üzerinden
metodları test ediniz.
 */
public class Main {
    public static void main(String[] args) {
        Arac arac = new Arac(100);
        System.out.println("Araç çalışıyor mu? : " + arac.calisiyorMu());
        System.out.println("Araç hızı = " + arac.hiziGetir());
        System.out.println("Aracın 10 km/h arttırdıktan sonra araç hızı = " + arac.hizlan());
        System.out.println("Aracın 35 km/h azalttıktan sonra araç hızı = " + arac.yavasla(35));
        System.out.println("Aracı durdur! Arac hızı = " + arac.dur());

    }
}