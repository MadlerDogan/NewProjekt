package avukatDosyaTakibi;

import java.util.Date;

public class Sanik {
   private String sanikAdi;
    private String sanikSoyadi;
    private String sanikMeslegi;

    public Sanik() {
    }

    @Override
    public String toString() {
        return "Sanik{" +
                "sanikAdi='" + sanikAdi + '\'' +
                ", sanikSoyadi='" + sanikSoyadi + '\'' +
                ", sanikMeslegi='" + sanikMeslegi + '\'' +
                '}';
    }

    public String getSanikAdi() {
        return sanikAdi;
    }

    public void setSanikAdi(String sanikAdi) {
        this.sanikAdi = sanikAdi;
    }

    public String getSanikSoyadi() {
        return sanikSoyadi;
    }

    public void setSanikSoyadi(String sanikSoyadi) {
        this.sanikSoyadi = sanikSoyadi;
    }

    public String getSanikMeslegi() {
        return sanikMeslegi;
    }

    public void setSanikMeslegi(String sanikMeslegi) {
        this.sanikMeslegi = sanikMeslegi;
    }

    public Sanik(String sanikAdi, String sanikSoyadi, String sanikMeslegi) {
        this.sanikAdi = sanikAdi;
        this.sanikSoyadi = sanikSoyadi;
        this.sanikMeslegi = sanikMeslegi;
    }
}
