import java.util.Scanner;
public class Prima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int n = sc.nextInt();
        boolean prima = true;

        if (n < 2) {
            prima = false; 
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    prima = false; 
                    break;
                }
            }
        }
        
        if (prima) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }

    }
}