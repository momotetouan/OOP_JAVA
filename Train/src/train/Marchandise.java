/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package train;

/**
 *
 * @author Farehan Yahya
 */
public class Marchandise extends wagon{
    //attributs
   private double masseMarx;
   private double masseMarch;
   private String descriptif;

    public Marchandise(double m, String n, double mm, double mma, String d) {
        super(m,n);
        this.masseMarx = mm;
        this.masseMarch = mma;
        this.descriptif = d;
    }
    public double getMasseTotale(){
        return this.masseMarch+getMasse();
}

    @Override
    public String toString() {
        return "Marchandise{" + "masseMarx=" + masseMarx + ", masseMarch=" + masseMarch + ", descriptif=" + descriptif + '}';
    }
    
    
}