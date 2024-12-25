import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---===Konversi Suhu===---");

        System.out.print("Masukkan suhu Celcius(°C): ");
        double celcius = sc.nextDouble();
        double farenheit = (celcius * 9 / 5) + 32;

        System.out.println("Suhu dalam Farenheit(°F): "+ farenheit + "°F");
        System.out.println("==========================");
    }
}