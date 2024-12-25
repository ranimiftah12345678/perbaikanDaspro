import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Rata-Rata Nilai Mahasiswa====");
        System.out.println("---------------------------------");

        double[][] nilaiMhs = new double[3][5];
        double[] rata = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan nilai Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print("Nilai " + (j + 1) + ": ");
                nilaiMhs[i][j] = sc.nextDouble();
            }
            System.out.println("================================");
        }
        for (int i = 0; i < 3; i++) {
            double total = 0;
            for (int j = 0; j < 5; j++) {
                total += nilaiMhs[i][j];
            }
            rata[i] = total / 5;
        }
        System.out.println("\nRata-rata nilai mahasiswa:");
        for (int i = 0; i < 3; i++) {
            System.out.printf("Mahasiswa %d: %.2f%n", (i + 1), rata[i]);
        }
    }
}