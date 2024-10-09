/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;

/**
 *
 * @author annis
 */
public class UserCustomer extends UserLogin{

    public UserCustomer(String username, String password) {
        super (username, password);
    }

    public void pesanKamar(Kamar kamar) {
        if(kamar.tersedia()) {
            System.out.println("Kamar berhasil dipesan.");
        } else {
            System.out.println("Kamar tidak tersedia.");
        }
    }

    public void lihatPesanan(PesanKamar pesanan) {
        System.out.println("Reservation details: " + pesanan);
    }
}
