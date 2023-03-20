package org.example;

import java.util.ArrayList;
import java.util.Scanner;

/*
Belirsiz sayıda pozitif integer değeri parametre olarak alan,
bu sayıların her biri için, toplamın yüzde kaçı olduğunu ve
en altta da toplamlarını ekrana yazdıran metodu yazınız.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif tam sayı giriniz.");
        while (true) {
            try {
                int sayi = scanner.nextInt();
                if (sayi != 0 && sayi > 0)
                    arrayList.add(sayi);
                else
                    break;
            } catch (Exception e) {
                System.out.println("Lütfen pozitif tam sayı giriniz!");
                break;
            }
        }

        toplamYuzde(arrayList);

    }

    public static void toplamYuzde(ArrayList<Integer> arrayList) {
        int toplam = 0;
        for (Integer sayi : arrayList)
            toplam += sayi;

        for (Integer sayi : arrayList) {
            float yuzde = (float) (100*sayi)/(float) toplam;
            //System.out.println(sayi + "\t\t" + yuzde + "%\n");
            System.out.format("%d \t\t %.1f", sayi, yuzde);
            System.out.println("%\n");
        }
        System.out.println(toplam + "\t\t" + "100%\n");

    }
}