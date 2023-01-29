package hotel;

public class KralDairesi extends Otel{
    public static void main(String[] args) {

        KralDairesi musteri3=new KralDairesi();
        musteri3.kahvalti();
        System.out.println("musteri3 tv ucreti : "+musteri3.tv("international", 7)+"$");
        System.out.println("musteri3 wifi ucreti : "+musteri3.wifi(8)+"$");
    }
    @Override
    public void kahvalti() {
        System.out.println("Kahvalti yataga gelir");
    }

    public int tv(String international, int saat){
        if(international.equals("international")){// eğer international kanal izliyorsa para alınacak
            return saat*100;
        }else//international değilse retrun 0 döndürecek
            return 0 ;
    }
}