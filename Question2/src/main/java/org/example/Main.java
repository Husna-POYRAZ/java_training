package org.example;
/*
 Atis isimli bir arayuz tanımlayın. Bu arayüze aşağıdaki
metodu ekleyin.
 hiziHesapla(int V0, int t) // t saniye sonra cismin hızını hesaplayan metod
 YukaridanAsagiyaDuseyAtis ve AsagidanYukariyaDuseyAtis
isimli iki sınıf tanımlayın, bu sınıflarda Atis arayüzünü
implement edin. Test sınıfında arayüz değişkeni üzerinden
metodlarınızı test ediniz.
 Atış formüllerini fizik dersinizin notlarından bakınız. Yerçekimi ivmesini 10 alınız.
 */
public class Main {
    public static void main(String[] args) {
        YukaridanAsagiyaDuseyAtis yukaridanAsagiyaDuseyAtis = new YukaridanAsagiyaDuseyAtis();
        AsagidanYukariyaDuseyAtis asagidanYukariyaDuseyAtis = new AsagidanYukariyaDuseyAtis();

        System.out.println("Yukarıdan aşağı atış : " + yukaridanAsagiyaDuseyAtis.hiziHesapla(30,1));
        System.out.println("Aşağıdan yukarı atış : " + asagidanYukariyaDuseyAtis.hiziHesapla(30,1));
    }
}