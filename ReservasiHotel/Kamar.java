/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;

/**
 *
 * @author annis
 */
public class Kamar {

    private int noKamar;
    private String jenisKamar;
    private boolean tersedia;

    public Kamar(int noKamar, String jenisKamar) {
        this.noKamar = noKamar;
        this.jenisKamar = jenisKamar;
        this.tersedia = true;
    }

    public int getNoKamar() {
        return noKamar;
    }

    public String getJenisKamar() {
        return jenisKamar;
    }

    public boolean tersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        tersedia = tersedia;
    }

    public void cekKetersediaan() {
        System.out.println("Kamar " + noKamar + " " + 
            (tersedia ? "Tersedia" : "Telah dipesan"));
    }
}
