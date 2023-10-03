/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package train;

/**
 *
 * @author Farehan Yahya
 */
public class Voiture extends wagon{
    //attributs
    int classe;
    int capacite;
    int nbRes;
    Passager[]passagers;
    
    
    public Voiture(double m, String n, int c, int ca){
        super(m,n);
        this.classe = c;
        this.capacite = ca;
        this.passagers = new Passager[ca];
    }
    public Passager getPassager(int i){
        if(i>=0 && i<this.capacite)
        {
            return this.passagers[i];
        }
        else
            return null;
        
        
    }

    public int getClasse() {
        return classe;
    }
    
    public double getMasseTotale(){
        return getMasse();
    }
    public void liberePlace(int i){
        Passager p = getPassager(i);
        if(p!=null)
        {
            p.setPlace(0);
            p.setVoiture(null);
            this.passagers[i] = null;
            this.nbRes--;
        }
        else{
            System.out.println("Impossible");
        }
        
    }
    
    public void  reservePlace(Passager p){
        if(this.nbRes<this.capacite && p.getPlace()!=0)
        {
            int i=1;
            while(p.getPlace()==0)
            {
                if(this.passagers[i]==null)
                {
                    this.passagers[i]=p;
                    this.nbRes++;
                    p.setPlace(i);
                    p.setVoiture(this);
                }
                else
        {
            System.out.println("Impossible voiture pleine");
        }
                i++;
            }
            
        
        
        }
}
    
    

    @Override
    public String toString() {
        return "Voiture{" + "classe=" + classe + ", capacite=" + capacite + ", nbRes=" + nbRes + ", passagers=" + this.passagers.toString() + '}';
    }
   
}