/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOALBAB5;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class MainBukuTamu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---------USER FRIENDLY-----------");
        System.out.println("~~~~~~~~ BUKU TAMU IF R ~~~~~~~~~");
        System.out.println("berapa tamu yang datang : ");
        int banyak = in.nextInt();
        for (int ulang = 0; ulang < banyak; ulang++) {
            System.out.print("masukkan Nama Tamu ke "+(ulang+1)+"   : ");
            String nama = in.next();
            System.out.print("Masukkan Alamat Tamu ke "+(ulang+1)+" : ");
            String alamat = in.next();
            BukuTamu.namaTamu(nama, ulang);
            BukuTamu.alamatTamu(alamat, ulang);
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Data Yang Masuk : ");
            BukuTamu.data();
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=");
        }
    }
}
