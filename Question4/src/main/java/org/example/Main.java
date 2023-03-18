package org.example;
/*
 Cikolata sınıfı tanımlayın. Bu sınıfın sutOrani, kakaoOrani
özellikleri olsun. BitterCikolata ve FindikliCikolata sınıfları
Cikolata sınıfından extend etsin. FindikliCikolata sınıfına
findikOrani özelliği ekleyin.
 Test sınıfınızda, olabilecek tüm upcast, downcast
örneklerini göstererek bu sınıflardan oluşturduğunuz
nesnelerin özelliklerine değerler atayınız.
 */
public class Main {
    public static void main(String[] args) {
        //upcasting
        Cikolata cikolata, findikliCikolata, bitterliCikolata;

        cikolata = new Cikolata(30, 70);
        findikliCikolata = new FindikliCikolata(20, 60, 20);
        bitterliCikolata = new BitterCikolata(15, 85);

        cikolata.printDescription();
        findikliCikolata.printDescription();
        bitterliCikolata.printDescription();

        // downcasting
        FindikliCikolata f = (FindikliCikolata)findikliCikolata;
        f.setFindikOrani(15);
        f.kakaoOrani = 55;
        f.printDescription();
    }
}