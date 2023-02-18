package avukatDosyaTakibi;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class KatipEkrani {


    public static void main(String[] args) {
        sanikOlustur();
    }

    public static void dosyaOlustur() {
        Scanner input = new Scanner(System.in);
        Dosya yeniDosya = new Dosya();
        Sanik newSanik = new Sanik();


        System.out.println("Dosya numarasını giriniz");
        String dosyaNo = input.next();



        yeniDosya.setDosyaNo(dosyaNo);

        List<Dosya>  dosya = new ArrayList<Dosya>();
        dosya.add(yeniDosya);


    }

    public static void sanikOlustur() {

        Scanner input = new Scanner(System.in);
        Sanik yeniSanik = new Sanik();
        List<Sanik> sanikList = new ArrayList<Sanik>();
        int cikis;
        do {

            System.out.println("Lütfen yeni sanik adi giriniz");
            String sanikAdi = input.nextLine();
            yeniSanik.setSanikAdi(sanikAdi);

            System.out.println("Lütfen yeni sanik soyadi giriniz");
            String sanikSoyAdi = input.nextLine();
            yeniSanik.setSanikSoyadi(sanikSoyAdi);

            System.out.println("Lütfen yeni sanik Mesleği giriniz");
            String sanikMeslek = input.nextLine();
            yeniSanik.setSanikMeslegi(sanikMeslek);
            sanikList.add(yeniSanik);
            System.out.println("Cikmak icin 0 tıklayiniz");
            cikis = input.nextInt();


        } while (cikis !=0);

        System.out.println(sanikList);

    }
}
