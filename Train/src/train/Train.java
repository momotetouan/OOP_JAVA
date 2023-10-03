/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package train;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Farehan Yahya
 */
public class Train {
            //attributs
        String numTrain;
        Date dateHeure;
        ArrayList<String> lignes;
        Locomotive Loco;
        ArrayList<wagon>wagons;

public Train(String numTrain, Date dateHeure, ArrayList<String> lignes, Locomotive Loco) {
        this.numTrain = numTrain;
        this.dateHeure = dateHeure;
        this.lignes = lignes;
        this.Loco = Loco;
        this.wagons = new ArrayList<wagon>();
    }

public void ajoutWagon(wagon w){
    if(getMasseTotale()+w.getMasseTotale()<=this.Loco.getMassTract())
    this.wagons.add(w);
    
}

public void retraitWagon(){
    this.wagons.remove(this.wagons.size()-1);
}
public double getMasseTotale(){
    double m =0;
    for(int i=0; i<this.wagons.size();i++){
        m+=this.wagons.get(i).getMasseTotale();
    }
    return m;
}
public void reservePlace(Passager p , int c){
    int i = 0;
    while(p.getPlace()==0 && i<this.wagons.size())
    {
        wagon w = this.wagons.get(i);
        if(w.getClass().getSimpleName().equals("Voiture"))
        {
            Voiture v = (Voiture)w;
            if(v.getClasse()==c)
            {
                v.reservePlace(p);
            }
        }
        i++;
    }
}

    @Override
    public String toString() {
        return "Train{" + "numTrain=" + numTrain + ", dateHeure=" + dateHeure + ", lignes=" + lignes + ", Loco=" + Loco + ", wagons=" + wagons + '}';
    }


}