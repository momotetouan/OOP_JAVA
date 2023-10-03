/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package train;

/**
 *
 * @author Farehan Yahya
 */
public class Passager {
    //attributs
    String nom;
    String prenom;
    String numDossier;
    Voiture voiture;
    int place;

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getPlace() {
        return place;
    }

    
    public Passager(String nom, String prenom, String numDossier) {
        this.nom = nom;
        this.prenom = prenom;
        this.numDossier = numDossier;
        //place = 0
        //voiture = null;
    }

    @Override
    public String toString() {
        return "Passager{" + "nom=" + nom + ", prenom=" + prenom + ", numDossier=" + numDossier + ", voiture=" + voiture + ", place=" + place + '}';
    }

    
    
}
