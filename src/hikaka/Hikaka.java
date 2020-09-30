/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hikaka;
import java.util.Scanner;

/**
 *
 * @author sonadztux | Nanda Arfan Hakim
 */
public class Hikaka {
    Scanner input = new Scanner(System.in);
    String kalimat, jawaban;
    int jmlKata = 0;
    int jmlHuruf = 0;
    int jmlKarakter = 0;
    int spasi = 0;
    
    
    public static void main(String[] args) {
        System.out.println("__== Selamat Datang di Program Hitung Kata dan Karakter ==__");
        
        Hikaka mulai = new Hikaka();
        mulai.program();
    }
    
    public void program(){
        
        System.out.print("\nMasukkan kalimat: ");
        kalimat = input.nextLine();

        Hikaka.hitungKata(kalimat, jmlKata, spasi);
        Hikaka.hitungHuruf(kalimat, jmlHuruf, spasi);
        Hikaka.hitungKarakter(kalimat, jmlKarakter);
        
        tanya();
    }
    
    public void tanya(){
        System.out.print("\nInput lagi? ");
        jawaban = input.nextLine();
        
        if(jawaban.equals("y") || jawaban.equals("ya")){
            program();
        }
        else if(jawaban.equals("t") || jawaban.equals("tidak")){
            keluar();
        }
        else{
            System.out.println("Hanya dapat menginputkan (y/ya) dan (t/tidak)!");
            tanya();
        }
    }
    
    public static void hitungKata(String kalimat, int jmlKata, int spasi){
        int panjangKalimat = kalimat.length();
                
        while(spasi < panjangKalimat){
            while(spasi < panjangKalimat && kalimat.charAt(spasi) == ' '){
                spasi++;
            }
            if(spasi < panjangKalimat && kalimat.charAt(spasi) != ' '){
                jmlKata++;
                
                while(spasi < panjangKalimat && kalimat.charAt(spasi) != ' '){
                    spasi++;
                }
            }
        }
        System.out.println("\n========= HASIL PERHITUNGAN =========");
        System.out.println("Jumlah kata: "+jmlKata+" kata.");
    }
    
    public  static void hitungHuruf(String kalimat, int jmlHuruf, int spasi){
        int panjangKalimat = kalimat.length();
        for(int i = 0; i < panjangKalimat; i++) {
            
            if(kalimat.charAt(i) == ' '){
                spasi++;
            }
        }
        
        jmlHuruf = panjangKalimat - spasi;
        System.out.println("Jumlah huruf: "+jmlHuruf+" huruf");
    }
    
    public static void hitungKarakter(String kalimat, int jmlKarakter){
        jmlKarakter = kalimat.length();
        System.out.println("Jumlah karakter: "+jmlKarakter);
    }
    
    public void keluar(){
        System.out.println("Terima kasih sudah menggunakan program HIKAKA.");
        System.out.println("Copyright © 2019 | Made with love by group 3 SI-42-02");
    }
    
}
