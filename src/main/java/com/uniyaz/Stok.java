package com.uniyaz;

import java.util.HashMap;
import java.util.Objects;

public class Stok {

    private Urun urun;
    private Personel urunAlanEleman;
    private double urunMiktari;

    public Stok(Urun urun, Personel urunAlanEleman, double urunMiktari) {
        this.urun = urun;
        this.urunAlanEleman = urunAlanEleman;
        this.urunMiktari = urunMiktari;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stok stok = (Stok) o;
        return Double.compare(stok.urunMiktari, urunMiktari) == 0 &&
                Objects.equals(urun, stok.urun) &&
                Objects.equals(urunAlanEleman, stok.urunAlanEleman);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urun, urunAlanEleman, urunMiktari);
    }

    public Personel getUrunAlanEleman() {
        return urunAlanEleman;
    }

    public void setUrunAlanEleman(Personel urunAlanEleman) {
        this.urunAlanEleman = urunAlanEleman;
    }

    public double getUrunMiktari() {
        return urunMiktari;
    }

    public void setUrunMiktari(double urunMiktari) {
        this.urunMiktari = urunMiktari;
    }

}
