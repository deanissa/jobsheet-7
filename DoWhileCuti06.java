import java.util.Scanner;
public class DoWhileCuti06 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int jatahCuti;
        int jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti : ");
        jatahCuti = sc.nextInt();

        do {
            System.out.print ("Apakah Anda ingin mengambil cuti (y/n)");
            konfirmasi = sc.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari :");
                jumlahHari = sc.nextInt();

                if (jumlahHari <= jatahCuti){
                    jatahCuti -= jumlahHari;
                    System.out.println ("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    break;
                }
            }
        } while (jatahCuti >0);
    }
    
}
