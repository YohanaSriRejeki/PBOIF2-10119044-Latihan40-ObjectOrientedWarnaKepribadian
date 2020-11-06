/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan40.objectorientedwarnakepribadian;

/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan warna kepribadian dari 
 * warna kesukaan yang dimasukkan oleh user dengan metode object oriented
 */

public class PBOIF210119044Latihan40ObjectOrientedWarnaKepribadian {
    public static void main(String[] args) {
        WarnaKepribadian wk = new WarnaKepribadian();
        System.out.println(wk.merah+"YUK "+wk.hijau+"CEK "+wk.kuning+"KEPRIBADIAN "+wk.cyan+"DARI "+wk.ungu+"WARNA "+wk.biru+"FAVORITMU");
        System.out.println();
        System.out.println(wk.latarMerah+wk.putih+"       MERAH        "+wk.transparan);
        System.out.println(wk.latarHijau+wk.putih+"       HIJAU        "+wk.transparan);
        System.out.println(wk.latarKuning+wk.putih+"       KUNING       "+wk.transparan);
        System.out.println(wk.latarBiru+wk.putih+"       BIRU         "+wk.transparan);
        System.out.println(wk.latarUngu+wk.putih+"       UNGU         "+wk.transparan);
        
        System.out.println();
        wk.memilihWarna();
        wk.hasilTest();
    }
}
