/* Nama File: Sepeda4Tak.java
 * Sub Class dari Class SepedaMotor
 */
public class Sepeda4Tak extends SepedaMotor {

    @Override
    void cetakKeterangan() {
        System.out.println("Ini Adalah Sepeda Motor 4 Tak");
    }

    public static void main(String[] args) {
        Sepeda4Tak s4tak = new Sepeda4Tak();  // Create an instance of Sepeda4Tak
        s4tak.cetakKeterangan();  // Print four-stroke motorbike information
        s4tak.setMesin("500 CC");  // Set engine type

        // Set the bike data (wheel type, brand, and year)
        s4tak.setDataSepeda("Roda Hard", "Yamaha Vixion", 2013);

        // Print bike details
        System.out.println("Kapasitas Mesin: " + s4tak.getMesin());
        System.out.println("Jenis Roda: " + s4tak.getJenisRoda());
        System.out.println("Merk Sepeda: " + s4tak.getMerk());
        System.out.println("Tahun Pembuatan: " + s4tak.getTahunBuat());
    }
}
