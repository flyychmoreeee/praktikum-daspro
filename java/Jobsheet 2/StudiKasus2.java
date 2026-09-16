import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        double lebar, panjang, diameter, sisi;

        System.out.print("Masukkan lebar tanah: ");
        lebar = input.nextInt();

        System.out.print("Masukkan panjang tanah: ");
        panjang = input.nextInt();

        System.out.print("Masukkan diameter kolam: ");
        diameter = input.nextInt();

        System.out.print("Masukkan panjang sisi taman: ");
        sisi = input.nextInt();


        double luas_tanah = lebar * panjang;

        double jari_jari = diameter / 2;

        double luas_kolam = Math.PI * jari_jari * jari_jari;

        double luas_taman = sisi * sisi;
        
        double luas_tanah_yang_tidak_digunakan = luas_tanah - luas_kolam - luas_taman;
        
        System.out.println("Luas tanah yang tidak digunakan: " + luas_tanah_yang_tidak_digunakan + " meter");

        input.close();
    }
}
