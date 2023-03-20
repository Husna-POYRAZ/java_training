package org.example;

import java.util.Scanner;

/*
Bir n tamsayı değerini parametre olarak alan ve nxn
boyutunda aşağıdaki şekilde kare oluşturan metodu
yazınız.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int n = scanner.nextInt();

        kareCiz(n);
    }

    public static void kareCiz(int n) {
        int k = n*3;
        if (n%2==0){
            for(int i=0;i<=2*n;i++){
                kareCizimi(k, i);
            }
        }else {
            for(int i=0;i<=2*n;i++){
                kareCizimi(k, i);
            }

        }
        }

    private static void kareCizimi(int k, int i) {
        for(int j=0;j<=k;j++){
            if(i%2==0){
                if(j %3 ==0 && j<=k)
                    System.out.print("+");
                else
                    System.out.print("-");
            }
            else {
                if(j %3 ==0 && j<=k)
                    System.out.print("|");
                else
                    System.out.print(" ");
            }
        }
        System.out.println();
    }

}



/*
            for (int j= 0; i < n ; j++)
                System.out.println("|  |");
                for (int k= 0; k < n ; k++)
                    System.out.println("+--+");
 */