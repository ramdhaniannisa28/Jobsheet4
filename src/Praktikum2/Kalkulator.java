/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum2;

/**
 *
 * @author USER
 */
public class Kalkulator implements Operasi{
    double bil1,bil2;
    
    public Kalkulator(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    public double getBil(){
        return bil1;
    }
    public double getBil2(){
        return bil2;
    }

    @Override
    public double penjumlahan() {
        double penjumlahan=bil1+bil2;
        return penjumlahan;
    }

    @Override
    public double pengurangan() {
        double pengurangan = bil1-bil2;
        return pengurangan;
    }

    @Override
    public double perkalian() {
        double perkalian = bil1*bil2;
        return perkalian;
    }

    @Override
    public double pembagian() {
        double pembagian = bil1/bil2;
        return pembagian;
    }
   
    
}
