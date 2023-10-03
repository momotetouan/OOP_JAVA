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
public class Main {
   public static void main(String[]args){
       Locomotive loco = new Locomotive("798988",100);
       Date d1 = new Date();
       ArrayList<String> l = new ArrayList<String>();
       l.add("Chenove");
       l.add("Dijon");
       l.add("Marseille");
       Train t1 = new Train("769848",d1,l,loco);
       wagon w = new Marchandise(10,"2984",20,15,"CHARBON");
       
       Voiture w1 = new Voiture(2000,"134567765",1,20);
       t1.ajoutWagon(w1);
       Passager p1 = new Passager("Messi","Lionel","4149");
       Passager p2 = new Passager("Savelli","Joel","2022");
       
       w1.reservePlace(p1);
       w1.reservePlace(p2);
       System.out.println(t1.toString());
   } 
}
