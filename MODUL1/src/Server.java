

import java.util.Scanner;

public class Server {

    
    public static void main(String[] args) {
        // TODO Create Database
        Database db = new Database();
        // TODO Create Menu
        Menu menu1 = new Menu();
        menu1.setNama(nama:"Nasi padang sukabirus");
        menu1.setKategori(kategori:"Makanan");
        menu1.setPrice(price:"50000");

        Menu menu2 = new Menu();
        menu2.setNama(nama:"Bakso Japra dekat SMA");
        menu2.setKategori(kategori:"Makanan");
        menu2.setPrice(price:"75000");

        Menu menu3 = new Menu();
        menu3.setNama(nama:"Ayam serunding baraya");
        menu3.setKategori(kategori:"Makanan");
        menu3.setPrice(price:"35000");
        // TODO Insert Menu to Database
       db.insertMenu(menu1);
       db.insertMenu(menu2);
       db.insertMenu(menu3);
        // TODO Display Main Menu
        Scanner scanner = new Scanner(System.in);
        System.out.println(x:"Selamat datang di restoran irsyad");
        System.out.println(x:"Silahkan Register Terlebih Dahulu");
        System.out.println(x:"==================================");

        System.out.print(s:"Nama :");
        String name = scanner.nextLine() ;

        System.out.print(s:"No HP :");
        int nohp = scanner.nextInterger();


        // TODO Create User
        User user = new User();
        user.setNama(nama);
        user.setNohp(nohp);
        user.register();
        // Display Menu
        while(true){
            System.out.println(x:"=============================");
            System.out.println(x:"1. Menu");
            System.out.println(x:"2. Pilih Menu");
            System.out.println(x:"2. Keluar");
            System.out.println(x:"=============================");

            System.out.print(s:"Masukkan Pilihan :");
            int pilihan = scanner.nextInteger();

            if(menu == 1){
                db.showMenu();
            }
        }
    }
}