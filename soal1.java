import java.util.Scanner; // Memanggil scanner untuk melakukan inputan dari keyboard
/**
 *
 * @author RafifShabiPrasetyo
 */
public class soal1 {
    public static void main(String[] args){

    //Deklarasi Variabel
    String scan;
    int jumlahkata;

    // Membuat Scanner baru
    Scanner scanner = new Scanner (System.in); // Mengintasiasi objek scanner untuk menerima input dari pengguna
      scan = scanner.nextLine (); // Menerima input dari pengguna dan disimpan pada variabel scan
      String[] kata = scan.split("[@ ? ! _ , . ']+"); // Pada tahap ini kata akan dipisahkan dengan metode split, dipisahkan berdasarkan "[A-Za-z !,?._'@]+," dan disimpan pada variabel scan
    jumlahkata = kata.length; // Untuk menghitung jumlah kata dalam kalimat dan disimpan pada variabel jumlahkata
    System.out.println (jumlahkata); // Menampilkan angka dari variabel jumlahkata
    for(int i = 0; i < jumlahkata; i++){ 
        System.out.println(kata[i]); // Menampilkan kata-kata yang sudah dipisahkan kebawah dengan bantuan for
    }
    }
}