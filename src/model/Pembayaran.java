package model;


public class Pembayaran {
    private int id;
    private String no;
    private String nama;
    private String merk;
    private String lama;
    private String biaya;

    public Pembayaran(int id, String no, String nama, String merk, String lama, String biaya) {
        this.id = id;
        this.no = no;
        this.nama = nama;
        this.merk = merk;
        this.lama = lama;
        this.biaya = biaya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getLama() {
        return lama;
    }

    public void setLama(String lama) {
        this.lama = lama;
    }

    public String getBiaya() {
        return biaya;
    }

    public void setBiaya(String biaya) {
        this.biaya = biaya;
    }
    
    
    
}
