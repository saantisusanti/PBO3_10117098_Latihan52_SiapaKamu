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
public class Manusia {
    protected String nama;
    protected int umur;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void siapaKamu(){
        System.out.println("Saya Manusia");
    }
}
