/**
 * WhileKelipatan06
 */
import java.util.Scanner;
public class WhileKelipatan06 {
    public static void main (String[]args){
        Scanner scan = new Scanner (System.in);
        int kelipatan;
        int jumlah = 0; 
        int counter = 0;
 
        System.out.print ("Masukkan bilangan kelipatan (1-9) :");
        kelipatan = scan.nextInt();

        int i = 1;
        while  (i<=50){
                if (i % kelipatan == 0){
                jumlah += i;
                counter ++;
            }
            i++;
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    }     
}