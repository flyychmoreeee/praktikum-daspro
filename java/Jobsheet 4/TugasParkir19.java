import java.util.Scanner;

public class TugasParkir19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double biaya_parkir;
        System.out.println("--- Hitung biaya parkir ---");
        System.out.print("Input durasi parkir: ");
        int lama_parkir = sc.nextInt();

        if (lama_parkir <= 2) {
            biaya_parkir = 2000;
            System.out.println("Biaya parkir: Rp " + biaya_parkir);
        } else {
            biaya_parkir = 2000 + (lama_parkir - 2) * 1000;
            System.out.println("Biaya parkir: Rp " + biaya_parkir);
        }

        sc.close();
    }
}
