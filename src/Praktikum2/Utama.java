/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Utama {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator(0,0);
        Scanner m = new Scanner(System.in);
        System.out.print("Masukan Bilangan Pertama = ");
        k.bil1 = m.nextDouble();
        System.out.print("Masukan Bilangan Kedua = ");
        k.bil2 = m.nextDouble();
        System.out.println();
        System.out.println("Hasil Penjumlahan = "+k.penjumlahan());
        System.out.println("Hasil Pengurangan = "+k.pengurangan());
        System.out.println("Hasil Perkalian = "+k.perkalian());
        System.out.println("Hasil Pembagian = "+k.pembagian());
       
    }
}
