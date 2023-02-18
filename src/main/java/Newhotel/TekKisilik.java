package Newhotel;

import java.util.*;

public class TekKisilik {

    private String musteriAdi;
    private String musteriSoyadi;
    private int musteriYasi;
    private String musteriCinsiyeti;

    private int tekKisilikOdaSayisi =5;
   public List<TekKisilik> tekKisilikMusteriList = new ArrayList<>();


   static HashMap< Integer, TreeMap<String,String>> tekKisilikOdaMusteriListesi = new HashMap<>();

    static TreeMap<String,String> kisiBilgileri = new TreeMap<>();
 static   String secim="";

  static  Scanner scanner = new Scanner(System.in);




    public static  void musteriKayit(){

        do {
            System.out.println("Tek Kisilik Oda Kayit sistemine hosgeldiniz");

            System.out.println("Lütfen oda numarasını giriniz");
            tekKisilikOdaMusteriListesi.put(scanner.nextInt(), kisiBilgileri);
            scanner.nextLine();
            System.out.println("Lütfen müsterinin soyAdini giriniz");
            kisiBilgileri.put("2-Soyad", scanner.nextLine());

            System.out.println("Lütfen müsterinin adini giriniz");
            kisiBilgileri.put("1-Isim", scanner.nextLine());

            System.out.println("Lütfen müsterinin cinsiyetini giriniz");
            kisiBilgileri.put( "3-Cinsiyet", scanner.next());

            System.out.println("Lütfen müsterinin yasini giriniz");
            kisiBilgileri.put("4-Yas",scanner.next());

            System.out.println("Devam etmek istiyor musunuz?  E/H");
            secim=scanner.next();


        }while (secim.equalsIgnoreCase("E"));


    }

    public static void cikisIslemleri(){

        System.out.println("Oda numarasını giriniz");
        System.out.println(tekKisilikOdaMusteriListesi.get(scanner.nextInt()));

        System.out.println("Müsteri kac gece konakladı");
        int oda = Hizmetler.tekkisilikOdaHesap(scanner.nextInt());
        System.out.println("Kaç kez çamaşır yıkandı");
        int camasir =   Hizmetler.camasirYikama( scanner.nextInt());

        System.out.println("kiralık kasa kullanıldı ise kaç kez");
        int kasa=  Hizmetler.kiralikKasa(scanner.nextInt());
        System.out.println("Utu hizmetinden faydalanıldı ise kaç kez ");
        int utu =  Hizmetler.utuKullunami(scanner.nextInt());

        System.out.println(""+
                "\nKonaklama  = "+ oda + " TL"+
                "\nCamasir    = "+ camasir+" TL"+
                "\nKasa       = "+ kasa+" TL"+
                "\nutu        = "+ utu+" TL"+
                "\nToplam     = "+ (oda+camasir+kasa+utu)+" TL");





    }



























    public TekKisilik(String musteriAdi, String musteriSoyadi, int musteriYasi, String musteriCinsiyeti, List<TekKisilik> tekKisilikMusteriList) {
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
        this.musteriYasi = musteriYasi;
        this.musteriCinsiyeti = musteriCinsiyeti;
        this.tekKisilikMusteriList = tekKisilikMusteriList;
    }

    public int getTekKisilikOdaSayisi() {
        return tekKisilikOdaSayisi;
    }

    public void setTekKisilikOdaSayisi(int tekKisilikOdaSayisi) {
        this.tekKisilikOdaSayisi = tekKisilikOdaSayisi;
    }

    public TekKisilik() {
    }
    public List<TekKisilik> getTekKisilikMusteriList() {
        return tekKisilikMusteriList;
    }

    public void setTekKisilikMusteriList(List<TekKisilik> tekKisilikMusteriList) {
        this.tekKisilikMusteriList = tekKisilikMusteriList;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public void setMusteriSoyadi(String musteriSoyadi) {
        this.musteriSoyadi = musteriSoyadi;
    }

    public int getMusteriYasi() {
        return musteriYasi;
    }

    public void setMusteriYasi(int musteriYasi) {
        this.musteriYasi = musteriYasi;
    }

    public String getMusteriCinsiyeti() {
        return musteriCinsiyeti;
    }

    public void setMusteriCinsiyeti(String musteriCinsiyeti) {
        this.musteriCinsiyeti = musteriCinsiyeti;
    }
    @Override
    public String toString() {
        return "TekKisilik{" +
                "musteriAdi='" + musteriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                ", musteriYasi=" + musteriYasi +
                ", musteriCinsiyeti='" + musteriCinsiyeti + '\'' +
                ", tekKisilikMusteriList=" + tekKisilikMusteriList +
                '}';
    }
}
