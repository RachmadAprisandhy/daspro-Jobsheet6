import java.util.Scanner;

public class Pemilihan2Percobaan2_18{

    public static void main (String [] args){
        Scanner input18 = new Scanner(System.in);

        int Pilihan_Menu,harga;
        String member,BayarDgQriz;
        double diskon,total_bayar,QRIZ = 1000;
        

        System.out.println("------------------------------");
        System.out.println("=========MENU KAFE JTI========");
        System.out.println("------------------------------");
        System.out.println("1. RiceBowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. paket boundling (Ricebowl+Ice Tea)");
        System.out.println("----------------------------------------------------");
        System.out.print("MASUKKAN ANGKA DARI MENU YANG DIPILIH : ");
        Pilihan_Menu = input18.nextInt();
        input18.nextLine();
        System.out.print("APAKAH PELANGGAN MEMILIKI MEMBER (Y/N) ?  = ");
        member = input18.nextLine();
        System.out.print("APAKAH ANDA AKAN MEMBAYAR DENGAN MENGGUNAKAN QRIZ (Y/N)");
        BayarDgQriz = input18.nextLine();
        System.out.println("----------------------------------------------------");

        if (BayarDgQriz.equalsIgnoreCase("y")) {
            System.out.println("Potongan Qris = Rp 1.000");
        }
    
        if (member.equalsIgnoreCase("Y")){
            diskon = 0.10;
            System.out.println("besar Diskon anda = 10 %");
            if (Pilihan_Menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);

            } else if ( Pilihan_Menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);

            } else if ( Pilihan_Menu == 3){
                harga = 15000;
                System.out.println("Harga paket bundling = " + harga);
            }else{
                System.out.println("MASUKKAN PILIHAN MENU DENGAN BENAR");
                return;
            }
            
            total_bayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + (total_bayar - QRIZ));
        }
        else if (member.equalsIgnoreCase("N")){
            if (Pilihan_Menu == 1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            }else if ( Pilihan_Menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            }else if ( Pilihan_Menu == 3){
                harga = 15000;
                System.out.println("Harga paket bundling = " + harga);
            }else{
                System.out.println("MASUKKAN PILIHAN MENU DENGAN BENAR");
                return;
            }
            System.out.println("Total bayar setelah diskon = " + (harga - QRIZ));
        }else{
            System.out.println("MEMBER TIDAK VALID");
        }
        System.out.println("----------------------------------------------------");
    }
}