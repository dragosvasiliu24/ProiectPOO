/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronice;

/**
 *
 * @author Asus
 */
public class Imprimanta extends Electronice {
    private int rezolutie;
    private String tip;
    private boolean color;
    private int vitezaPrintare;
    private int capacitateHartie;   


  public Imprimanta(){
super();
this.rezolutie=0;
this.tip="Necunoscut";
this.color=false;
this.vitezaPrintare=0;
this.capacitateHartie=0;
}
public Imprimanta(String marca, double pret, String numeProdus, boolean disponibil,int rezolutie, String tip, boolean color, int vitezaPrintare, int capacitateHartie){
    super(marca,pret,numeProdus,disponibil);
    this.rezolutie=rezolutie;
    this.tip=tip;
    this.color=color;
    this.vitezaPrintare=vitezaPrintare;
    this.capacitateHartie=capacitateHartie;
}
public Imprimanta(Imprimanta original){
    super(original);
    this.rezolutie=original.rezolutie;
    this.tip=original.tip;
    this.color=original.color;
    this.vitezaPrintare=original.vitezaPrintare;
    this.capacitateHartie=original.capacitateHartie;
}
public int getRezolutie()
{
    return rezolutie;
}
public void setRezolutie(int rezolutie){
    this.rezolutie=rezolutie;
}
public String getTip(){
    return tip;
}
public void setTip(String tip){
    this.tip=tip;
}
public boolean getColor(){
    return color;
}
public void setColor(boolean color){
    this.color=color;
}
public int getVitezaPrintare(){
    return vitezaPrintare;
}
public void setVitezaPrintare(int vitezaPrintare){
    this.vitezaPrintare=vitezaPrintare;
}
public int getCapacitateHartie(){
    return capacitateHartie;
}
public void setCapacitateHartie(int capacitateHartie){
    this.capacitateHartie=capacitateHartie;
}

 @Override
    public void nou(){
        System.out.println("Imprimanta este noua...");
    }  
     @Override
     public void resigilat(){
         System.out.println("Imprimanta este resigilata...");
     }
      @Override
      public String toString(){
          return "Imprimanta{"+super.toString() +
          ", rezolutie="+rezolutie+
          ",tip="+tip+'\''+
          ", culoare="+color+
          ", viteza de printare="+vitezaPrintare+
          ", capacitate Hartie="+capacitateHartie+
          '}'; 
      }
}
