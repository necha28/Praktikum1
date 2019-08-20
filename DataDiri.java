/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author necha
 */
public class DataDiri {
    public static void main(String[] args) {
        // membuat variabel
        String nama, alamat, kelas;
        int usia;
        double tinggi;
        char gender;
        char goldar;
        
        // mengisi variabel
        nama = "Necha Syifa" ;
        alamat = "Malang" ;
        usia = 16;
        tinggi = 160;
        gender = 'P';
        goldar = 'B';
        kelas = "X RPL 2" ;
        
        // mencetak ke layar isi variabel
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("tinggi: " + tinggi + " cm");
        System.out.println("gender: " + gender);
        System.out.println("goldar: " + goldar);
        System.out.println("kelas: " + kelas);
        
    }
    
}
