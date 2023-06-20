package UAS;

import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] angka = new int[10];
        for (int i = 0; i < angka.length ; i++) {
            angka[i] = scanner.nextInt();
        }
        int jumlahKelipatan5 = 0;
        for (int i = 0; i < angka.length; i++) {
            if(angka[i] % 5 == 0){
                jumlahKelipatan5++;
            }
        }
        System.out.println(jumlahKelipatan5);
    }
}
