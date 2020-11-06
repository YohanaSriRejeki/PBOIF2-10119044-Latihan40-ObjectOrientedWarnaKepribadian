/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119044.latihan40.objectorientedwarnakepribadian;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : Yohana Sri Rejeki
 * KELAS    : IF2
 * NIM      : 10119044
 * Deskripsi Program : Program ini bertujuan menampilkan warna kepribadian dari 
 * warna kesukaan yang dimasukkan oleh user dengan metode object oriented
 */
class WarnaKepribadian {
    public String nama;
    public String warna;
    
    String merah = "\u001b[31m";
    String latarMerah = "\u001b[41m";
    String hijau = "\u001b[32m";
    String latarHijau = "\u001b[42m";
    String kuning = "\u001b[33m";
    String latarKuning= "\u001b[43m";
    String biru = "\u001b[34m";
    String latarBiru = "\u001b[44m";
    String ungu = "\u001b[35m";
    String latarUngu = "\u001b[45m";
    String cyan = "\u001b[36m";
    String putih = "\u001b[37;1m";
    String transparan = "\u001b[0m"; 
    
    public void memilihWarna(){
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.print("PILIH WARNA FAVORITMU : ");
        warna = input.next();
        warna = warna.toUpperCase();
        System.out.print("NAMA KAMU : ");
        nama = input.next();
    }
    
    public void hasilTest(){
        System.out.println("===HASIL TEST KEPRIBADIAN "+(nama.toUpperCase())+"===");
        
        switch (warna){
            case ("MERAH"):
                System.out.println("Warna Favoritmu adalah "+merah+warna+transparan);
                System.out.println("1. Periang,");
                System.out.println("2. Pemberani,");
                System.out.println("3. Berani mengambil resiko dalam setiap langkah,");
                System.out.println("4. Menyukai tantangan,");
                System.out.println("5. Kurang sabar,");
                System.out.println("6. Dapat menahan marah namun jika sudah tahap puncak toleransi, kemarahannya akan sulit dikontrol");
                System.out.println("7. Memiliki energi kehangatan dan cinta.");
             break;
             case ("HIJAU"):
                System.out.println("Warna Favoritmu adalah "+hijau+warna+transparan);
                System.out.println("1. Romantis,");
                System.out.println("2. Menyukai hal yang berbau alami dan keindahan,");
                System.out.println("3. Teguh pada prinsip,");
                System.out.println("4. Menginginkan kesempurnaan,");
                System.out.println("5. Mudah cemburu,");
                System.out.println("6. Mudah merasa iri");
                System.out.println("7. Menjunjung tinggi suatu nilai toleransi dan kepercayaan.");
             break;
             case ("KUNING"):
                System.out.println("Warna Favoritmu adalah "+kuning+warna+transparan);
                System.out.println("1. Optimis,");
                System.out.println("2. Suka bergaul,");
                System.out.println("3. Periang,");
                System.out.println("4. Senang menolong,");
                System.out.println("5. Lincah dan aktif,");
                System.out.println("6. Tidak suka meremehkan kekurangan orang lain");
                System.out.println("7. Loyal,");
                System.out.println("8. Hangat,");
                System.out.println("9. Meskipun karakternya optimis dan idealis, seringkali goyah dan tidak stabil,");
                System.out.println("10. Cenderung penakut.");
             break;
             case ("BIRU"):
                System.out.println("Warna Favoritmu adalah "+biru+warna+transparan);
                System.out.println("1. Menyenangkan,");
                System.out.println("2. Bijaksana,");
                System.out.println("3. Pembawaan diri tenang saat menghadapi masalah,");
                System.out.println("4. Dinamis,");
                System.out.println("5. Senang berbagi,");
                System.out.println("6. Bersahabat,");
                System.out.println("7. Tidak terlalu suka menjadi sorotan banyak orang,");
                System.out.println("6. Menyembunyikan perasaan karena karakternya yang cenderung mencari jalan damai.");
             break;
             case ("UNGU"):
                System.out.println("Warna Favoritmu adalah "+ungu+warna+transparan);
                System.out.println("1. Optimis,");
                System.out.println("2. Tidak pernah ragu,");
                System.out.println("3. Menurutnya pasangan yang ideal adalah yang memiliki mental yang kuat,");
                System.out.println("4. Memiliki ambisi yang besar,");
                System.out.println("5. Memiliki empati yang besar,");
                System.out.println("6. Memiliki sisi misterius sebab seringkali menutupi perasaannya,");
                System.out.println("7. Terkadang bersikap keras kepala dan angkuh.");
             break;
             default:
                 System.out.println("Oops... Belum teridentifikasi");
        }
    }
}
