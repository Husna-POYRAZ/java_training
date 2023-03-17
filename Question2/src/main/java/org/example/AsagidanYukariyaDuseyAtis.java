package org.example;

public class AsagidanYukariyaDuseyAtis implements Atis{
    @Override
    public int hiziHesapla(int V0, int t) {
        // Yukarı çıkarken hız formülü : Vson = V0 - gt
        // Aşağı inerken hız formülü : Vson = V0 + gt
        int h = 1/2*(10*t*t);
        int peak = V0/10;
        if(peak < t) {
            int Vson = V0+10*t;
            if (Vson < 0)
                return 0;
            return Vson;
        }
        return V0-10*t;

    }
}
