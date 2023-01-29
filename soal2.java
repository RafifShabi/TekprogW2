import java.util.Scanner;
/**
 *
 * @author RafifShabiPrasetyo
 */
public class soal2 {
    public static void main(String[] args) {
        // Deklarasi Variabel
        String kalimat;
        int angka;
        
        // Membuat array of string dan array of integer untuk menampung hasil inputan
        String[] arrKalimat = new String[15];
        int[] arrAngka = new int[3];

        // Membuat Scanner baru
        Scanner scanner = new Scanner(System.in);
        
        // Melakukan scanner ke array menggunakan perulangan
        for(int i = 0; i < 3; i++) {
            kalimat = scanner.next();
            arrKalimat[i] = kalimat;
            angka = scanner.nextInt();
            arrAngka[i] = angka;
        }
        
        // Menampilkan Output
        System.out.println("==============================");
        for(int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", arrKalimat[i], arrAngka[i]); // %03d untuk membuat format integer 000, %s untuk mengoutputkan string
        }
        System.out.println("==============================");
    }
}
