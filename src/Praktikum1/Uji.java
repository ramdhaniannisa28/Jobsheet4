/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Uji {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        Manusia l = new Laki_laki(0);
        Manusia p = new Perempuan(0);
        String Kelamin;
        System.out.println("User 1");
        System.out.print("Masukan Tinggi Badan anda (cm) = ");
        l.Tinggibadan = p.Tinggibadan = masukan.nextDouble();
        System.out.print("Masukan Jenis Kelamin = ");
        Kelamin = masukan.next();
        switch(Kelamin){
            case "L":System.out.print("Berat Badan Pria Ideal anda adalah = "+l.htgbbi());
            break;
            case "P":System.out.print("berat Badan Wanita Ideal anda adalah = "+p.htgbbi());
            break;
            case "l":System.out.print("Berat Badan Pria Ideal anda adalah = "+l.htgbbi());
            break;
            case "p":System.out.print("berat Badan Wanita Ideal anda adalah = "+p.htgbbi());
            break;
        }
        System.out.println("\n");
        System.out.println("User 2");
        System.out.print("Masukan Tinggi Badan anda (cm) = ");
        l.Tinggibadan = p.Tinggibadan = masukan.nextDouble();
        System.out.print("Masukan Jenis Kelamin = ");
        Kelamin = masukan.next();
        switch(Kelamin){
            case "L":System.out.println("Berat Badan Pria Ideal anda adalah = "+l.htgbbi());
            break;
            case "P":System.out.println("berat Badan Wanita Ideal anda adalah = "+p.htgbbi());
            break;
            case "l":System.out.println("Berat Badan Pria Ideal anda adalah = "+l.htgbbi());
            break;
            case "p":System.out.println("berat Badan Wanita Ideal anda adalah = "+p.htgbbi());
            break;
        }
    }
    }