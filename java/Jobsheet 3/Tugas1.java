import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        
        Scanner cn = new Scanner(System.in);

        double x, y, sisa_harga, pokok_per_bulan, bunga_per_bulan, cicilan_per_bulan;
        int z;

        System.out.println("Masukkan harga laptop: ");
        x = cn.nextInt();
        System.out.println("Masukkan uang muka: ");
        y = cn.nextInt();
        System.out.println("Masukkan durasi tenor: ");
        z = cn.nextInt();

        sisa_harga = x-y;
        pokok_per_bulan=sisa_harga / z;
        bunga_per_bulan = sisa_harga * 0.02;
        cicilan_per_bulan= pokok_per_bulan+bunga_per_bulan;

        System.out.println("Jumlah cicilan perbulan: Rp. " + cicilan_per_bulan);

        cn.close();
    }
}
