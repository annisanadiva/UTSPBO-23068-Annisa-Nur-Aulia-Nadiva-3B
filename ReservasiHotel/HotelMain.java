/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ReservasiHotel;
import java.util.Scanner;
/**
 *
 * @author annis
 */
public class HotelMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Contoh data user customer dan admin (username dan password)
        UserCustomer customer = new UserCustomer("nadiva", "ndv123");
        UserAdmin admin = new UserAdmin("admin1", "123min");

        System.out.println("Selamat datang di aplikasi reservasi hotel.");
        System.out.println("Apakah Anda Admin atau Customer? (Ketik 'admin' atau 'customer')");
        String userType = scanner.nextLine();

        // User diminta menginput username dan password
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        // Proses login berdasarkan tipe pengguna
        
        // Proses login customer
        if (userType.equalsIgnoreCase("customer")) {
            if (customer.login(inputUsername, inputPassword)) {
                System.out.println("Customer berhasil login.");
                // Customer dapat melanjutkan fitur reservasi setelah berhasil login
            } else {
                System.out.println("Username atau password Customer salah.");
            }
        // Proses login admin
        } else if (userType.equalsIgnoreCase("admin")) {
            if (admin.login(inputUsername, inputPassword)) {
                System.out.println("Admin berhasil login.");
                // Admin dapat melanjutkan fitur pengelolaan setelah berhasil login
            } else {
                System.out.println("Username atau password Admin salah.");
            }
        } else {
            // Akan mengeluarkan pesan kesalahan jika inputan tidak valid (bukan admin atau customer)
            System.out.println("Tipe pengguna tidak valid. Harap ketik 'admin' atau 'customer'.");
        }
        
        // Method untuk menampilkan menu utama untuk customer
        if (customer.login(inputUsername, inputPassword)) {
            int opsi;
            do {
                // Menampilkan pilihan menu
                System.out.println("\n=== Menu Utama Reservasi ===");
                System.out.println("1. Pesan Kamar");
                System.out.println("2. Cek Ketersediaan Kamar");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");
                opsi = scanner.nextInt();  // User diminta menginput opsi dan akan scan oleh program

                switch (opsi) {
                    case 1:
                        // Opsi untuk customer memproses pemesanan kamar
                        Kamar kamar = DataKamar.getListKamar().get(0);
                        customer.pesanKamar(kamar);
                        break;

                    case 2:
                        // Opsi untuk customer mengecek ketersediaan kamar
                        System.out.println("Cek Ketersediaan Kamar: ");
                        for (Kamar r : DataKamar.getListKamar()) {
                            r.cekKetersediaan(); 
                        }
                        break;
                    case 3:
                        // Opsi untuk keluar dari program
                        System.out.println("Keluar dari aplikasi.");
                        break;
                    default:
                        // Jika opsi yang dipilih tidak valid
                        System.out.println("Pilihan tidak valid.");
                }
            } while (opsi != 3);  // Untuk mengulangi program hingga user memilih opsi keluar
        }

        // Method untuk menampilkan menu utama untuk admin
        if (admin.login(inputUsername, inputPassword)) {
            int opsi;
            do {
                // Menampilkan pilihan menu
                System.out.println("\n=== Menu Utama Pengelolaan ===");
                System.out.println("1. Cek Ketersediaan Kamar");
                System.out.println("2. Lihat Semua Pesanan");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu: ");
                opsi = scanner.nextInt();  // User diminta menginput opsi dan akan scan oleh program

                switch (opsi) {
                    case 1:
                        // Opsi untuk admin mengecek ketersediaan kamar
                        admin.cekKamarTersedia();  // Admin melihat ketersediaan kamar
                        break;
                    case 2:
                        // Opsi untuk admin melihat semua pesanan
                        admin.lihatPesanan();  // Admin melihat semua pesanan yang ada di database
                        break;
                    case 3:
                        // Opsi untuk keluar dari program
                        System.out.println("Keluar dari aplikasi.");
                        break;
                    default:
                        // Jika opsi yang dipilih tidak valid
                        System.out.println("Pilihan tidak valid.");
                }
            } while (opsi != 3);  // Untuk mengulangi program hingga user memilih opsi keluar
        }    
    }
}
