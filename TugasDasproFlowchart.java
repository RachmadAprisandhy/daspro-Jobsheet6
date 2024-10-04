import java.util.Scanner;

public class TugasDasproFlowchart{

    public static void main (String [] args){
        Scanner inputtoko18 = new Scanner(System.in);

        String JenisBuku;
        int JumlahBuku;
        int HargaBuku = 20000;
        double Harga_Bayar,diskon,total_Diskon;


        System.out.println("------------------------------------");
        System.out.println("========= DaVinci Bookstore ========");
        System.out.println("------------------------------------");
        System.out.println("Masukkan Jenis Buku : ");
        JenisBuku =inputtoko18.nextLine();
        System.out.println("Masukkan Jumlah buku Yang dibeli : ");
        JumlahBuku = inputtoko18.nextInt();

        if (JenisBuku.equalsIgnoreCase("KAMUS")) {
            diskon = 0.1;
            if (JumlahBuku > 2) {
                diskon += 0.02;
            }
        } else if (JenisBuku.equalsIgnoreCase("NOVEL")) {
            diskon = 0.07;
            if (JumlahBuku > 3) {
                diskon += 0.02;
            }
        } else {
            if (JumlahBuku > 3) {
                diskon = 0.05;
            } else {
                diskon = 0;
            }
        }

        double Harga_Total = HargaBuku * JumlahBuku;
        total_Diskon = Harga_Total * diskon;
        double total = Harga_Total - total_Diskon;

        System.out.println("Jumlah diskon anda adalah sebanyak : " + diskon);
        System.out.println("Total yang harus dibayar : Rp" + total);
        System.out.println("====================Terima Kasih telah berbelanja====================");
        System.out.println("=====================LITERATION RULES THE WORLD======================");

        }
    }

