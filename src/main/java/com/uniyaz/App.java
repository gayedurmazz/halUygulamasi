package com.uniyaz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Stok> stokList = new ArrayList<>();
    private static Object NullPointerException;

    public static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        String cevap;
        Personel personel = new Personel();
        boolean yeniKayit = true;
        do{
            personel.kayitOluştur(stokList);
            System.out.println("İşlemlere devam etmek için Y tuşuna basınız.");
            cevap = scanner.nextLine();
            if (cevap.equals("Y")){
                yeniKayit = true;
            }else {
                yeniKayit = false;
            }

        }while (yeniKayit);

        try {
            stoklariListele(stokList);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static void stoklariListele(List<Stok> stokListesi) throws Throwable {
        System.out.println("Personel adı\tÜrün Adı\tÜrün Miktarı\tMiktar Türü");
        System.out.println("---------------------------------------------------------------");
        Scanner scanner = new Scanner(System.in);
        try{
            for (Stok stok : stokListesi) {
                System.out.println(stok.getUrunAlanEleman().getPersonelAdi()+"\t\t\t"+stok.getUrun().getUrunAdi() +"\t\t\t"+stok.getUrunMiktari()+"\t\t\t"+ stok.getUrun().getMiktarTuru());
            }
        }catch (NullPointerException e){
            System.out.println("Stokta ürün bulunamadı!");
            throw (Throwable) NullPointerException;
        }
//
//        System.out.println("Toplamı istenen ürünü giriniz:");
//        System.out.println("1. Elma\n 2.Armut\n 3. Pırasa\n 4. Brokoli\n");
//        int secim = scanner.nextInt();
//        String secilenUrunAdi;
//        if (secim == 1){
//            secilenUrunAdi =
//        }

    }
}

