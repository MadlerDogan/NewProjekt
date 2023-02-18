package avukatDosyaTakibi;

import java.util.Date;

public class Suclar {
    private String suc;
    private String kanunMaddasi;
    private String sucYeri;
    private Date sucTarihi;

    public Suclar() {
    }

    public Suclar(String suc, String kanunMaddasi, String sucYeri, Date sucTarihi) {
        this.suc = suc;
        this.kanunMaddasi = kanunMaddasi;
        this.sucYeri = sucYeri;
        this.sucTarihi = sucTarihi;
    }

    @Override
    public String toString() {
        return "Suclar{" +
                "suc='" + suc + '\'' +
                ", kanunMaddasi='" + kanunMaddasi + '\'' +
                ", sucYeri='" + sucYeri + '\'' +
                ", sucTarihi=" + sucTarihi +
                '}';
    }

    public String getSuc() {
        return suc;
    }

    public void setSuc(String suc) {
        this.suc = suc;
    }

    public String getKanunMaddasi() {
        return kanunMaddasi;
    }

    public void setKanunMaddasi(String kanunMaddasi) {
        this.kanunMaddasi = kanunMaddasi;
    }

    public String getSucYeri() {
        return sucYeri;
    }

    public void setSucYeri(String sucYeri) {
        this.sucYeri = sucYeri;
    }

    public Date getSucTarihi() {
        return sucTarihi;
    }

    public void setSucTarihi(Date sucTarihi) {
        this.sucTarihi = sucTarihi;
    }
}
