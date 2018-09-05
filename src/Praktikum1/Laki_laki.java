/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum1;

/**
 *
 * @author USER
 */
public class Laki_laki extends Manusia{
    
    public Laki_laki (double TB){
        this.Tinggibadan=TB;
    }
    @Override
    public double htgbbi(){
        return ((Tinggibadan - 100) - ((Tinggibadan - 100) * 10/100));
}
}
