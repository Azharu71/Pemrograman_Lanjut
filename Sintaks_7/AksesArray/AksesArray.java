public class AksesArray {
    public static void main(String[] args) {
        int[] nilai = {80, 85, 90, 75, 88};

        // Ubah elemen ke-4 (indeks 3)
        nilai[3] = 95;

        // Cetak semua nilai menggunakan for
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("nilai[" + i + "] = " + nilai[i]);
        }

        // Cetak menggunakan for-each
        System.out.println("\nMenggunakan for-each:");
        for (int n : nilai) {
            System.out.println(n);
        }
    }
}
