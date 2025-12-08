/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ro.ugal.aciee.electronice;

/**
 *
 * @author ac1019
 */
public class Tableta extends Electronice implements Stare{
    
    private int diagonalaDisplay,greutate,capacitateBaterie;
    private boolean incarcatorInclus;
    private String rezolutie;
    
    public Tableta() {
        super(); 
        this.diagonalaDisplay = 0;
        this.greutate = 0;
        this.capacitateBaterie = 0;
        this.incarcatorInclus = false;
        this.rezolutie = null;
    }
    
    public Tableta(String marca, String numeProdus, double pret, boolean disponibil,int diagonalaDisplay, int greutate, int capacitateBaterie,boolean incarcatorInclus, String rezolutie) {
        super(marca, numeProdus, pret, disponibil); 
        this.diagonalaDisplay = diagonalaDisplay;
        this.greutate = greutate;
        this.capacitateBaterie = capacitateBaterie;
        this.incarcatorInclus = incarcatorInclus;
        this.rezolutie = rezolutie;
    }
    
    public Tableta(Tableta copy) {
        super(copy);
        this.diagonalaDisplay = copy.diagonalaDisplay;
        this.greutate = copy.greutate;
        this.capacitateBaterie = copy.capacitateBaterie;
        this.incarcatorInclus = copy.incarcatorInclus;
        this.rezolutie = copy.rezolutie;
    }
    
    public void setDiagonalaDisplay(int diagonalaDisplay) {
        this.diagonalaDisplay = diagonalaDisplay;
    }
    public int getDiagonalaDisplay() {
        return diagonalaDisplay;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }
    public int getGreutate() {
        return greutate;
    }

    public void setCapacitateBaterie(int capacitateBaterie) {
        this.capacitateBaterie = capacitateBaterie;
    }
    public int getCapacitateBaterie() {
        return capacitateBaterie;
    }

    public void setIncarcatorInclus(boolean incarcatorInclus) {
        this.incarcatorInclus = incarcatorInclus;
    }
    
    public boolean getIncarcatorInclus() {
        return incarcatorInclus;
    }

    public void setRezolutie(String rezolutie) {
        this.rezolutie = rezolutie;
    }
    public String getRezolutie() {
        return rezolutie;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Diagonala: " + diagonalaDisplay +  " Greutate: " + greutate +  " Baterie: " + capacitateBaterie +  " Rezolutie: " + rezolutie + " Incarcator inclus: " + incarcatorInclus;
    }
    
    
     @Override
    public void nou() {
        System.out.println("Tableta este noua.");
    }

    @Override
    public void resigilat() {
        System.out.println("Tableta este resigilata.");
    }
    
    public static void filtreazaTablete(Object[] vector,int greutateMin,boolean incarcatorInclus){
        System.out.println("-------Tablete care respecta cerinta------");
        for(Object obj :vector)
        {
            Tableta p=(Tableta) obj;
            if(p.getGreutate()>=greutateMin & p.incarcatorInclus==incarcatorInclus){
                System.out.println(p);
            }
        }
    }
     public static void scrieTabletaFisier(Object[] TabletaVector, String filename) {
    try (PrintWriter pw = new PrintWriter(new FileWriter(filename, true))) {  // true = append
        for (Object o : TabletaVector) {
            if (o == null) continue;

            Tableta b = (Tableta) o;
            pw.println(b.toString());   // scriere + trecere la linia următoare
        }
        System.out.println("Am adăugat Tablete în: " + filename);
    } catch (IOException ex) {
        System.err.println("Eroare la scrierea în fișierul " + filename + ": " + ex.getMessage());
    }
}
    
}

