package avukatDosyaTakibi;

public class Musteki {
    private String mustekiAdi;
    private String mustekiSoyadi;
    private String mustekiAdresi;



    public Musteki() {
    }

    @Override
    public String toString() {
        return "Musteki{" +
                "mustekiAdi='" + mustekiAdi + '\'' +
                ", mustekiSoyadi='" + mustekiSoyadi + '\'' +
                ", mustekiAdresi='" + mustekiAdresi + '\'' +
                '}';
    }

    public String getMustekiAdi() {
        return mustekiAdi;
    }

    public void setMustekiAdi(String mustekiAdi) {
        this.mustekiAdi = mustekiAdi;
    }

    public String getMustekiSoyadi() {
        return mustekiSoyadi;
    }

    public void setMustekiSoyadi(String mustekiSoyadi) {
        this.mustekiSoyadi = mustekiSoyadi;
    }

    public String getMustekiAdresi() {
        return mustekiAdresi;
    }

    public void setMustekiAdresi(String mustekiAdresi) {
        this.mustekiAdresi = mustekiAdresi;
    }

    public Musteki(String mustekiAdi, String mustekiSoyadi, String mustekiAdresi) {
        this.mustekiAdi = mustekiAdi;
        this.mustekiSoyadi = mustekiSoyadi;
        this.mustekiAdresi = mustekiAdresi;
    }
}
