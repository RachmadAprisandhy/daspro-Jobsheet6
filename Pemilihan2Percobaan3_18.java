import java.util.Scanner;

//mport javax.lang.model.util.ElementScanner14;

public class Pemilihan2Percobaan3_18 {

    public static void main (String [] args){
        Scanner input18 = new Scanner(System.in);

        String Kategori;
        int penghasilan,gajiBersih;
        double pajak;

        System.out.print(" Masukkan Kategori : ");
        Kategori = input18.nextLine();
        System.out.print("Masukkan besarnya penghasilan : ");
        penghasilan = input18.nextInt();

        if (Kategori.equals("pekerja")){
            if (penghasilan <=2000000)
            pajak = 0.1;
            else if (penghasilan <=3000000)
            pajak = 0.15;
            else
            pajak = 0.2;
            gajiBersih = (int) (penghasilan -(pajak * penghasilan));
            System.out.println("penghasilan bersih" + gajiBersih);
        }else if (Kategori.equals("pebisnis")) {
            if (penghasilan <=2500000)
            pajak = 0.15;
            else if (penghasilan <=3500000)
            pajak =0.2;
            else
            pajak = 0.25;
            gajiBersih = (int) (penghasilan -(pajak * penghasilan));
            System.out.println("penghasilan bersih" + gajiBersih);

        }else
            System.out.println("masukan kategori salah");
    }
}