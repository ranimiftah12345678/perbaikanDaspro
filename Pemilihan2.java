import java.util.Scanner;

public class Pemilihan2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
    System.out.print("Masukkan jumlah(m3) air yang digunakan: ");
    int m = sc.nextInt();
    int totalHarga;
    System.out.println("=======================================");

    if (m <= 50) {
        totalHarga = m * 1000;
    } else if (m <= 100) {
        totalHarga = (50 * 1000) + ((m - 50) * 1500);
    } else if (m <= 150) {
        totalHarga = (50 * 1000) + (50 * 1500) + ((m - 100) * 2000);
    } else {
        totalHarga = (50 * 1000) + (50 * 1500) + (50 * 2000) + ((m - 150) * 3000);
    }
    System.out.println("Harga yang harus dibayar: Rp. " + totalHarga);
}
}
