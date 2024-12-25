import java.util.Scanner;

public class array1D {
    public static void main(String[] args) {
        char[] arr = new char[15];
        char karakter = 'A';

        for (int i = 0; i < arr.length; i++) {
            arr[i] = karakter;
            karakter++;
        }

        int indeks = 0;
        
        for (int baris = 1; baris <= 5; baris++) { 
            for (int spasi = 0; spasi < 5 - baris; spasi++) {
                System.out.print(" ");
            }
            for (int kolom = 0; kolom < baris; kolom++) {
                if (indeks < arr.length) {
                    System.out.print(arr[indeks]);
                    indeks++;
                }
            }
            System.out.println(); 
        }
    }
}