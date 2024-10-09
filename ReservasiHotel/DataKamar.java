/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservasiHotel;
import java.util.ArrayList;  // Mengimpor ArrayList untuk menyimpan data
import java.util.List;  // Mengimpor List
/**
 *
 * @author annis
 */
public class DataKamar {
    private static List<Kamar> listKamar = new ArrayList<>();
    private static List<PesanKamar> listPesanan = new ArrayList<>();

    // Blok static untuk inisialisasi awal data kamar
    static {
        listKamar.add(new Kamar(101, "Single"));
        listKamar.add(new Kamar(201, "Double"));
        listKamar.add(new Kamar(301, "Suite"));
    }

    // Method untuk mendapatkan daftar kamar
    public static List<Kamar> getListKamar() {
        return listKamar;
    }

    // Method untuk mendapatkan daftar reservasi
    public static List<PesanKamar> getListPesanan() {
        return listPesanan;
    }

 }
