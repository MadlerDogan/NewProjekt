package YeniHotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        YeniOtel yeniMusteri = new AileOdasi();

        List<YeniOtel> hotelList = new ArrayList<>();


        int cikis;
        do {

            System.out.println("Lütfen yeni müsteri adi giriniz");
            String musteriAdi = input.nextLine();
           yeniMusteri.setMusteriAdi(musteriAdi);

            System.out.println("Lütfen yeni müsteri soyadi giriniz");
            String musteriSoyAdi = input.nextLine();
            yeniMusteri.setMusteriSoyadi(musteriSoyAdi);

            hotelList.add(yeniMusteri);
            System.out.println("Cikmak icin 0 tıklayiniz");
            cikis = input.nextInt();


        } while (cikis != 0);
        System.out.println(yeniMusteri);
    }

}
