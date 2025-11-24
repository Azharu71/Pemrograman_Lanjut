public class DemoArrayDefault {
    public static void main(String[] args) {
        // Deklarasi dan alokasi array bertipe double
        double[] suhu = new double[12]; // Menyediakan ruang untuk 7 elemen

        // Menampilkan nilai default dari setiap elemen array
        System.out.println("Nilai default array suhu:");
        for (int i = 0; i < suhu.length; i += 2) {
            System.out.println("suhu[" + i + "] = " + suhu[i]);
        }
    }
}