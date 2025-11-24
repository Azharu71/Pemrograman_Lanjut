/* Nama File: Sepeda2Tak.java
 * Sub Class dari Class SepedaMotor
 */
public class Sepeda2Tak extends SepedaMotor {

    @Override
    void cetakKeterangan() {
        System.out.println("Ini Adalah Sepeda Motor 2 Tak");
    }

    public static void main(String[] args) {
        Sepeda2Tak s2tak = new Sepeda2Tak();  // Create an instance of Sepeda2Tak
        s2tak.cetakKeterangan();  // Print two-stroke motorbike information
        s2tak.setMesin("150 CC");  // Set engine type

        // Set the bike data (wheel type, brand, and year)
        s2tak.setDataSepeda("Roda Hard", "Honda Beat", 2013);

        // Print bike details
        System.out.println("Kapasitas Mesin: " + s2tak.getMesin());
        System.out.println("Jenis Roda: " + s2tak.getJenisRoda());
        System.out.println("Merk Sepeda: " + s2tak.getMerk());
        System.out.println("Tahun Pembuatan: " + s2tak.getTahunBuat());
    }
}
