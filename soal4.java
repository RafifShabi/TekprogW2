import java.util.Scanner;
/**
 *
 * @author RafifShabiPrasetyo
 */
public class soal4 {
    public static void main(String[] args) {
        //Deklarasi Variabel
        String plat1, plat2, plat3, plat4, sumplat;
        long hasil;
        
        // Membuat Scanner Baru
        Scanner scanner = new Scanner(System.in);
        
        // Algoritma
        // Menerima inputan dari user dan masuk ke variabel plat1, plat2, plat3, plat4
        plat1 = scanner.next();
        plat2 = scanner.next();
        plat3 = scanner.next();
        plat4 = scanner.next();
        
        sumplat = plat1 + plat2 + plat3 + plat4; // seluruh plat dijumlahkan dan dimasukkan pada variabel sumplat
        
        // Mengkonversi String ke long, lalu dikurang 999999
        hasil = Long.parseLong(sumplat) - 999999;
        hasil = hasil % 5;
        
        if (hasil == 0) { // Jika hasilnya 0 maka berhenti jika tidak maka jalan
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
    }
}
