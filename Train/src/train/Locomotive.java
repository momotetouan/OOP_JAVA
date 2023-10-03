/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package train;

/**
 *
 * @author Farehan Yahya
 */
public class Locomotive {
    //attributs
    String numLoco;
    double massTract;
    //accesseurs

    public String getNumLoco() {
        return numLoco;
    }

    public void setNumLoco(String numLoco) {
        this.numLoco = numLoco;
    }

    public double getMassTract() {
        return massTract;
    }

    public void setMassTract(double massTract) {
        this.massTract = massTract;
    }

    public Locomotive(String numLoco, double massTract) {
        this.numLoco = numLoco;
        this.massTract = massTract;
    }

    @Override
    public String toString() {
        return "Locomotive{" + "numLoco=" + numLoco + ", massTract=" + massTract + '}';
    }
    
}
