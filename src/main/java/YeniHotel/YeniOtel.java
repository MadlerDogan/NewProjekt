package YeniHotel;

public abstract class YeniOtel {
    String musteriAdi;
    String musteriSoyadi;

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




    public abstract void kahvalti(int kisiSayisi);

    public abstract int wifi(int kisiSayisi);

}