/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;
/**
 *
 * @author annis
 */
public class UserAdmin extends UserLogin{

    public UserAdmin(String username, String password) {
        super(username, password);
    }

    public void cekKamarTersedia() {
        for (Kamar kamar : DataKamar.getListKamar()) {
            System.out.println("Kamar " + kamar.getNoKamar() + ": " + 
                (kamar.tersedia() ? "Tersedia" : "Telah dipesan"));
        }
    }

    public void lihatPesanan() {
        DataKamar.getListPesanan().forEach(pesanan -> 
            System.out.println(pesanan));
    }
}
