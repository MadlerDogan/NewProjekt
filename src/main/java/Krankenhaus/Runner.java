package Krankenhaus;

public class Runner  {

    private static Hastane hastane = new Hastane();


    public static void main(String[] args) {

        String hastaDurumu = "Diabet";

        String unvan = doktorUnvan(hastaDurumu);

      hastane.setDoktor(doktorBul(unvan));


        System.out.println("Doktor ismi: " + hastane.getDoktor().getIsim());
        System.out.println("Doktor soy isim: " + hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: " + hastane.getDoktor().getUnvan());



        int hastaId = 222;

       int id= hastaIdBul(hastaId);

        hastane.setHasta(hastaBul(id));

        System.out.println("hastane.getHasta().getIsim() = " + hastane.getHasta().getIsim());
        System.out.println("hastane.getHasta().getSoyIsim() = " + hastane.getHasta().getSoyIsim());
        System.out.println("hastane.getHasta().getHastaID() = " + hastane.getHasta().getHastaID());
        System.out.println("hastane.getHasta().getHastalik() = " + hastane.getHasta().getHastalik());
    }

    private static Hasta hastaBul(int hastaId) {

        Hasta hasta = new Hasta();
        for (int i = 0; i <hastane.hastaIDleri.length;i++){

            if(hastaId==hastane.hastaIDleri[i]){
                hasta.setIsim(hastane.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane.hastaSoyIsimleri[i]);
                hasta.setHastalik((hastane.durumlar[i]));

                hasta.setHastaID(hastaId);



            }
        }
        return hasta;
    }

    private static int hastaIdBul(int hastaId) {
        if (hastaId == 111) {
            return hastane.hastaIDleri[0];
        } else if (hastaId == 222) {
            return hastane.hastaIDleri[1];

        } if (hastaId == 333) {
            return hastane.hastaIDleri[2];
        } else if (hastaId == 444) {
            return hastane.hastaIDleri[3];

        } else

        return hastaId;


    }//
    public static String doktorUnvan(String actuelDurum) {

        if (actuelDurum.equals("Allerji")) {
            return hastane.unvanlar[0];

        } else if (actuelDurum.equals("Bas agrisi")) {
            return hastane.unvanlar[1];

        } else if (actuelDurum.equals("Diabet")) {
            return hastane.unvanlar[2];

        } else if (actuelDurum.equals("Kalp Spazmi")) {
            return hastane.unvanlar[3];
        }
        return "yanlis durum";

    }//method

    public static Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();

        for (int i = 0; i < hastane.unvanlar.length; i++) {

            if (unvan.equals(hastane.unvanlar[i])) {
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }//if
        }//for i
        return doktor;





    }//method
}//class
