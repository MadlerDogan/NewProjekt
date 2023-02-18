package Newhotel;

import java.util.Scanner;

public class HotelReseption   {

    static Scanner input = new Scanner(System.in);
    static String secim="";
    public static void anaMenu(){
do {
    System.out.println("" +
            "\n Otelimiz Oda Kayit Sistemine hosgeldiniz" +
            "\n Odaya yeni kayıt için..............1" +
            "\n Sorgu ekranı için .................2" +
            "\n Hesap ve kapanıs islemleri icin....3" +
            "\n Ana menüye dönmek icin ............A" +
            "\n Cikis yapmak için .................Q" +
            "\n Lütfen bir tercih yapınız...");
    secim = input.nextLine();
    switch (secim) {
        case "1":
            TekKisilik.musteriKayit();
            break;
        case "2":

            break;
        case "3":
            TekKisilik.cikisIslemleri();
        case "a":
        case "A":
            //ana menu link
            break;
        case "q":
        case "¨Q":
            System.out.println(" Sistemden çıkıyorsunuz ");
            System.exit(0);
        default:
            System.out.println("Hatali giris yaptiniz");
    }
}while (!secim.equalsIgnoreCase("q"));
}


}
