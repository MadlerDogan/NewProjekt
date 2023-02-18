package avukatDosyaTakibi;

public class Dosya {

    private String dosyaNo;



    @Override
    public String toString() {
        return "Dosya{" +
                "dosyaNo='" + dosyaNo + '\'' +
                '}';
    }

    public String getDosyaNo() {
        return dosyaNo;
    }

    public void setDosyaNo(String dosyaNo) {
        this.dosyaNo = dosyaNo;
    }

    public Dosya() {
    }

    public Dosya(String dosyaNo) {
        this.dosyaNo = dosyaNo;
    }
}
