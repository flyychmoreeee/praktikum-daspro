import java.util.Scanner;

public class TugasAntrean19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Mesin Antrean Akademik ---");
        System.out.print("Masukkan kode layanan: ");

        int kode_layanan = sc.nextInt();

        switch (kode_layanan) {
            case 1:
                System.out.println("Layanan legalisir ijazah berada di Loket A");
            break;
            case 2:
                System.out.println("Layanan surat keterangan aktif kuliah berada di Loket B");
            break;
            case 3:
                System.out.println("Layanan pembayaran UKT berada di Loket C");
            break;
            case 4:
                System.out.println("Layanan pengajuan cuti akademik berada di Loket D");
            break;
            default:
                System.out.println("Kode layanan tidak tersedia");
        }

        sc.close();
    }
}
