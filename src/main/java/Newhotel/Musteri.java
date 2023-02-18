package Newhotel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Musteri {
    private String musteriAd;
    private String musteriSoyad;
    private int musteriYas;
    private String musteriCinsiyet;

    public Musteri(String musteriAd, String musteriSoyad, int musteriYas, String musteriCinsiyet) {
        this.musteriAd = musteriAd;
        this.musteriSoyad = musteriSoyad;
        this.musteriYas = musteriYas;
        this.musteriCinsiyet = musteriCinsiyet;
    }

    public Musteri() {
            }

    public String getMusteriAd() {
        return musteriAd;
    }

    public void setMusteriAd(String musteriAd) {
        this.musteriAd = musteriAd;
    }

    public String getMusteriSoyad() {
        return musteriSoyad;
    }

    public void setMusteriSoyad(String musteriSoyad) {
        this.musteriSoyad = musteriSoyad;
    }

    public int getMusteriYas() {
        return musteriYas;
    }

    public void setMusteriYas(int musteriYas) {
        this.musteriYas = musteriYas;
    }

    public String getMusteriCinsiyet() {
        return musteriCinsiyet;
    }

    public void setMusteriCinsiyet(String musteriCinsiyet) {
        this.musteriCinsiyet = musteriCinsiyet;
    }


    @Override
    public String toString() {
        return "Musteri{" +
                "musteriAd='" + musteriAd + '\'' +
                ", musteriSoyad='" + musteriSoyad + '\'' +
                ", musteriYas=" + musteriYas +
                ", musteriCinsiyet='" + musteriCinsiyet + '\'' +
                '}';
    }
}
