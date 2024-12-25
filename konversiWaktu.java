import java.util.Scanner;

public class konversiWaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---===Konversi Waktu===---");
        
        System.out.print("Masukkan waktu(detik): ");
        int totalDetik = sc.nextInt();

        int jam = totalDetik / 3600;
        int sisaDetik = totalDetik % 3600;
        int menit = sisaDetik / 60;
        int detik = sisaDetik % 60;

        System.out.println("Waktu: " + jam + ", menit: "+ menit+ ", detik: "+ detik);
        System.out.println("==========================");
    }
}
