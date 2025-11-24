public class NilaiMahasiswa {
    public static void main(String[] args) {
        // Inisialisasi array nilai
        int[] nilai = {75, 80, 90, 85, 70};

        // Variabel untuk menyimpan total
        int total = 0;

        // Menjumlahkan seluruh elemen array
        for (int n : nilai) {
            total += n;
        }

        // Menghitung rata-rata
        double rataRata = (double) total / nilai.length;

        // Menampilkan hasil
        System.out.println("Total Nilai: " + total);
        System.out.printf("Rata-Rata Nilai: %.2f\n", rataRata);
    }
}
