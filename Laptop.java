package com.mycompany.electronice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Laptop extends Electronice implements Stare {
    private String tipProcesor;
    private String sistemOperare;
    private int diagonalaDisplay , rataRefresh, memorie;
    private  boolean touchscreen;

    public Laptop() {
        super();
        this.tipProcesor = "";
        this.sistemOperare = "";
        this.diagonalaDisplay = 0;
        this.rataRefresh = 0;
        this.memorie = 0;
        this.touchscreen = false;
    }
    public Laptop(String marca, String numeProdus, double pret, boolean disponibil,String tipProcesor, String sistemOperare, int diagonalaDisplay, int rataRefresh, int memorie, boolean touchscreen) {
        super(marca,numeProdus,pret,disponibil);
        this.tipProcesor = tipProcesor;
        this.sistemOperare = sistemOperare;
        this.diagonalaDisplay = diagonalaDisplay;
        this.rataRefresh = rataRefresh;
        this.memorie = memorie;
        this.touchscreen = touchscreen;
    }
    public Laptop(Laptop original) {
        super(original);
        this.tipProcesor = original.tipProcesor;
        this.sistemOperare = original.sistemOperare;
        this.diagonalaDisplay = original.diagonalaDisplay;
        this.rataRefresh = original.rataRefresh;
        this.memorie = original.memorie;
        this.touchscreen = original.touchscreen;
    }
    public void setTipProcesor(String tipProcesor) {
        this.tipProcesor = tipProcesor;
    }
    public String getTipProcesor() {
        return tipProcesor;
    }
    public void setSistemOperare(String sistemOperare) {
        this.sistemOperare = sistemOperare;
    }
    public String getSistemOperare() {
        return sistemOperare;
    }
    public void setDiagonalaDisplay(int diagonalaDisplay) {
        this.diagonalaDisplay = diagonalaDisplay;
    }
    public int getDiagonalaDisplay() {
        return diagonalaDisplay;
    }
    public void setRataRefresh(int rataRefresh) {
        this.rataRefresh = rataRefresh;
    }
    public int getRataRefresh() {
        return rataRefresh;
    }
    public void setMemorie(int memorie) {
        this.memorie = memorie;
    }
    public int getMemorie() {
        return memorie;
    }
    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }
    public boolean getTouchscreen() {
        return touchscreen;
    }
    @Override
    public String toString() {
        return super.toString()+ "tipProcesor"+tipProcesor+"sistemOperare"+sistemOperare+"diagonala display"+ diagonalaDisplay+"rata refresh"+ rataRefresh+"memorie"+memorie+"touchscreen"+touchscreen;
    }
    @Override
    public void nou(){
        System.out.println("laptop nou.");
    }
    @Override
    public void resigilat(){
        System.out.println(" laptop resigilat");
    }

    public static void filtreazaLaptop(Object [] vector, int diagonalaDisplay,int memorie){
        System.out.println("Laptop filtrat");
        for(Object obj : vector){
            Laptop l = (Laptop) obj;
            if(l.diagonalaDisplay<=diagonalaDisplay&&l.memorie<=memorie){
                System.out.println(l);
            }
        }
    }
    public static void scrieLaptop(Object[] laptopVector, String filename) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename, true))) {  // true = append
            for (Object o : laptopVector) {
                if (o == null) continue;

                Laptop b = (Laptop) o;
                pw.println(b.toString());   // scriere + trecere la linia următoare
            }
            System.out.println("Am adăugat Laptopu în: " + filename);
        } catch (IOException ex) {
            System.err.println("Eroare la scrierea în fișierul " + filename + ": " + ex.getMessage());
        }
    }
}
