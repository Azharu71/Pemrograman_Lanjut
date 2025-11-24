public class Array2DContoh {
    public static void main(String[] args) {
        // Inisialisasi array 2D
        int[][] data = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // Variabel untuk total
        int total = 0;

        // Menampilkan isi array 2D
        System.out.println("Isi array 2D:");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + " ");
                total += data[i][j];  // Menambahkan elemen ke total
            }
            System.out.println();  // Pindah ke baris baru setelah satu baris array
        }

        // Menampilkan total
        System.out.println("Total semua elemen: " + total);
    }
}
