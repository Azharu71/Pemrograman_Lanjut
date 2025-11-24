public class Mobil {

    String merk;
    String warna;
    int kecepatan;
    boolean statusmesin = false;

    public void setDataMobil(String m, String w, int kecepatan) {
        merk = m;
        warna = w;
        this.kecepatan = kecepatan;
    }
    public String getMerk() {
        return merk;
    }
    public String getWarna() {
        return warna;
    }
    public int getKecepatan() {
        return kecepatan;
    }

    public static void main(String[] args) {
        // Create an instance of Mobil
        Mobil mobil1 = new Mobil();

        // Set data for the car
        mobil1.setDataMobil("Toyota", "Merah", 120);

        // Display car data
        System.out.println("Merk Mobil: " + mobil1.getMerk());
        System.out.println("Warna Mobil: " + mobil1.getWarna());
        System.out.println("Kecepatan Mobil: " + mobil1.getKecepatan() + " km/h");
    }
}