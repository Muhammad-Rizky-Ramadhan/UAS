package UAS;

import java.util.Scanner;

public class nomor5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("masukkan jumlah array ");
        int banyakArray = scanner.nextInt();

        int[] array = new int[banyakArray];

        System.out.println("masukkan angka yang dicari ");
        int cari = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int jumlahYangDicari = Form(array, cari);

        System.out.println("angka "+ cari + " berjumlah "+jumlahYangDicari);
    }
    public static int Form(int[] array, int cari){
        int jumlahYangDicari = 0;
        for (int i = 0; i < array.length; i++) {
            if(cari == array[i]){
                jumlahYangDicari++;
            }
        }
        return jumlahYangDicari;
    }
}
