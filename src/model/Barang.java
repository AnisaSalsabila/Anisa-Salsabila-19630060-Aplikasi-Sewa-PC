package model;

/**
 *
 * @author ASUS
 */
public class Barang {
    private int id;
    private String merek;

    public Barang(int id, String merek) {
        this.id = id;
        this.merek = merek;
    }

    public Barang() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }
    
    
}
