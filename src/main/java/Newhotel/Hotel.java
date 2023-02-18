package Newhotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String otelAdi;
    private int maxMusteriSayisi;

    private List<Musteri> musteriListesi = new ArrayList<>();

    public Hotel(String otelAdi, int maxMusteriSayisi, List<Musteri> musteriListesi) {
        this.otelAdi = otelAdi;
        this.maxMusteriSayisi = maxMusteriSayisi;
        this.musteriListesi = musteriListesi;
    }

    public Hotel() {
    }

    public String getOtelAdi() {
        return otelAdi;
    }

    public void setOtelAdi(String otelAdi) {
        this.otelAdi = otelAdi;
    }

    public int getMaxMusteriSayisi() {
        return maxMusteriSayisi;
    }

    public void setMaxMusteriSayisi(int maxMusteriSayisi) {
        this.maxMusteriSayisi = maxMusteriSayisi;
    }

    public List<Musteri> getMusteriListesi() {
        return musteriListesi;
    }

    public void setMusteriListesi(List<Musteri> musteriListesi) {
        this.musteriListesi = musteriListesi;
    }



    @Override
    public String toString() {
        return "Otel{" +
                "otelAdi='" + otelAdi + '\'' +
                ", maxMusteriSayisi=" + maxMusteriSayisi +
                ", musteriListesi=" + musteriListesi +
                '}';
    }
}
