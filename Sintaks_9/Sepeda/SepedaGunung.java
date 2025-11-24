/* Nama File: SepedaGunung.java
 * Sub Class dari Class Sepeda
 */
public class SepedaGunung extends Sepeda {

    void cetakKeterangan(){
        System.out.println("Ini Adalah Sepeda Gunung");
    }

    public static void main(String[] args){
        SepedaGunung s1 = new SepedaGunung();  // Create a new instance of SepedaGunung
        s1.cetakKeterangan();  // Print mountain bike information
        s1.setDataSepeda("Roda Medium", "Polygon", 2015);  // Set data for the bike

        // Display the bike details
        System.out.println("Jenis Roda: " + s1.getJenisRoda());
        System.out.println("Merk Sepeda: " + s1.getMerk());
        System.out.println("Tahun Pembuatan: " + s1.getTahunBuat());
    }
}