/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan52_siapakamu;

/**
 *
 * @author 
 * NAMA     : SANTI SUSANTI
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan siapa kamu,
 *                     yaitu terdapat manusia, dosen, dan mahasiswa sesuai 
 *                     dengan kententuan.
 */
public class PBO3_10117098_Latihan52_SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("41227829930");
        System.out.println("NIP Dosen : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        dosen.mengajarApa();
        System.out.println("");
       
    Mahasiswa mhs = new Mahasiswa();
        mhs.setNim("10110269");
        System.out.println("NIM Mahasiswa : "+mhs.getNim());
        mhs.siapaKamu();
        mhs.setNama("Nindi");
        mhs.setUmur(17);
        mhs.setKelas("PBO");
        mhs.kelasApa();
    }
    
}
