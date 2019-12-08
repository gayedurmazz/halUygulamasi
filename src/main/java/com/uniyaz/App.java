package com.uniyaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Stok> stokList = new ArrayList<>();
    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        String cevap;
        boolean yeniKayit = true;
        do{
            kayitOlustur();
            System.out.println("Yeni kayıt için Y tuşuna basınız.");
            cevap = scanner.nextLine();
            if (cevap.equals("Y")){
                yeniKayit = true;
            }else {
                yeniKayit = false;
            }

        }while (yeniKayit);

            stoklariListele(stokList);
    }

    public static void kayitOlustur(){
        Scanner scanner = new Scanner(System.in);
        Personel personel = new Personel();

        System.out.println( "Adınızı giriniz: " );

        String personelAdi = scanner.nextLine();
        personel.setPersonelAdi(personelAdi);
        System.out.println("Şeçim Yapınız:");
        System.out.println("1. Meyve kaydı");
        System.out.println("2. Sebze Kaydı");
        int secim = scanner.nextInt();

        if(secim == 1){
            System.out.println("1. Elma kaydı");
            System.out.println("2. Armut kaydı");
            int secim2 = scanner.nextInt();
            System.out.println("Alınan miktarı giriniz: ");
            int alinanMiktar = scanner.nextInt();

            if (secim2 == 1){
                Urun urun = new Elma();
                Stok stok = new Stok(urun , personel, alinanMiktar);
                personel.urunAl(urun, alinanMiktar, stok);
                stokList.add(stok);

            }else if (secim2 == 2){
                Urun urun = new Armut();
                Stok stok = new Stok(urun , personel, alinanMiktar);
                personel.urunAl(urun, alinanMiktar, stok);
                stokList.add(stok);

            }

        }else if (secim == 2){
            System.out.println("1. Brokoli kaydı");
            System.out.println("2. Pırasa kaydı");
            int secim2 = scanner.nextInt();
            System.out.println("Alınan miktarı giriniz: ");
            int alinanMiktar = scanner.nextInt();
            if (secim2 == 1){
                Urun urun = new Brokoli();
                Stok stok = new Stok(urun , personel, alinanMiktar);
                personel.urunAl(urun, alinanMiktar, stok);
                stokList.add(stok);

            }else if (secim2 == 2){
                Urun urun = new Pirasa();
                Stok stok = new Stok(urun , personel, alinanMiktar);
                personel.urunAl(urun, alinanMiktar, stok);
                stokList.add(stok);

            }
        }

        scanner.nextLine();
        System.out.println( );
    }

    public static void stoklariListele(List<Stok> stokListesi){

        Scanner scanner = new Scanner(System.in);
        for (Stok stok : stokListesi) {
            System.out.println(stok.getUrunAlanEleman().getPersonelAdi()+"  "+stok.getUrun().getUrunAdi() +"  "+stok.getUrunMiktari()+"  "+ stok.getUrun().getMiktarTuru());
        }
//
//        System.out.println("Toplamı istenen ürünü giriniz:");
//        System.out.println("1. Elma/n 2.Armut /n 3. Pırasa/n 4. Brokoli/n");
//        int secim = scanner.nextInt();
//        String secilenUrunAdi;
//        if (secim == 1){
//            secilenUrunAdi =
//        }
        
    }
}

