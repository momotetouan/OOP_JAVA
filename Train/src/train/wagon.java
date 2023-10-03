/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package train;

/**
 *
 * @author Farehan Yahya
 */
public abstract class wagon {
    //attributs
    double masse;
    String numWagon;

    public wagon(double masse, String numWagon) {
        this.masse = masse;
        this.numWagon = numWagon;
    }

    public double getMasse() {
        return masse;
    }
    
    
    public abstract double getMasseTotale();
    public abstract String toString();
}
