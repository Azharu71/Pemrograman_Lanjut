/* Nama File: SepedaBalap.java
 * Sub Class dari Class Sepeda
 */
public class SepedaBalap extends Sepeda {

    void cetakKeterangan(){
        System.out.println("Ini Adalah Sepeda Balap");
    }

    public static void main(String[] args){
        SepedaBalap s1 = new SepedaBalap();  // Create a new instance of SepedaBalap
        s1.cetakKeterangan();  // Print racing bike information
        s1.setDataSepeda("Roda Soft", "BMX", 2000);  // Set data for the bike

        // Display the bike details
        System.out.println("Jenis Roda: " + s1.getJenisRoda());
        System.out.println("Merk Sepeda: " + s1.getMerk());
        System.out.println("Tahun Pembuatan: " + s1.getTahunBuat());
    }
}