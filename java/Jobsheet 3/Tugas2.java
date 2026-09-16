import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner cn = new Scanner(System.in);

        int x;
        double biaya_cetak, total_biaya;

        System.out.println("Masukkan jumlah lembar:");
        x=cn.nextInt();

        biaya_cetak= x * 500;

        total_biaya= biaya_cetak + 5000;

        System.out.println("Total biaya: Rp. " + total_biaya);

        cn.close();
    }
}
