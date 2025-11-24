import java.util.Scanner;

public class sistemKelulusan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();
        long[] nim = new long[jumlah];
        double[] nilaiUTS = new double[jumlah];
        double[] nilaiUAS = new double[jumlah];
        double[] total = new double[jumlah];
        String[] grade = new String[jumlah];
        String[] ket = new String[jumlah];

        for (int i = 0; i < jumlah; i++) {
            // input data sesuai jumlah mahasiswa
            System.err.println("Data ke-" + (i + 1));
            System.out.print("Masukan NIM: ");
            nim[i] = input.nextLong();

            // batasi minimal dan maksimal nilai uts dan uas
            System.out.print("Masukan Niai UTS: ");
            nilaiUTS[i] = Math.min(100, Math.max(0, input.nextDouble()));

            System.out.print("Masukan Nilai UAS: ");
            nilaiUAS[i] = Math.min(100, Math.max(0, input.nextDouble()));

            // logika perhitungan nilai dan batas minimal serta maksimal
            double totalNilai = ((nilaiUTS[i] + nilaiUAS[i]) / 2);
            if (totalNilai >= 100) {
                total[i] = 100;
            } else if (totalNilai <= 0) {
                total[i] = 0;
            } else {
                total[i] = totalNilai;
            }

            if (total[i] >= 90) {
                grade[i] = "A";
            } else if (total[i] >= 80) {
                grade[i] = "B+";
            } else if (total[i] >= 70) {
                grade[i] = "B";
            } else if (total[i] >= 60) {
                grade[i] = "C+";
            } else if (total[i] >= 50) {
                grade[i] = "C";
            } else if (total[i] >= 40) {
                grade[i] = "D";
            } else if (total[i] >= 30) {
                grade[i] = "E";
            } else if (total[i] < 29) {
                grade[i] = "F";
            }

            // logika keterangan lulus atau tidak menggunakan regex
            if (grade[i].matches("[ABC].*")) {
                ket[i] = "Lulus";
            } else {
                ket[i] = "Tidak Lulus";
            }
        }

        // print output ke terimal
        System.out.println("========================================================================");
        System.out.printf("%-12s %-12s %-12s %-8s %-8s %-8s\n",
                "NIM", "Nilai UTS", "Nilai UAS", "Total", "Grade", "Keterangan");
        System.out.println("========================================================================");

        for (int i = 0; i < jumlah; i++) {
            System.out.printf("%-12d %-12.0f %-12.0f %-8.2f %-8s %-8s\n", nim[i], nilaiUTS[i], nilaiUAS[i], total[i],
                    grade[i], ket[i]);
        }
        System.out.println("========================================================================");
        input.close();

    }

}
