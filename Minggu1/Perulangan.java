package Minggu1;
import java.util.Scanner;
public class Perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.println("===============");

        int length = nim.length();
        char digitPertama = nim.charAt(length - 2);
        char digitKedua = nim.charAt(length - 1);
        int n = (digitPertama - '0') * 10 + (digitKedua - '0');

        if (n<10) {
            n+=10;
        }

        System.out.println("n : " + n);

        for (int i=1; i <=n; i++) {
            if (i==6 || i==10) {
                continue;
            }
            if (i % 2 == 1) {
                System.out.print("*");
            }
            else {
                System.out.print(" " + i + " ");
            }
        }
        sc.close();
    }
}

