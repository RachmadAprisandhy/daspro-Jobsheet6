import java.util.Scanner;

public class Pemilihan2Percobaan1_18{

    public static void main (String [] args){
        Scanner input18 = new Scanner(System.in);

        int tahun;

        System.out.println("Masukkan Tahun : ");
        tahun = input18.nextInt();

        if ((tahun % 4)== 0){
            if ((tahun % 100)==0);
            System.out.println("Tahun Kabisat");
        } else
            System.out.println("bukan tahun Kabisat");
    }
}