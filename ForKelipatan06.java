/**
 * ForKelipatan06
 */
import java.util.Scanner;
public class ForKelipatan06 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int kelipatan;
        int jumlah = 0; 
        int counter = 0;
        float rata;
        rata = 0;
 
        System.out.print ("Masukkan bilangan kelipatan (1-9) :");
        kelipatan = sc.nextInt();
        for (int i = 1; i<=50; i++){
            if ( i % kelipatan == 0){
                jumlah += i;
                counter ++;
                rata = jumlah/counter;
            }
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.printf("Rata Rata bilangan %d adalah %.3f\n", kelipatan, rata);
    }     
}