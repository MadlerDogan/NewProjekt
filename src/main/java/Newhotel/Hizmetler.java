package Newhotel;

import java.security.PublicKey;

public class Hizmetler {

    String utu;
    String tv;
    String internet;

    String camasir;

    public static int tekkisilikOdaHesap(int kacGece){

     int konaklamaUcreti= kacGece*100;
        return konaklamaUcreti;
    }

    public static int ciftkisilikOdaHesap(int kacGece){

        System.out.println("Konaklama ucretiniz "+ kacGece*150+ " TL");
        return kacGece;
    }

    public static int suitOdaHesap(int kacGece){

int konaklamaUcreti= kacGece*500;
        return kacGece;
    }

    public static int utuKullunami(int utulenenParca){

        int utuUcreti=utulenenParca*20;
    //    System.out.println("Utu ucretiniz "+ utuUcreti+ " TL");
        return utuUcreti;
    }

    public static int camasirYikama(int yikamaSayisi){

        int yikamaUcreti =yikamaSayisi* 20;
     //   System.out.println("Yikama ucretiniz "+ yikamaUcreti+ " TL");
        return yikamaUcreti;
    }

    public static int kiralikKasa(int kiralananGun){

       int kasakiralamaUcreti= kiralananGun* 30;
       // System.out.println("Kiralık kasa ucretiniz "+ kasakiralamaUcreti+ " TL");
        return kasakiralamaUcreti;
    }


}
