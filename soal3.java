import java.util.Scanner;
/**
 *
 * @author RafifShabiPrasetyo
 */
public class soal3 {
	// Deklarasi variabel
    Scanner scan = new Scanner (System.in);
    double bil1 = scan.nextDouble ();
    String operator = scan.next ();
    double bil2 = scan.nextDouble ();
    double result;
	
	// Operator switch case untuk operator matematika
    switch (operator)
      {
    case "+" -> { // jika + maka bil1 + bil2 dan hasil disimpan di result
	result = bil1 + bil2;
	System.out.println (result);
	}
	break;
	case "-" -> { // jika - maka bil1 - bil2 dan hasil disimpan di result
	result = bil1 - bil2;
	System.out.println (result);
	}
	break;
	case "*" -> { // jika * maka bil1 * bil2 dan hasil disimpan di result
	result = bil1 * bil2;
	System.out.println (result);
	}
	break;
	case "/" -> { // jika / maka bil1 / bil2 dan hasil disimpan di result tetapi disini terdapat if jika bil2 bukan 0 maka operasi akan dilaksanakan, tetapi jika bil2 0 maka akan di tampilkan "Tidak bisa dibagi dengan 0"
	if (bil2 != 0)
	  {
	    result = bil1 / bil2;
	    System.out.println (result);
	  }
	else
	  {
	    System.out.println ("Tidak bisa dibagi dengan 0");
	  }
	}
	break;
      default -> { // jika operator selain diatas maka akan masuk ke default
	System.out.println ("Perintah salah");
	  }
	break;
      }
}
