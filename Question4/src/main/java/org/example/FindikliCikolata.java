package org.example;

public class FindikliCikolata extends Cikolata{
    private int findikOrani;

    public FindikliCikolata(int sutOrani, int kakaoOrani, int findikOrani) {
        super(sutOrani, kakaoOrani);
        this.findikOrani = findikOrani;
    }

    public int getFindikOrani() {
        return findikOrani;
    }

    public void setFindikOrani(int findikOrani) {
        this.findikOrani = findikOrani;
    }

    public void printDescription(){
        System.out.println("\nÇikolata " + " süt oranı : " + this.sutOrani
                + " , " + " kako oranı : " + this.kakaoOrani + " ve "
                + " fındık oranı : " + getFindikOrani() + ". ");
    }
}
