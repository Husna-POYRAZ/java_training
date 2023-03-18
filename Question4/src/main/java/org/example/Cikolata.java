package org.example;

public class Cikolata {
    public int sutOrani;
    public int kakaoOrani;

    public Cikolata() {}

    public Cikolata(int sutOrani, int kakaoOrani) {
        this.sutOrani = sutOrani;
        this.kakaoOrani = kakaoOrani;
    }

    public void printDescription(){
        System.out.println("\nÇikolata " + " süt oranı : " + this.sutOrani
                + " ve " + " kako oranı " + this.kakaoOrani + ". ");
    }
}
