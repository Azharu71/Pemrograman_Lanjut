class Kendaraan {
    private String merk;  // Attribute for the vehicle's brand
    private int tahun_pembuatan;  // Attribute for the vehicle's manufacturing year

    // Setter method to set the merk and tahun_pembuatan
    void setDataMobil(String merk, int tahun_pembuatan) {
        this.merk = merk;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Getter method to get the merk
    String getMerk() {
        return merk;
    }

    // Getter method to get the tahun_pembuatan
    int getTahun() {
        return tahun_pembuatan;
    }
}

public class Mobil {
    public static void main(String[] args) {
        Kendaraan mobilku = new Kendaraan();  // Creating an object of Kendaraan class
        mobilku.setDataMobil("PAJERO", 2017);  // Setting data for the vehicle

        // Printing the merk and tahun_pembuatan using getter methods
        System.out.println("Merk Mobil : " + mobilku.getMerk());
        System.out.println("Tahun Mobil : " + mobilku.getTahun());
    }
}