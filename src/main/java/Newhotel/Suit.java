package Newhotel;

public class Suit {
    private String musteriAdi;
    private String musteriSoyadi;
    private int musteriYasi;
    private String musteriCinsiyeti;

    public Suit(String musteriAdi, String musteriSoyadi, int musteriYasi, String musteriCinsiyeti) {
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
        this.musteriYasi = musteriYasi;
        this.musteriCinsiyeti = musteriCinsiyeti;
    }

    public Suit() {
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
        return "Suit{" +
                "musteriAdi='" + musteriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                ", musteriYasi=" + musteriYasi +
                ", musteriCinsiyeti='" + musteriCinsiyeti + '\'' +
                '}';
    }
}
