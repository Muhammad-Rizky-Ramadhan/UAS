package UAS;

import java.util.Scanner;

public class nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();
        if(angka % 5 == 0){
            System.out.println("angka " + angka + " adalah kellipatan 5");
        }else{
            System.out.println("bukan kelipatan 5");
        }
    }
}
