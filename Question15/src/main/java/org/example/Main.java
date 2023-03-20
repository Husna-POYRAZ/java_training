package org.example;

import java.util.Scanner;

/*
 Bir n tamsayı değerini parametre olarak alan, n
uzunluğunda taban alanına sahip ve n yüksekliğinde
aşağıdaki şekilde üçgen oluşturan metodu yazınız.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n = scanner.nextInt();
        ucgenCiz(n);
    }

    public static void ucgenCiz(int n) {
        int i,j,k;
        for (i=1; i<=n+2; i++) {
            for(j=i; j<=n+2;j++) {
                System.out.print(" ");//Boşluğumuzu belirtiyoruz.
                if(j== n+2){
                    if(i== 1 || i==n+2) {
                        System.out.print("+");
                        if(i==n+2) {
                            for(k=0; k<n;k++) {
                                System.out.print("-");
                            }
                            System.out.println("+");
                        }
                    }
                    else {
                        System.out.print("/");
                        for(k=0; k<i-2;k++)
                            System.out.print(" ");
                        System.out.print("|");
                    }
                }
            }
            System.out.println();
        }
    }
}