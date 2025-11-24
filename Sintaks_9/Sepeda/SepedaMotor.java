/* Nama File: SepedaMotor.java
 * Sub Class dari Class Sepeda
 */
public class SepedaMotor extends Sepeda {
    protected String mesin;  // New attribute for engine type

    // Setter for mesin
    public void setMesin(String mesin) {
        this.mesin = mesin;
    }

    // Getter for mesin
    public String getMesin() {
        return mesin;
    }

    // Method to print bike type information
    void cetakKeterangan() {
        System.out.println("Ini Adalah Sepeda Motor");
    }

    // Main method to test the SepedaMotor class
    public static void main(String[] args) {
        SepedaMotor s1 = new SepedaMotor();  // Create an instance of SepedaMotor
        s1.cetakKeterangan();  // Print motorbike information
        s1.setDataSepeda("Roda Hard", "Honda", 2014);  // Set data for the motorbike

        // Display the bike details
        System.out.println("Jenis Roda: " + s1.getJenisRoda());
        System.out.println("Merk Sepeda: " + s1.getMerk());
        System.out.println("Tahun Pembuatan: " + s1.getTahunBuat());
    }
}
