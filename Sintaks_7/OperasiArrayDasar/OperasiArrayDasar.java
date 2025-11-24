public class OperasiArrayDasar {
    public static void main(String[] args) {
        // Inisialisasi array nilai
        int[] nilai = {70, 75, 80, 85, 90};

        // Variabel untuk total, maksimum, dan minimum
        int total = 0;
        int maks = nilai[0];
        int min = nilai[0];

        // Perulangan untuk menghitung total, maksimum, dan minimum
        for (int n : nilai) {
            total += n;
            if (n > maks) {
                maks = n;
            }
            if (n < min) {
                min = n;
            }
        }

        // Menghitung rata-rata
        double rataRata = (double) total / nilai.length;

        // Menampilkan hasil
        System.out.println("Total nilai: " + total);
        System.out.printf("Rata-rata nilai: %.2f%n", rataRata);
        System.out.println("Nilai tertinggi: " + maks);
        System.out.println("Nilai terendah: " + min);
    }
}