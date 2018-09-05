/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanPraktikum;

/**
 *
 * @author USER
 */
public class Kucing extends Hewan{
    @Override
    void setNama(){
        String Kucing = "Carberus";
        System.out.println("Nama Kucing : "+Kucing);
    }
     @Override
    void setSuara(){
        String suara = "Miaw Meow Meong";
        System.out.println("Suara Kucing : "+suara);
    }
     @Override
    void setBerat(){
        double berat = 2.0;
        System.out.println("Berat Kucing : "+berat+"Kg");
    }
}
