/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronice;

/**
 *
 * @author Asus
 */
public class AparatFoto extends Electronice implements Stare {
    private int megaPixeli;
    private boolean areZoomOptic;
    private String tip;
    private double greutate;
    private int diagonalaDisplay;
    
    public AparatFoto(){
        super();
        this.megaPixeli=0;
        this.areZoomOptic=false;
        this.tip="Necunoscut";
        this.greutate=0.0;
        this.diagonalaDisplay=0;
    }
    public AparatFoto(String marca, double pret, String numeProdus, boolean disponibil, int megaPixeli, boolean areZoomOptic, String tip, double greutate, int diagonalaDisplay){
        super(marca,pret,numeProdus,disponibil);
        this.megaPixeli=megaPixeli;
        this.areZoomOptic=areZoomOptic;
        this.tip=tip;
        this.greutate=greutate;
        this.diagonalaDisplay=diagonalaDisplay;
    }
    public AparatFoto(AparatFoto original){
        super(original);
        this.megaPixeli=original.megaPixeli;
        this.areZoomOptic=original.areZoomOptic;
        this.tip=original.tip;
        this.greutate=original.greutate;
        this.diagonalaDisplay=original.diagonalaDisplay;
    }
    public int getMegaPixeli(){
        return megaPixeli;
    }
    public void setMegaPixeli(int megaPixeli){
        this.megaPixeli=megaPixeli;
    }
    public boolean getAreZoomOptic(){
        return areZoomOptic;
    }
    public void setAreZoomOptic(boolean areZoomOptic){
        this.areZoomOptic=areZoomOptic;
    }
    public String getTip(){
        return tip;
    }
    public void setTip(String tip){
        this.tip=tip;
    }
    public double getGreutate(){
        return greutate;
    }
    public void setGreutate(double greutate){
        this.greutate=greutate;
    }
    public int getDiagonalaDisplay(){
        return diagonalaDisplay;
    }
    public void setDiagonalaDisplay(int diagonalaDisplay){
        this.diagonalaDisplay=diagonalaDisplay;
    }
    
    @Override
    public void nou(){
        System.out.println("Aparatul Foto este nou...");
    }  
     @Override
     public void resigilat(){
         System.out.println("Aparatul Foto este resigilat...");
     }
     @Override
     public String toString(){
         return "AparatFoto {"+super.toString()+
         ", Mega Pixeli="+megaPixeli+
         ", Are Zoom Optic="+areZoomOptic+
         ", Tip="+tip+'\''+
         ", Greutate="+greutate+
         ", Diagonala Display="+diagonalaDisplay+
         '}';
     }
             
}

