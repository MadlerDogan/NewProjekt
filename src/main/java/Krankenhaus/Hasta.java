package Krankenhaus;


public class Hasta extends VeriBankasi {
    private String isim;
    private String soyIsim;
    private int hastaID;
    private Durum hastaDurumu;

    private String hastalik;

    public String getHastalik() {
        return hastalik;
    }

    public void setHastalik(String hasalik) {
        this.hastalik = hasalik;
    }

    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String getSoyIsim() {
        return soyIsim;
    }
    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }
    public int getHastaID() {
        return hastaID;
    }
    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }
    public Durum getHastaDurumu() {
        return hastaDurumu;
    }
    public void setHastaDurumu(Durum hastaDurumu) {
        this.hastaDurumu = hastaDurumu;
    }
}