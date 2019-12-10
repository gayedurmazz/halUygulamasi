package com.uniyaz;

import java.util.List;
import java.util.Objects;

public class Satis {

    private double satisMiktari;

    App app = new App();
    public void satisYap(Urun urun, double satisMiktari, List<Stok> stokList) {
        double varOlanMiktar;
        for (Stok stok : stokList) {
            if(urun.getUrunAdi().equals(stok.getUrun().getUrunAdi())) {
                varOlanMiktar = stok.getUrunMiktari();
                stok.setUrunMiktari(varOlanMiktar -= satisMiktari);
                break;
            }
        }

     app.stokBilgileriniDosyayaYaz(stokList);

        List<Stok> dosyadanOkunan = app.stokBilgileriniDosyadanOku();
        System.out.println("DOSYADAN OKUMA");
        for (Stok stok : dosyadanOkunan) {
            System.out.println(stok.getUrunAlanEleman().getPersonelAdi()+"\t\t\t"+stok.getUrun().getUrunAdi() +"\t\t\t"+stok.getUrunMiktari()+"\t\t\t"+ stok.getUrun().getMiktarTuru());

        }
    }

    public double getSatisMiktari() {
        return satisMiktari;
    }

    public void setSatisMiktari(double satisMiktari) {
        this.satisMiktari = satisMiktari;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Satis satis = (Satis) o;
        return Double.compare(satis.satisMiktari, satisMiktari) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(satisMiktari);
    }
}
