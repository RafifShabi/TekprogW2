import java.util.Scanner; // Memanggil scanner untuk melakukan inputan dari keyboard
/**
 *
 * @author RafifShabiPrasetyo
 */
public class soal5 {
    public static void main(String[] args) {
        // Deklarasi Variabel
        int item, total_gaji;
        int gaji = 500000;
        
        // Membuat Scanner Baru
        Scanner scanner = new Scanner(System.in);
        
        // Algoritma
        item = scanner.nextInt();
        
        if (item < 15) { // Jika item kurang dari 15
            total_gaji = gaji - (((15 - item) * 50000) * 15/100);
            System.out.println(total_gaji);
        } else if (item >= 40 && item < 80) { // Jika item lebih dari atau sama dengan 40 dan kurang dari 80
            total_gaji = gaji + ((item * 50000) * 25/100);
            System.out.println(total_gaji);
        } else if (item > 80) { // Jika item lebih dari 80
            total_gaji = gaji + ((item * 50000) * 35/100);
            System.out.println(total_gaji);            
        } else { // Jika item lebih dari 15 dan kurang dari 40
            total_gaji = gaji + ((item * 50000) * 10/100);
            System.out.println(total_gaji);
        }
    }
}
