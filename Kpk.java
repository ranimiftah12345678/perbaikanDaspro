import java.util.Scanner;

public class Kpk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = sc.nextInt();
        
        int bilanganPertama = a;
        int bilanganKedua = b;
        int kpk = (a > b) ? a : b;
        
        while (true) {
            if (kpk % bilanganPertama == 0 && kpk % bilanganKedua == 0) {
                break; 
            }
            kpk++;
        }
        System.out.println("==============================");
        System.out.println("KPK dari " + bilanganPertama + " dan " + bilanganKedua + " adalah: " + kpk);
        System.out.println("==============================");
    }
}
