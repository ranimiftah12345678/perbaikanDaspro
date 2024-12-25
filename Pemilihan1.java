import java.util.Scanner;

public class Pemilihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====Urutan Ascending====");
        System.out.print("Masukkan bilangan pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga: ");
        int c = sc.nextInt();

        int bilSementara;
        if (a > b) {
            bilSementara = a; a = b; b = bilSementara;
        }
        if (a > c) {
            bilSementara = a; a = c; c = bilSementara;
        }
        if (b > c) {
            bilSementara = b; b = c; c = bilSementara;
        }
        System.out.println("===============================");
        System.out.println("Bilangan dalam urutan ascending: " + a + " : " + b + " : " + c);
    }
}