/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SOALBAB5;

/**
 *
 * @author DS
 */
public class BukuTamu {
//membuat array dan deklarasi variabel
    private static final String Tamu[][] = new String[3][100];
    private static int ID = 1;
//method static untuk bagian nama tamu
    public static void namaTamu(String nama, int nomor) {
        String id = Integer.toString(ID);
        Tamu[0][nomor] = id;
        Tamu[1][nomor] = nama;
    }
//method static untuk bagian nama tamu
    public static void alamatTamu(String alamat, int nomor) {
        Tamu[2][nomor] = alamat;
    }
//data tersimpan
    public static void data() {
        System.out.println("ID\tNama\tAlamat");
        for (int i = 0; i < ID; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Tamu[j][i] + "\t");
            }
            System.out.println("");
        }
        ID++;
    }
}
