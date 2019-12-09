package com.uniyaz;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Personel implements KayitOlusturabilir {
    private int id;
    private String personelAdi;
    private int alinanUrunMiktari;
    
    @Override
    public void kayitOluştur(List<Stok> stokList) {
        Scanner scanner = new Scanner(System.in);
        Personel personel = new Personel();

        System.out.println( "Adınızı giriniz: " );

        String personelAdi = scanner.nextLine();
        personel.setPersonelAdi(personelAdi);
        System.out.println("Şeçim Yapınız:");
        System.out.println("1. Meyve kaydı");
        System.out.println("2. Sebze Kaydı");
        System.out.println("3. Satış");
        int secim = scanner.nextInt();
        int secim2;
        if(secim == 1){
            System.out.println("1. Elma kaydı");
            System.out.println("2. Armut kaydı");
            secim2 = scanner.nextInt();
            System.out.println("Alınan miktarı giriniz: ");
            int alinanMiktar = scanner.nextInt();

            if (secim2 == 1){
                Urun urun = new Elma();
                Stok stok = new Stok(urun , personel, alinanMiktar);
                //personel.urunAl(urun, alinanMiktar, stok);
                stokList.add(stok);

            }else if (secim2 == 2){
                Urun urun = new Armut();
                Stok stok = new Stok(urun , personel, alinanMiktar);
                //personel.urunAl(urun, alinanMiktar, stok);
                stokList.add(stok);

            }

        }else if (secim == 2){
            System.out.println("1. Brokoli kaydı");
            System.out.println("2. Pırasa kaydı");
            secim2 = scanner.nextInt();
            System.out.println("Alınan miktarı giriniz: ");
            int alinanMiktar = scanner.nextInt();
            if (secim2 == 1){
                Urun urun = new Brokoli();
                Stok stok = new Stok(urun , personel, alinanMiktar);
                //personel.urunAl(urun, alinanMiktar, stok);
                stokList.add(stok);

            }else if (secim2 == 2){
                Urun urun = new Pirasa();
                Stok stok = new Stok(urun , personel, alinanMiktar);
                //personel.urunAl(urun, alinanMiktar, stok);
                stokList.add(stok);

            }
        }else if(secim == 3){
            App app = new App();
            try {
                app.stoklariListele(stokList);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            System.out.println("1. Elma");
            System.out.println("2. Armut");
            System.out.println("3. Brokoli");
            System.out.println("4. Pırasa");
            System.out.println("Satmak istediğiniz ürünün kodunu giriniz: ");
            secim2 = scanner.nextInt();
            System.out.println("Satılacak ürün miktarını giriniz: ");
            int satilacakMiktar = scanner.nextInt();
            Satis satis = new Satis();
            if(secim2 == 1){
                Urun urun = new Elma();
                satis.satisYap(urun, satilacakMiktar, stokList);
            }else if(secim2 == 2){
                Urun urun = new Armut();
                satis.satisYap(urun, satilacakMiktar, stokList);
            }else if(secim2 == 3){
                Urun urun = new Brokoli();
                satis.satisYap(urun, satilacakMiktar, stokList);
            }else if(secim2 == 4){
                Urun urun = new Pirasa();
                satis.satisYap(urun, satilacakMiktar, stokList);
            }

            try {
                app.stoklariListele(stokList);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }

        scanner.nextLine();
        System.out.println( );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personel personel = (Personel) o;
        return id == personel.id &&
                alinanUrunMiktari == personel.alinanUrunMiktari &&
                Objects.equals(personelAdi, personel.personelAdi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, personelAdi, alinanUrunMiktari);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPersonelAdi() {
        return personelAdi;
    }

    public void setPersonelAdi(String personelAdi) {
        this.personelAdi = personelAdi;
    }

    public int getAlinanUrunMiktari() {
        return alinanUrunMiktari;
    }

    public void setAlinanUrunMiktari(int alinanUrunMiktari) {
        this.alinanUrunMiktari = alinanUrunMiktari;
    }

}
