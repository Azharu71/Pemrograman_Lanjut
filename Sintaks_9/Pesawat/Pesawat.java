/**
 * Nama File: Pesawat.java
 * @author javajawa
 */
public class Pesawat {
    String jenis_pesawat;
    String nama_airlines;

    /* Constructor Method tanpa parameter */
    public Pesawat() {
    }

    public Pesawat(String jenis_pesawat, String nama_airlines) {
        this.jenis_pesawat = jenis_pesawat;
        this.nama_airlines = nama_airlines;
    }

    public void infoPesawat() {
        System.out.println("Jenis Pesawat: " + this.jenis_pesawat);
        System.out.println("Nama Air Line: " + this.nama_airlines);
    }
}