/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;

/**
 *
 * @author annis
 */
public class PesanKamar {
    
    private int noPesanan;
    private UserCustomer customer;
    private Kamar kamar;

    public PesanKamar(UserCustomer customer, Kamar kamar, int noPesanan) {
        this.noPesanan = noPesanan;
        this.customer = customer;
        this.kamar = kamar;
        kamar.setTersedia(false);
    }

    public int getNoPesanan() {
        return noPesanan;
    }

    public UserCustomer getCustomer() {
        return customer;
    }

    public Kamar getKamar() {
        return kamar;
    }
}
