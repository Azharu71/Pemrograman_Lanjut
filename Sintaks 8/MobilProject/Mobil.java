public class Mobil {

    // Attributes
    public String merk;
    public int tahun_pembuatan;

    // Setter method for setting the 'merk' and 'tahun_pembuatan'
    public void setDataMobil(String merk, int tahun_pembuatan) {
        this.merk = merk; // Assign the passed value to the 'merk' attribute
        this.tahun_pembuatan = tahun_pembuatan; // Assign the passed value to 'tahun_pembuatan'
    }

    // Getter method to return the 'merk'
    public String getMerk() {
        return merk; // Return the value of 'merk'
    }

    // Getter method to return the 'tahun_pembuatan'
    public int getTahun() {
        return tahun_pembuatan; // Return the value of 'tahun_pembuatan'
    }

    // Main method to test the class functionality
    public static void main(String[] args) {
        Mobil mobilku = new Mobil(); // Create an instance of Mobil
        mobilku.setDataMobil("AVANZA", 2000); // Set the values for 'merk' and 'tahun_pembuatan'

        // Output the values using getter methods
        System.out.println("Merk Mobil: " + mobilku.getMerk());
        System.out.println("Tahun Mobil: " + mobilku.getTahun());
    }
}
