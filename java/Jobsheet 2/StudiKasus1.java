import java.util.Scanner;

public class StudiKasus1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int gaji_pokok, tunjangan_anak, jumlah_anak;

        // 10%
        double potongan_dana_pensiun = 0.1;

        System.out.print("Masukkan gaji pokok: ");
        gaji_pokok = input.nextInt();

        System.out.print("Masukkan tunjangan anak: ");
        tunjangan_anak = input.nextInt();

        System.out.print("Masukkan jumlah anak: ");
        jumlah_anak = input.nextInt();

        double gaji_bersih = gaji_pokok + (tunjangan_anak*jumlah_anak) - (potongan_dana_pensiun*gaji_pokok);
        System.out.println("Total gaji bersih anda: Rp" + gaji_bersih);

        input.close();
    }
    
}
